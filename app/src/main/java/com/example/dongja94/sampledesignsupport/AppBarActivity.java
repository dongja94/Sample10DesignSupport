package com.example.dongja94.sampledesignsupport;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

public class AppBarActivity extends AppCompatActivity {

    RecyclerView rvList;
    MyAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_bar);
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        rvList = (RecyclerView)findViewById(R.id.rv_list);
        mAdapter = new MyAdapter();
        rvList.setAdapter(mAdapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        rvList.setLayoutManager(layoutManager);

        initData();
    }

    private void initData() {
        for (int i = 0 ; i < 40; i++) {
            mAdapter.add("item " + i);
        }
    }
}
