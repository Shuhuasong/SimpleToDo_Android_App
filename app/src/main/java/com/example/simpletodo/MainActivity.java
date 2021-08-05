package com.example.simpletodo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<String> items;

    Button btnAdd;
    EditText etItem;
    RecyclerView rvItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //get the reference of each view, so we can add logic for each component
        btnAdd = findViewById(R.id.btnAdd);
        etItem = findViewById((R.id.etItem));
        rvItems = findViewById(R.id.rvItems);

        items = new ArrayList<>();
        items.add("Clean the House");
        items.add("Shop in Supermarket");
        items.add("Do the homeword");
        items.add("Have fun");


        ItemsAdapter itemsAdapter = new ItemsAdapter(items);
        rvItems.setAdapter(itemsAdapter);
        rvItems.setLayoutManager(new LinearLayoutManager(this));
    }
}

/*
http://5.9.10.113/67511950/error-aapt-android-studio-when-generate-signature
 */