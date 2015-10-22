package com.tabexample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.RadioButton;

public class QuizActivity extends Activity{
	public static int count=0;
	@Override
    public void onCreate(Bundle savedInstanceState) 
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz19);
        ImageButton imgbtn=(ImageButton) findViewById(R.id.imgbtn);
        imgbtn.setOnClickListener(new OnClickListener()
        {

			//@Override
			public void onClick(View v){
				
			Intent intent=new Intent(QuizActivity.this,NextQuestion.class);
			startActivity(intent);
		}
	});
       RadioButton rb2=(RadioButton) findViewById(R.id.rb2);
       rb2.setOnClickListener(new OnClickListener() {
		
		public void onClick(View v) {
			count++;
			// TODO Auto-generated method stub
			Intent intent=new Intent(QuizActivity.this,NextQuestion.class);
			startActivity(intent);
		}
	});
         

       

   }
}