package com.example.gridapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

import com.example.gridapp.adapter.ImageAdapter;
import com.example.gridapp.model.User;
import com.example.gridapp.ui.util.ExpandableHeightGridView;

import java.util.ArrayList;

public class MainActivity extends Activity
{
	private int[] grid_icon = new int[] {
			R.drawable.ic_launcher,
			R.drawable.ic_launcher,
			R.drawable.ic_launcher,
			R.drawable.ic_launcher};

	private String[] grid_text = new String[] { 
			"a",
			"b", 
			"c" , 
	"d"};

	private ExpandableHeightGridView gridView;
	private ArrayList<User> userList = new ArrayList<User>();
	private ImageAdapter imageAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		gridView = (ExpandableHeightGridView) findViewById(R.id.grid_view);
		gridView.setExpanded(true);

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				userList.add(new User(i+1, grid_text[i], grid_icon[i]));
			}
		}

		imageAdapter = new ImageAdapter(this, userList);
		gridView.setAdapter(imageAdapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	protected void onStart()
	{
		// TODO Auto-generated method stub
		super.onStart();
	}

}
