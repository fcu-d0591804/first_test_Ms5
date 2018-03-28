package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        int num = intent.getIntExtra("n",1);



    }

    public void fn_like(View View) {
        Intent i = new Intent();
        i.putExtra("Like", 1);
        setResult(RESULT_OK, i);
        finish();


    }
}
