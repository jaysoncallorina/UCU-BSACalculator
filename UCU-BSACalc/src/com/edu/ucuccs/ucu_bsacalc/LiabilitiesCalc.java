package com.edu.ucuccs.ucu_bsacalc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LiabilitiesCalc extends Activity {

	EditText txtAssets;
	EditText txtEquity;
	TextView txtAnswer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_liabilities_calc);
		getActionBar().setDisplayHomeAsUpEnabled(true);

		txtAssets = (EditText) findViewById(R.id.txtAssets);
		txtEquity = (EditText) findViewById(R.id.txtEquity);
		txtAnswer = (TextView) findViewById(R.id.txtAnswer);
	}

	public void Calc(View v) {

		String asset = txtAssets.getText().toString();
		String equity = txtEquity.getText().toString();
		if (asset.equals("") || equity.equals("")) {

			Toast.makeText(getApplicationContext(), "Please enter number",
					Toast.LENGTH_LONG).show();
		} else {
			int ans = Integer.parseInt(asset) - Integer.parseInt(equity);
			txtAnswer.setText(Integer.toString(ans));
		}
	}
	public boolean onOptionsItemSelected(MenuItem item){
	    Intent myIntent = new Intent(getApplicationContext(), BasicEquation.class);
	    startActivityForResult(myIntent, 0);
	    return true;

	}

}
