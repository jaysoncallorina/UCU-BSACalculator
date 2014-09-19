package com.edu.ucuccs.ucu_bsacalc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class EquityCalc extends Activity {

	EditText txtAssets;
	EditText txtLiab;
	TextView txtAnswer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_equity_calc);
		getActionBar().setDisplayHomeAsUpEnabled(true);

		txtAssets = (EditText) findViewById(R.id.txtAssets);
		txtLiab = (EditText) findViewById(R.id.txtLiab);
		txtAnswer = (TextView) findViewById(R.id.txtAnswer);
	}

	public void Calc(View v) {

		String assets = txtAssets.getText().toString();
		String liab = txtLiab.getText().toString();
		if (assets.equals("") || liab.equals("")) {

			Toast.makeText(getApplicationContext(), "Please enter number",
					Toast.LENGTH_LONG).show();
		} else {
			int ans = Integer.parseInt(assets) - Integer.parseInt(liab);
			txtAnswer.setText(Integer.toString(ans));
		}
	}
	public boolean onOptionsItemSelected(MenuItem item){
	    Intent myIntent = new Intent(getApplicationContext(), BasicEquation.class);
	    startActivityForResult(myIntent, 0);
	    return true;

	}

}
