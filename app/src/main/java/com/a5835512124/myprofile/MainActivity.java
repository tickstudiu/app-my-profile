package com.a5835512124.myprofile;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridLayout;

public class MainActivity extends AppCompatActivity {

    private GridLayout home,profile,setting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        home = findViewById(R.id.home);
        profile = findViewById(R.id.profile);
        setting = findViewById(R.id.setting);

        profile.setVisibility( View.GONE );
        setting.setVisibility( View.GONE );


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "haven't new msg", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
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
        if (id == R.id.action_home) {
            home.setVisibility( View.VISIBLE );
            profile.setVisibility( View.GONE );
            setting.setVisibility( View.GONE );
            return true;
        }
        if (id == R.id.action_profile){
            home.setVisibility( View.GONE );
            profile.setVisibility( View.VISIBLE );
            setting.setVisibility( View.GONE );
            return true;
        }
        if (id == R.id.action_settings){
            home.setVisibility( View.GONE );
            profile.setVisibility( View.GONE );
            setting.setVisibility( View.VISIBLE );
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
