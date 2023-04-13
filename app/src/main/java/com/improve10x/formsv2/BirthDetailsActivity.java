package com.improve10x.formsv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class BirthDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birth_details);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
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
            professionalIntent.putExtras(bundle);
            professionalIntent.putExtra("date",dateOfBirth);
            professionalIntent.putExtra("place",placeOfBirth);
            startActivity(professionalIntent);
        });
    }
}