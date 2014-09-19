package com.edu.ucuccs.ucu_bsacalc;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class AssetCalc extends Activity {

	EditText txtEquity;
	EditText txtLiab;
	TextView txtAnswer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_asset_calc);
		getActionBar().setDisplayHomeAsUpEnabled(true);

		txtLiab = (EditText) findViewById(R.id.txtLiab);
		txtEquity = (EditText) findViewById(R.id.txtEquity);
		txtAnswer = (TextView) findViewById(R.id.txtAnswer);
	}

	public void Calculate(View v) {

		String liab = txtLiab.getText().toString();
		String equity = txtEquity.getText().toString();

		if(liab.equals("") || equity.equals("")){
		
			Toast.makeText(getApplicationContext(),
					"Please enter number", Toast.LENGTH_LONG)
					.show();
		}
		else{
			int ans = Integer.parseInt(liab) + Integer.parseInt(equity);
		
		txtAnswer.setText(Integer.toString(ans));
		}
	}
	public boolean onOptionsItemSelected(MenuItem item){
	    Intent myIntent = new Intent(getApplicationContext(), BasicEquation.class);
	    startActivityForResult(myIntent, 0);
	    return true;

	}

}
