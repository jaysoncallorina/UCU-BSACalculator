package com.edu.ucuccs.ucu_bsacalc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Efficiency_Ratios extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_efficiency__ratios);
	}

	public void clickAT(View v) {

		Intent E = new Intent(this, AssetTurnoverCalc.class);
		startActivity(E);

	}

	public void clickACP(View v) {

		Intent E = new Intent(this, ACPCalc.class);
		startActivity(E);

	}

	public void clickCCC(View v) {

		Intent E = new Intent(this, CashConCycleCalc.class);
		startActivity(E);

	}

	public void clickICP(View v) {

		Intent E = new Intent(this, ICPCalc.class);
		startActivity(E);

	}
	public void clickICR(View v) {

		Intent E = new Intent(this, ICRCalc.class);
		startActivity(E);

	}

}
