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

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {
	
	Button giris;
	EditText username,password;
	TextView tvusername,tvpassword;
	
	HttpPost httppost;
	StringBuffer buffer;
	HttpResponse response;
	HttpClient httpclient;
	List<NameValuePair> nameValuePairs;
	
	ProgressDialog dialog = null;

    @Override
    protected void onCreate(Bundle MuratYýlmaz) {
        super.onCreate(MuratYýlmaz);
        setContentView(R.layout.activity_main);
        
      giris = (Button)findViewById(R.id.button1);
      username = (EditText)findViewById(R.id.editText1);
      password = (EditText)findViewById(R.id.editText2);
      tvusername = (TextView)findViewById(R.id.textView1);
      
   	//---------------------------CLICK BUTTON & FUNCTION------------------------------------------------
      giris.setOnClickListener(new View.OnClickListener() {
		
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				dialog = ProgressDialog.show(MainActivity.this, "","Validating user...",true);
				new Thread(new Runnable() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						login();
					}
				}).start();
				
			}
		});
        
    
        if (MuratYýlmaz == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }


  //------------------------------------FUNCTION---------------------------------------------------------------
    void login(){
    	try{
    		httpclient=new DefaultHttpClient();
    		httppost=new HttpPost("http://192.168.254.2/getAllCustomers/loin.php");
    		nameValuePairs=new ArrayList<NameValuePair>(2);
    		nameValuePairs.add(new BasicNameValuePair("username", username.getText().toString().trim()));
    		nameValuePairs.add(new BasicNameValuePair("password", password.getText().toString().trim()));
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
					//tvusername.setText("Response from PHP:" + response);

					response.trim();
					if(response.equalsIgnoreCase("hasta")){
			    		
						
						Intent intent =new Intent("com.muratyilmaz.EKRANHASTA");
						intent.putExtra( "userName", username.getText().toString().trim() );
		    			startActivity(intent);
		    			
		    		}else if(response.equalsIgnoreCase("doktor")){
		    		
		    			Intent intent =new Intent("com.muratyilmaz.EKRANAILEHEKIMI");
						intent.putExtra( "userName", username.getText().toString().trim() );
		    			startActivity(intent);
		    		} 
				
					dialog.dismiss();	
				}
			});
    		
    		
    	}catch(Exception e){}
    	
    }
    
    //---------------------------------------DONT LOOK-------------------------------------------------------------
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }

}
