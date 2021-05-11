package com.example.test;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.test.adapter.AnimalOrderAdapter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private AnimalOrderAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = (RecyclerView) findViewById(R.id.rc_animal_order);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        final List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add("农家土鸡"+i);
        }

        mAdapter = new AnimalOrderAdapter(getApplicationContext(), list);
        mRecyclerView.setAdapter(mAdapter);
    }
}