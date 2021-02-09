package com.example.aco_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class EventAdapter extends BaseAdapter {

    Context context;
    Event[] events;
    LayoutInflater inflater;

    public EventAdapter(Context context, Event[] events){
        this.context = context;
        this.events = events;
        inflater = (LayoutInflater.from(context));
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.event, null);
        TextView eventName = (TextView) convertView.findViewById(R.id.event_name);
        TextView eventDate = (TextView) convertView.findViewById(R.id.event_date);
        TextView eventChoirs = (TextView) convertView.findViewById(R.id.event_choirs);
        TextView eventLocation = (TextView) convertView.findViewById(R.id.event_location);
        Event currEvent = events[position];
        eventName.setText(currEvent.name);
        eventDate.setText(currEvent.date);
        eventChoirs.setText(currEvent.choirs);
        eventLocation.setText(currEvent.location);
        return convertView;
    }

    @Override
    public int getCount() {
        return events.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
}
