package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox c1,c2,c3,c4;
    Button button;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c1=(CheckBox)findViewById(R.id.checkBox);
        c2=(CheckBox)findViewById(R.id.checkBox1);
        c3=(CheckBox)findViewById(R.id.checkBox2);
        c4=(CheckBox)findViewById(R.id.checkBox3);
        button=(Button)findViewById(R.id.button);
        tv=(TextView)findViewById(R.id.textView4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s="";                                                                         //Multiple correct options
                if(c1.isChecked()){
                  //  tv.setText(c1.getText().toString());
                    s=c1.getText().toString();//Multiple correct options
                    Toast.makeText(getApplicationContext(),c1.getText().toString(),Toast.LENGTH_LONG).show();
                }
                if(c2.isChecked()){
                  // tv.setText(c2.getText().toString());
                    s=s+" "+c2.getText().toString();                                                       //Multiple correct options
                    Toast.makeText(getApplicationContext(),c2.getText().toString(),Toast.LENGTH_LONG).show();
                }
                if(c3.isChecked()){
                    //tv.setText(c3.getText().toString());
                    s=s+" "+c3.getText().toString();                                                    //Multiple correct options
                    Toast.makeText(getApplicationContext(),c3.getText().toString(),Toast.LENGTH_LONG).show();
                }
                if(c4.isChecked()){
                    //tv.setText(c4.getText().toString());
                    s=s+" "+c4.getText().toString();                                                //Multiple correct options
                    Toast.makeText(getApplicationContext(),c4.getText().toString(),Toast.LENGTH_LONG).show();
                }
                tv.setText(s);                                                              //Multiple correct options
            }
        });
    }
}