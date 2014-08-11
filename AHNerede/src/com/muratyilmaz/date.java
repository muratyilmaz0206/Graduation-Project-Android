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
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

public class date extends Activity {
	
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
	
	Bundle extras;
	String myParam1;
	
	TextView username,kayitdurumugoster;
	
	Button butondokuz,dokuzonbes,dokuzotuz,dokuzk�rkbes,
			on, ononbes, onotuz,onk�rkbes,
			onbir,onbironbes,onbirotuz,onbirk�rkbes,
			onuc,onuconbes,onucotuz,onuck�rkbes,
			ondort,ondortonbes,ondortotuz,ondortk�rkbes,
			onbes,onbesonbes,onbesotuz,onbesk�rkbes,
			onalt�,onalt�onbes,onalt�otuz,onalt�k�rkbes;
	
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.date);
		
		datePicker = (DatePicker)findViewById(R.id.datePicker1);
		
		username = (TextView)findViewById(R.id.textView1);
		kayitdurumugoster = (TextView)findViewById(R.id.kayitdurumu);
		
		showdate = (Button)findViewById(R.id.showDate);
		
		butondokuz = (Button)findViewById(R.id.button2);
		dokuzonbes = (Button)findViewById(R.id.button3);
		dokuzotuz = (Button)findViewById(R.id.button4);
		dokuzk�rkbes = (Button)findViewById(R.id.button5);
		on = (Button)findViewById(R.id.button6);
		ononbes = (Button)findViewById(R.id.button7);
		onotuz = (Button)findViewById(R.id.button8);
		onk�rkbes = (Button)findViewById(R.id.button9);
		onbir = (Button)findViewById(R.id.button10);
		onbironbes = (Button)findViewById(R.id.button11);
		onbirotuz = (Button)findViewById(R.id.button12);
		onbirk�rkbes = (Button)findViewById(R.id.button13);
		onuc = (Button)findViewById(R.id.button14);
		onuconbes = (Button)findViewById(R.id.button15);
		onucotuz = (Button)findViewById(R.id.button16);
		onuck�rkbes = (Button)findViewById(R.id.button17);
		ondort = (Button)findViewById(R.id.button18);
		ondortonbes = (Button)findViewById(R.id.button19);
		ondortotuz = (Button)findViewById(R.id.button20);
		ondortk�rkbes = (Button)findViewById(R.id.button21);
		onbes = (Button)findViewById(R.id.button22);
		onbesonbes = (Button)findViewById(R.id.button23);
		onbesotuz = (Button)findViewById(R.id.button24);
		onbesk�rkbes = (Button)findViewById(R.id.button25);
		onalt� = (Button)findViewById(R.id.button26);
		onalt�onbes = (Button)findViewById(R.id.button27);
		onalt�otuz = (Button)findViewById(R.id.button28);
		onalt�k�rkbes = (Button)findViewById(R.id.button29);
		
		//-----------------------------------GET USERNAME----------------------------------------------------
		 extras = getIntent().getExtras();
		    if (extras != null)
		    {
		        myParam1 = extras.getString("userName");
		        username.setText("Sn. " + myParam1);
		    }
		    else
		    {
		        //..oops!
		    }
		
		
		
		showdate.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				/* month = datePicker.getMonth();
				 day = datePicker.getDayOfMonth();
				 year = datePicker.getYear();
				Toast.makeText(getApplicationContext(), "Tarih: "+day+" - "+monthlist[month]+" - "+year, Toast.LENGTH_SHORT).show(); */
		
				new Thread(new Runnable() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						hastarandevugetir();
					}
				}).start();
			}
		});
		
		//-----------------------------------CLICK BUTTONS----------------------------------------------------
		 butondokuz.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
				
					new Thread(new Runnable() {
						
						@Override
						public void run() {
							// TODO Auto-generated method stub
							butondokuz();
						}
					}).start();
					
				}
			}); 
		 
		 
		 dokuzonbes.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
				
					new Thread(new Runnable() {
						
						@Override
						public void run() {
							// TODO Auto-generated method stub
							dokuzonbes();
						}
					}).start();
					
				}
			}); 
		 
		 
		 dokuzotuz.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
				
					new Thread(new Runnable() {
						
						@Override
						public void run() {
							// TODO Auto-generated method stub
							dokuzotuz();
						}
					}).start();
					
				}
			}); 
		 
		 
		 dokuzk�rkbes.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
				
					new Thread(new Runnable() {
						
						@Override
						public void run() {
							// TODO Auto-generated method stub
							dokuzk�rkbes();
						}
					}).start();
					
				}
			}); 
		 
		 
		 on.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
				
					new Thread(new Runnable() {
						
						@Override
						public void run() {
							// TODO Auto-generated method stub
							on();
						}
					}).start();
					
				}
			}); 
		 
		 
		 ononbes.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
				
					new Thread(new Runnable() {
						
						@Override
						public void run() {
							// TODO Auto-generated method stub
							ononbes();
						}
					}).start();
					
				}
			}); 
		 
		 onotuz.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
				
					new Thread(new Runnable() {
						
						@Override
						public void run() {
							// TODO Auto-generated method stub
							onotuz();
						}
					}).start();
					
				}
			}); 
		 
		 onk�rkbes.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
				
					new Thread(new Runnable() {
						
						@Override
						public void run() {
							// TODO Auto-generated method stub
							onk�rkbes();
						}
					}).start();
					
				}
			}); 
		 
		 onbir.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
				
					new Thread(new Runnable() {
						
						@Override
						public void run() {
							// TODO Auto-generated method stub
							onbir();
						}
					}).start();
					
				}
			}); 
		 
		 onbironbes.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
				
					new Thread(new Runnable() {
						
						@Override
						public void run() {
							// TODO Auto-generated method stub
							onbironbes();
						}
					}).start();
					
				}
			}); 
		 
		 
		 onbirotuz.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
				
					new Thread(new Runnable() {
						
						@Override
						public void run() {
							// TODO Auto-generated method stub
							onbirotuz();
						}
					}).start();
					
				}
			}); 
		 
		 onbirk�rkbes.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
				
					new Thread(new Runnable() {
						
						@Override
						public void run() {
							// TODO Auto-generated method stub
							onbirk�rkbes();
						}
					}).start();
					
				}
			}); 
		 
		 
		 onuc.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
				
					new Thread(new Runnable() {
						
						@Override
						public void run() {
							// TODO Auto-generated method stub
							onuc();
						}
					}).start();
					
				}
			}); 
		 
		 onuconbes.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
				
					new Thread(new Runnable() {
						
						@Override
						public void run() {
							// TODO Auto-generated method stub
							onuconbes();
						}
					}).start();
					
				}
			}); 
		 
		 onucotuz.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
				
					new Thread(new Runnable() {
						
						@Override
						public void run() {
							// TODO Auto-generated method stub
							onucotuz();
						}
					}).start();
					
				}
			}); 
		 
		 onuck�rkbes.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
				
					new Thread(new Runnable() {
						
						@Override
						public void run() {
							// TODO Auto-generated method stub
							onuck�rkbes();
						}
					}).start();
					
				}
			}); 
		 
		 
		 ondort.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
				
					new Thread(new Runnable() {
						
						@Override
						public void run() {
							// TODO Auto-generated method stub
							ondort();
						}
					}).start();
					
				}
			}); 
		 
		 ondortonbes.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
				
					new Thread(new Runnable() {
						
						@Override
						public void run() {
							// TODO Auto-generated method stub
							ondortonbes();
						}
					}).start();
					
				}
			}); 
		 
		 ondortotuz.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
				
					new Thread(new Runnable() {
						
						@Override
						public void run() {
							// TODO Auto-generated method stub
							ondortotuz();
						}
					}).start();
					
				}
			}); 
		 
		 ondortk�rkbes.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
				
					new Thread(new Runnable() {
						
						@Override
						public void run() {
							// TODO Auto-generated method stub
							ondortk�rkbes();
						}
					}).start();
					
				}
			}); 
		 
		 
		 onbes.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
				
					new Thread(new Runnable() {
						
						@Override
						public void run() {
							// TODO Auto-generated method stub
							onbes();
						}
					}).start();
					
				}
			}); 
		 
		 onbesonbes.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
				
					new Thread(new Runnable() {
						
						@Override
						public void run() {
							// TODO Auto-generated method stub
							onbesonbes();
						}
					}).start();
					
				}
			}); 
		 
		 onbesotuz.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
				
					new Thread(new Runnable() {
						
						@Override
						public void run() {
							// TODO Auto-generated method stub
							onbesotuz();
						}
					}).start();
					
				}
			}); 
		 
		 onbesk�rkbes.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
				
					new Thread(new Runnable() {
						
						@Override
						public void run() {
							// TODO Auto-generated method stub
							onbesk�rkbes();
						}
					}).start();
					
				}
			}); 
		 
		 
		 onalt�.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
				
					new Thread(new Runnable() {
						
						@Override
						public void run() {
							// TODO Auto-generated method stub
							onalt�();
						}
					}).start();
					
				}
			}); 
		 
		 
		 onalt�onbes.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
				
					new Thread(new Runnable() {
						
						@Override
						public void run() {
							// TODO Auto-generated method stub
							onalt�onbes();
						}
					}).start();
					
				}
			}); 
		 
		 onalt�otuz.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
				
					new Thread(new Runnable() {
						
						@Override
						public void run() {
							// TODO Auto-generated method stub
							onalt�otuz();
						}
					}).start();
					
				}
			}); 
		 
		 onalt�k�rkbes.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
				
					new Thread(new Runnable() {
						
						@Override
						public void run() {
							// TODO Auto-generated method stub
							onalt�k�rkbes();
						}
					}).start();
					
				}
			}); 
		//-------------------------------------------------------------------------------------------------
		
	}
	
	//-----------------------------------FUNCTIONS--------------------------------------------------------------
	
	void hastarandevugetir(){
		try{
			httpclient=new DefaultHttpClient();
    		httppost=new HttpPost("http://192.168.254.2/getAllCustomers/hastarandevugetir.php");
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
					
					Toast.makeText(getApplicationContext(), response, Toast.LENGTH_SHORT).show();
					//username.setText(response);
					
				
				}
			});
				
		}catch(Exception e){}
		
	} 
	
	
	
	
	
	void butondokuz(){
		try{
			httpclient=new DefaultHttpClient();
    		httppost=new HttpPost("http://192.168.254.2/getAllCustomers/randevukaydet.php");
    		 day = datePicker.getDayOfMonth();
    		String daystring = Integer.toString(day);
    		month = datePicker.getMonth();
    		 year = datePicker.getYear();
    		 String yearstring = Integer.toString(year);
    		nameValuePairs=new ArrayList<NameValuePair>(3);
    		nameValuePairs.add(new BasicNameValuePair("username", myParam1));
    		nameValuePairs.add(new BasicNameValuePair("date", daystring+ "-"+monthlist[month]+"-"+yearstring) );
    		nameValuePairs.add(new BasicNameValuePair("time", "09.00") );
    		httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
    		//response=httpclient.execute(httppost);
    		
    		ResponseHandler<String> responseHandler=new BasicResponseHandler();
    		 final String response = httpclient.execute(httppost,responseHandler);
    		System.out.println("Response:" + response);
    		
			
			runOnUiThread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					
					
					Toast.makeText(getApplicationContext(), response, Toast.LENGTH_SHORT).show();
					//kayitdurumugoster.setText("\t\t\t\t\t " + response);
					
				
				}
			});
				
		}catch(Exception e){}
		
	} 
	
	
	
	void dokuzonbes(){
		try{
			httpclient=new DefaultHttpClient();
    		httppost=new HttpPost("http://192.168.254.2/getAllCustomers/randevukaydet.php");
    		 day = datePicker.getDayOfMonth();
    		String daystring = Integer.toString(day);
    		month = datePicker.getMonth();
    		 year = datePicker.getYear();
    		 String yearstring = Integer.toString(year);
    		nameValuePairs=new ArrayList<NameValuePair>(3);
    		nameValuePairs.add(new BasicNameValuePair("username", myParam1));
    		nameValuePairs.add(new BasicNameValuePair("date", daystring+ "-"+monthlist[month]+"-"+yearstring) );
    		nameValuePairs.add(new BasicNameValuePair("time", "09.15") );
    		httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
    		//response=httpclient.execute(httppost);
    		
    		ResponseHandler<String> responseHandler=new BasicResponseHandler();
    		 final String response = httpclient.execute(httppost,responseHandler);
    		System.out.println("Response:" + response);
    		
			
			runOnUiThread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					
					Toast.makeText(getApplicationContext(), response, Toast.LENGTH_SHORT).show();
					//kayitdurumugoster.setText("\t\t\t\t\t " + response);
					
				
				}
			});
				
		}catch(Exception e){}
		
	} 
	
	
	void dokuzotuz(){
		try{
			httpclient=new DefaultHttpClient();
    		httppost=new HttpPost("http://192.168.254.2/getAllCustomers/randevukaydet.php");
    		 day = datePicker.getDayOfMonth();
    		String daystring = Integer.toString(day);
    		month = datePicker.getMonth();
    		 year = datePicker.getYear();
    		 String yearstring = Integer.toString(year);
    		nameValuePairs=new ArrayList<NameValuePair>(3);
    		nameValuePairs.add(new BasicNameValuePair("username", myParam1));
    		nameValuePairs.add(new BasicNameValuePair("date", daystring+ "-"+monthlist[month]+"-"+yearstring) );
    		nameValuePairs.add(new BasicNameValuePair("time", "09.30") );
    		httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
    		//response=httpclient.execute(httppost);
    		
    		ResponseHandler<String> responseHandler=new BasicResponseHandler();
    		 final String response = httpclient.execute(httppost,responseHandler);
    		System.out.println("Response:" + response);
    		
			
			runOnUiThread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					
					Toast.makeText(getApplicationContext(), response, Toast.LENGTH_SHORT).show();
					//kayitdurumugoster.setText("\t\t\t\t\t " + response);
					
				
				}
			});
				
		}catch(Exception e){}
		
	} 
	
	void dokuzk�rkbes(){
		try{
			httpclient=new DefaultHttpClient();
    		httppost=new HttpPost("http://192.168.254.2/getAllCustomers/randevukaydet.php");
    		 day = datePicker.getDayOfMonth();
    		String daystring = Integer.toString(day);
    		month = datePicker.getMonth();
    		 year = datePicker.getYear();
    		 String yearstring = Integer.toString(year);
    		nameValuePairs=new ArrayList<NameValuePair>(3);
    		nameValuePairs.add(new BasicNameValuePair("username", myParam1));
    		nameValuePairs.add(new BasicNameValuePair("date", daystring+ "-"+monthlist[month]+"-"+yearstring) );
    		nameValuePairs.add(new BasicNameValuePair("time", "09.45") );
    		httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
    		//response=httpclient.execute(httppost);
    		
    		ResponseHandler<String> responseHandler=new BasicResponseHandler();
    		 final String response = httpclient.execute(httppost,responseHandler);
    		System.out.println("Response:" + response);
    		
			
			runOnUiThread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					
					Toast.makeText(getApplicationContext(), response, Toast.LENGTH_SHORT).show();
					//kayitdurumugoster.setText("\t\t\t\t\t " + response);
					
				
				}
			});
				
		}catch(Exception e){}
		
	} 
	
	
	void on(){
		try{
			httpclient=new DefaultHttpClient();
    		httppost=new HttpPost("http://192.168.254.2/getAllCustomers/randevukaydet.php");
    		 day = datePicker.getDayOfMonth();
    		String daystring = Integer.toString(day);
    		month = datePicker.getMonth();
    		 year = datePicker.getYear();
    		 String yearstring = Integer.toString(year);
    		nameValuePairs=new ArrayList<NameValuePair>(3);
    		nameValuePairs.add(new BasicNameValuePair("username", myParam1));
    		nameValuePairs.add(new BasicNameValuePair("date", daystring+ "-"+monthlist[month]+"-"+yearstring) );
    		nameValuePairs.add(new BasicNameValuePair("time", "10.00") );
    		httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
    		//response=httpclient.execute(httppost);
    		
    		ResponseHandler<String> responseHandler=new BasicResponseHandler();
    		 final String response = httpclient.execute(httppost,responseHandler);
    		System.out.println("Response:" + response);
    		
			
			runOnUiThread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					
					Toast.makeText(getApplicationContext(), response, Toast.LENGTH_SHORT).show();
					//kayitdurumugoster.setText("\t\t\t\t\t " + response);
					
				
				}
			});
				
		}catch(Exception e){}
		
	} 
	
	
	void ononbes(){
		try{
			httpclient=new DefaultHttpClient();
    		httppost=new HttpPost("http://192.168.254.2/getAllCustomers/randevukaydet.php");
    		 day = datePicker.getDayOfMonth();
    		String daystring = Integer.toString(day);
    		month = datePicker.getMonth();
    		 year = datePicker.getYear();
    		 String yearstring = Integer.toString(year);
    		nameValuePairs=new ArrayList<NameValuePair>(3);
    		nameValuePairs.add(new BasicNameValuePair("username", myParam1));
    		nameValuePairs.add(new BasicNameValuePair("date", daystring+ "-"+monthlist[month]+"-"+yearstring) );
    		nameValuePairs.add(new BasicNameValuePair("time", "10.15") );
    		httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
    		//response=httpclient.execute(httppost);
    		
    		ResponseHandler<String> responseHandler=new BasicResponseHandler();
    		 final String response = httpclient.execute(httppost,responseHandler);
    		System.out.println("Response:" + response);
    		
			
			runOnUiThread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					
					Toast.makeText(getApplicationContext(), response, Toast.LENGTH_SHORT).show();
					//kayitdurumugoster.setText("\t\t\t\t\t " + response);
					
				
				}
			});
				
		}catch(Exception e){}
		
	} 
	
	
	void onotuz(){
		try{
			httpclient=new DefaultHttpClient();
    		httppost=new HttpPost("http://192.168.254.2/getAllCustomers/randevukaydet.php");
    		 day = datePicker.getDayOfMonth();
    		String daystring = Integer.toString(day);
    		month = datePicker.getMonth();
    		 year = datePicker.getYear();
    		 String yearstring = Integer.toString(year);
    		nameValuePairs=new ArrayList<NameValuePair>(3);
    		nameValuePairs.add(new BasicNameValuePair("username", myParam1));
    		nameValuePairs.add(new BasicNameValuePair("date", daystring+ "-"+monthlist[month]+"-"+yearstring) );
    		nameValuePairs.add(new BasicNameValuePair("time", "10.30") );
    		httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
    		//response=httpclient.execute(httppost);
    		
    		ResponseHandler<String> responseHandler=new BasicResponseHandler();
    		 final String response = httpclient.execute(httppost,responseHandler);
    		System.out.println("Response:" + response);
    		
			
			runOnUiThread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					
					Toast.makeText(getApplicationContext(), response, Toast.LENGTH_SHORT).show();
					//kayitdurumugoster.setText("\t\t\t\t\t " + response);
					
				
				}
			});
				
		}catch(Exception e){}
		
	} 
	
	
	void onk�rkbes(){
		try{
			httpclient=new DefaultHttpClient();
    		httppost=new HttpPost("http://192.168.254.2/getAllCustomers/randevukaydet.php");
    		 day = datePicker.getDayOfMonth();
    		String daystring = Integer.toString(day);
    		month = datePicker.getMonth();
    		 year = datePicker.getYear();
    		 String yearstring = Integer.toString(year);
    		nameValuePairs=new ArrayList<NameValuePair>(3);
    		nameValuePairs.add(new BasicNameValuePair("username", myParam1));
    		nameValuePairs.add(new BasicNameValuePair("date", daystring+ "-"+monthlist[month]+"-"+yearstring) );
    		nameValuePairs.add(new BasicNameValuePair("time", "10.45") );
    		httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
    		//response=httpclient.execute(httppost);
    		
    		ResponseHandler<String> responseHandler=new BasicResponseHandler();
    		 final String response = httpclient.execute(httppost,responseHandler);
    		System.out.println("Response:" + response);
    		
			
			runOnUiThread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					
					Toast.makeText(getApplicationContext(), response, Toast.LENGTH_SHORT).show();
					//kayitdurumugoster.setText("\t\t\t\t\t " + response);
					
				
				}
			});
				
		}catch(Exception e){}
		
	} 
	
	
	void onbir(){
		try{
			httpclient=new DefaultHttpClient();
    		httppost=new HttpPost("http://192.168.254.2/getAllCustomers/randevukaydet.php");
    		 day = datePicker.getDayOfMonth();
    		String daystring = Integer.toString(day);
    		month = datePicker.getMonth();
    		 year = datePicker.getYear();
    		 String yearstring = Integer.toString(year);
    		nameValuePairs=new ArrayList<NameValuePair>(3);
    		nameValuePairs.add(new BasicNameValuePair("username", myParam1));
    		nameValuePairs.add(new BasicNameValuePair("date", daystring+ "-"+monthlist[month]+"-"+yearstring) );
    		nameValuePairs.add(new BasicNameValuePair("time", "11.00") );
    		httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
    		//response=httpclient.execute(httppost);
    		
    		ResponseHandler<String> responseHandler=new BasicResponseHandler();
    		 final String response = httpclient.execute(httppost,responseHandler);
    		System.out.println("Response:" + response);
    		
			
			runOnUiThread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					
					Toast.makeText(getApplicationContext(), response, Toast.LENGTH_SHORT).show();
					//kayitdurumugoster.setText("\t\t\t\t\t " + response);
					
				
				}
			});
				
		}catch(Exception e){}
		
	} 
	
	void onbironbes(){
		try{
			httpclient=new DefaultHttpClient();
    		httppost=new HttpPost("http://192.168.254.2/getAllCustomers/randevukaydet.php");
    		 day = datePicker.getDayOfMonth();
    		String daystring = Integer.toString(day);
    		month = datePicker.getMonth();
    		 year = datePicker.getYear();
    		 String yearstring = Integer.toString(year);
    		nameValuePairs=new ArrayList<NameValuePair>(3);
    		nameValuePairs.add(new BasicNameValuePair("username", myParam1));
    		nameValuePairs.add(new BasicNameValuePair("date", daystring+ "-"+monthlist[month]+"-"+yearstring) );
    		nameValuePairs.add(new BasicNameValuePair("time", "11.15") );
    		httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
    		//response=httpclient.execute(httppost);
    		
    		ResponseHandler<String> responseHandler=new BasicResponseHandler();
    		 final String response = httpclient.execute(httppost,responseHandler);
    		System.out.println("Response:" + response);
    		
			
			runOnUiThread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					
					Toast.makeText(getApplicationContext(), response, Toast.LENGTH_SHORT).show();
					//kayitdurumugoster.setText("\t\t\t\t\t " + response);
					
				
				}
			});
				
		}catch(Exception e){}
		
	} 
	
	
	void onbirotuz(){
		try{
			httpclient=new DefaultHttpClient();
    		httppost=new HttpPost("http://192.168.254.2/getAllCustomers/randevukaydet.php");
    		 day = datePicker.getDayOfMonth();
    		String daystring = Integer.toString(day);
    		month = datePicker.getMonth();
    		 year = datePicker.getYear();
    		 String yearstring = Integer.toString(year);
    		nameValuePairs=new ArrayList<NameValuePair>(3);
    		nameValuePairs.add(new BasicNameValuePair("username", myParam1));
    		nameValuePairs.add(new BasicNameValuePair("date", daystring+ "-"+monthlist[month]+"-"+yearstring) );
    		nameValuePairs.add(new BasicNameValuePair("time", "11.30") );
    		httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
    		//response=httpclient.execute(httppost);
    		
    		ResponseHandler<String> responseHandler=new BasicResponseHandler();
    		 final String response = httpclient.execute(httppost,responseHandler);
    		System.out.println("Response:" + response);
    		
			
			runOnUiThread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					
					Toast.makeText(getApplicationContext(), response, Toast.LENGTH_SHORT).show();
					//kayitdurumugoster.setText("\t\t\t\t\t " + response);
					
				
				}
			});
				
		}catch(Exception e){}
		
	} 
	
	void onbirk�rkbes(){
		try{
			httpclient=new DefaultHttpClient();
    		httppost=new HttpPost("http://192.168.254.2/getAllCustomers/randevukaydet.php");
    		 day = datePicker.getDayOfMonth();
    		String daystring = Integer.toString(day);
    		month = datePicker.getMonth();
    		 year = datePicker.getYear();
    		 String yearstring = Integer.toString(year);
    		nameValuePairs=new ArrayList<NameValuePair>(3);
    		nameValuePairs.add(new BasicNameValuePair("username", myParam1));
    		nameValuePairs.add(new BasicNameValuePair("date", daystring+ "-"+monthlist[month]+"-"+yearstring) );
    		nameValuePairs.add(new BasicNameValuePair("time", "11.45") );
    		httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
    		//response=httpclient.execute(httppost);
    		
    		ResponseHandler<String> responseHandler=new BasicResponseHandler();
    		 final String response = httpclient.execute(httppost,responseHandler);
    		System.out.println("Response:" + response);
    		
			
			runOnUiThread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					
					Toast.makeText(getApplicationContext(), response, Toast.LENGTH_SHORT).show();
					//kayitdurumugoster.setText("\t\t\t\t\t " + response);
					
				
				}
			});
				
		}catch(Exception e){}
		
	} 
	
	void onuc(){
		try{
			httpclient=new DefaultHttpClient();
    		httppost=new HttpPost("http://192.168.254.2/getAllCustomers/randevukaydet.php");
    		 day = datePicker.getDayOfMonth();
    		String daystring = Integer.toString(day);
    		month = datePicker.getMonth();
    		 year = datePicker.getYear();
    		 String yearstring = Integer.toString(year);
    		nameValuePairs=new ArrayList<NameValuePair>(3);
    		nameValuePairs.add(new BasicNameValuePair("username", myParam1));
    		nameValuePairs.add(new BasicNameValuePair("date", daystring+ "-"+monthlist[month]+"-"+yearstring) );
    		nameValuePairs.add(new BasicNameValuePair("time", "13.00") );
    		httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
    		//response=httpclient.execute(httppost);
    		
    		ResponseHandler<String> responseHandler=new BasicResponseHandler();
    		 final String response = httpclient.execute(httppost,responseHandler);
    		System.out.println("Response:" + response);
    		
			
			runOnUiThread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					
					Toast.makeText(getApplicationContext(), response, Toast.LENGTH_SHORT).show();
					//kayitdurumugoster.setText("\t\t\t\t\t " + response);
					
				
				}
			});
				
		}catch(Exception e){}
		
	}
	
	
	void onuconbes(){
		try{
			httpclient=new DefaultHttpClient();
    		httppost=new HttpPost("http://192.168.254.2/getAllCustomers/randevukaydet.php");
    		 day = datePicker.getDayOfMonth();
    		String daystring = Integer.toString(day);
    		month = datePicker.getMonth();
    		 year = datePicker.getYear();
    		 String yearstring = Integer.toString(year);
    		nameValuePairs=new ArrayList<NameValuePair>(3);
    		nameValuePairs.add(new BasicNameValuePair("username", myParam1));
    		nameValuePairs.add(new BasicNameValuePair("date", daystring+ "-"+monthlist[month]+"-"+yearstring) );
    		nameValuePairs.add(new BasicNameValuePair("time", "13.15") );
    		httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
    		//response=httpclient.execute(httppost);
    		
    		ResponseHandler<String> responseHandler=new BasicResponseHandler();
    		 final String response = httpclient.execute(httppost,responseHandler);
    		System.out.println("Response:" + response);
    		
			
			runOnUiThread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					
					Toast.makeText(getApplicationContext(), response, Toast.LENGTH_SHORT).show();
					//kayitdurumugoster.setText("\t\t\t\t\t " + response);
					
				
				}
			});
				
		}catch(Exception e){}
		
	}
	
	void onucotuz(){
		try{
			httpclient=new DefaultHttpClient();
    		httppost=new HttpPost("http://192.168.254.2/getAllCustomers/randevukaydet.php");
    		 day = datePicker.getDayOfMonth();
    		String daystring = Integer.toString(day);
    		month = datePicker.getMonth();
    		 year = datePicker.getYear();
    		 String yearstring = Integer.toString(year);
    		nameValuePairs=new ArrayList<NameValuePair>(3);
    		nameValuePairs.add(new BasicNameValuePair("username", myParam1));
    		nameValuePairs.add(new BasicNameValuePair("date", daystring+ "-"+monthlist[month]+"-"+yearstring) );
    		nameValuePairs.add(new BasicNameValuePair("time", "13.30") );
    		httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
    		//response=httpclient.execute(httppost);
    		
    		ResponseHandler<String> responseHandler=new BasicResponseHandler();
    		 final String response = httpclient.execute(httppost,responseHandler);
    		System.out.println("Response:" + response);
    		
			
			runOnUiThread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					
					Toast.makeText(getApplicationContext(), response, Toast.LENGTH_SHORT).show();
					//kayitdurumugoster.setText("\t\t\t\t\t " + response);
					
				
				}
			});
				
		}catch(Exception e){}
		
	}
	
	void onuck�rkbes(){
		try{
			httpclient=new DefaultHttpClient();
    		httppost=new HttpPost("http://192.168.254.2/getAllCustomers/randevukaydet.php");
    		 day = datePicker.getDayOfMonth();
    		String daystring = Integer.toString(day);
    		month = datePicker.getMonth();
    		 year = datePicker.getYear();
    		 String yearstring = Integer.toString(year);
    		nameValuePairs=new ArrayList<NameValuePair>(3);
    		nameValuePairs.add(new BasicNameValuePair("username", myParam1));
    		nameValuePairs.add(new BasicNameValuePair("date", daystring+ "-"+monthlist[month]+"-"+yearstring) );
    		nameValuePairs.add(new BasicNameValuePair("time", "13.45") );
    		httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
    		//response=httpclient.execute(httppost);
    		
    		ResponseHandler<String> responseHandler=new BasicResponseHandler();
    		 final String response = httpclient.execute(httppost,responseHandler);
    		System.out.println("Response:" + response);
    		
			
			runOnUiThread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					
					Toast.makeText(getApplicationContext(), response, Toast.LENGTH_SHORT).show();
					//kayitdurumugoster.setText("\t\t\t\t\t " + response);
					
				
				}
			});
				
		}catch(Exception e){}
		
	}
	
	
	void ondort(){
		try{
			httpclient=new DefaultHttpClient();
    		httppost=new HttpPost("http://192.168.254.2/getAllCustomers/randevukaydet.php");
    		 day = datePicker.getDayOfMonth();
    		String daystring = Integer.toString(day);
    		month = datePicker.getMonth();
    		 year = datePicker.getYear();
    		 String yearstring = Integer.toString(year);
    		nameValuePairs=new ArrayList<NameValuePair>(3);
    		nameValuePairs.add(new BasicNameValuePair("username", myParam1));
    		nameValuePairs.add(new BasicNameValuePair("date", daystring+ "-"+monthlist[month]+"-"+yearstring) );
    		nameValuePairs.add(new BasicNameValuePair("time", "14.00") );
    		httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
    		//response=httpclient.execute(httppost);
    		
    		ResponseHandler<String> responseHandler=new BasicResponseHandler();
    		 final String response = httpclient.execute(httppost,responseHandler);
    		System.out.println("Response:" + response);
    		
			
			runOnUiThread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					
					Toast.makeText(getApplicationContext(), response, Toast.LENGTH_SHORT).show();
					//kayitdurumugoster.setText("\t\t\t\t\t " + response);
					
				
				}
			});
				
		}catch(Exception e){}
		
	}
	
	
	void ondortonbes(){
		try{
			httpclient=new DefaultHttpClient();
    		httppost=new HttpPost("http://192.168.254.2/getAllCustomers/randevukaydet.php");
    		 day = datePicker.getDayOfMonth();
    		String daystring = Integer.toString(day);
    		month = datePicker.getMonth();
    		 year = datePicker.getYear();
    		 String yearstring = Integer.toString(year);
    		nameValuePairs=new ArrayList<NameValuePair>(3);
    		nameValuePairs.add(new BasicNameValuePair("username", myParam1));
    		nameValuePairs.add(new BasicNameValuePair("date", daystring+ "-"+monthlist[month]+"-"+yearstring) );
    		nameValuePairs.add(new BasicNameValuePair("time", "14.15") );
    		httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
    		//response=httpclient.execute(httppost);
    		
    		ResponseHandler<String> responseHandler=new BasicResponseHandler();
    		 final String response = httpclient.execute(httppost,responseHandler);
    		System.out.println("Response:" + response);
    		
			
			runOnUiThread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					
					Toast.makeText(getApplicationContext(), response, Toast.LENGTH_SHORT).show();
					//kayitdurumugoster.setText("\t\t\t\t\t " + response);
					
				
				}
			});
				
		}catch(Exception e){}
		
	}
	
	void ondortotuz(){
		try{
			httpclient=new DefaultHttpClient();
    		httppost=new HttpPost("http://192.168.254.2/getAllCustomers/randevukaydet.php");
    		 day = datePicker.getDayOfMonth();
    		String daystring = Integer.toString(day);
    		month = datePicker.getMonth();
    		 year = datePicker.getYear();
    		 String yearstring = Integer.toString(year);
    		nameValuePairs=new ArrayList<NameValuePair>(3);
    		nameValuePairs.add(new BasicNameValuePair("username", myParam1));
    		nameValuePairs.add(new BasicNameValuePair("date", daystring+ "-"+monthlist[month]+"-"+yearstring) );
    		nameValuePairs.add(new BasicNameValuePair("time", "14.30") );
    		httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
    		//response=httpclient.execute(httppost);
    		
    		ResponseHandler<String> responseHandler=new BasicResponseHandler();
    		 final String response = httpclient.execute(httppost,responseHandler);
    		System.out.println("Response:" + response);
    		
			
			runOnUiThread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					
					Toast.makeText(getApplicationContext(), response, Toast.LENGTH_SHORT).show();
					//kayitdurumugoster.setText("\t\t\t\t\t " + response);
					
				
				}
			});
				
		}catch(Exception e){}
		
	}
	
	
	void ondortk�rkbes(){
		try{
			httpclient=new DefaultHttpClient();
    		httppost=new HttpPost("http://192.168.254.2/getAllCustomers/randevukaydet.php");
    		 day = datePicker.getDayOfMonth();
    		String daystring = Integer.toString(day);
    		month = datePicker.getMonth();
    		 year = datePicker.getYear();
    		 String yearstring = Integer.toString(year);
    		nameValuePairs=new ArrayList<NameValuePair>(3);
    		nameValuePairs.add(new BasicNameValuePair("username", myParam1));
    		nameValuePairs.add(new BasicNameValuePair("date", daystring+ "-"+monthlist[month]+"-"+yearstring) );
    		nameValuePairs.add(new BasicNameValuePair("time", "14.45") );
    		httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
    		//response=httpclient.execute(httppost);
    		
    		ResponseHandler<String> responseHandler=new BasicResponseHandler();
    		 final String response = httpclient.execute(httppost,responseHandler);
    		System.out.println("Response:" + response);
    		
			
			runOnUiThread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					
					Toast.makeText(getApplicationContext(), response, Toast.LENGTH_SHORT).show();
					//kayitdurumugoster.setText("\t\t\t\t\t " + response);
					
				
				}
			});
				
		}catch(Exception e){}
		
	}
	
	
	void onbes(){
		try{
			httpclient=new DefaultHttpClient();
    		httppost=new HttpPost("http://192.168.254.2/getAllCustomers/randevukaydet.php");
    		 day = datePicker.getDayOfMonth();
    		String daystring = Integer.toString(day);
    		month = datePicker.getMonth();
    		 year = datePicker.getYear();
    		 String yearstring = Integer.toString(year);
    		nameValuePairs=new ArrayList<NameValuePair>(3);
    		nameValuePairs.add(new BasicNameValuePair("username", myParam1));
    		nameValuePairs.add(new BasicNameValuePair("date", daystring+ "-"+monthlist[month]+"-"+yearstring) );
    		nameValuePairs.add(new BasicNameValuePair("time", "15.00") );
    		httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
    		//response=httpclient.execute(httppost);
    		
    		ResponseHandler<String> responseHandler=new BasicResponseHandler();
    		 final String response = httpclient.execute(httppost,responseHandler);
    		System.out.println("Response:" + response);
    		
			
			runOnUiThread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					
					Toast.makeText(getApplicationContext(), response, Toast.LENGTH_SHORT).show();
					//kayitdurumugoster.setText("\t\t\t\t\t " + response);
					
				
				}
			});
				
		}catch(Exception e){}
		
	}
	
	void onbesonbes(){
		try{
			httpclient=new DefaultHttpClient();
    		httppost=new HttpPost("http://192.168.254.2/getAllCustomers/randevukaydet.php");
    		 day = datePicker.getDayOfMonth();
    		String daystring = Integer.toString(day);
    		month = datePicker.getMonth();
    		 year = datePicker.getYear();
    		 String yearstring = Integer.toString(year);
    		nameValuePairs=new ArrayList<NameValuePair>(3);
    		nameValuePairs.add(new BasicNameValuePair("username", myParam1));
    		nameValuePairs.add(new BasicNameValuePair("date", daystring+ "-"+monthlist[month]+"-"+yearstring) );
    		nameValuePairs.add(new BasicNameValuePair("time", "15.15") );
    		httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
    		//response=httpclient.execute(httppost);
    		
    		ResponseHandler<String> responseHandler=new BasicResponseHandler();
    		 final String response = httpclient.execute(httppost,responseHandler);
    		System.out.println("Response:" + response);
    		
			
			runOnUiThread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					
					Toast.makeText(getApplicationContext(), response, Toast.LENGTH_SHORT).show();
					//kayitdurumugoster.setText("\t\t\t\t\t " + response);
					
				
				}
			});
				
		}catch(Exception e){}
		
	}
	
	void onbesotuz(){
		try{
			httpclient=new DefaultHttpClient();
    		httppost=new HttpPost("http://192.168.254.2/getAllCustomers/randevukaydet.php");
    		 day = datePicker.getDayOfMonth();
    		String daystring = Integer.toString(day);
    		month = datePicker.getMonth();
    		 year = datePicker.getYear();
    		 String yearstring = Integer.toString(year);
    		nameValuePairs=new ArrayList<NameValuePair>(3);
    		nameValuePairs.add(new BasicNameValuePair("username", myParam1));
    		nameValuePairs.add(new BasicNameValuePair("date", daystring+ "-"+monthlist[month]+"-"+yearstring) );
    		nameValuePairs.add(new BasicNameValuePair("time", "15.30") );
    		httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
    		//response=httpclient.execute(httppost);
    		
    		ResponseHandler<String> responseHandler=new BasicResponseHandler();
    		 final String response = httpclient.execute(httppost,responseHandler);
    		System.out.println("Response:" + response);
    		
			
			runOnUiThread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					
					Toast.makeText(getApplicationContext(), response, Toast.LENGTH_SHORT).show();
					//kayitdurumugoster.setText("\t\t\t\t\t " + response);
					
				
				}
			});
				
		}catch(Exception e){}
		
	}
	
	
	void onbesk�rkbes(){
		try{
			httpclient=new DefaultHttpClient();
    		httppost=new HttpPost("http://192.168.254.2/getAllCustomers/randevukaydet.php");
    		 day = datePicker.getDayOfMonth();
    		String daystring = Integer.toString(day);
    		month = datePicker.getMonth();
    		 year = datePicker.getYear();
    		 String yearstring = Integer.toString(year);
    		nameValuePairs=new ArrayList<NameValuePair>(3);
    		nameValuePairs.add(new BasicNameValuePair("username", myParam1));
    		nameValuePairs.add(new BasicNameValuePair("date", daystring+ "-"+monthlist[month]+"-"+yearstring) );
    		nameValuePairs.add(new BasicNameValuePair("time", "15.45") );
    		httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
    		//response=httpclient.execute(httppost);
    		
    		ResponseHandler<String> responseHandler=new BasicResponseHandler();
    		 final String response = httpclient.execute(httppost,responseHandler);
    		System.out.println("Response:" + response);
    		
			
			runOnUiThread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					
					Toast.makeText(getApplicationContext(), response, Toast.LENGTH_SHORT).show();
					//kayitdurumugoster.setText("\t\t\t\t\t " + response);
					
				
				}
			});
				
		}catch(Exception e){}
		
	}
	
	
	void onalt�(){
		try{
			httpclient=new DefaultHttpClient();
    		httppost=new HttpPost("http://192.168.254.2/getAllCustomers/randevukaydet.php");
    		 day = datePicker.getDayOfMonth();
    		String daystring = Integer.toString(day);
    		month = datePicker.getMonth();
    		 year = datePicker.getYear();
    		 String yearstring = Integer.toString(year);
    		nameValuePairs=new ArrayList<NameValuePair>(3);
    		nameValuePairs.add(new BasicNameValuePair("username", myParam1));
    		nameValuePairs.add(new BasicNameValuePair("date", daystring+ "-"+monthlist[month]+"-"+yearstring) );
    		nameValuePairs.add(new BasicNameValuePair("time", "16.00") );
    		httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
    		//response=httpclient.execute(httppost);
    		
    		ResponseHandler<String> responseHandler=new BasicResponseHandler();
    		 final String response = httpclient.execute(httppost,responseHandler);
    		System.out.println("Response:" + response);
    		
			
			runOnUiThread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					
					Toast.makeText(getApplicationContext(), response, Toast.LENGTH_SHORT).show();
					//kayitdurumugoster.setText("\t\t\t\t\t " + response);
					
				
				}
			});
				
		}catch(Exception e){}
		
	}
	
	
	void onalt�onbes(){
		try{
			httpclient=new DefaultHttpClient();
    		httppost=new HttpPost("http://192.168.254.2/getAllCustomers/randevukaydet.php");
    		 day = datePicker.getDayOfMonth();
    		String daystring = Integer.toString(day);
    		month = datePicker.getMonth();
    		 year = datePicker.getYear();
    		 String yearstring = Integer.toString(year);
    		nameValuePairs=new ArrayList<NameValuePair>(3);
    		nameValuePairs.add(new BasicNameValuePair("username", myParam1));
    		nameValuePairs.add(new BasicNameValuePair("date", daystring+ "-"+monthlist[month]+"-"+yearstring) );
    		nameValuePairs.add(new BasicNameValuePair("time", "16.15") );
    		httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
    		//response=httpclient.execute(httppost);
    		
    		ResponseHandler<String> responseHandler=new BasicResponseHandler();
    		 final String response = httpclient.execute(httppost,responseHandler);
    		System.out.println("Response:" + response);
    		
			
			runOnUiThread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					
					Toast.makeText(getApplicationContext(), response, Toast.LENGTH_SHORT).show();
					//kayitdurumugoster.setText("\t\t\t\t\t " + response);
					
				
				}
			});
				
		}catch(Exception e){}
		
	}
	
	void onalt�otuz(){
		try{
			httpclient=new DefaultHttpClient();
    		httppost=new HttpPost("http://192.168.254.2/getAllCustomers/randevukaydet.php");
    		 day = datePicker.getDayOfMonth();
    		String daystring = Integer.toString(day);
    		month = datePicker.getMonth();
    		 year = datePicker.getYear();
    		 String yearstring = Integer.toString(year);
    		nameValuePairs=new ArrayList<NameValuePair>(3);
    		nameValuePairs.add(new BasicNameValuePair("username", myParam1));
    		nameValuePairs.add(new BasicNameValuePair("date", daystring+ "-"+monthlist[month]+"-"+yearstring) );
    		nameValuePairs.add(new BasicNameValuePair("time", "16.30") );
    		httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
    		//response=httpclient.execute(httppost);
    		
    		ResponseHandler<String> responseHandler=new BasicResponseHandler();
    		 final String response = httpclient.execute(httppost,responseHandler);
    		System.out.println("Response:" + response);
    		
			
			runOnUiThread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					
					Toast.makeText(getApplicationContext(), response, Toast.LENGTH_SHORT).show();
					//kayitdurumugoster.setText("\t\t\t\t\t " + response);
			
				}
			});
				
		}catch(Exception e){}
		
	}
	
	void onalt�k�rkbes(){
		try{
			httpclient=new DefaultHttpClient();
    		httppost=new HttpPost("http://192.168.254.2/getAllCustomers/randevukaydet.php");
    		 day = datePicker.getDayOfMonth();
    		String daystring = Integer.toString(day);
    		month = datePicker.getMonth();
    		 year = datePicker.getYear();
    		 String yearstring = Integer.toString(year);
    		nameValuePairs=new ArrayList<NameValuePair>(3);
    		nameValuePairs.add(new BasicNameValuePair("username", myParam1));
    		nameValuePairs.add(new BasicNameValuePair("date", daystring+ "-"+monthlist[month]+"-"+yearstring) );
    		nameValuePairs.add(new BasicNameValuePair("time", "16.45") );
    		httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
    		//response=httpclient.execute(httppost);
    		
    		ResponseHandler<String> responseHandler=new BasicResponseHandler();
    		 final String response = httpclient.execute(httppost,responseHandler);
    		System.out.println("Response:" + response);
    		
			
			runOnUiThread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					
					Toast.makeText(getApplicationContext(), response, Toast.LENGTH_SHORT).show();
					//kayitdurumugoster.setText("\t\t\t\t\t " + response);
				
				}
			});
				
		}catch(Exception e){}
		
	}
	//------------------------------------------------------------------------------------------------

}
