package com.example.waterbill.activites;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.waterbill.R;

public class Loginpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginscreen);

       TextView textfp = findViewById(R.id.forgt_pass);
        textfp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Loginpage.this, Forgotpassword.class);
                startActivity(intent);
            }
        });
        Button button3 = findViewById(R.id.button_login);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Loginpage.this, HomeTool_barScreen.class);
                startActivity(intent);
            }
        });

    }
}
