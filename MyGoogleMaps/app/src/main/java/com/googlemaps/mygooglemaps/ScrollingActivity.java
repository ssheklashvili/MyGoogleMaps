package com.googlemaps.mygooglemaps;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class ScrollingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        toolbar.setTitle("");
//        setSupportActionBar(toolbar);


        Button uninstall=(Button)findViewById(R.id.uninstallButton);
        uninstall.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Snackbar.make(view,"Uninstall",Snackbar.LENGTH_LONG).setAction("Action",null).show();
            }
        });


        Button open=(Button)findViewById(R.id.openButton);
        open.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Snackbar.make(view,"Open",Snackbar.LENGTH_LONG).setAction("Action1",null).show();
            }
        });

        View plane=findViewById(R.id.plane);
        plane.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Snackbar.make(view,"Travel & Local",Snackbar.LENGTH_LONG).setAction("Action",null).show();
            }
        });

        View similar=findViewById(R.id.similar);
        similar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Snackbar.make(view,"Similar",Snackbar.LENGTH_LONG).setAction("Action",null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scrolling, menu);
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
}
