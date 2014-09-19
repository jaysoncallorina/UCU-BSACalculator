package com.edu.ucuccs.ucu_bsacalc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class GrossProfitCalc extends Activity {

	EditText txtRevenue;
	EditText txtCGS;
	TextView txtAnswer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_gross_profit_calc);
		getActionBar().setDisplayHomeAsUpEnabled(true);

		txtRevenue = (EditText) findViewById(R.id.txtRevenue);
		txtCGS = (EditText) findViewById(R.id.txtCGS);
		txtAnswer = (TextView) findViewById(R.id.txtAnswer);
	}

	public void Calc(View v) {

		String rev = txtRevenue.getText().toString();
		String cgs = txtCGS.getText().toString();
		if (rev.equals("") || cgs.equals("")) {

			Toast.makeText(getApplicationContext(), "Please enter number",
					Toast.LENGTH_LONG).show();
		} else {
			int ans = Integer.parseInt(rev) - Integer.parseInt(cgs);
			txtAnswer.setText(Integer.toString(ans));
		}
	}
	public boolean onOptionsItemSelected(MenuItem item){
	    Intent myIntent = new Intent(getApplicationContext(), BasicEquation.class);
	    startActivityForResult(myIntent, 0);
	    return true;

	}

}
