package com.edu.ucuccs.ucu_bsacalc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ICPCalc extends Activity {

	EditText txtITR;
	TextView txtAnswer;
	Button btnCalc;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_icpcalc);

		txtITR = (EditText) findViewById(R.id.txtITR);
		txtAnswer = (TextView) findViewById(R.id.txtAnswer);
		btnCalc = (Button) findViewById(R.id.btnCalc);
		
		btnCalc.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				

				
				String ITR = txtITR.getText().toString();

				if (ITR.equals("")) {

					Toast.makeText(getApplicationContext(), "Please enter number",
							Toast.LENGTH_LONG).show();
				} else {
					int ans = 365 / Integer.parseInt(ITR);

					txtAnswer.setText(Integer.toString(ans));
				}


			}
			
			
			
		});
	}

}
