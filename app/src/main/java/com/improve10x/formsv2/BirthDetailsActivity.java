package com.improve10x.formsv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BirthDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birth_details);
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
        Toast.makeText(this,   email + " " + userName + "  " + firstName + "  " + lastName + " " + hNo + " " + city + " " + state + " " + street + " " + country, Toast.LENGTH_LONG).show();
        EditText dateTxt = findViewById(R.id.date_txt);
        dateTxt.setText("06/09/2000");
        EditText placeTxt = findViewById(R.id.place_txt);
        placeTxt.setText("Nandyal");
        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(v -> {
            finish();
        });
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(v -> {
            String dateOfBirth = dateTxt.getText().toString();
            String placeOfBirth = placeTxt.getText().toString();
            Intent professionalIntent = new Intent(this, ProfessionalInfoActivity.class);
            professionalIntent.putExtra("email",email);
            professionalIntent.putExtra("userName",userName);
            professionalIntent.putExtra("firstName",firstName);
            professionalIntent.putExtra("lastName",lastName);
            professionalIntent.putExtra("hNo",hNo);
            professionalIntent .putExtra("street",street);
            professionalIntent.putExtra("city",city);
            professionalIntent.putExtra("state",state);
            professionalIntent.putExtra("country",country);
            professionalIntent.putExtra("date",dateOfBirth);
            professionalIntent.putExtra("place",placeOfBirth);
            startActivity(professionalIntent);
        });
    }
}