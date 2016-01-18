package com.solutionz.babysitter.dogbabysitter;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;


public class OwnerDetails extends Activity {

    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_owner_details);
        setValues();
        // Spinner element
        Spinner spinner = (Spinner) findViewById(R.id.dogsize);
        // Spinner click listener
        //  spinner.setOnItemSelectedListener(this);
        // Spinner Drop down elements
        List<String> categories = new ArrayList<String>();
        categories.add("size");
        categories.add("Small");
        categories.add("Medium");
        categories.add("Large");
        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);
        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);


        // Spinner element
        Spinner dogyear = (Spinner) findViewById(R.id.dogyear);
        // Spinner click listener
        //  spinner.setOnItemSelectedListener(this);
        // Spinner Drop down elements
        List<String> categories_year = new ArrayList<String>();
        categories_year.add("year");


        categories_year.add("0");
        categories_year.add("1");
        categories_year.add("2");
        categories_year.add("3");
        categories_year.add("4");
        categories_year.add("5");
        categories_year.add("6");
        categories_year.add("7");
        categories_year.add("8");
        categories_year.add("9");
        categories_year.add("10");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter_year = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories_year);
        // Drop down layout style - list view with radio button
        dataAdapter_year.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // attaching data adapter to spinner
        dogyear.setAdapter(dataAdapter_year);



        // Spinner element
        Spinner dogmonth = (Spinner) findViewById(R.id.dogmonth);
        // Spinner click listener
        //  spinner.setOnItemSelectedListener(this);
        // Spinner Drop down elements
        List<String> categories_month = new ArrayList<String>();
        categories_month.add("month");

        categories_month.add("1");
        categories_month.add("2");
        categories_month.add("3");
        categories_month.add("4");
        categories_month.add("5");
        categories_month.add("6");
        categories_month.add("7");
        categories_month.add("8");
        categories_month.add("9");
        categories_month.add("10");
        categories_month.add("11");
        categories_month.add("12");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter_month = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories_month);
        // Drop down layout style - list view with radio button
        dataAdapter_month.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // attaching data adapter to spinner
        dogmonth.setAdapter(dataAdapter_month);



        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), OwnerCriticalDetails.class);
                startActivity(intent);
            }
        });

    }

    public void setValues() {
        submit = (Button) findViewById(R.id.submit);

    }

}
