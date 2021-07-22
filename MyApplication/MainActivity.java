package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import static java.lang.Thread.sleep;

public class MainActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("life cycle","onCreate invoked");
        try{
            sleep(3000);
        }catch(InterruptedException e)   {
            e.printStackTrace();
        }
    }

    protected void onStart() {
        super.onStart();
        Log.d("life cycle","onStart invoked");
        try{
            sleep(3000);
        }catch(InterruptedException e)   {
            e.printStackTrace();
        }
    }

    protected void onResume() {
        super.onResume();
        Log.d("life cycle","onResume invoked");
        try{
            sleep(3000);
        }catch(InterruptedException e)   {
            e.printStackTrace();
        }
    }

    protected void onPause() {
        super.onPause();
        Log.d("life cycle","onPause invoked");
        try{
            sleep(3000);
        }catch(InterruptedException e)   {
            e.printStackTrace();
        }
    }

    protected void onStop() {
        super.onStop();
        Log.d("life cycle","onStop invoked");
        try{
            sleep(3000);
        }catch(InterruptedException e)   {
            e.printStackTrace();
        }
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.d("life cycle","onDestroy invoked");
        try{
            sleep(3000);
        }catch(InterruptedException e)   {
            e.printStackTrace();
        }
    }

    protected void onRestart() {
        super.onRestart();
        Log.d("life cycle","onRestart invoked");
        try{
            sleep(3000);
        }catch(InterruptedException e)   {
            e.printStackTrace();
        }
    }
}