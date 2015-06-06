package com.stockita.myappportfoio;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * This is Project 0: My App Portfolio
 * by UDACITY
 * my name is Hishmad
 * from Jakarta, Indonesia.
 */
public class MainActivity extends ActionBarActivity {

    String thanks = "Thank you";


    /**
     * This method is invoked once this activity is start it
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is invoked once the user clicked the button
     * and goes to Spotify Stream activity.
     */
    public void onClickSpotifyStreamer(View view) {

        // instantiate and initialize the ViewGroup object
        ViewGroup   mainLayoutViewGroup =
                (ViewGroup) findViewById(R.id.relative_layout_one_id);
        ViewGroup   subViewForButtons =
                (ViewGroup) findViewById(R.id.linear_layout_one_id);

        // set the background color
        mainLayoutViewGroup.setBackgroundColor(Color.rgb(48, 48, 48));
        subViewForButtons.setBackgroundColor(Color.rgb(66, 66, 66));

        // display the message on screen using Toast
        String displayText = "You clicked Spotify Streamer, " + thanks;
        Toast.makeText(MainActivity.this, displayText, Toast.LENGTH_SHORT).show();
    }

    /**
     * This method is invoked once the user clicked the button
     * and goes to Scores App activity.
     */
    public void onClickScoresApp(View view) {

        // instantiate and initialize the ViewGroup object
        ViewGroup   mainLayoutViewGroup =
                (ViewGroup) findViewById(R.id.relative_layout_one_id);
        ViewGroup   subViewForButtons =
                (ViewGroup) findViewById(R.id.linear_layout_one_id);

        // set the background color
        mainLayoutViewGroup.setBackgroundColor(Color.rgb(58, 58, 58));
        subViewForButtons.setBackgroundColor(Color.rgb(76, 76, 76));

        // display the message on screen using Toast
        String displayText = "You clicked Scores App, " + thanks;
        Toast.makeText(MainActivity.this, displayText, Toast.LENGTH_SHORT).show();
    }

    /**
     * This method is invoked once the user clicked the button
     * and goes to Library App activity.
     */
    public void onClickLibraryApp(View view) {

        // instantiate and initialize the ViewGroup object
        ViewGroup   mainLayoutViewGroup =
                (ViewGroup) findViewById(R.id.relative_layout_one_id);
        ViewGroup   subViewForButtons =
                (ViewGroup) findViewById(R.id.linear_layout_one_id);

        // set the background color
        mainLayoutViewGroup.setBackgroundColor(Color.rgb(68, 68, 68));
        subViewForButtons.setBackgroundColor(Color.rgb(86, 86, 86));

        // display the message on screen using Toast
        String displayText = "You clicked Library App, " + thanks;
        Toast.makeText(MainActivity.this, displayText, Toast.LENGTH_SHORT).show();
    }

    /**
     * This method is invoked once the user clicked the button
     * and goes to Build it Bigger activity.
     */
    public void onClickBuildItBigger(View view) {

        // instantiate and initialize the ViewGroup object
        ViewGroup   mainLayoutViewGroup =
                (ViewGroup) findViewById(R.id.relative_layout_one_id);
        ViewGroup   subViewForButtons =
                (ViewGroup) findViewById(R.id.linear_layout_one_id);

        // set the background color
        mainLayoutViewGroup.setBackgroundColor(Color.rgb(78, 78, 78));
        subViewForButtons.setBackgroundColor(Color.rgb(96, 96, 96));

        // display the message on screen using Toast
        String displayText = "You clicked Build it Bigger, " + thanks;
        Toast.makeText(MainActivity.this, displayText, Toast.LENGTH_SHORT).show();
    }

    /**
     * This method is invoked once the user clicked the button
     * and goes to XYZ Reader activity.
     */
    public void onClickXYZReader(View view) {

        // instantiate and initialize the ViewGroup object
        ViewGroup   mainLayoutViewGroup =
                (ViewGroup) findViewById(R.id.relative_layout_one_id);
        ViewGroup   subViewForButtons =
                (ViewGroup) findViewById(R.id.linear_layout_one_id);

        // set the background color
        mainLayoutViewGroup.setBackgroundColor(Color.rgb(88, 88, 88));
        subViewForButtons.setBackgroundColor(Color.rgb(106, 106, 106));

        // display the message on screen using Toast
        String displayText = "You clicked XYZ Reader, " + thanks;
        Toast.makeText(MainActivity.this, displayText, Toast.LENGTH_SHORT).show();
    }

    /**
     * This method is invoked once the user clicked the button
     * and goes to My own App activity.
     */
    public void onClickCapstone(View view) {

        // instantiate and initialize the ViewGroup object
        ViewGroup   mainLayoutViewGroup =
                (ViewGroup) findViewById(R.id.relative_layout_one_id);
        ViewGroup   subViewForButtons =
                (ViewGroup) findViewById(R.id.linear_layout_one_id);

        // set the background color
        mainLayoutViewGroup.setBackgroundColor(Color.rgb(98, 98, 98));
        subViewForButtons.setBackgroundColor(Color.rgb(116, 116, 116));

        // display the message on screen using Toast
        String displayText = "You clicked My Own App, Coming soon";
        Toast.makeText(MainActivity.this, displayText, Toast.LENGTH_SHORT).show();
    }

}
