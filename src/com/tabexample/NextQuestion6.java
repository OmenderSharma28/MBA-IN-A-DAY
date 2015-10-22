package com.tabexample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.RadioButton;

public class NextQuestion6 extends Activity{
	public static int count=NextQuestion.count;
	@Override
    public void onCreate(Bundle savedInstanceState) 
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz7);
        ImageButton imgbtn=(ImageButton) findViewById(R.id.imgbtn);
        imgbtn.setOnClickListener(new OnClickListener()
        {

			//@Override
			public void onClick(View v) 
			{
				Intent i=new Intent(NextQuestion6.this,NextQuestion7.class);
				startActivity(i);
							
			}
        	
        	
        });
        RadioButton rb2=(RadioButton) findViewById(R.id.rb4);
        rb2.setOnClickListener(new OnClickListener() {
 		
 		public void onClick(View v) {
 			count++;
 			// TODO Auto-generated method stub
 			Intent intent=new Intent(NextQuestion6.this,NextQuestion7.class);
 			startActivity(intent);
 		}
 	});
	}

}
