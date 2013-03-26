package com.westcheshirecollege;

import net.simonvt.menudrawer.MenuDrawer;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

	private MenuDrawer mDrawer;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	        mDrawer = MenuDrawer.attach(this);
	        mDrawer.setContentView(R.layout.activity_rightmenu);
	        mDrawer.setMenuView(R.layout.menu_row_category);
	}

	
	
	
	
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
