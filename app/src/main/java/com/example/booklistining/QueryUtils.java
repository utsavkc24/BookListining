package com.example.booklistining;

import android.text.TextUtils;
import android.util.Log;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;

public class QueryUtils {
    //Tag for the log messages
    public  static  final  String LOG_TAG = MainActivity.class.getSimpleName();

    private QueryUtils() {

    }

    /**
     * Make an HTTp request to the given URL and return s string as the response
     *
     */
    private String makeHttpRequest(URL url) throws IOException{
        String jsonResponse = "";
        HttpURLConnection urlConnection = null;
        InputStream inputStream = null;
        try {
            urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.setReadTimeout(10000 /*millisecond*/);
            urlConnection.setConnectTimeout(15000 /*millisecond*/);
            urlConnection.connect();
            inputStream = urlConnection.getInputStream();
            jsonResponse = readFromStream(inputStream);

            //If the request was successful (respond code 200),
            //then read the input stream and parse the response.
            if(urlConnection.getResponseCode() == 200){
                inputStream = urlConnection.getInputStream();
                jsonResponse = readFromStream(inputStream);
            }else{
                Log.e(LOG_TAG,"Error response code" +urlConnection.getResponseCode());
            }
        }catch (IOException e){
            Log.e(LOG_TAG,"IOException is thrown");
        }finally {
            if (urlConnection != null){
                urlConnection.disconnect();
            }if (inputStream != null){
                // Function must handle java.io.IOException here
                inputStream.close();
            }
        }
        return jsonResponse;
    }

    /**
     * Convert the {@link InputStream} into a string which contains the
     * whole JSON response from the server.
     */
    private String readFromStream(InputStream inputStream) throws IOException{
        StringBuilder output = new StringBuilder();
        if(inputStream != null){
            //Translation process from raw data to human readable characters
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, Charset.forName("UTF-8"));
            //Use of BufferedReader make input faster than InputStreamReader.
            //Buffered reads one line at a time.
            BufferedReader reader = new BufferedReader(inputStreamReader);
            String line = reader.readLine();
            while (line != null){
                output.append(line);
                //read next line
                line = reader.readLine();
            }
        }
        return output.toString();
    }

    public static ArrayList<Custom> extractBookList(String bookListJSON) {
        //If the JSON string is empty or null, then return early.
        if (TextUtils.isEmpty(bookListJSON)){
            return null;
        }
        ArrayList<Custom> bookList = new ArrayList<>();
        try {
            //Create a JSONObject from the JSON_STRING
            JSONObject rootObject = new JSONObject(bookListJSON);
            // Extract the JSONArray associated with the key called "items",
            // which represents a list of items (or books).
            JSONArray itemsArray = rootObject.getJSONArray("items");

            for(int i = 0; i < itemsArray.length(); i++){
                JSONObject currentBook = itemsArray.getJSONObject(i);
                JSONObject volumeInfo = currentBook.getJSONObject("volumeInfo");
                //JSONObject imageLinks = currentBook.getJSONObject("imageLinks");
                //String bookImage = imageLinks.getString("thumbnail");
                String title = volumeInfo.getString("title");
                //String subTitle = volumeInfo.getString("subtitle");

                Custom book = new Custom(title);
                bookList.add(book);
        }
        }catch (Exception e){
            e.printStackTrace();
        }
        return bookList;
    }

}
