package com.tabexample;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;



public class PeopleActivity extends ListActivity {
	
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.peopleview);
		String[] arr={"Management","Leadership","Organizational Behaviour","Organizational Design"
				,"Human Resource"};
		//TextView tv=new TextView(this);
		//LayoutParams lp= new LayoutParams(LayoutParams.FILL_PARENT,LayoutParams.FILL_PARENT);
		//tv.setText("This is PeopleActivity");
		//tv.setLayoutParams(lp);
		//setContentView(tv);
		
		this.setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arr));
    }
    public void onListItemClick(ListView l, View v, int position, long id) 
    {
		super.onListItemClick(l, v, position, id);
		// Get the item that was clicked
		Object O = this.getListAdapter().getItem(position);
		String str = O.toString();
		if(str=="Management")
		{
		//Toast.makeText(this, "You selected: " + str, Toast.LENGTH_LONG).show();
		Intent i=new Intent(PeopleActivity.this,ManagementInfo.class);
		startActivity(i);
		}
		else if(str=="Leadership")
		{
			Intent i=new Intent(PeopleActivity.this,LeadershipInfo.class);
			startActivity(i);
		}
		else if(str=="Organizational Behaviour")
		{
			Intent i=new Intent(PeopleActivity.this,OrganizationalBehaviourInfo.class);
			startActivity(i);
		}
		else if(str=="Organizational Design")
		
		{
			Intent i=new Intent(PeopleActivity.this,OrganizationalDesignInfo.class);
			startActivity(i);
		}
		else if(str=="Human Resource")
		{
			Intent i=new Intent(PeopleActivity.this,HumanResourceInfo.class);
			startActivity(i);
		}    
		
	}
}

