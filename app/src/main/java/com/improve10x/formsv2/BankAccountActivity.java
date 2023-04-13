package com.improve10x.formsv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class BankAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_account);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
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
            creditIntent.putExtras(bundle);
            creditIntent.putExtra("bank",bank);
            creditIntent .putExtra("holder",holder);
            creditIntent.putExtra("accountNo",accountNo);
            creditIntent.putExtra("ifsc",ifsc);
            startActivity(creditIntent);
        });
    }
}