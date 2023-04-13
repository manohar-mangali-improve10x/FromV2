package com.improve10x.formsv2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class IdentityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identity);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Identity");
        actionBar.setDisplayHomeAsUpEnabled(true);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
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
            Intent intent1 = new Intent(this, RegistrationSuccessfullActivity.class);
            intent1.putExtras(bundle);
            intent1.putExtra("panNo", panNo);
            intent1.putExtra("aadhaarNo", aadhaarNo);
            startActivity(intent1);

        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Toast.makeText(this, "good bye", Toast.LENGTH_SHORT).show();
            finish();
            return true;
        } else if (item.getItemId() == R.id.help_item) {
            Toast.makeText(this, "help me", Toast.LENGTH_SHORT).show();
            return true;
        } else if (item.getItemId() == R.id.logout_item) {
            Toast.makeText(this, "logout", Toast.LENGTH_SHORT).show();
            return true;
        } else if (item.getItemId() == R.id.signup_item) {
            Toast.makeText(this, "signup app", Toast.LENGTH_SHORT).show();
            return true;
        } else if (item.getItemId() == R.id.share_item) {
            Toast.makeText(this, "share with friends", Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.identity_menu,menu);
        return true;
    }
}