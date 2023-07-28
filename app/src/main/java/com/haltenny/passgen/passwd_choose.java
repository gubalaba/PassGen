package com.haltenny.passgen;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class passwd_choose extends Activity {

    private Button btn;
    private Button btn2;
    private Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passwd_choose);

        btn = (Button)findViewById(R.id.button2);

        btn.setOnClickListener(v -> {
            Intent i = new Intent(this,eight_symbols.class);
            startActivity(i);
        });
        btn2 = (Button)findViewById(R.id.button3);

        btn2.setOnClickListener(v -> {
            Intent i = new Intent(this,sixteen_symbols.class);
            startActivity(i);
        });
        btn3 = (Button)findViewById(R.id.button4);

        btn3.setOnClickListener(v -> {
            Intent i = new Intent(this,max_symbols.class);
            startActivity(i);
        });
    }
}