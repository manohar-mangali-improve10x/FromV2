package com.improve10x.formsv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddressActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address);
        Intent intent = getIntent();
        String email =  intent.getStringExtra("email");
        String userName = intent.getStringExtra("userName");
        String firstName = intent.getStringExtra("firstName");
        String lastName = intent.getStringExtra("lastName");
        Toast.makeText(this,   email + " " + userName  + " " + firstName + " " + lastName, Toast.LENGTH_LONG).show();
        EditText hNoTxt = findViewById(R.id.hno_txt);
        hNoTxt.setText("1-276/1");
        EditText streetTxt = findViewById(R.id.street_txt);
        streetTxt.setText("BC Colony");
        EditText cityTxt = findViewById(R.id.city_txt);
        cityTxt.setText("Nandyal");
        EditText stateTxt = findViewById(R.id.state_txt);
        stateTxt.setText("Andhra Pradesh");
        EditText countryTxt = findViewById(R.id.country_txt);
        countryTxt.setText("India");
        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(v -> {
            finish();
        });
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(v -> {
            String hNo  = hNoTxt.getText().toString();
            String street = streetTxt.getText().toString();
            String city = cityTxt.getText().toString();
            String state = stateTxt.getText().toString();
            String country = countryTxt.getText().toString();
            Intent birthIntent = new Intent(this,BirthDetailsActivity.class);
            birthIntent.putExtra("email",email);
            birthIntent.putExtra("userName",userName);
            birthIntent.putExtra("firstName",firstName);
            birthIntent.putExtra("lastName",lastName);
            birthIntent.putExtra("hNo",hNo);
            birthIntent .putExtra("street",street);
            birthIntent.putExtra("city",city);
            birthIntent.putExtra("state",state);
            birthIntent.putExtra("country",country);
            startActivity(birthIntent);
        });
    }
}