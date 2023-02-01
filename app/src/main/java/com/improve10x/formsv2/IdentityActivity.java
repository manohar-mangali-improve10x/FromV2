package com.improve10x.formsv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class IdentityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identity);
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
        String cardNo = intent.getStringExtra("cardNo");
        String cardHolder = intent.getStringExtra("cardHolder");
        String expiry = intent.getStringExtra("expiry");
        String cvv = intent.getStringExtra("cvv");
        Toast.makeText(this,  email + " " + userName + " " + firstName +  " " + lastName + "  " + hNo + " " + city + " " +state + " " + street + " " + country + " " + date + " " + place + " " +company + " " +experience + " " + designation + " " + bank + " " + holder + " " + accountNo + "  " + ifsc+ " " + cardNo + " " + cardHolder + " " + expiry + " " + cvv, Toast.LENGTH_LONG).show();
        EditText panNoTxt = findViewById(R.id.panno_txt);
        panNoTxt.setText("FHDFG342K");
        EditText aadhaarNoTxt = findViewById(R.id.aadharno_txt);
        aadhaarNoTxt.setText("530520521232");
        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(v -> {
            finish();
        });
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(v -> {
            String panNo = panNoTxt.getText().toString();
            String aadhaarNo = aadhaarNoTxt.getText().toString();
            Intent intent1 = new Intent(this,RegistrationSuccessfullActivity.class);
            intent1.putExtra("email",email);
            intent1.putExtra("userName",userName);
            intent1.putExtra("firstName",firstName);
            intent1.putExtra("lastName",lastName);
            intent1.putExtra("hNo",hNo);
            intent1.putExtra("street",street);
            intent1.putExtra("city",city);
            intent1.putExtra("state",state);
            intent1.putExtra("country",country);
            intent1.putExtra("date",date);
            intent1.putExtra("place",place);
            intent1.putExtra("company",company);
            intent1.putExtra("experience",experience);
            intent1.putExtra("designation",designation);
            intent1.putExtra("bank",bank);
            intent1.putExtra("holder",holder);
            intent1.putExtra("accountNo",accountNo);
            intent1.putExtra("ifsc",ifsc);
            intent1.putExtra("cardNo",cardNo);
            intent1.putExtra("cardHolder",cardHolder);
            intent1.putExtra("expiry",expiry);
            intent1.putExtra("cvv",cvv);
            intent1.putExtra("panNo",panNo);
            intent1.putExtra("aadhaarNo",aadhaarNo);
            startActivity(intent1);

        });
    }
}