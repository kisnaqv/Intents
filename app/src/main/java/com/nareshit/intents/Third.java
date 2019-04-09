package com.nareshit.intents;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class Third extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }

   /* @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i=new Intent(Third.this,MainActivity.class);
        startActivity(i);
    }*/
}