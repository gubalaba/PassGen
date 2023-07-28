package com.haltenny.passgen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {

    public Button btn;
    private Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        setTheme(androidx.appcompat.R.style.Base_Theme_AppCompat_Light);

        setContentView(R.layout.activity_main);




        btn = (Button)findViewById(R.id.button);
        ImageView imageView = findViewById(R.id.imageView2);
        imageView.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("@drawable/logo", null, getPackageName())));
        btn.setOnClickListener(v -> {
            Intent i = new Intent(this, passwd_choose.class);
            startActivity(i);
        });

    }
}