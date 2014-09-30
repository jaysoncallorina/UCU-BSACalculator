package com.edu.ucuccs.ucu_bsacalc;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.app.Activity;

public class CashConCycleCalc extends Activity {

	EditText txtICP;
	EditText txtRCP;
	EditText txtPCP;
	TextView txtAnswer;
	Button btnCalc;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cash_con_cycle_calc);

		txtICP = (EditText) findViewById(R.id.txtICP);
		txtRCP = (EditText) findViewById(R.id.txtRCP);
		txtPCP = (EditText) findViewById(R.id.txtPCP);
		txtAnswer = (TextView) findViewById(R.id.txtAnswer);
		btnCalc = (Button) findViewById(R.id.btnCalc);

		btnCalc.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub

				String ICP = txtICP.getText().toString();
				String RCP = txtRCP.getText().toString();
				String PCP = txtPCP.getText().toString();

				if (ICP.equals("") || RCP.equals("") || PCP.equals("")) {

					Toast.makeText(getApplicationContext(),
							"Please enter number", Toast.LENGTH_LONG).show();
				} else {
					int ans = (Integer.parseInt(ICP) + Integer.parseInt(RCP)) - Integer.parseInt(PCP);

					txtAnswer.setText(Integer.toString(ans));
				}

			}

		});
	}

}
