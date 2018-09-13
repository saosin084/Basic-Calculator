package com.funkyhacker.basiccalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button1);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("1", "onClick");
            }
        };
        button.setOnClickListener(listener);

        Button button2 = findViewById(R.id.button2);
        View.OnClickListener listener2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("2", "onClick");
            }
        };
        button2.setOnClickListener(listener2);

        Button button3 = findViewById(R.id.button3);
        View.OnClickListener listener3 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("3", "onClick");
            }
        };
        button3.setOnClickListener(listener3);

        Button button4 = findViewById(R.id.button4);
        View.OnClickListener listener4 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("4", "onClick");
            }
        };
        button4.setOnClickListener(listener4);

        Button button5 = findViewById(R.id.button5);
        View.OnClickListener listener5 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("5", "onClick");
            }
        };
        button5.setOnClickListener(listener5);

        Button button6 = findViewById(R.id.button6);
        View.OnClickListener listener6 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("6", "onClick");
            }
        };
        button6.setOnClickListener(listener6);

        Button button7 = findViewById(R.id.button7);
        View.OnClickListener listener7 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("7", "onClick");
            }
        };
        button7.setOnClickListener(listener7);

        Button button8 = findViewById(R.id.button8);
        View.OnClickListener listener8 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("8", "onClick");
            }
        };
        button8.setOnClickListener(listener8);

        Button button9 = findViewById(R.id.button9);
        View.OnClickListener listener9 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("9", "onClick");
            }
        };
        button9.setOnClickListener(listener9);

        Button button0 = findViewById(R.id.button0);
        View.OnClickListener listener0 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("0", "onClick");
            }
        };
        button0.setOnClickListener(listener0);

        Button buttonp = findViewById(R.id.buttonp);
        View.OnClickListener listenerp = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("plus", "onClick");
            }
        };
        buttonp.setOnClickListener(listenerp);

        Button buttonm = findViewById(R.id.buttonm);
        View.OnClickListener listenerm = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("minus", "onClick");
            }
        };
        buttonm.setOnClickListener(listenerm);

        Button buttont = findViewById(R.id.buttont);
        View.OnClickListener listenert = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("times", "onClick");
            }
        };
        buttont.setOnClickListener(listenert);

        Button buttond = findViewById(R.id.buttond);
        View.OnClickListener listenerd = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("div", "onClick");
            }
        };
        buttond.setOnClickListener(listenerd);

        Button buttone = findViewById(R.id.buttone);
        View.OnClickListener listenere = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("equal", "onClick");
            }
        };
        buttone.setOnClickListener(listenere);

        Button buttondot = findViewById(R.id.buttondot);
        View.OnClickListener listenerdot = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("dot", "onClick");
            }
        };
        buttondot.setOnClickListener(listenerdot);

        Button buttonC = findViewById(R.id.buttonC);
        View.OnClickListener listenerC = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("C", "onClick");
            }
        };
        buttonC.setOnClickListener(listenerC);

        Button buttonAC = findViewById(R.id.buttonAC);
        View.OnClickListener listenerAC = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("AC", "onClick");
            }
        };
        buttonAC.setOnClickListener(listenerAC);

        Log.d("TEST", "onCreate");
    }
}
