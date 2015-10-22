package com.tabexample;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MoneyActivity extends ListActivity {
	public String[] lv_arr={"Financial System","Financial Management","Economics","Financial Trends in Economics"};
	
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		String[] arr={"Financial Systems","Financial Management","Economics","Global Trends in Economics"};
		
		this.setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arr));
    }
    public void onListItemClick(ListView l, View v, int position, long id) 
    {
		super.onListItemClick(l, v, position, id);
		// Get the item that was clicked
		Object O = this.getListAdapter().getItem(position);
		String str = O.toString();
		if(str=="Financial Systems")
		{
		//Toast.makeText(this, "You selected: " + str, Toast.LENGTH_LONG).show();
		Intent i=new Intent(MoneyActivity.this,FinancialSystems.class);
		startActivity(i);
		}
		else if(str=="Financial Management")
		{
			Intent i=new Intent(MoneyActivity.this,FinancialManagement.class);
			startActivity(i);
			}
		else if(str=="Economics")
		{
			Intent i=new Intent(MoneyActivity.this,Economics.class);
			startActivity(i);
		}
		else if(str=="Global Trends in Economics")
		
		{
			Intent i=new Intent(MoneyActivity.this,GlobalTrendsInEconomics.class);
			startActivity(i);
		}
		   
}
}