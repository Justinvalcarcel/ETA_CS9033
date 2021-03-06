package com.nyu.cs9033.eta.controllers;

import com.nyu.cs9033.eta.models.Trip;
import com.nyu.cs9033.eta.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class ViewTripActivity extends Activity {

	private static final String TAG = "ViewTripActivity";
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// TODO - fill in here
        setContentView(R.layout.viewtrip);
		Trip trip = getTrip(getIntent());
		viewTrip(trip);
	}
	
	/**
	 * Create a Trip object via the recent trip that
	 * was passed to TripViewer via an Intent.
	 * 
	 * @param i The Intent that contains
	 * the most recent trip data.
	 * 
	 * @return The Trip that was most recently
	 * passed to TripViewer, or null if there
	 * is none.
	 */
	public Trip getTrip(Intent i) {
		
		// TODO - fill in here
		
		return null;
	}

	/**
	 * Populate the View using a Trip model.
	 * 
	 * @param trip The Trip model used to
	 * populate the View.
	 */
	public void viewTrip(Trip trip) {


		
		// TODO - fill in here
        TextView tvname = (TextView)findViewById(R.id.TextViewName);
        tvname.setText(name);
        TextView tvstart = (TextView)findViewById(R.id.TextViewStart);
        tvstart.setText(start);
        TextView tvdestination = (TextView)findViewById(R.id.TextViewDestination);
        tvdestination.setText(destination);
        TextView tvtraveltime = (TextView)findViewById(R.id.TextViewTravelTime);
        tvtraveltime.setText(traveltime);
        TextView tvdate = (TextView)findViewById(R.id.TextViewDate);
        tvdate.setText(date);
	}
}
