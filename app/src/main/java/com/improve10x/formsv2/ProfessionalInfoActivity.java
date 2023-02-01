package com.improve10x.formsv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ProfessionalInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_professional_info);
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
        Toast.makeText(this, email + " " + userName + " " + firstName +  " " + lastName + "  " + hNo + " " + city + " " +state + " " + street + " " + country + " " + date + " " + place, Toast.LENGTH_LONG).show();
        EditText companyTxt = findViewById(R.id.company_txt);
        companyTxt.setText("intel");
        EditText experienceTxt = findViewById(R.id.exp_txt);
        experienceTxt.setText("2 Years");
        EditText designationTxt = findViewById(R.id.total_experience_txt);
        designationTxt.setText("Java Developer");
        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(v -> {
            finish();
        });
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(v -> {
            String company = companyTxt.getText().toString();
            String experience = experienceTxt.getText().toString();
            String designation = designationTxt.getText().toString();
            Intent bankIntent = new Intent(this, BankAccountActivity.class);
            bankIntent.putExtra("company",company);
            bankIntent.putExtra("email",email);
            bankIntent.putExtra("userName",userName);
            bankIntent.putExtra("firstName",firstName);
            bankIntent.putExtra("lastName",lastName);
            bankIntent.putExtra("hNo",hNo);
            bankIntent .putExtra("street",street);
            bankIntent.putExtra("city",city);
            bankIntent.putExtra("state",state);
            bankIntent.putExtra("country",country);
            bankIntent.putExtra("date",date);
            bankIntent.putExtra("place",place);
            bankIntent .putExtra("experience",experience);
            bankIntent.putExtra("designation",designation);
            startActivity(bankIntent);
        });
    }
}