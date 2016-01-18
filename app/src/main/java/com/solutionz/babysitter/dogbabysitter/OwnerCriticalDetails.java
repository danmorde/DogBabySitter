package com.solutionz.babysitter.dogbabysitter;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class OwnerCriticalDetails extends Activity {
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_owner_critical_details);
        setValues();
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Submitted", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void setValues() {
        submit = (Button) findViewById(R.id.submit);

    }


}
