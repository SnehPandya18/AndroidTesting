package com.snehpandya.androidtesting;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

/**
 * Created by sneh.pandya on 24/10/17.
 */

public class FifthActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private MyAdapter mMyAdapter;
    private ArrayList<Names> mNames;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);

        mNames = Names.createList();

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        mMyAdapter = new MyAdapter(mNames, this);

        mRecyclerView.setAdapter(mMyAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
