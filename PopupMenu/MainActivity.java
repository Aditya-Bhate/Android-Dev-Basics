package com.example.pop_upmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;
import com.example.pop_upmenu.R;

public class MainActivity extends AppCompatActivity {
    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv=(ImageView)findViewById(R.id.imageView);
        final PopupMenu popupMenu= new PopupMenu(MainActivity.this,iv);
        popupMenu.getMenuInflater().inflate(R.menu.options,popupMenu.getMenu());

        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        switch(menuItem.getItemId())
                        {
                            case R.id.CSE:
                                //Intent intent=new Intent(MainActivity.this,MainActivity3.class);// explicit intent
                                //  startActivity(intent);
                                Toast.makeText(getApplicationContext(),"CSE",Toast.LENGTH_LONG).show();
                                return true;
                            case R.id.ECE:
                                //Intent i=getPackageManager().getLaunchIntentForPackage("com.example.pop_upmenu");//implicit intent
                                //  startActivity(i);
                                Toast.makeText(getApplicationContext(),"ECE",Toast.LENGTH_LONG).show();
                                return true;
                            case R.id.MEC:
                                Toast.makeText(getApplicationContext(),"MEC",Toast.LENGTH_LONG).show();
                                return true;
                            case R.id.CIV:
                                Toast.makeText(getApplicationContext(),"CIV",Toast.LENGTH_LONG).show();
                                return true;
                            case R.id.about:
                                Toast.makeText(getApplicationContext(),"About",Toast.LENGTH_LONG).show();
                                return true;
                        }
                        return false;
                    }
                });popupMenu.show();
            }
        });
    }


}