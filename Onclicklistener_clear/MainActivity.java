package com.example.onclicklistener_clear;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText t1,t2;
    TextView tv;
    Button b,b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1=(EditText)findViewById(R.id.editText1);
        t2=(EditText)findViewById(R.id.editText2);
        tv=(TextView)findViewById(R.id.textView4);
        b=(Button)findViewById(R.id.button);
        b1=(Button)findViewById(R.id.button1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num=Integer.parseInt(t1.getText().toString())+Integer.parseInt(t2.getText().toString());
                tv.setText(Integer.toString(num));
                Log.d("string","Result"+num);
                Toast.makeText(MainActivity.this,"Result="+num,Toast.LENGTH_LONG).show();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText("");
                t2.setText("");
            }
        });

    }
}