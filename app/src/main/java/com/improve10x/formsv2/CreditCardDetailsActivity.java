package com.improve10x.formsv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CreditCardDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credit_card_details);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
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
            identityIntent.putExtras(bundle);
            identityIntent.putExtra("cardNo",cardNo);
            identityIntent .putExtra("cardHolder",cardHolder);
            identityIntent.putExtra("expiry",expiry);
            identityIntent.putExtra("cvv",cvv);
            startActivity(identityIntent);
        });
    }
}