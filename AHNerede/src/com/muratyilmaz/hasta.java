package com.muratyilmaz;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class hasta extends Activity{

	Button showDoctor,showcalendar;
	TextView tvusername,tvdoctorname;
	
	HttpPost httppost;
	StringBuffer buffer;
	HttpResponse response;
	HttpClient httpclient;
	List<NameValuePair> nameValuePairs;
	
	Bundle extras;
	String myParam;
	
	ArrayList<String> stringList;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hasta);
		  
	    tvusername =(TextView)findViewById(R.id.textView3);
	    tvdoctorname =(TextView)findViewById(R.id.textView4);
		showDoctor = (Button)findViewById(R.id.button1);
		showcalendar= (Button)findViewById(R.id.calendarbutton);
		
	
	//---------------------------TAKE USERNAME FROM LOGIN PAGE------------------------------------------------
		 extras = getIntent().getExtras();
	    if (extras != null)
	    {
	        myParam = extras.getString("userName");
	        tvusername.setText(myParam);
	    }
	    else
	    {
	        //..oops!
	    }
		
	  //---------------------------CLICK BUTTON & FUNCTION------------------------------------------------
	    showDoctor.setOnClickListener(new View.OnClickListener() {
	
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			
				new Thread(new Runnable() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						getDoctor();
					}
				}).start();
				
			}
		});
        
	    showcalendar.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//startActivity(new Intent("com.muratyilmaz.DATE"));
				
				Intent intent =new Intent("com.muratyilmaz.DATE");
				intent.putExtra( "userName", myParam );
    			startActivity(intent);
			}
		});

	   
	}
	

	 //------------------------------------FUNCTION---------------------------------------------------------------
void getDoctor(){
	
	try{
		httpclient=new DefaultHttpClient();
		httppost=new HttpPost("http://192.168.254.2/getAllCustomers/hasta.php");
		nameValuePairs=new ArrayList<NameValuePair>(1);
		nameValuePairs.add(new BasicNameValuePair("username", myParam));
		httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
		response=httpclient.execute(httppost);
		
		ResponseHandler<String> responseHandler=new BasicResponseHandler();
		 final String response = httpclient.execute(httppost,responseHandler);
		System.out.println("Response:" + response);
		
		runOnUiThread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				tvdoctorname.setText("\t\t\t\t\t Dr. " + response);
				
			
			}
		});
			
	}catch(Exception e){}
	
	}
}
