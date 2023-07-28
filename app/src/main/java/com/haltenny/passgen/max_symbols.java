package com.haltenny.passgen;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class max_symbols extends Activity {
    private TextView passwdText;
    private Button generate_button;
    private Button copy_button;
    String passwd = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_max_symbols);
        generate_button = (Button)findViewById(R.id.button9);
        copy_button = (Button)findViewById(R.id.copy_button);

        passwdText = findViewById(R.id.passwd1);

        String allowedSymbols = "1234567890-=!@#$%^&*()_+qwertyuiop[]QWERTYUIOP{}asdfghjkl;'ASDFGHJKL:\"zxcvbnm,.\\/ZXCVBNM<>?";



        passwdText.setText(passwd);

        String finalPasswd = passwd;
        passwdText.setOnClickListener(v -> {
            ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("textCopy", finalPasswd);
            clipboard.setPrimaryClip(clip);

        });

        copy_button.setOnClickListener(v -> {
            ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("textCopy", passwd);
            clipboard.setPrimaryClip(clip);
        });

        generate_button.setOnClickListener(v -> {
                passwd = "";
            for (int i = 0; i < 32; i++) {
                    int index = (int) Math.floor(Math.random() * allowedSymbols.length());
                    passwd += allowedSymbols.charAt(index);
                }
                passwdText.setText(passwd);
            });

        }
    }
