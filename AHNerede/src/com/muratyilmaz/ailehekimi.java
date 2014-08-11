package com.muratyilmaz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ailehekimi extends Activity{

	TextView drusername;
	Button showPatient;
	
	Bundle extras;
	String myParam;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ailehekimi);
		
		 drusername =(TextView)findViewById(R.id.textView1);
		 showPatient = (Button)findViewById(R.id.button1);
		 
		 extras = getIntent().getExtras();
		    if (extras != null)
		    {
		        myParam = extras.getString("userName");
		        drusername.setText(myParam);
		    }
		    else
		    {
		        //..oops!
		    }
		    
		    showPatient.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					//startActivity(new Intent("com.muratyilmaz.DATE"));
					
					Intent intent =new Intent("com.muratyilmaz.HASTAGOSTER");
					intent.putExtra( "userName", myParam );
	    			startActivity(intent);
				}
			});
		    
	}
	
	
	
	
	
	
	
	
	
	

}
