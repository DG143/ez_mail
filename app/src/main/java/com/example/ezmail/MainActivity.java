package com.example.ezmail;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    String name;
    ArrayList<item> items = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerview = findViewById(R.id.recyclerview);

        items.add(new item("Shruty Ma'am","shruty@gmail.com",R.drawable.a));
        items.add(new item("Savita Ma'am","savita@gmail.com",R.drawable.b));
        items.add(new item("Pratibha Ma'am","pratibha@gmail.com",R.drawable.c));
        items.add(new item("Dean sir","ds@gmail.com",R.drawable.d));

        recyclerview.setLayoutManager(new LinearLayoutManager(this));
        MyAdapter myAdapter = new MyAdapter(this,items);
        recyclerview.setAdapter(myAdapter);

    }
}