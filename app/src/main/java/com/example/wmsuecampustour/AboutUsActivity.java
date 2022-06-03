package com.example.wmsuecampustour;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class AboutUsActivity extends AppCompatActivity {
    private Button btn_visionmission;
    private Button btn_strategicplan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);


        btn_visionmission = findViewById(R.id.btnvisionmission);
        btn_strategicplan = findViewById(R.id.btnstrategicplan);

        btn_visionmission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AboutUsActivity.this, VisionMissionActivity.class);
                startActivity(intent);
            }
        });
        btn_strategicplan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AboutUsActivity.this,StrategicPlanActivity.class);
                startActivity(intent);

            }
        });

    }
}
