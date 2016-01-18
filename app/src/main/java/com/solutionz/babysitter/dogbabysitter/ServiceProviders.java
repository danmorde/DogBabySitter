package com.solutionz.babysitter.dogbabysitter;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class ServiceProviders extends Activity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_providers);
        // Get ListView object from xml
        listView = (ListView) findViewById(R.id.serviceproviderlist);

        // Defined Array values to show in ListView
        String[] values = new String[] { "Nir Aharoni",
                "Motti Dahan",
                "Dan Mordechay",
                "Elkana David",
                "Amiram Elzam",
                "Aviram Elkobi",
                "Shimri Peretz",
                "Matan Shlomi"
        };

        // Define a new Adapter
        // First parameter - Context
        // Second parameter - Layout for the row
        // Third parameter - ID of the TextView to which the data is written
        // Forth - the Array of data

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);


        // Assign adapter to ListView
        listView.setAdapter(adapter);

        // ListView Item Click Listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // ListView Clicked item index
                int itemPosition     = position;

                // ListView Clicked item value
                String  itemValue    = (String) listView.getItemAtPosition(position);
                Intent intent = new Intent(getApplicationContext(), ServiceProvidersDetails.class);
                intent.putExtra("selectedProvider", itemValue);
                startActivity(intent);

            }

        });

    }

}
