package com.example.mp_pertemuan3;

import android.os.Bundle;
import android.content.Intent;

import android.content.Intent;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

import android.widget.Button;
import android.widget.Toolbar;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText username, passoword;
    Button btnlogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username =(EditText)findViewById(R.id.username);
        passoword=(EditText)findViewById(R.id.pass);
        btnlogin=(Button)findViewById(R.id.login);


        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usernameKey = username.getText().toString();
                String passwordKey = passoword.getText().toString();

                if (usernameKey.equals("ricky") && passwordKey.equals("666"))
                {
                    Toast.makeText(getApplicationContext(), "LOGIN SUKSES",
                            Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, Success.class);
                    MainActivity.this.startActivity(intent);
                    finish();

                }else{
                    startActivity(new Intent(MainActivity.this,FailedLogin.class));

                }

            }
        });
        Toolbar toolbar=findViewById(R.id.toolbar);
        setActionBar(toolbar);
        getActionBar().setDisplayHomeAsUpEnabled(true);
    }
}