package com.haltenny.passgen.viewmodel.listeners.clipboard;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.View;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CopyListener implements View.OnClickListener{
    Activity activity;
    String copyText;
    @Override
    public void onClick(View view) {
        ClipboardManager clipboard = (ClipboardManager) activity.getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("textCopy", copyText);
        clipboard.setPrimaryClip(clip);
    }
}
