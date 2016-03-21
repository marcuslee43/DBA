package com.example.administrator.dba;

import android.app.Fragment;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;

import static com.example.administrator.dba.R.*;


public class MainDBA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_db);

        final ImageView aniR = (ImageView) findViewById(id.imageView3);
        aniR.setBackgroundResource(drawable.fram_ani_right);
        aniR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AnimationDrawable aniRight = (AnimationDrawable) aniR.getBackground();
                aniRight.start();
            }

        });
    }
    <ImageView
    android:layout_width="match_parent"
    android:layout_height="180dp"
    android:id="@+id/imageView2"
    android:layout_weight="1"
    android:src="@drawable/left1" />
    <ImageView
    android:layout_width="match_parent"
    android:layout_height="180dp"
    android:id="@+id/imageView2"
    android:layout_weight="1"
    android:src="@drawable/left1" />

   /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_db, menu);
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
    }*/
}
