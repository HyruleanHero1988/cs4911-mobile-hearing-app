package com.example.wildlifesounds_version2;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Animallist extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_animallist);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.animallist, menu);
		return true;
	}

}
