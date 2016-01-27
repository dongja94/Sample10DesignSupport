package com.example.dongja94.sampledesignsupport;

import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class CoordinatorActivity extends AppCompatActivity {

    CoordinatorLayout coordinatorLayout;
    RecyclerView rvList;
    MyAdapter mAdapter;

    FloatingActionButton fabButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordinator);
        rvList = (RecyclerView)findViewById(R.id.rv_list);
        mAdapter = new MyAdapter();
        rvList.setAdapter(mAdapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        rvList.setLayoutManager(layoutManager);

        fabButton = (FloatingActionButton)findViewById(R.id.fab_button);
        fabButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Snackbar", Snackbar.LENGTH_SHORT).show();
            }
        });
        initData();
    }

    private void initData() {
        for (int i = 0; i < 40; i++) {
            mAdapter.add("item" + i);
        }
    }
}
