package com.haltenny.passgen.view.password_types;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import com.haltenny.passgen.R;
import com.haltenny.passgen.viewmodel.listeners.HardListener;
import com.haltenny.passgen.viewmodel.listeners.MediumListener;
import com.haltenny.passgen.viewmodel.listeners.clipboard.CopyListener;
import lombok.var;

public class Hard extends Activity {
    TextView passwdText;
    Button generateButton;
    Button copyButton;

    String passwd = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_max_symbols);

        generateButton = findViewById(R.id.generate_button);
        passwdText = findViewById(R.id.passwd);
        copyButton = findViewById(R.id.copy_button1);

        passwdText.setText(passwd);

        String finalPasswd = passwd;
        var copyListener = new CopyListener(this, finalPasswd);
        passwdText.setOnClickListener(copyListener);

        var hardListener = new HardListener(passwdText);
        generateButton.setOnClickListener(hardListener);
        System.out.println(passwd + finalPasswd);

        copyListener = new CopyListener(this, passwd);
        copyButton.setOnClickListener(copyListener);

    }
}