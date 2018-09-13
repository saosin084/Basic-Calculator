package com.funkyhacker.basiccalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("TEST", "onCreate");
        initBtn();
        initListener();
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

    private void initListener() {

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("1", "onClick");
            }
        };
        button.setOnClickListener(listener);

        View.OnClickListener listener2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("2", "onClick");
            }
        };
        button2.setOnClickListener(listener2);

        View.OnClickListener listener3 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("3", "onClick");
            }
        };
        button3.setOnClickListener(listener3);

        View.OnClickListener listener4 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("4", "onClick");
            }
        };
        button4.setOnClickListener(listener4);

        View.OnClickListener listener5 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("5", "onClick");
            }
        };
        button5.setOnClickListener(listener5);

        View.OnClickListener listener6 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("6", "onClick");
            }
        };
        button6.setOnClickListener(listener6);

        View.OnClickListener listener7 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("7", "onClick");
            }
        };
        button7.setOnClickListener(listener7);

        View.OnClickListener listener8 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("8", "onClick");
            }
        };
        button8.setOnClickListener(listener8);

        View.OnClickListener listener9 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("9", "onClick");
            }
        };
        button9.setOnClickListener(listener9);

        View.OnClickListener listener0 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("0", "onClick");
            }
        };
        button0.setOnClickListener(listener0);

        View.OnClickListener listenerp = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("plus", "onClick");
            }
        };
        buttonp.setOnClickListener(listenerp);

        View.OnClickListener listenerm = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("minus", "onClick");
            }
        };
        buttonm.setOnClickListener(listenerm);

        View.OnClickListener listenert = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("times", "onClick");
            }
        };
        buttont.setOnClickListener(listenert);

        View.OnClickListener listenerd = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("div", "onClick");
            }
        };
        buttond.setOnClickListener(listenerd);

        View.OnClickListener listenere = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("equal", "onClick");
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
            }
        };
        buttonC.setOnClickListener(listenerC);

        View.OnClickListener listenerAC = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("AC", "onClick");
            }
        };
        buttonAC.setOnClickListener(listenerAC);
    }
}