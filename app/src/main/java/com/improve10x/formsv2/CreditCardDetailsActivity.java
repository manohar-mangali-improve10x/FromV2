package com.improve10x.formsv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CreditCardDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credit_card_details);
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
        String bank = intent.getStringExtra("bank");
        String holder = intent.getStringExtra("holder");
        String accountNo = intent.getStringExtra("accountNo");
        String ifsc = intent.getStringExtra("ifsc");
        Toast.makeText(this,  email + " " + userName + " " + firstName +  " " + lastName + "  " + hNo + " " + city + " " +state + " " + street + " " + country + " " + date + " " + place + " " +company + " " +experience + " " + designation + " " + bank + " " + holder + " " + accountNo + "  " + ifsc, Toast.LENGTH_LONG).show();
        EditText cardNoTxt = findViewById(R.id.cardno_txt);
        cardNoTxt.setText("292082002222");
        EditText cardHolderTxt = findViewById(R.id.cardholder_txt);
        cardHolderTxt.setText("Mangali Manohar");
        EditText expiryTxt = findViewById(R.id.expiry_txt);
        expiryTxt.setText("05/2025");
        EditText cvvTxt = findViewById(R.id.cvv_txt);
        cvvTxt.setText("520");
        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(v -> {
            finish();
        });
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(v -> {
            String cardNo = cardNoTxt.getText().toString();
            String cardHolder = cardHolderTxt.getText().toString();
            String expiry = expiryTxt.getText().toString();
            String cvv = cvvTxt.getText().toString();
            Intent identityIntent = new Intent(this, IdentityActivity.class);
            identityIntent.putExtra("email",email);
            identityIntent.putExtra("userName",userName);
            identityIntent.putExtra("firstName",firstName);
            identityIntent.putExtra("lastName",lastName);
            identityIntent.putExtra("hNo",hNo);
            identityIntent .putExtra("street",street);
            identityIntent.putExtra("city",city);
            identityIntent.putExtra("state",state);
            identityIntent.putExtra("country",country);
            identityIntent.putExtra("date",date);
            identityIntent.putExtra("place",place);
            identityIntent.putExtra("company",company);
            identityIntent .putExtra("experience",experience);
            identityIntent.putExtra("designation",designation);
            identityIntent.putExtra("bank",bank);
            identityIntent .putExtra("holder",holder);
            identityIntent.putExtra("accountNo",accountNo);
            identityIntent.putExtra("ifsc",ifsc);
            identityIntent.putExtra("cardNo",cardNo);
            identityIntent .putExtra("cardHolder",cardHolder);
            identityIntent.putExtra("expiry",expiry);
            identityIntent.putExtra("cvv",cvv);
            startActivity(identityIntent);
        });
    }
}