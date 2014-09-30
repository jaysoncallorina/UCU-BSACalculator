package com.edu.ucuccs.ucu_bsacalc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ICRCalc extends Activity {

	EditText txtSales;
	EditText txtCGS;
	TextView txtAnswer;
	Button btnCalc;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_icrcalc);
		
		txtSales = (EditText) findViewById(R.id.txtSales);
		txtCGS = (EditText) findViewById(R.id.txtCGS);
		txtAnswer = (TextView) findViewById(R.id.txtAnswer);
		btnCalc = (Button) findViewById(R.id.btnCalc);
		
		btnCalc.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				

				
				String Sales = txtSales.getText().toString();
				String CGS = txtCGS.getText().toString();

				if (Sales.equals("") || CGS.equals("")) {

					Toast.makeText(getApplicationContext(), "Please enter number",
							Toast.LENGTH_LONG).show();
				} else {
					
					double ans = (Integer.parseInt(Sales) * 0.5) / Integer.parseInt(CGS);
					txtAnswer.setText(double.class.toString(ans + ""));
				}


			}
			
			
			
		});
	}


}
