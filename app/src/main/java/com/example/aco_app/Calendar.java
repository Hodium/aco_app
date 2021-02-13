package com.example.aco_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

public class Calendar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.calendar);

        ListView listView = (ListView) findViewById(R.id.calendar_list_view);
        Event list[] = new Event[3];
        Event event1 = new Event("Evento1","09/02/2020", "emCANTUS", "Odivelas");
        Event event2 = new Event("Evento2", "11/02/2020", "emCANTUS & entreOITAVAS", "Igreja Santa Maria de Loures");
        Event event3 = new Event("Evento3", "14/02/2020", "comPASSOS", "Mosteiro D. Dinis");
        list[0] = event1;
        list[1] = event2;
        list[2] = event3;

        EventAdapter adapter = new EventAdapter(getApplicationContext(), list);
        listView.setAdapter(adapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}