package com.example.wifiapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView aSwitch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aSwitch=(ImageView) findViewById(R.id.wifi);
        final WifiManager wifiManager=(WifiManager)getSystemService(getApplicationContext().WIFI_SERVICE);
        wifiManager.setWifiEnabled(false);


        aSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WifiManager wifiManager1=(WifiManager)getSystemService(getApplicationContext().WIFI_SERVICE);
                if(wifiManager.getWifiState()==1){
                    wifiManager.setWifiEnabled(false);
                    aSwitch.setImageTintList(ColorStateList.valueOf(Color.GREEN));
                    Toast.makeText(getApplicationContext(),"Wifi On",Toast.LENGTH_LONG).show();
                }
                else{
                    wifiManager.setWifiEnabled(true);
                    aSwitch.setImageTintList(ColorStateList.valueOf(Color.RED));
                    Toast.makeText(getApplicationContext(),"Wifi Off",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}


/*package com.example.wifiapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Switch aSwitch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aSwitch=(Switch)findViewById(R.id.wifi);
        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                ActivityCompat.requestPermissions(MainActivity.this,new String[]{Manifest.permission.CHANGE_WIFI_STATE},1);
                if(b==true){
                    WifiManager wifiManager=(WifiManager)getSystemService(getApplicationContext().WIFI_SERVICE);
                    wifiManager.setWifiEnabled(true);
                    Toast.makeText(getApplicationContext(),"Wifi On",Toast.LENGTH_LONG).show();
                }
                else{
                    WifiManager wifiManager=(WifiManager)getSystemService(getApplicationContext().WIFI_SERVICE);
                    wifiManager.setWifiEnabled(false);
                    Toast.makeText(getApplicationContext(),"Wifi Off",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}*/