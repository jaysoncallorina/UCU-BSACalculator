package com.edu.ucuccs.ucu_bsacalc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class NetProfitCalc extends Activity {

	EditText txtGP;
	EditText txtOE;
	EditText txtTax;
	EditText txtInterest;
	TextView txtAnswer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_net_profit_calc);
		getActionBar().setDisplayHomeAsUpEnabled(true);


		txtGP = (EditText) findViewById(R.id.txtGP);
		txtOE = (EditText) findViewById(R.id.txtOE);
		txtTax = (EditText) findViewById(R.id.txtTax);
		txtInterest = (EditText) findViewById(R.id.txtInterest);
		txtAnswer = (TextView) findViewById(R.id.txtAnswer);

	}

	public void Calc(View v) {

		String gp = txtGP.getText().toString();
		String oe = txtOE.getText().toString();
		String tax = txtTax.getText().toString();
		String interest = txtInterest.getText().toString();
		if (gp.equals("") || oe.equals("") || tax.equals("")
				|| interest.equals("")) {

			Toast.makeText(getApplicationContext(), "Please enter number",
					Toast.LENGTH_LONG).show();
		} else {
			int ans = Integer.parseInt(gp) - Integer.parseInt(oe)
					- Integer.parseInt(tax) - Integer.parseInt(interest);
			txtAnswer.setText(Integer.toString(ans));
		}
	}

	public boolean onOptionsItemSelected(MenuItem item){
	    Intent myIntent = new Intent(getApplicationContext(), BasicEquation.class);
	    startActivityForResult(myIntent, 0);
	    return true;

	}
}
