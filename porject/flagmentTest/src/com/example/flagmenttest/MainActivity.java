package com.example.flagmenttest;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TabHost;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		TabHost th = (TabHost) findViewById(R.id.tabhost);
		th.setup();
		
		th.addTab(th.newTabSpec("tab1").setIndicator("”Ô‘g•\",null).setContent(R.id.tab1));
		th.addTab(th.newTabSpec("tab2").setIndicator("FILES",null).setContent(R.id.tab2));
		th.addTab(th.newTabSpec("tab3").setIndicator("LIST",null).setContent(R.id.tab3));	

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
