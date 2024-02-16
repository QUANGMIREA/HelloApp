package com.example.helloapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("RRR","OnCreate");
        button = findViewById(R.id.button);
        button.setOnClickListener(this::onClick);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("RRR","OnStart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("RRR","OnDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("RRR","OnRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("RRR","OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("RRR","OnStop");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("RRR","OnResume");
    }
    public void onClick(View v){
        if(v.getId() == R.id.button) {
            //Intent intent = new Intent(MainActivity.this, MainActivity2.class);
           // startActivity(intent);
            Intent intent = new Intent(Intent.ACTION_VIEW);
            String www = "http://mirea.ru";
            intent.setData(Uri.parse(www));
            startActivity(intent);
        } else {

        }
    }

}