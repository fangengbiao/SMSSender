package com.example.smssender;

import android.os.Bundle;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.telephony.gsm.SmsManager;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	
	private Button sender;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		sender=(Button)findViewById(R.id.sender);
		sender.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				senderEmail();
			}

		});
	}

	@SuppressWarnings("deprecation")
	protected void senderEmail() {
		
		String msg ="hello";   
		String number = "5554";   
		SmsManager sms = SmsManager.getDefault();   
		PendingIntent pi = PendingIntent.
		getBroadcast(this,0,new Intent(),0);   
		sms.sendTextMessage(number,null,msg,pi,null);   
		
		Log.i("sdfa", "123");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
