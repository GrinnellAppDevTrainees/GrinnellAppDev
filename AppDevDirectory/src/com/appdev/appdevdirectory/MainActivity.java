package com.appdev.appdevdirectory;

import com.variablevision.appdevdirectory.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Button directory = (Button) findViewById(R.id.Directory);
		Button activity = (Button) findViewById(R.id.Activity);
		Button about = (Button) findViewById(R.id.About);
		
		directory.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this,
						DirectoryActivity.class);
				startActivity(intent);
			}
		});
		
		activity.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this,
						ActivityFeed.class);
				startActivity(intent);
			}
		});
		
		about.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this,
						AboutActivity.class);
				startActivity(intent);
			}
		});
		
		
		
	}
}
