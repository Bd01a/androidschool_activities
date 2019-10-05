package com.fed.androidschool_activities;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

public class Map extends AppCompatActivity {

    public static final String SAVED_PARSEL = "TEST_MODEL";
    public static final String LOG_TAG = "MAIN_ACTIVITY";

    private TestModel testModel;

    private TextView mTextView;
    private RandomHelper randomHelper = new RandomHelper();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map);

        mTextView = findViewById(R.id.info_textview);

        testModel = randomHelper.randInitial();
        mTextView.setText(testModel.string);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putParcelable(SAVED_PARSEL, testModel);
        Log.d(LOG_TAG, testModel.floats.toString());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        testModel = savedInstanceState.getParcelable(SAVED_PARSEL);
        mTextView.setText(testModel.string);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}
