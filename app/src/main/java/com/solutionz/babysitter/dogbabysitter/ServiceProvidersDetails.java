package com.solutionz.babysitter.dogbabysitter;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class ServiceProvidersDetails extends Activity {
    Button ready;
    private String name;
    TextView txtname;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_providers_details);
        setValues();
        ready.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Payments.class);
                startActivity(intent);
            }
        });
    }

    public void setValues() {
        Intent intent = getIntent();
        name = intent.getStringExtra("selectedProvider");
        ready = (Button) findViewById(R.id.ready);
        txtname = (TextView) findViewById(R.id.name);
        txtname.setText(name);
    }

}
