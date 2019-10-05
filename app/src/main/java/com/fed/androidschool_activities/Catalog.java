package com.fed.androidschool_activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class Catalog extends AppCompatActivity {

    public static final String SAVED_PARSEL = "TEST_MODEL";
    public static final String LOG_TAG = "MAIN_ACTIVITY";

    private TestModel testModel;

    private TextView mTextView;
    private RandomHelper randomHelper = new RandomHelper();

    private View mapButton;
    private View searchButton;
    private View accountButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.catalog);

        mTextView = findViewById(R.id.info_textview);
        mapButton = findViewById(R.id.button_map);
        searchButton = findViewById(R.id.button_search);
        accountButton = findViewById(R.id.button_account);

        mapButton.setOnClickListener(this::onClickMap);
        searchButton.setOnClickListener(this::onClickSearch);
        accountButton.setOnClickListener(this::onClickAccount);

        testModel = randomHelper.randInitial();
        mTextView.setText(testModel.string);
    }
    private void onClickMap(View view){
        Intent intent = new Intent(this, Map.class);
        startActivity(intent);
    }
    private void onClickSearch(View view){
        Intent intent = new Intent(this, Search.class);
        startActivity(intent);
    }
    private void onClickAccount(View view){
        Intent intent = new Intent(this, Account.class);
        startActivity(intent);
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
