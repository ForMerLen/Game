package com.example.lenovo.game;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void GameStart(View view){
        Intent intent = new Intent(MainActivity.this,GameActivity.class);
        startActivity(intent);
    }

    public void exit(View view){
        finish();
    }
}
