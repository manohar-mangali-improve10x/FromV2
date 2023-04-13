package com.improve10x.formsv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ProfessionalInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_professional_info);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
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
            bankIntent.putExtras(bundle);
            bankIntent.putExtra("company",company);
            bankIntent .putExtra("experience",experience);
            bankIntent.putExtra("designation",designation);
            startActivity(bankIntent);
        });
    }
}