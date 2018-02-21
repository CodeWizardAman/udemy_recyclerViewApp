package com.example.android.recyclerviewapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by UFO_24 on 21-02-2018.
 */

public class DetailsActivity extends AppCompatActivity {

    private TextView nameTextView, descTextView, ratingTextView;
    private Bundle extras;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        extras = getIntent().getExtras();

        nameTextView = (TextView)findViewById(R.id.text_title);
        descTextView = (TextView) findViewById(R.id.text_desc);
        ratingTextView = (TextView) findViewById(R.id.text_rating);

        if(extras != null) {
            nameTextView.setText(extras.getString("title"));
            descTextView.setText(extras.getString("desc"));
            ratingTextView.setText(extras.getString("rating"));
        }
    }
}
