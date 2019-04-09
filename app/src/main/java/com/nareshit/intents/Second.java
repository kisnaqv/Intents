package com.nareshit.intents;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Second extends AppCompatActivity {

    Button third;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        third=findViewById(R.id.second);
        textView=findViewById(R.id.textView);

        //getting data
        Intent intent=getIntent();
        String s1=intent.getStringExtra("Name");
        String s2=intent.getStringExtra("Mobile");

        textView.setText(s1+s2);

        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Second.this,Third.class);
                startActivity(intent);
                finish();
            }
        });
    }
}


