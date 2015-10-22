package com.tabexample;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class AboutMBA extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// requestWindowFeature(Window.FEATURE_LEFT_ICON);
		setContentView(R.layout.aboutmba);
		MediaPlayer mp=MediaPlayer.create(getApplicationContext(), R.raw.c);
		
		mp.start();
		// setFeatureDrawableResource(Window.FEATURE_LEFT_ICON,R.drawable.backbutton);
		ImageButton btn = (ImageButton) findViewById(R.id.imgbutton);
		btn.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(AboutMBA.this, HomeActivity.class);
				startActivity(i);

			}

		});
	}
}
