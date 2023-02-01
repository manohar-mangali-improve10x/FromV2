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
        Toast.makeText(this, email + " " + userName + " " + firstName + " " + lastName + "  " + hNo + " " + city + " " + state + " " + street + " " + country + " " + date + " " + place + " " + company + " " + experience + " " + designation + " " + bank + " " + holder + " " + accountNo + "  " + ifsc + " " + cardNo + " " + cardHolder + " " + expiry + " " + cvv + "  " + panNo + " " + aadhaar, Toast.LENGTH_LONG).show();


        TextView emailTxt = findViewById(R.id.email_txt);
        emailTxt.setText(email);
        TextView userNameTxt = findViewById(R.id.user_name_txt);
        userNameTxt.setText(userName);
        TextView firstNameTxt = findViewById(R.id.first_name_txt);
        emailTxt.setText(firstName);
        TextView lastNameTxt = findViewById(R.id.last_name_txt);
        userNameTxt.setText(lastName);
        TextView hNoTxt = findViewById(R.id.hno_txt);
        emailTxt.setText(hNo);
        TextView streetTxt = findViewById(R.id.street_name_txt);
        userNameTxt.setText(street);
        TextView cityTxt = findViewById(R.id.city_txt);
        emailTxt.setText(city);
        TextView sateTxt = findViewById(R.id.state_txt);
        userNameTxt.setText(state);
        TextView countryTxt = findViewById(R.id.country_txt);
        emailTxt.setText(country);
        TextView dateOfBirthTxt = findViewById(R.id.date_of_birth_txt);
        userNameTxt.setText(date);
        TextView placeOfBirthTxt = findViewById(R.id.place_txt);
        emailTxt.setText(place);
        TextView currentCompanyTxt = findViewById(R.id.current_company_txt);
        userNameTxt.setText(company);
        TextView totalExperienceTxt = findViewById(R.id.total_experience_txt);
        emailTxt.setText(experience);
        TextView designationTxt = findViewById(R.id.designation_txt);
        userNameTxt.setText(designation);
    }
}
