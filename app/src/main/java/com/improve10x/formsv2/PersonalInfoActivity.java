package com.improve10x.formsv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PersonalInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_info);
        Intent intent = getIntent();
        String email = intent.getStringExtra("email");
        Toast.makeText(this, email, Toast.LENGTH_LONG).show();
        EditText userNameTxt = findViewById(R.id.username_txt);
        userNameTxt.setText("Mangali Manohar");
        EditText firstNameTxt = findViewById(R.id.firstname_txt);
        firstNameTxt.setText("Mangali");
        EditText lastNameTxt = findViewById(R.id.lastname_text);
        lastNameTxt.setText("Manohar");
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(v -> {
            String userName = userNameTxt.getText().toString();
            String firstName = firstNameTxt.getText().toString();
            String  lastName = lastNameTxt.getText().toString();
            Intent addressIntent = new Intent(this, AddressActivity.class);
            addressIntent.putExtra("email",email);
            addressIntent.putExtra("userName",userName);
            addressIntent.putExtra("firstName",firstName);
            addressIntent.putExtra("lastName",lastName);
            startActivity(addressIntent);
        });
        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(v -> {
            finish();
        });
    }
}