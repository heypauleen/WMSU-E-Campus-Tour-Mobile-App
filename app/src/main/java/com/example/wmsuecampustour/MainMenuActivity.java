package com.example.wmsuecampustour;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainMenuActivity extends AppCompatActivity {

    private Button btn_AboutUs;
    private Button btn_Administration;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmenu);
        btn_AboutUs = findViewById(R.id.buttonAboutUs);
        btn_Administration = findViewById(R.id.btnadmission);
        btn_AboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenuActivity.this, AboutUsActivity.class);
                startActivity(intent);
            }
        });
        btn_Administration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenuActivity.this, AdministrationActivity.class);
                startActivity(intent);
            }
        });


    }
}
