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


public class MainMenu extends Activity {

    Button owner, serviceProvider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        setValues();
        owner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),OwnerDetails.class);
                startActivity(intent);
            }
        });
        serviceProvider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ServiceProviders.class);
                startActivity(intent);
            }
        });
    }
    public void setValues() {
        owner = (Button) findViewById(R.id.owner);
        serviceProvider = (Button) findViewById(R.id.serviceprovider);
    }
}
