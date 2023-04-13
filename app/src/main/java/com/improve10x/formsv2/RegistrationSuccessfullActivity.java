package com.improve10x.formsv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class RegistrationSuccessfullActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_successfull);
        Intent intent = getIntent();
        String email = intent.getStringExtra("email");
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
        String panNo = intent.getStringExtra("panNo");
        String aadhaar = intent.getStringExtra("aadhaarNo");

        TextView emailTxt = findViewById(R.id.email_txt);
        emailTxt.setText(email);
        TextView userNameTxt = findViewById(R.id.user_name_txt);
        userNameTxt.setText(userName);
        TextView firstNameTxt = findViewById(R.id.first_name_txt);
        firstNameTxt.setText(firstName);
        TextView lastNameTxt = findViewById(R.id.last_name_txt);
        lastNameTxt.setText(lastName);
        TextView hNoTxt = findViewById(R.id.hno_txt);
        hNoTxt.setText(hNo);
        TextView streetTxt = findViewById(R.id.street_name_txt);
        streetTxt.setText(street);
        TextView cityTxt = findViewById(R.id.city_txt);
        cityTxt.setText(city);
        TextView stateTxt = findViewById(R.id.state_txt);
        stateTxt.setText(state);
        TextView countryTxt = findViewById(R.id.country_txt);
        countryTxt.setText(country);
        TextView dateOfBirthTxt = findViewById(R.id.date_of_birth_txt);
        dateOfBirthTxt.setText(date);
        TextView placeOfBirthTxt = findViewById(R.id.place_txt);
        placeOfBirthTxt.setText(place);
        TextView currentCompanyTxt = findViewById(R.id.current_company_txt);
        currentCompanyTxt.setText(company);
        TextView totalExperienceTxt = findViewById(R.id.total_experience_txt);
        totalExperienceTxt.setText(experience);
        TextView designationTxt = findViewById(R.id.designation_txt);
        designationTxt.setText(designation);
        TextView bankTxt = findViewById(R.id.bank_name_txt);
        bankTxt.setText(bank);
        TextView holderTxt = findViewById(R.id.account_holder_txt);
        holderTxt.setText(holder);
        TextView accountNoTxt = findViewById(R.id.account_number_txt);
        accountNoTxt.setText(accountNo);
        TextView ifscTxt = findViewById(R.id.ifsc_code_txt);
        ifscTxt.setText(ifsc);
        TextView cardNoTxt = findViewById(R.id.total_experience_txt);
        cardNoTxt.setText(cardNo);
        TextView cardHolderTxt = findViewById(R.id.designation_txt);
        cardHolderTxt.setText(cardHolder);
        TextView expiryTxt = findViewById(R.id.card_holder_txt);
        expiryTxt.setText(expiry);
        TextView cvvTxt = findViewById(R.id.cvv_txt);
        cvvTxt.setText(cvv);
        TextView panNoTxt = findViewById(R.id.pan_number);
        panNoTxt.setText(panNo);
        TextView aadhaarTxt = findViewById(R.id.aadhar_number_txt);
        aadhaarTxt.setText(aadhaar);
    }
}
