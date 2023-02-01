package com.improve10x.formsv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BankAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_account);
        Intent intent = getIntent();
        String email =  intent.getStringExtra("email");
        String userName = intent.getStringExtra("userName");
        String firstName = intent.getStringExtra("firstName");
        String lastName = intent.getStringExtra("lastName");
        String hNo = intent.getStringExtra("hNo");
        String city = intent.getStringExtra("city");
        String state = intent.getStringExtra("state");
        String street = intent.getStringExtra("street");
        String country = intent.getStringExtra("country");
        String date = intent.getStringExtra("date");
        String place = intent.getStringExtra("place");
        String company = intent.getStringExtra("company");
        String experience = intent.getStringExtra("experience");
        String designation = intent.getStringExtra("designation");
        Toast.makeText(this,  email + " " + userName + " " + firstName +  " " + lastName + "  " + hNo + " " + city + " " +state + " " + street + " " + country + " " + date + " " + place + " " +company + " " +experience + " " + designation , Toast.LENGTH_LONG).show();
        EditText bankTxt = findViewById(R.id.bank_txt);
        bankTxt.setText("State Bank Of India");
        EditText holderTxt = findViewById(R.id.holder_txt);
        holderTxt.setText("Mangali Manohar");
        EditText accountNoTxt = findViewById(R.id.accountno_txt);
        accountNoTxt.setText("35069594608");
        EditText ifscTxt = findViewById(R.id.ifsc_txt);
        ifscTxt.setText("Sbin0012907");
        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(v -> {
            finish();
        });
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(v -> {
            String bank = bankTxt.getText().toString();
            String holder = holderTxt.getText().toString();
            String accountNo = accountNoTxt.getText().toString();
            String ifsc = ifscTxt.getText().toString();
            Intent creditIntent = new Intent(this, CreditCardDetailsActivity.class);
            creditIntent.putExtra("email",email);
            creditIntent.putExtra("userName",userName);
            creditIntent.putExtra("firstName",firstName);
            creditIntent.putExtra("lastName",lastName);
            creditIntent.putExtra("hNo",hNo);
            creditIntent .putExtra("street",street);
            creditIntent.putExtra("city",city);
            creditIntent.putExtra("state",state);
            creditIntent.putExtra("country",country);
            creditIntent.putExtra("date",date);
            creditIntent.putExtra("place",place);
            creditIntent.putExtra("company",company);
            creditIntent .putExtra("experience",experience);
            creditIntent.putExtra("designation",designation);
            creditIntent.putExtra("bank",bank);
            creditIntent .putExtra("holder",holder);
            creditIntent.putExtra("accountNo",accountNo);
            creditIntent.putExtra("ifsc",ifsc);
            startActivity(creditIntent);
        });
    }
}