package com.example.alexander.myview;

import android.app.Activity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.jar.Attributes;


public class MyActivity extends Activity {


    private ArrayList<User> users;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        users = new ArrayList<User>() {
            {
                add(new User("name1", "phone1", R.drawable.mario_icon));
                add(new User("name2", "phone2", R.drawable.mario_icon));
                add(new User("name3", "phone3", R.drawable.mario_icon));
                add(new User("name4", "phone4", R.drawable.mario_icon));
                add(new User("name5", "phone5", R.drawable.mario_icon));
            }
        };
        MyViewAdapter adapter = new MyViewAdapter(this, users);
        // находим список
        ListView lvMyAct = (ListView) findViewById(R.id.myListView);
        lvMyAct.setAdapter(adapter);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
