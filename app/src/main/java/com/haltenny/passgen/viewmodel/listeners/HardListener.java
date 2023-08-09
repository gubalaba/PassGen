package com.haltenny.passgen.viewmodel.listeners;

import android.view.View;
import android.widget.TextView;
import com.haltenny.passgen.model.PasswordType;
import com.haltenny.passgen.model.password.impl.PasswordServiceImpl;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class HardListener implements View.OnClickListener {
    TextView textView;

    @Override
    public void onClick(View view) {
        var passwordService = new PasswordServiceImpl();

        textView.setText(passwordService.generate(PasswordType.HARD.getAllowedSymbols(),
                PasswordType.HARD.getLength()));
    }
}