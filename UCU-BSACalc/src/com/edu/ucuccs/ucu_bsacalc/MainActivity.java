package com.edu.ucuccs.ucu_bsacalc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	Button BtnBasicEquation;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		BtnBasicEquation = (Button) findViewById(R.id.btnBasicEquation);

	}

	public void BasicEq(View v) {

		Intent BE = new Intent(this, BasicEquation.class);
		startActivity(BE);
	
	}

}
