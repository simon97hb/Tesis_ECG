package com.example.toshibac45.tesis_ecg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sign_up extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        Button signUpButton = (Button) findViewById(R.id.email_sign_up_button);

        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDrawerActivity();
            }
        });
    }

    private void openDrawerActivity(){
        Intent intent = new Intent(this, Navigation.class);
        startActivity(intent);
    }
}
