package com.tabexample;



import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;


public class TabWidgetActivity extends TabActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Resources res= getResources();
        TabHost tabhost= getTabHost();
        TabHost.TabSpec spec;
        Intent intent;
        
        //add Home Tab
        intent= new Intent().setClass(this,HomeActivity.class);
        spec= tabhost.newTabSpec("Home");
        spec.setIndicator("Home",res.getDrawable(R.drawable.home));
        spec.setContent(intent);
        tabhost.addTab(spec);
            
        
        
      //add People Tab
        intent= new Intent().setClass(this,PeopleActivity.class);
        spec= tabhost.newTabSpec("People");
        spec.setIndicator("People",res.getDrawable(R.drawable.people));
        spec.setContent(intent);
        tabhost.addTab(spec);
       
        //add Money TAB
        intent= new Intent().setClass(this,MoneyActivity.class);
        spec= tabhost.newTabSpec("Money");
        spec.setIndicator("Money",res.getDrawable(R.drawable.money));
        spec.setContent(intent);
        tabhost.addTab(spec); 
        
      //add Market TAB
        intent= new Intent().setClass(this,MarketActivity.class);
        spec= tabhost.newTabSpec("Market");
        spec.setIndicator("Market",res.getDrawable(R.drawable.market));
        spec.setContent(intent);
        tabhost.addTab(spec); 
        
      //add System TAB
        intent= new Intent().setClass(this,SystemActivity.class);
        spec= tabhost.newTabSpec("System");
        spec.setIndicator("System",res.getDrawable(R.drawable.systems));
        spec.setContent(intent);
        tabhost.addTab(spec);
        
      //add Quiz TAB
        intent= new Intent().setClass(this,QuizActivity.class);
        spec= tabhost.newTabSpec("Quiz");
        spec.setIndicator("Quiz",res.getDrawable(R.drawable.quiz));
        spec.setContent(intent);
        tabhost.addTab(spec);  
        //getTabHost().getTabWidget().setBackgroundResource(R.drawable.titlebar2);
        //tabhost.setCurrentTab(0);
        //tabhost.setClickable(true);
        
        
        
       }
}