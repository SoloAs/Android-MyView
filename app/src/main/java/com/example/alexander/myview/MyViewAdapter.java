package com.example.alexander.myview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by Alexander on 9/30/2014.
 */
public class MyViewAdapter extends ArrayAdapter<User> {

    private ArrayList<User> users;

    public MyViewAdapter(Context context, ArrayList<User> users) {
        super(context, R.layout.my_view_layout);
        this.users = users;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        MyView view = (MyView)convertView;
        if (view == null) {
        //    LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //    convertView = inflater.inflate(R.layout.my_view_layout, null);

        //    convertView.setTag(view);
            view = new MyView(getContext());
        }
        view.populate(users.get(position));
        return view;

    }
}
