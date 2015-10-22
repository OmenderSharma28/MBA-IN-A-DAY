package com.tabexample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.RadioButton;

public class NextQuestion extends Activity{
	public static int count=QuizActivity.count;
	
	@Override
    public void onCreate(Bundle savedInstanceState) 
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz1);
        
        ImageButton imgbtn=(ImageButton) findViewById(R.id.imgbtn);
        imgbtn.setOnClickListener(new OnClickListener()
        {

			//@Override
			public void onClick(View v) 
			{
				
				Intent i=new Intent(NextQuestion.this,NextQuestion1.class);
				startActivity(i);
							
			}
        	
        	
        });
        RadioButton rb2= (RadioButton) findViewById(R.id.rb2);
        rb2.setOnClickListener(new OnClickListener(){
			//@Override
			public void onClick(View v) 
			{
				count++;
				Intent i=new Intent(NextQuestion.this,NextQuestion1.class);
				startActivity(i);			
			}
        });
       
	}

        
	

}
