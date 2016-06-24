package com.bourymbodj.nullvalidator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText balance, interest, minpay ;
    Button check;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        balance = (EditText) findViewById(R.id.cardBalance);
        interest = (EditText) findViewById(R.id.yearlyInterest);
        minpay = (EditText) findViewById(R.id.minimumPayment);
        check = (Button) findViewById(R.id.Check);
        check.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String nbalance, ninterest, nminpay;
        nbalance = balance.getText().toString();
        ninterest= interest.getText().toString();
        nminpay= minpay.getText().toString();

        if (nbalance.matches("")) {
            Toast.makeText(this, "You did not enter a balance", Toast.LENGTH_SHORT).show();
        }
        if (ninterest.matches("")) {
            Toast.makeText(this, "You did not enter the interest", Toast.LENGTH_SHORT).show();
        }
        if (nminpay.matches("")) {
            Toast.makeText(this, "You did not enter the minimum payment", Toast.LENGTH_SHORT).show();
        }

    }
}
