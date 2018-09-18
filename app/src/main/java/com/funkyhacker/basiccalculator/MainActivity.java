package com.funkyhacker.basiccalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.funkyhacker.basiccalculator.MainActivity.Mode.DIVIDE;
import static com.funkyhacker.basiccalculator.MainActivity.Mode.MULTIPLE;
import static com.funkyhacker.basiccalculator.MainActivity.Mode.NONE;
import static com.funkyhacker.basiccalculator.MainActivity.Mode.PLUS;
import static com.funkyhacker.basiccalculator.MainActivity.Mode.SUBTRACT;


public class MainActivity extends AppCompatActivity {

    private Button button;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button0;
    private Button buttonp;
    private Button buttonm;
    private Button buttont;
    private Button buttond;
    private Button buttone;
    private Button buttondot;
    private Button buttonC;
    private Button buttonAC;
    private TextView textview;
    private int x, y, i;
    private String s;

    public enum Mode {
        PLUS,
        SUBTRACT,
        MULTIPLE,
        DIVIDE,
        NONE
    }

    private Mode mode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("TEST", "onCreate");
        initBtn();
        initListener();
        textview = findViewById(R.id.textView3);
        mode = NONE;

    }

    private void initBtn() {
        button = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button0 = findViewById(R.id.button0);
        buttonp = findViewById(R.id.buttonp);
        buttonm = findViewById(R.id.buttonm);
        buttont = findViewById(R.id.buttont);
        buttond = findViewById(R.id.buttond);
        buttone = findViewById(R.id.buttone);
        buttondot = findViewById(R.id.buttondot);
        buttonC = findViewById(R.id.buttonC);
        buttonAC = findViewById(R.id.buttonAC);

    }

    private void calculate(String number) {
        Log.d(number, "onClick");
        if (mode == NONE) {
            String current = (String) textview.getText();
            textview.setText(current + number);
            current = (String) textview.getText();
            x = Integer.parseInt(current);
        } else {
            if (i == 0) {
                textview.setText(number);
                i = 1;
            } else {
                String current = (String) textview.getText();
                textview.setText(current + number);
            }

        }
    }

    private void initListener() {

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate("1");
            }
        };
        button.setOnClickListener(listener);

        View.OnClickListener listener2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate("2");
            }
        };
        button2.setOnClickListener(listener2);

        View.OnClickListener listener3 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate("3");
            }
        };
        button3.setOnClickListener(listener3);

        View.OnClickListener listener4 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate("4");
            }
        };
        button4.setOnClickListener(listener4);

        View.OnClickListener listener5 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate("5");
            }
        };
        button5.setOnClickListener(listener5);

        View.OnClickListener listener6 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate("6");
            }
        };
        button6.setOnClickListener(listener6);

        View.OnClickListener listener7 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate("7");
            }
        };
        button7.setOnClickListener(listener7);

        View.OnClickListener listener8 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate("8");
            }
        };
        button8.setOnClickListener(listener8);

        View.OnClickListener listener9 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate("9");
            }
        };
        button9.setOnClickListener(listener9);

        View.OnClickListener listener0 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate("0");
            }
        };
        button0.setOnClickListener(listener0);

        View.OnClickListener listenerp = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("plus", "onClick");
                mode = PLUS;
            }
        };
        buttonp.setOnClickListener(listenerp);

        View.OnClickListener listenerm = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("minus", "onClick");
                mode = SUBTRACT;
            }
        };
        buttonm.setOnClickListener(listenerm);

        View.OnClickListener listenert = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("times", "onClick");
                mode = MULTIPLE;
            }
        };
        buttont.setOnClickListener(listenert);

        View.OnClickListener listenerd = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("div", "onClick");
                mode = DIVIDE;
            }
        };
        buttond.setOnClickListener(listenerd);

        View.OnClickListener listenere = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("equal", "onClick");
                if (mode == PLUS) {

                    String current = (String) textview.getText();
                    y = Integer.parseInt(current);
                    x = x + y;
                    s = String.valueOf(x);
                    textview.setText(s);

                } else if (mode == SUBTRACT) {
                    String current = (String) textview.getText();
                    y = Integer.parseInt(current);
                    x = x - y;
                    s = String.valueOf(x);
                    textview.setText(s);
                } else if (mode == MULTIPLE) {
                    String current = (String) textview.getText();
                    y = Integer.parseInt(current);
                    x = x * y;
                    s = String.valueOf(x);
                    textview.setText(s);
                } else if (mode == DIVIDE) {
                    String current = (String) textview.getText();
                    y = Integer.parseInt(current);
                    x = x / y;
                    s = String.valueOf(x);
                    textview.setText(s);
                }

            }
        };
        buttone.setOnClickListener(listenere);

        View.OnClickListener listenerdot = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("dot", "onClick");
            }
        };
        buttondot.setOnClickListener(listenerdot);

        View.OnClickListener listenerC = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("C", "onClick");
                textview.setText("");
                i = 0;
            }
        };
        buttonC.setOnClickListener(listenerC);

        View.OnClickListener listenerAC = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("AC", "onClick");
                textview.setText("");
                mode = NONE;
                i = 0;
            }
        };
        buttonAC.setOnClickListener(listenerAC);
    }
}