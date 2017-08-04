package com.jain.abhishek.advanced_android_programming.graphics_multimedia.Sunrise_Demo;

import android.app.Activity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.jain.abhishek.advanced_android_programming.R;


public class MainActivity_Sunrise extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_anim_sunrise);


		//get the sun View
		ImageView sun = (ImageView) findViewById(R.id.sun);

		//get the sunrise animation
		Animation sunRise = AnimationUtils.loadAnimation(this, R.anim.sun_rise);

		//apply the animation to the View
		sun.startAnimation(sunRise);


		//get the clock View
		ImageView clock = (ImageView) findViewById(R.id.clock);

		//get the clock turn animation
		Animation clockTurn = AnimationUtils.loadAnimation(this, R.anim.clock_turn);

		//apply the animation to the View
		clock.startAnimation(clockTurn);


		//get the hour hand View
		ImageView hour = (ImageView) findViewById(R.id.hour);
	
		//get the hour turn animation
		Animation hourTurn = AnimationUtils.loadAnimation(this, R.anim.hour_turn);
		
		//apply the animation to the View
		hour.startAnimation(hourTurn);

	}
}