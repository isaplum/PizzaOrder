package com.example.krixniemann.pizzaorder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvtotal;
    RadioButton smlButton;
    RadioButton mdButton;
    RadioButton lgButton;
    double total = 0;
    CheckBox exCheesebx;
    CheckBox delivbx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        smlButton = (RadioButton) findViewById(R.id.smlButton);
        mdButton = (RadioButton) findViewById(R.id.mdButton);
        lgButton = (RadioButton) findViewById(R.id.lgButton);
        tvtotal = (TextView) findViewById(R.id.totView);
        exCheesebx = (CheckBox) findViewById(R.id.exCheesebx);
        delivbx = (CheckBox) findViewById(R.id.delivbx);
    }
    public void onsmlButtonClicked (View view) {

        boolean checked = ((RadioButton) view).isChecked();
        if (checked = true) {
            total = 7 + total;
        }
    }
    public void onmdButtonClicked (View view){

        boolean checked = ((RadioButton) view).isChecked();
        if (checked = true){
            total = total + 9;
        }
    }
    public void onlgButtonClicked (View view){

        boolean checked = ((RadioButton) view).isChecked();
        if (checked = true){
            total = total + 13;
        }
    }


    public void onClick(View view) {
        if (exCheesebx.isChecked()) {
            total = total + 1.75;
        }
        if (delivbx.isChecked()) {
            total = total + 2.5;
        }

        tvtotal.setText(String.format("Your total is: $%.2f", total));
        total = 0;
      

    }
}
