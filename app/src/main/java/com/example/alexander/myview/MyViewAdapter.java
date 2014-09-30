package com.example.alexander.myview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/**
 * Created by Alexander on 9/30/2014.
 */
public class MyViewAdapter extends ArrayAdapter<MyView> {
    public MyViewAdapter(Context context, int res) {
        super(context, res);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        MyView view = (MyView) convertView;

        if (view == null) {
            view = new MyView(getContext());
            //view.setBackgroundResource(R.drawable.mario_icon);
        }

        view.populate(getItem(position));
        return view;
    }
}
