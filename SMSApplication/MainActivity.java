package com.example.smsapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tv1;
    EditText phone,sms;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView) findViewById(R.id.textView1);
        phone=(EditText)findViewById(R.id.editTextPhone);
        sms=(EditText)findViewById(R.id.editTextTextPersonName);
        b=(Button)findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ActivityCompat.requestPermissions(MainActivity.this,new String[]{Manifest.permission.SEND_SMS}, PackageManager.PERMISSION_GRANTED);//SELF PERMISSION
                if (phone.getText().toString().isEmpty() || sms.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Enter valid inputs in sms and phone no.", Toast.LENGTH_LONG).show();
                } else {
                    try {
                        SmsManager smsManager = SmsManager.getDefault();
                        smsManager.sendTextMessage(phone.getText().toString(), null, sms.getText().toString(), null, null);
                        Toast.makeText(getApplicationContext(), "SMS send successfully", Toast.LENGTH_LONG).show();
                    } catch (Exception e) {
                        Toast.makeText(getApplicationContext(), "SMS send failed", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}