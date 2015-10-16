package com.myapps.android.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void Toast_SPTFYSTRMR(View view){
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Spotify Streamer App!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context,text,duration);
        toast.show();
    }

    public void Toast_SCOREAPP(View view){
        Toast.makeText(getApplicationContext(),"This button will launch my Score App!",Toast.LENGTH_SHORT).show();
    }

    public void Toast_LIBAPP(View view){
        Toast.makeText(getApplicationContext(),"This button will launch my Library App!",Toast.LENGTH_SHORT).show();
    }

    public void Toast_BIB(View view){
        Toast.makeText(getApplicationContext(),"This button will launch my Build it bigger App!",Toast.LENGTH_SHORT).show();
    }

    public void Toast_XYZReader(View view){
        Toast.makeText(getApplicationContext(),"This button will launch my XYZ reader App!",Toast.LENGTH_SHORT).show();
    }

    public void Toast_Capstone(View view){
        Toast.makeText(getApplicationContext(),"This button will launch my Capstone App!",Toast.LENGTH_SHORT).show();
    }
}
