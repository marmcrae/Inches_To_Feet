package com.example.Inches_to_Feet;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.math.RoundingMode;
import java.text.DecimalFormat;

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
        final TextView feetResultTextView = (TextView) findViewById(R.id.feetResultTextViewID);
        final TextView inchesResultTextView = (TextView) findViewById(R.id.inchesResultTextViewID) ;

        java.text.DecimalFormat decimalFormat = new java.text.DecimalFormat("###,###");
        java.text.DecimalFormat decimalFormatIn = new DecimalFormat("###,###.##");


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

                    decimalFormat.setRoundingMode(RoundingMode.DOWN);

                    feetResultTextView.setVisibility(View.VISIBLE);
                    inchesResultTextView.setVisibility(View.VISIBLE);
                    resultFeetTextView.setText(decimalFormat.format(resultFeet));
                    resultInchesTextView.setText(decimalFormatIn.format(resultInches));




                }

            }
        });
    }
}
