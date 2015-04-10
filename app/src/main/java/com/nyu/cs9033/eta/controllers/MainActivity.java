package com.nyu.cs9033.eta.controllers;

import com.nyu.cs9033.eta.models.Trip;
import com.nyu.cs9033.eta.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.widget.Button;


public class MainActivity extends Activity {

	private static final String TAG = "MainActivity";
	Trip
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

        //TO DO HERE
        Button cbutton;
        cbutton =(Button)findViewById(R.id.cbuttonxml);
        cbutton.setOnClickListener((android.view.View.OnClickListener) this);

        Button vbutton;
        vbutton =(Button)findViewById(R.id.vbuttonxml);
        vbutton.setOnClickListener((android.view.View.OnClickListener) this);
    }

	/**
	 * This method should start the
	 * Activity responsible for creating
	 * a Trip.
	 */
	public void startCreateTripActivity() {

        //Edited here

        //startActivityForResult();
	}
	
	/**
	 * This method should start the
	 * Activity responsible for viewing
	 * a Trip.
	 */
	public void startViewTripActivity() {

        // edited here
		ViewTripActivity trip2 = new ViewTripActivity();
        //trip2.viewTrip();
	}
	
	/**
	 * Receive result from CreateTripActivity here.
	 * Can be used to save instance of Trip object
	 * which can be viewed in the ViewTripActivity.
	 * 
	 * Note: This method will be called when a Trip
	 * object is returned to the main activity. 
	 * Remember that the Trip will not be returned as
	 * a Trip object; it will be in the persisted
	 * Parcelable form. The actual Trip object should
	 * be created and saved in a variable for future
	 * use, i.e. to view the trip.
	 * 
	 */
	@Override
	public void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO - fill in here
        //where main activity is waiting for response

	}
}
