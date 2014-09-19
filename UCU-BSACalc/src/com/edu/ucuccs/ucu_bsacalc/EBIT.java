package com.edu.ucuccs.ucu_bsacalc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class EBIT extends Activity {

	EditText txtRevenue;
	EditText txtOE;
	TextView txtAnswer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ebit);
		getActionBar().setDisplayHomeAsUpEnabled(true);

		txtRevenue = (EditText) findViewById(R.id.txtRevenue);
		txtOE = (EditText) findViewById(R.id.txtOE);
		txtAnswer = (TextView) findViewById(R.id.txtAnswer);
	}

	public void Calc(View v) {

		String rev = txtRevenue.getText().toString();
		String oe = txtOE.getText().toString();
		if (rev.equals("") || oe.equals("")) {

			Toast.makeText(getApplicationContext(), "Please enter number",
					Toast.LENGTH_LONG).show();
		} else {
			int ans = Integer.parseInt(rev) - Integer.parseInt(oe);
			txtAnswer.setText(Integer.toString(ans));
		}
	}
	public boolean onOptionsItemSelected(MenuItem item){
	    Intent myIntent = new Intent(getApplicationContext(), BasicEquation.class);
	    startActivityForResult(myIntent, 0);
	    return true;

	}

}
