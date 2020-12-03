package ru.startandroid.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
    }

    public void onClickSignIn(View v){
        Intent intent = new Intent(SignIn.this, Main2Activity.class);
        startActivity(intent);
    }
    public void onClickCreateNewAcc(View v){
        Intent intent = new Intent(SignIn.this, SignUp.class);
        startActivity(intent);
    }
}
