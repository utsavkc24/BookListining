package com.example.booklistining;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public static final String JSON_STRING="https://www.googleapis.com/books/v1/volumes?q=androidr";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Custom> books = QueryUtils.extractBookList(JSON_STRING);

        ListView bookListView = (ListView) findViewById(R.id.list);

        BookAdapter adapter = new BookAdapter(this,books);

        bookListView.setAdapter(adapter);

    }
}
