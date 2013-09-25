package com.example.wildlifesounds_version2;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;
import android.widget.ListView;
import java.util.ArrayList;


public class Animallist extends Activity {
	private ArrayList<animal> animalList_database; 	//contain a array list of Animal class
	private ListView animallist;
	
	private String[]animals= {"bobcat","coyote","deer","fox","mountainlion","possum",
							  "rabbit","raccoon","squirrel","turkey"};
	
	

	
	
	
	
	
	
	
	
	
	
	
	
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
	
	
	
	private void initializeVariable(){
		animallist=(ListView)findViewById(R.id.lvAnimallist);
		
	

		
	}

}


