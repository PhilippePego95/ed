package com.example.mati.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class DisplayMessageActivity extends AppCompatActivity {

    EditText txtn1,txtn2;
    Button btnS, btnR,btnM,btnD;
    TextView txtR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtn1=(EditText)findViewById(R.id.txtn1);
        txtn2=(EditText)findViewById(R.id.txtn2);
        btnS=(Button)findViewById(R.id.btnSuma);
        btnR=(Button)findViewById(R.id.btnResta);
        btnM=(Button)findViewById(R.id.btnMulti);
        btnD=(Button)findViewById(R.id.btnDiv);
        txtR=(TextView)findViewById(R.id.txtRes);

        btnS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1= Integer.parseInt(txtn1.getText().toString());
                int num2= Integer.parseInt(txtn2.getText().toString());
                int s=num1+num2;
                txtR.setText("Resultado: "+s);
            }
        });

        btnM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1= Integer.parseInt(txtn1.getText().toString());
                int num2= Integer.parseInt(txtn2.getText().toString());
                int s=num1*num2;
                txtR.setText("Resultado: "+s);
            }
        });

        btnR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1= Integer.parseInt(txtn1.getText().toString());
                int num2= Integer.parseInt(txtn2.getText().toString());
                int s=num1-num2;
                txtR.setText("Resultado: "+s);
            }
        });

        btnD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1= Integer.parseInt(txtn1.getText().toString());
                int num2= Integer.parseInt(txtn2.getText().toString());
                int s=num1/num2;
                txtR.setText("Resultado: "+s);
            }
        });
    }


}
