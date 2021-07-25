package com.example.simplemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.options,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.CSE:
                Toast.makeText(getApplicationContext(),"You selected CSE",Toast.LENGTH_LONG).show();
                return true;
            case R.id.ECE:
                Toast.makeText(getApplicationContext(),"You selected ECE",Toast.LENGTH_LONG).show();
                return true;
            case R.id.MEC:
                Toast.makeText(getApplicationContext(),"You selected MECHANICAL",Toast.LENGTH_LONG).show();
                return true;
            case R.id.CIV:
                Toast.makeText(getApplicationContext(),"You selected CIVIL",Toast.LENGTH_LONG).show();
                return true;
        }
       return super.onOptionsItemSelected(item);
    }
}