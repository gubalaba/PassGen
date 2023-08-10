package com.haltenny.passgen.view;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import com.haltenny.passgen.R;

public class LoadActivity extends Activity {

    public Button btn;

    @SuppressLint({"UseCompatLoadingForDrawables", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        setTheme(androidx.appcompat.R.style.Base_Theme_AppCompat_Light);

        setContentView(R.layout.activity_main);




        btn = findViewById(R.id.button);
        ImageView imageView = findViewById(R.id.imageView2);
        imageView.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("@drawable/logo", null, getPackageName())));
        btn.setOnClickListener(v -> {
            Intent i = new Intent(this, ChooseActivity.class);
            startActivity(i);
        });


    }
}