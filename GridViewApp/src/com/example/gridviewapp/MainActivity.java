package com.example.gridviewapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

public class MainActivity<View> extends Activity {
		GridView gridview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    
        gridview=(GridView) findViewById(R.id.grid_view);
        gridview.setAdapter(new ImageAdapter(MainActivity.this));
       
       gridview.setOnItemClickListener(new OnItemClickListener() {
    	  
		
		@Override
		public void onItemClick(AdapterView<?> arg0, android.view.View arg1,
				int arg2, long arg3) {
			
			 Intent i=new Intent(MainActivity.this,
	    			   SingleViewActivity.class);
	    	   i.putExtra("id",arg2);
	    	   startActivity(i);
			
		}
	});
    	   
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
