package com.haltenny.passgen;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class sixteen_symbols extends Activity {
    private TextView passwdText;
    private Button generate_button;
    private Button copy_button;
    String passwd = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixteen_symbols);
        generate_button = (Button)findViewById(R.id.generate_button1);

        copy_button = (Button)findViewById(R.id.copy_button2);
        passwdText = findViewById(R.id.passwd2);

        String allowedSymbols = "1234567890-=!@#$%^&*()_+qwertyuiop[]QWERTYUIOP{}asdfghjkl;'ASDFGHJKL:\"zxcvbnm,.\\/ZXCVBNM<>?";

        passwdText.setText(passwd);

        String finalPasswd = passwd;
        passwdText.setOnClickListener(v -> {
            ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("textCopy", finalPasswd);
            clipboard.setPrimaryClip(clip);
        });
        generate_button.setOnClickListener(v -> {
            passwd = "";
            for (int i = 0; i < 16; i++) {
                int index = (int) Math.floor(Math.random() * allowedSymbols.length());
                passwd += allowedSymbols.charAt(index);
            }
            passwdText.setText(passwd);
        });
        copy_button.setOnClickListener(v -> {
            ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("textCopy", passwd);
            clipboard.setPrimaryClip(clip);
        });
    }
}