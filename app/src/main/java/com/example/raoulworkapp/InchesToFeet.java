package com.example.raoulworkapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class InchesToFeet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inches_to_feet);

        final EditText enterInches = (EditText) findViewById(R.id.enterInchesID);
        final EditText enterNumerator = (EditText) findViewById(R.id.enterNumeratorID);
        final EditText enterDenominator = (EditText) findViewById(R.id.enterDenominatorID);
        final TextView resultFeetTextView = (TextView) findViewById(R.id.resultFeetID);
        final TextView resultInchesTextView = (TextView) findViewById(R.id.resultInchesID);

        Button convertButton = (Button) findViewById(R.id.convertButton);
        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double multiplier = 12;
                double resultFeet = 0.0;
                double resultInches = 0.0;
                double fractionToDecValue =0.0;






                if (enterInches.getText().equals ("")) {


                    resultFeetTextView.setTextColor(Color.RED);
                }else {
                    double numeratorValue = Double.parseDouble(enterNumerator.getText().toString());
                    double denominatorValue = Double.parseDouble(enterDenominator.getText().toString());
                    double feetValue = Double.parseDouble(enterInches.getText().toString());
                    double inchesValue = Double.parseDouble(enterInches.getText().toString());


                    fractionToDecValue = (numeratorValue / denominatorValue) + feetValue;
                    resultFeet = fractionToDecValue / multiplier;
                    resultInches = fractionToDecValue % multiplier;

                    resultFeetTextView.setText(Double.toString(resultFeet));
                    resultInchesTextView.setText(Double.toString(resultInches));
                }

            }
        });
    }
}
