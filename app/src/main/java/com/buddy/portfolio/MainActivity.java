package com.buddy.portfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void OpenPopularMovieApp(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This Button Will Launch My Popular Movie App";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        // Do something in response to button
    }

    public void OpenStockHawkApp(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This Button Will Launch My Stock Hawk App";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        // Do something in response to button
    }

    public void OpenBuildItBiggerApp(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This Button Will Launch My Buid it Bigger App";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        // Do something in response to button
    }

    public void OpenAppMaterialApp(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This Button Will Launch My Make Your App Material App";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        // Do something in response to button
    }

    public void OpenGoUbiquitousApp(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This Button Will Launch My Go Ubiquitous App";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        // Do something in response to button
    }

    public void OpenCapStoneApp(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This Button Will Launch My Capstone My Application App";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        // Do something in response to button
    }
}
