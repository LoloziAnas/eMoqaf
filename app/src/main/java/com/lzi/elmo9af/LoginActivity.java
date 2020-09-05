package com.lzi.elmo9af;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void registerBtnClick(View view) {
        Intent intent   = new Intent(this,RegisterActivity.class);
        startActivity(intent);
    }
    public void forgetPasword(View view) {
        Intent intent   = new Intent(this,ForgetPasswordActivity.class);
        startActivity(intent);
    }
}
