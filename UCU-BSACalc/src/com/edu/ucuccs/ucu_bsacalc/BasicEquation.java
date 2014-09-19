package com.edu.ucuccs.ucu_bsacalc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class BasicEquation extends Activity {

	Button btnAssets;
	Button btnEBIT;
	Button btnEquity;
	Button btnGP;
	Button btnLiab;
	Button btnNet;
	Button btnOP;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_basic_equation);
		getActionBar().setDisplayHomeAsUpEnabled(true);

		btnAssets = (Button) findViewById(R.id.btnAssets);
		btnEBIT = (Button) findViewById(R.id.btnEBIT);
		btnEquity = (Button) findViewById(R.id.btnEquity);
		btnGP = (Button) findViewById(R.id.btnGP);
		btnLiab = (Button) findViewById(R.id.btnLiab);
		btnNet = (Button) findViewById(R.id.btnNet);
		btnOP = (Button) findViewById(R.id.btnOP);
	}

	public void asset(View v) {

		Intent BE = new Intent(this, AssetCalc.class);
		startActivity(BE);

	}

	public void EBIT(View v) {

		Intent EBIT = new Intent(this, EBIT.class);
		startActivity(EBIT);
	}
	public void Equity(View v) {

		Intent EBIT = new Intent(this, EquityCalc.class);
		startActivity(EBIT);
	}
	public void GP(View v) {

		Intent EBIT = new Intent(this, GrossProfitCalc.class);
		startActivity(EBIT);
	}
	public void Liab(View v) {

		Intent EBIT = new Intent(this, LiabilitiesCalc.class);
		startActivity(EBIT);
	}
	public void Net(View v) {

		Intent EBIT = new Intent(this, NetProfitCalc.class);
		startActivity(EBIT);
	}
	public void OP(View v) {

		Intent EBIT = new Intent(this, OperatingProfitCalc.class);
		startActivity(EBIT);
	}
	public boolean onOptionsItemSelected(MenuItem item){
	    Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
	    startActivityForResult(myIntent, 0);
	    return true;

	}
}
