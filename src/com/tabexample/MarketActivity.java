package com.tabexample;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MarketActivity extends ListActivity {
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		 String[] arr={"Marketing Strategy","Porter's 5 Forces","Key Promotional Tools",
				"Power of Brand","Selling & Customer"};
		
		 this.setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arr));
    }
    public void onListItemClick(ListView l, View v, int position, long id) 
    {
		super.onListItemClick(l, v, position, id);
		// Get the item that was clicked
		Object O = this.getListAdapter().getItem(position);
		String str = O.toString();
		if(str=="Marketing Strategy")
		{
		//Toast.makeText(this, "You selected: " + str, Toast.LENGTH_LONG).show();
		Intent i=new Intent(MarketActivity.this,MarketingStrategy.class);
		startActivity(i);
		}
		else if(str=="Porter's 5 Forces")
		    {
			Intent i=new Intent(MarketActivity.this,ProtersForces.class);
			startActivity(i);
			}
		else if(str=="Key Promotional Tools")
		{
			Intent i=new Intent(MarketActivity.this,KeyPromotionalTools.class);
			startActivity(i);
		}
		else if(str=="Power of Brand")
		
		{
			Intent i=new Intent(MarketActivity.this,PowerOfBrand.class);
			startActivity(i);
		}
		else if(str=="Selling & Customer")
		{
			Intent i=new Intent(MarketActivity.this,SellingCustomer.class);
			startActivity(i);
		}    
  }
}
