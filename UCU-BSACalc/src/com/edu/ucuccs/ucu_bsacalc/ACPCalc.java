package com.edu.ucuccs.ucu_bsacalc;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.app.Activity;

public class ACPCalc extends Activity {
	
	EditText txtAR;
	EditText txtACS;
	TextView txtAnswer;
	Button btnCalc;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_acpcalc);
		
		txtAR = (EditText) findViewById(R.id.txtAR);
		txtACS = (EditText) findViewById(R.id.txtACS);
		txtAnswer = (TextView) findViewById(R.id.txtAnswer);
		btnCalc = (Button) findViewById(R.id.btnCalc);
		
		
		btnCalc.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				

				
				String AR = txtAR.getText().toString();
				String ACS = txtACS.getText().toString();

				if (AR.equals("") || ACS.equals("")) {

					Toast.makeText(getApplicationContext(), "Please enter number",
							Toast.LENGTH_LONG).show();
				} else {
					int ans = (Integer.parseInt(AR) / Integer.parseInt(ACS)) / 365;

					txtAnswer.setText(Integer.toString(ans));
				}


			}
			
			
			
		});
		
	}

}
