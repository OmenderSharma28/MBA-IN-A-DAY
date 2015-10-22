package com.tabexample;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class HomeActivity extends Activity{

	@Override
	public void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.frontpage);
		
		ImageButton btn = (ImageButton) findViewById(R.id.img);
		
		btn.setOnClickListener(new OnClickListener() 
		{
			
			public void onClick(View v) {
				Intent i = new Intent (HomeActivity.this, AboutMBA.class);
				startActivity(i);
			}
		});
		
   }
}