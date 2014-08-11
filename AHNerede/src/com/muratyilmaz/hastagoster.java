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
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

public class hastagoster extends Activity {
	
	Bundle extras;
	String myParam1;
	
	HttpPost httppost;
	StringBuffer buffer;
	HttpResponse response;
	HttpClient httpclient;
	List<NameValuePair> nameValuePairs;
	
	DatePicker datePicker;
	Button showdate;
	String[] monthlist = {"01","02","03","04","05","06",
			"07","08","09","10","11","12"};
	
	int month;
	int day;
	int year;
	
	Button hastagoster;
	
	TextView drusername,hastaname;
	
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hastagoster);
		
		drusername = (TextView)findViewById(R.id.textView1);
		datePicker = (DatePicker)findViewById(R.id.datePicker1);
		
		 extras = getIntent().getExtras();
		    if (extras != null)
		    {
		        myParam1 = extras.getString("userName");
		        drusername.setText("Dr. " + myParam1);
		    }
		    else
		    {
		        //..oops!
		    }
		    
		    hastagoster = (Button)findViewById(R.id.showDate);
		    
		    hastagoster.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
				
					new Thread(new Runnable() {
						
						@Override
						public void run() {
							// TODO Auto-generated method stub
							hastagoster();
						}
					}).start();
					
				}
			}); 
		
	}

	
	void hastagoster(){
		
		try{
			httpclient=new DefaultHttpClient();
    		httppost=new HttpPost("http://192.168.254.2/getAllCustomers/doktorrandevugetir.php");
    		 day = datePicker.getDayOfMonth();
    		String daystring = Integer.toString(day);
    		month = datePicker.getMonth();
    		 year = datePicker.getYear();
    		 String yearstring = Integer.toString(year);
    		nameValuePairs=new ArrayList<NameValuePair>(2);
    		nameValuePairs.add(new BasicNameValuePair("username", myParam1));
    		nameValuePairs.add(new BasicNameValuePair("date", daystring+ "-"+monthlist[month]+"-"+yearstring) );
    		httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
    		response=httpclient.execute(httppost);
    		
    		ResponseHandler<String> responseHandler=new BasicResponseHandler();
    		 final String response = httpclient.execute(httppost,responseHandler);
    		System.out.println("Response:" + response);
    		
			
			runOnUiThread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					
					
					//Toast.makeText(getApplicationContext(), response, Toast.LENGTH_SHORT).show();
					drusername.setText(response + "\n\n\n");
					
				
				}
			});
				
		}catch(Exception e){}
	}
	
	
	
	
	
}
