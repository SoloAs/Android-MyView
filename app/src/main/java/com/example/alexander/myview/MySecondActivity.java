package com.example.alexander.myview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MySecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_second);


        Intent intent = getIntent();
        int position = intent.getIntExtra("selectedItem", -1);
        // int position = Integer.parseInt(getIntent().getExtras().get("selectedItem").toString());
        //TextView tvMySecAct = (TextView)findViewById(R.id.custom_view_name);

       /* switch(position)
        {
            case 0:
            {
                tvMySecAct.setText("This is Alex Alexanders page");
                break;
            }
            case 1:
            {
                tvMySecAct.setText("This is John Johns page");
                break;
            }
            case 2:
            {
                tvMySecAct.setText("This is Ammy Andersons page");
                break;
            }
            case 3:
            {
                tvMySecAct.setText("This is Ann Nobodyknows page");
                break;
            }
            //   default: {
            //      tvMySecAct.setText("Page not found");
            //     break;
            //  }

        }*/
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my_second, menu);
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
