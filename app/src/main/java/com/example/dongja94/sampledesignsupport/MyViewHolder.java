package com.example.dongja94.sampledesignsupport;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by dongja94 on 2016-01-27.
 */
public class MyViewHolder extends RecyclerView.ViewHolder {
    TextView messageView;
    public MyViewHolder(View itemView) {
        super(itemView);
        messageView = (TextView)itemView;
    }

    public void setText(String text) {
        messageView.setText(text);
    }
}
