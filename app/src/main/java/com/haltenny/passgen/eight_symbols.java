package com.haltenny.passgen;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class eight_symbols extends Activity {
    private TextView passwdText;
    private Button generate_button;
    private Button copy_button;
    String passwd = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eight_symbols);
        generate_button = (Button)findViewById(R.id.generate_button);
        passwdText = findViewById(R.id.passwd);
        copy_button = (Button)findViewById(R.id.copy_button1);
        String allowedSymbols = "1234567890";

        passwdText.setText(passwd);

        String finalPasswd = passwd;
        passwdText.setOnClickListener(v -> {
            ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("textCopy", finalPasswd);
            clipboard.setPrimaryClip(clip);
        });
        generate_button.setOnClickListener(v -> {
            passwd = "";
            for (int i = 0; i < 4; i++) {
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