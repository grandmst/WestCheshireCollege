package com.westcheshirecollege;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;

 
public class Splash extends Activity {
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.splash);
		
		
		Thread timer = new Thread(){
			@Override
			public void run(){
				try{
					sleep(5000);
				} catch (InterruptedException e){
					e.printStackTrace();
				}finally{
					Intent openStartingPoint = new Intent("com.westcheshirecollege.MAINACTIVITY");
					startActivity(openStartingPoint);
					}
				}
			};
			timer.start();
		}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}
	
	
}