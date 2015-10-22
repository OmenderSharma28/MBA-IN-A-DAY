package com.tabexample;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SystemActivity extends ListActivity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		String[] arr={"Quality","Project Management","Project Info Systems","The Business Plan"};
		this.setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arr));
    }
    public void onListItemClick(ListView l, View v, int position, long id) 
    {
		super.onListItemClick(l, v, position, id);
		// Get the item that was clicked
		Object O = this.getListAdapter().getItem(position);
		String str = O.toString();
		if(str=="Quality")
		{
		//Toast.makeText(this, "You selected: " + str, Toast.LENGTH_LONG).show();
		Intent i=new Intent(SystemActivity.this,Quality.class);
		startActivity(i);
		}
		else if(str=="Project Management")
		    {
			Intent i=new Intent(SystemActivity.this,ProjectManagement.class);
			startActivity(i);
			}
		else if(str=="Project Info Systems")
		{
			Intent i=new Intent(SystemActivity.this,ProjectInfoSystems.class);
			startActivity(i);
		}
		else if(str=="The Business Plan")
		
		{
			Intent i=new Intent(SystemActivity.this,TheBusinessPlan.class);
			startActivity(i);
		}
}
}
