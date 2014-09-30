package com.edu.ucuccs.ucu_bsacalc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class AssetTurnoverCalc extends Activity {

	EditText txtNetSales;
	EditText txtTotalAssets;
	TextView txtAnswer;
	Button btnCalc;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_asset_turnover_calc);

		txtNetSales = (EditText) findViewById(R.id.txtNetSales);
		txtTotalAssets = (EditText) findViewById(R.id.txtTotalAssets);
		txtAnswer = (TextView) findViewById(R.id.txtAnswer);
		btnCalc = (Button) findViewById(R.id.btnCalc);
		
		btnCalc.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub

				
				String NS = txtNetSales.getText().toString();
				String TA = txtTotalAssets.getText().toString();

				if (NS.equals("") || TA.equals("")) {

					Toast.makeText(getApplicationContext(), "Please enter number",
							Toast.LENGTH_LONG).show();
				} else {
					int ans = Integer.parseInt(NS) / Integer.parseInt(TA);

					txtAnswer.setText(Integer.toString(ans));
				}


			}
			
			
			
		});
		

	}

}
