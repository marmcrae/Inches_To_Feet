package com.example.Inches_to_Feet;


        import androidx.appcompat.app.AppCompatActivity;

        import android.graphics.Color;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;

        import org.mozilla.javascript.Context;
        import org.mozilla.javascript.Scriptable;

        import java.math.RoundingMode;
        import java.text.DecimalFormat;


public class Calculator extends AppCompatActivity {
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnPercent,btnPlus,btnMinus,btnMultiply,btnDivision,btnEqual,btnFtEqual, btnClear,btnDot,btnBracket;
    public TextView tvInput,tvOutput, inchesOutput;
    String process;
    String finalResult = "";
    boolean checkBracket = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);

        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnDivision = findViewById(R.id.btnDivision);
        btnMultiply = findViewById(R.id.btnMultiply);

        btnEqual = findViewById(R.id.btnEqual);
        btnFtEqual =findViewById(R.id.btnFtEqual);

        btnClear = findViewById(R.id.btnClear);
        btnDot = findViewById(R.id.btnDot);
        btnPercent = findViewById(R.id.btnPercent);
        btnBracket = findViewById(R.id.btnBracket);

        tvInput = findViewById(R.id.tvInput);
        tvOutput = findViewById(R.id.tvOutput);
        inchesOutput = findViewById(R.id.calculatorFeetTV);

        DecimalFormat decimalFormat = new DecimalFormat("###,###");
        DecimalFormat decimalFormatIn = new DecimalFormat ("###,###.##");

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvInput.setText("");
                tvOutput.setText("");
                inchesOutput.setText("");
            }
        });



        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "6");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "9");
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "+");
            }
        });


        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "-");
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "×");
            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "÷");
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + ".");
            }
        });

        btnPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "%");
            }
        });

        btnBracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (checkBracket){
                    process = tvInput.getText().toString();
                    tvInput.setText(process + ")");
                    checkBracket = false;
                }else{
                    process = tvInput.getText().toString();
                    tvInput.setText(process + "(");
                    checkBracket = true;
                }

            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if( tvInput.getText().equals("")) {
                    inchesOutput.setText("ERROR: input cannot be empty");
                    inchesOutput.setTextColor(Color.RED);
                }

                process = tvInput.getText().toString();

                process = process.replaceAll("×","*");
                process = process.replaceAll("%","/100");
                process = process.replaceAll("÷","/");

                Context rhino =Context.enter();

                rhino.setOptimizationLevel(-1);

                //String finalResult = "";

                try {
                    Scriptable scriptable = rhino.initStandardObjects();
                    finalResult = rhino.evaluateString(scriptable,process,"javascript",1,null).toString();
                }catch (Exception e){
                    finalResult="0";
                }

                tvOutput.setText(finalResult);
            }





        });


        btnFtEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double multiplier = 12;
                double resultFeet = 0.0;
                double resultInches = 0.0;

                if( !tvInput.getText().equals("") && tvOutput.getText().equals("")) {

                    try {
                        double feetValue = Double.parseDouble(tvInput.getText().toString());
                        double inchesValue = Double.parseDouble(tvInput.getText().toString());

                        resultFeet = feetValue / multiplier;
                        resultInches = inchesValue % multiplier;
                        decimalFormat.setRoundingMode(RoundingMode.DOWN);


                        inchesOutput.setText("Feet: " + decimalFormat.format(resultFeet) + "  " + "Inches: " + decimalFormatIn.format(resultInches));

                    }catch (NumberFormatException exception) {
                        inchesOutput.setText("ERROR: Check Input");
                        inchesOutput.setTextColor(Color.RED);
                    }
                } else if ( tvOutput.getText().equals(finalResult)){
                    double feetValue = Double.parseDouble(tvOutput.getText().toString());
                    double inchesValue = Double.parseDouble(tvOutput.getText().toString());

                    resultFeet = feetValue / multiplier;
                    resultInches = inchesValue % multiplier;
                    decimalFormat.setRoundingMode(RoundingMode.DOWN);


                    inchesOutput.setText("Feet: " + decimalFormat.format(resultFeet) + "  "  + "Inches: " + decimalFormatIn.format (resultInches));



                } else if( tvInput.getText().equals("")) {
                    inchesOutput.setText("ERROR: Input Cannot Be Empty");
                    inchesOutput.setTextColor(Color.RED);



                }else{


                    double feetValue = Double.parseDouble(tvInput.getText().toString());
                    double inchesValue = Double.parseDouble(tvInput.getText().toString());

                    resultFeet = feetValue / multiplier;
                    resultInches = inchesValue % multiplier;
                    decimalFormat.setRoundingMode(RoundingMode.DOWN);



                }
            }
        });

    }
}
