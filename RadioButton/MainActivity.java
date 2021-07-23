package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup rg;
    RadioButton rb;
    TextView tv;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg=(RadioGroup)findViewById(R.id.radio);
        tv=(TextView)findViewById(R.id.textView3);
        button=(Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int rid=rg.getCheckedRadioButtonId();
                rb=(RadioButton)findViewById(rid);
                tv.setText(rb.getText().toString());
                Toast.makeText(getApplicationContext(),rb.getText().toString(),Toast.LENGTH_LONG).show();
            }
        });
    }
}