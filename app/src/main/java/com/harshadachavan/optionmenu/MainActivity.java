package com.harshadachavan.optionmenu;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_menu, menu);//Menu Resource, Menu
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        mTextView = (TextView)findViewById(R.id.change_tv);
        switch (item.getItemId()) {
            case R.id.red:
               // Toast.makeText(getApplicationContext(),"Item 1 Selected",Toast.LENGTH_LONG).show();
                mTextView.setTextColor(Color.parseColor("#f44242"));
                return true;
            case R.id.blue:
               // Toast.makeText(getApplicationContext(),"Item 2 Selected",Toast.LENGTH_LONG).show();
                mTextView.setTextColor(Color.parseColor("#2c43d6"));
                return true;
            case R.id.green:
               // Toast.makeText(getApplicationContext(),"Item 3 Selected",Toast.LENGTH_LONG).show();
                mTextView.setTextColor(Color.parseColor("#1dcc1a"));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
