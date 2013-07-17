package com.example.customactivities;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;
import android.view.View;
//import android.view.View.OnClickListener;

public class MainActivity extends Activity {
	public final static String MESSAGE = "Test message sent to new Action";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final Button button = (Button) findViewById(R.id.button1);
	    button.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View v) {
	            // Perform action on click
	        	sendMessage(v);
	        }
	    });
	}
	
	public void sendMessage(View view) {
		Intent intent = new Intent(this, DisplayMessageActivity.class);
	    EditText editText = (EditText) findViewById(R.id.edit_message);
	    String message = editText.getText().toString();
	    intent.putExtra(EXTRA_MESSAGE, message);
	    startActivity(intent);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
