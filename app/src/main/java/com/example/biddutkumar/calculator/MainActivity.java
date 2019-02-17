package com.example.biddutkumar.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button oneBtn, twoBtn, threeBtn, fourBtn, fiveBtn, sixBtn, sevenBtn, eightBtn, nineBtn, zeroBtn,
    plusBtn, minusBtn, multipleBtn, divisionBtn,clearBtn;
    EditText inputET1, inputET2;
    TextView resultTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        oneBtn = findViewById(R.id.oneBtn);
        twoBtn = findViewById(R.id.twoBtn);
        threeBtn = findViewById(R.id.threeBtn);
        fourBtn = findViewById(R.id.fourBtn);
        fiveBtn = findViewById(R.id.fiveBtn);
        sixBtn = findViewById(R.id.sixBtn);
        sevenBtn = findViewById(R.id.sevenBtn);
        eightBtn = findViewById(R.id.eightBtn);
        nineBtn = findViewById(R.id.nineBtn);
        zeroBtn = findViewById(R.id.zeroBtn);
        plusBtn = findViewById(R.id.plusBtn);
        minusBtn = findViewById(R.id.minusBtn);
        multipleBtn = findViewById(R.id.multipleBtn);
        divisionBtn=findViewById(R.id.divisionBtn);
        clearBtn=findViewById(R.id.clearBtn);

        inputET1 = findViewById(R.id.inputET1);
        inputET2 = findViewById(R.id.inputET2);

        resultTV = findViewById(R.id.resultTV);

        /*oneBtn.setOnClickListener(this);
        twoBtn.setOnClickListener(this);
        threeBtn.setOnClickListener(this);
        fourBtn.setOnClickListener(this);
        fiveBtn.setOnClickListener(this);
        sixBtn.setOnClickListener(this);
        sevenBtn.setOnClickListener(this);
        eightBtn.setOnClickListener(this);
        nineBtn.setOnClickListener(this);
        zeroBtn.setOnClickListener(this);
        plusBtn.setOnClickListener(this);
        minusBtn.setOnClickListener(this);
        multipleBtn.setOnClickListener(this);
        divisionBtn.setOnClickListener(this);  */


      oneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(inputET1.isFocused())
                {
                    inputET1.setText(inputET1.getText().toString()+"1");
                    inputET1.setSelection(inputET1.getText().length());
                }
                else if(inputET2.isFocused())
                {
                    inputET2.setText(inputET2.getText().toString()+"1");
                    inputET2.setSelection(inputET2.getText().length());
                }

            }
        });


        twoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(inputET1.isFocused())
                {
                    inputET1.setText(inputET1.getText().toString()+"2");
                    inputET1.setSelection(inputET1.getText().length());
                }
                else if(inputET2.isFocused())
                {
                    inputET2.setText(inputET2.getText().toString()+"2");
                    inputET2.setSelection(inputET2.getText().length());
                }

            }
        });

        threeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inputET1.isFocused())
                {
                    inputET1.setText(inputET1.getText().toString()+"3");
                    inputET1.setSelection(inputET1.getText().length());
                }
                else if(inputET2.isFocused())
                {
                    inputET2.setText(inputET2.getText().toString()+"3");
                    inputET2.setSelection(inputET2.getText().length());
                }
            }
        });

        fourBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inputET1.isFocused())
                {
                    inputET1.setText(inputET1.getText().toString()+"4");
                    inputET1.setSelection(inputET1.getText().length());
                }
                else if(inputET2.isFocused())
                {
                    inputET2.setText(inputET2.getText().toString()+"4");
                    inputET2.setSelection(inputET2.getText().length());
                }
            }
        });

        fiveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inputET1.isFocused())
                {
                    inputET1.setText(inputET1.getText().toString()+"5");
                    inputET1.setSelection(inputET1.getText().length());
                }
                else if(inputET2.isFocused())
                {
                    inputET2.setText(inputET2.getText().toString()+"5");
                    inputET2.setSelection(inputET2.getText().length());
                }
            }
        });

        sixBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inputET1.isFocused())
                {
                    inputET1.setText(inputET1.getText().toString()+"6");
                    inputET1.setSelection(inputET1.getText().length());
                }
                else if(inputET2.isFocused())
                {
                    inputET2.setText(inputET2.getText().toString()+"6");
                    inputET2.setSelection(inputET2.getText().length());

                }
            }
        });

        sevenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inputET1.isFocused())
                {
                    inputET1.setText(inputET1.getText().toString()+"7");
                    inputET1.setSelection(inputET1.getText().length());
                }
                else if(inputET2.isFocused())
                {
                    inputET2.setText(inputET2.getText().toString()+"7");
                    inputET2.setSelection(inputET2.getText().length());
                }
            }
        });

        eightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inputET1.isFocused())
                {
                    inputET1.setText(inputET1.getText().toString()+"8");
                    inputET1.setSelection(inputET1.getText().length());
                }
                else if(inputET2.isFocused())
                {
                    inputET2.setText(inputET2.getText().toString()+"8");
                    inputET2.setSelection(inputET2.getText().length());
                }
            }
        });
        nineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(inputET1.isFocused())
                {
                    inputET1.setText(inputET1.getText().toString()+"9");
                    inputET1.setSelection(inputET1.getText().length());
                }
                else if(inputET2.isFocused())
                {
                    inputET2.setText(inputET2.getText().toString()+"9");
                    inputET2.setSelection(inputET2.getText().length());
                }
            }
        });

        zeroBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inputET1.isFocused())
                {
                    inputET1.setText(inputET1.getText().toString()+"0");
                    inputET1.setSelection(inputET1.getText().length());
                }
                else if(inputET2.isFocused())
                {
                    inputET2.setText(inputET2.getText().toString()+"0");
                    inputET2.setSelection(inputET2.getText().length());
                }
            }
        });



        plusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputValue1=inputET1.getText().toString();
                String inputValue2=inputET2.getText().toString();
                if(inputValue1.equals("")|| inputValue2.equals(""))
                {
                    //inputET1.setText("");
                    //inputET2.setText("");
                    //Toast.makeText(this, "Plz Enter the number", Toast.LENGTH_SHORT).show();
                }
                else {
                    int value1 = Integer.valueOf(inputValue1);
                    int value2 = Integer.valueOf(inputValue2);
                    int sum = value1 + value2;
                    resultTV.setText(String.valueOf("Result is : "+sum));
                }

            }
        });

        minusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputValue1=inputET1.getText().toString();
                String inputValue2=inputET2.getText().toString();
                if(inputValue1.equals("")|| inputValue2.equals(""))
                {
                    //inputET1.setText("");
                    //inputET2.setText("");
                    //Toast.makeText(this, "Plz Enter the number", Toast.LENGTH_SHORT).show();
                }
                else {
                    int value1 = Integer.valueOf(inputValue1);
                    int value2 = Integer.valueOf(inputValue2);
                    if(value1<value2)
                    {
                        Toast.makeText(MainActivity.this, "Num1 must be greater than num2.try again...", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        int sub = value1 - value2;
                        resultTV.setText(String.valueOf("Result is : "+sub));
                    }
                }

            }
        });

        multipleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputValue1=inputET1.getText().toString();
                String inputValue2=inputET2.getText().toString();
                if(inputValue1.equals("")|| inputValue2.equals(""))
                {
                    //inputET1.setText("");
                    //inputET2.setText("");
                    //Toast.makeText(this, "Plz Enter the number", Toast.LENGTH_SHORT).show();
                }
                else {
                    int value1 = Integer.valueOf(inputValue1);
                    int value2 = Integer.valueOf(inputValue2);
                    int mul = value1*value2;
                    resultTV.setText(String.valueOf("Result is : "+mul));
                }

            }
        });

        divisionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputValue1=inputET1.getText().toString();
                String inputValue2=inputET2.getText().toString();


                    int value1 = Integer.valueOf(inputValue1);
                    int value2 = Integer.valueOf(inputValue2);
                    if(value1<value2)
                    {
                        Toast.makeText(MainActivity.this, "Num1 must be greater than num2.try again...", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        int div = value1/value2;
                        resultTV.setText(String.valueOf("Result is : "+div));
                    }
                }

            }
        );

        clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inputET1.isFocused())
                {
                    inputET1.setText("");
                }
                else if(inputET2.isFocused())
                {
                    inputET2.setText("");
                }

            }
        });

    }
}