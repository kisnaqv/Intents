package com.nareshit.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button moving;
    EditText Name,Mobile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        moving=findViewById(R.id.Moving);
        Name=findViewById(R.id.name);
        Mobile=findViewById(R.id.mobile);

        moving.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Intent intent=new Intent(MainActivity.this,Second.class);
                startActivity(intent);*/
                Intent intent=new Intent(MainActivity.this,Second.class);
                intent.putExtra("Name",Name.getText().toString());
                intent.putExtra("Mobile",Mobile.getText().toString());
                startActivity(intent);
            }
        });
    }
}