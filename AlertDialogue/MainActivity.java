package com.example.alertdialogue;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.alertdialogue.R;

public class MainActivity extends AppCompatActivity {

    RadioGroup rg;
    RadioButton rb;
    Button button;
    LinearLayout ll1,ll2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg=(RadioGroup)findViewById(R.id.radio);
        button=(Button)findViewById(R.id.button);
        ll1=(LinearLayout)findViewById(R.id.linear1);
        ll2=(LinearLayout)findViewById(R.id.linear2);
        ll1.setVisibility(View.VISIBLE);
        ll2.setVisibility(View.GONE);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int rid=rg.getCheckedRadioButtonId();
                rb=(RadioButton)findViewById(rid);


                final AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("You selected "+rb.getText()+" Do you want to continue?").setCancelable(true).setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //Toast.makeText(getApplicationContext(),rb.getText().toString(),Toast.LENGTH_LONG).show();                //in case of single question
                        ll1.setVisibility(View.GONE);
                        ll2.setVisibility(View.VISIBLE);
                    }
                }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                       builder.setCancelable(true);
                      //  finish();                                //it will close the app!
                    }
                });
                AlertDialog alertDialog=builder.create();
                alertDialog.setTitle("Aditya Alert");
                alertDialog.show();

            }
        });
    }
}