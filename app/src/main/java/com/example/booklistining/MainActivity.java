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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Custom> books = QueryUtils.extractBookList();

        ListView bookListView = (ListView) findViewById(R.id.list);

        BookAdapter adapter = new BookAdapter(this,books);

        bookListView.setAdapter(adapter);

    }
}
