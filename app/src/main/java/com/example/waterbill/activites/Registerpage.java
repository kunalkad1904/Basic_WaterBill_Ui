package com.example.waterbill.activites;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.waterbill.R;
import com.google.android.material.textfield.TextInputEditText;

public class Registerpage extends AppCompatActivity {
    private TextInputEditText textInputUsername;
    private TextInputEditText textInputEmail;
    private TextInputEditText textInputMobileNo;
    private TextInputEditText textInputPassword;
    private TextInputEditText textInputDob;
    private TextInputEditText textInputUniqueid;
    private TextInputEditText textInputAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);
        textInputUsername = findViewById(R.id.username);
        textInputEmail = findViewById(R.id.email);
        textInputMobileNo = findViewById(R.id.mobileno);
        textInputPassword = findViewById(R.id.password);
        textInputDob = findViewById(R.id.dob);
        textInputUniqueid = findViewById(R.id.uniqueid);
        textInputAddress = findViewById(R.id.address);

        Button button = findViewById(R.id.btn_register);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(textInputUsername.getText().toString().trim().length()==0){
                    Toast.makeText(Registerpage.this, "Please Enter Username Correctly", Toast.LENGTH_SHORT).show();
                    textInputUsername.requestFocus();
                }else if(textInputEmail.getText().toString().trim().length()==0){
                    Toast.makeText(Registerpage.this, "Please Enter Username Correctly", Toast.LENGTH_SHORT).show();
                    textInputEmail.requestFocus();
                }else if(textInputMobileNo.getText().toString().trim().length()==0){
                    Toast.makeText(Registerpage.this, "Please enter mobile number", Toast.LENGTH_SHORT).show();
                    textInputMobileNo.requestFocus();
                }else if(textInputUniqueid.getText().toString().trim().length()!=10){
                    Toast.makeText(Registerpage.this, "Please enter valid mobile number", Toast.LENGTH_SHORT).show();
                    textInputUniqueid.requestFocus();
                }else if(textInputPassword.getText().toString().trim().length()==0){
                    Toast.makeText(Registerpage.this, "Please enter password", Toast.LENGTH_SHORT).show();
                    textInputPassword.requestFocus();
                }else{
                    Toast.makeText(Registerpage.this, "Submitted", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Registerpage.this, Loginpage.class);
                    startActivity(intent);
                }
            }
        });
    }
}