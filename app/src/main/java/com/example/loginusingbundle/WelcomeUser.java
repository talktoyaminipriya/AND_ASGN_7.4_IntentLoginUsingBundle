package com.example.loginusingbundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class WelcomeUser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_user);

        TextView tv =  (TextView) findViewById(R.id.welcome);

        Bundle getbundle = this.getIntent().getExtras();

        String res = " Welcome to " +getbundle.getString("Bundle Name");

        tv.setText(res);
    }
}
