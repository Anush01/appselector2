package com.example.anushmp.appselector2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView usernamehere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        usernamehere = findViewById(R.id.usernamehere);

        if(getIntent() != null){


            String UserName = getIntent().getExtras().get("key").toString();
            usernamehere.setText(UserName);

        }



    }
}