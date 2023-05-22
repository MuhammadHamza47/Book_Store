package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.Models.BookModel;
import com.My_Adapter.BookAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.reView);

        ArrayList<BookModel> arrayList = new ArrayList<>();
        arrayList.add(new BookModel(R.drawable.chemistry9th, "Chemistry 9th"));
        arrayList.add(new BookModel(R.drawable.biology9th, "Biology 9th"));
        arrayList.add(new BookModel(R.drawable.physics9th, "Physics 9th"));
        arrayList.add(new BookModel(R.drawable.math9th, "Math 9th"));

        BookAdapter adapter = new BookAdapter(arrayList, this);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
    }
}