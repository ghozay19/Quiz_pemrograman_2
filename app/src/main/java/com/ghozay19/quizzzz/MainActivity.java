package com.ghozay19.quizzzz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;



/**
 * Created by {$user} on 25/02/2019.
 * at 10:38
 * Copyright (c) 2019 Naghom Dev All rights reserved.
 */
public class MainActivity extends AppCompatActivity {


    List<Model> dataItemList = SampleDataProvider.dataItemList;



    DataAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        ButterKnife.bind(this);

        RecyclerView recyclerView = findViewById(R.id.rv_favourite);
        adapter = new DataAdapter(this, dataItemList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));


    }
}

