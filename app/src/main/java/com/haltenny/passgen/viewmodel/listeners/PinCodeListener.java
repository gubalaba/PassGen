package com.haltenny.passgen.viewmodel.listeners;

import android.view.View;
import android.widget.TextView;
import com.haltenny.passgen.model.PasswordType;
import com.haltenny.passgen.viewmodel.password.impl.PasswordServiceImpl;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import lombok.var;

@Data
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class PinCodeListener implements View.OnClickListener {
    TextView textView;

    @Override
    public void onClick(View view) {
        var passwordService = new PasswordServiceImpl();
        textView.setText(passwordService.generate(PasswordType.PINCODE.getAllowedSymbols(), PasswordType.PINCODE.getLength()));
    }
}