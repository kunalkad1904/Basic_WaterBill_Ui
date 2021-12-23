package com.example.waterbill.activites;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.waterbill.R;
import com.google.android.material.textfield.TextInputEditText;

public class Forgotpassword extends AppCompatActivity {
    private TextInputEditText textInputEmail;
    private TextInputEditText textInputPassword;
    private TextInputEditText textInputConfirmPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forgotpassword);
        textInputEmail = findViewById(R.id.forgotppageemail);
        textInputPassword = findViewById(R.id.forgotppassword);
        textInputConfirmPassword = findViewById(R.id.forgotpconfirmpassword);

        Button button = findViewById(R.id.button_submit);
        button.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            if(textInputEmail.getText().toString().trim().length()==0){
                Toast.makeText(Forgotpassword.this, "Please Enter Email Correctly", Toast.LENGTH_SHORT).show();
                textInputEmail.requestFocus();
            }else if(textInputPassword.getText().toString().trim().length()==0){
                Toast.makeText(Forgotpassword.this, "Please FILL", Toast.LENGTH_SHORT).show();
                textInputPassword.requestFocus();
            }else if(textInputConfirmPassword.getText().toString().trim().length()==0){
                Toast.makeText(Forgotpassword.this, "Please enter mobile number", Toast.LENGTH_SHORT).show();
                textInputConfirmPassword.requestFocus();
                textInputPassword.requestFocus();
            }else if(!textInputConfirmPassword.getText().toString().trim().equals(textInputPassword.getText().toString().trim())){
                Toast.makeText(Forgotpassword.this, "Password do not match", Toast.LENGTH_SHORT).show();
                textInputConfirmPassword.requestFocus();

            }else{
                Toast.makeText(Forgotpassword.this, "Submitted", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Forgotpassword.this, Loginpage.class);
                startActivity(intent);
            }
        }
        });
    }
}