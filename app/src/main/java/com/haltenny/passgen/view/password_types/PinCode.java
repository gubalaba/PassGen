package com.haltenny.passgen.view.password_types;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import com.haltenny.passgen.R;
import com.haltenny.passgen.viewmodel.listeners.PinCodeListener;
import com.haltenny.passgen.viewmodel.listeners.clipboard.CopyListener;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import lombok.var;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class PinCode extends Activity {

    TextView passwdText;
    Button generateButton;
    Button copyButton;


    String passwd = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eight_symbols);

        generateButton = findViewById(R.id.generate_button);
        passwdText = findViewById(R.id.passwd);
        copyButton = findViewById(R.id.copy_button1);

        passwdText.setText(passwd);

        String finalPasswd = passwd;
        var copyListener = new CopyListener(this, finalPasswd);
        passwdText.setOnClickListener(copyListener);

        var pinCodeListener = new PinCodeListener(passwdText);
        generateButton.setOnClickListener(pinCodeListener);
        System.out.println(passwd + finalPasswd);

        copyListener = new CopyListener(this, passwd);
        copyButton.setOnClickListener(copyListener);
    }
}