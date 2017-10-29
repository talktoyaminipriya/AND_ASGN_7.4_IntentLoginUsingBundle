package com.example.loginusingbundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText username;
    Button btn;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         username = (EditText) findViewById(R.id.un);
         password = (EditText) findViewById(R.id.pwd);
         btn = (Button) findViewById(R.id.button);

        btn.setOnClickListener(this);
    }


    @Override
    public  void onClick(View view) {

        if (!username.getText().toString().isEmpty() && !password.getText().toString().isEmpty()) {
            Intent in = new Intent(MainActivity.this, WelcomeUser.class);
            Bundle bundle = new Bundle();
            bundle.putString("Bundle Name", username.getText().toString().trim());
            in.putExtras(bundle);
            startActivity(in);
        } else {
            Toast.makeText(MainActivity.this, "Please enter Username and Password", Toast.LENGTH_SHORT).show();
            username.requestFocus();
        }
    }

}

