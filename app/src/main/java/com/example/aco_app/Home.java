package com.example.aco_app;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.home);
    }

    public void calendarClick(View view) {
        Intent intent = new Intent(this, Calendar.class);
        startActivity(intent);
    }

    public void musicClick(View view) {
        Intent intent = new Intent(this, Music.class);
        startActivity(intent);
    }

    public void notificationsClick(View view) {
        Intent intent = new Intent(this, Notification.class);
        startActivity(intent);
    }

    public void mediaClick(View view) {
        Intent intent = new Intent(this, Media.class);
        startActivity(intent);
    }
}