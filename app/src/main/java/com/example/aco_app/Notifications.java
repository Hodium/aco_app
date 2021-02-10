package com.example.aco_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

public class Notifications extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.notifications);

        ListView listView = (ListView) findViewById(R.id.notifications_list_view);
        Notification list[] = new Notification[5];
        Notification note1 = new Notification("INFORMAÇÃO - Não há ensaio.","09/01/2019", 0);
        Notification note2 = new Notification("Bem-vindos novos coralistas", "11/03/2021", 1);
        Notification note3 = new Notification("Audições dia 3", "16/08/2020", 2);
        Notification note4 = new Notification("Welcome all!", "14/12/2020", 1);
        Notification note5 = new Notification("Vamos ao EuropaCantat2037! =D", "37/13/2036", 2);
        list[0] = note1;
        list[1] = note2;
        list[2] = note3;
        list[3] = note4;
        list[4] = note5;

        NotificationAdapter adapter = new NotificationAdapter(getApplicationContext(), list);
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