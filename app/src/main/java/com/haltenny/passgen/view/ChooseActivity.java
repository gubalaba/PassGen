package com.haltenny.passgen.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import com.haltenny.passgen.R;
import com.haltenny.passgen.view.password_types.PinCode;
import com.haltenny.passgen.view.password_types.Hard;
import com.haltenny.passgen.view.password_types.Medium;

public class ChooseActivity extends Activity {

    private Button btn;
    private Button btn2;
    private Button btn3;
    private Button btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passwd_choose);

        btn = findViewById(R.id.button2);

        btn.setOnClickListener(v -> {
            Intent i = new Intent(this, PinCode.class);
            startActivity(i);
        });
        btn2 = findViewById(R.id.button3);

        btn2.setOnClickListener(v -> {
            Intent i = new Intent(this, Medium.class);
            startActivity(i);
        });
        btn3 = findViewById(R.id.button4);

        btn3.setOnClickListener(v -> {
            Intent i = new Intent(this, Hard.class);
            startActivity(i);
        });
    }
}