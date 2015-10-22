package com.tabexample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Toast;

public class NextQuestion17 extends Activity{
	public static int count=NextQuestion.count;

	@Override
    public void onCreate(Bundle savedInstanceState) 
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz18);
        Toast.makeText(this,"Quiz Test Result Marks:" +count,Toast.LENGTH_LONG).show();
        {
			
			
        RadioButton rb1=(RadioButton) findViewById(R.id.rb1);
        rb1.setOnClickListener(new OnClickListener(){

			//@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(NextQuestion17.this,"Correct",Toast.LENGTH_SHORT).show();
				Intent in=new Intent(NextQuestion17.this,TabWidgetActivity.class);
				startActivity(in);
			}
			
	       
        	
        	
        });
        RadioButton rb=(RadioButton) findViewById(R.id.rb3);
        rb.setOnClickListener(new OnClickListener() {
 		
 		public void onClick(View v) {
 			count++;
 			// TODO Auto-generated method stub
 			Intent intent=new Intent(NextQuestion17.this,TabWidgetActivity.class);
 			startActivity(intent);
 		}
 	});
	}
}}
