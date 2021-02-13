package com.example.aco_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class NotificationAdapter extends BaseAdapter {

    Context context;
    Notification[] notifications;
    LayoutInflater inflater;

    public NotificationAdapter(Context context, Notification[] notifications){
        this.context = context;
        this.notifications = notifications;
        inflater = (LayoutInflater.from(context));
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.notification, null);
        RelativeLayout notificationBackground = (RelativeLayout) convertView.findViewById(R.id.notification_background);
        TextView notificationName = (TextView) convertView.findViewById(R.id.notification_name);
        TextView notificationDate = (TextView) convertView.findViewById(R.id.notification_date);
        Notification currNotification = notifications[position];
        switch (currNotification.type){
            case 0:
                notificationBackground.setBackgroundColor(0xFF00FF00);
                break;
            case 1:
                notificationBackground.setBackgroundColor(0xFFFF0000);
                break;
            case 2:
                notificationBackground.setBackgroundColor(0xFF0000FF);
                break;
        }
        notificationName.setText(currNotification.name);
        notificationDate.setText(currNotification.date);
        return convertView;
    }

    @Override
    public int getCount() {
        return notifications.length;
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
