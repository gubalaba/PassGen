package com.haltenny.passgen.viewmodel.listeners;

import android.view.View;
import android.widget.TextView;
import com.haltenny.passgen.model.PasswordType;
import com.haltenny.passgen.viewmodel.password.impl.PasswordServiceImpl;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class MediumListener implements View.OnClickListener {
    TextView textView;

    @Override
    public void onClick(View view) {
        var passwordService = new PasswordServiceImpl();

        textView.setText(passwordService.generate(PasswordType.MEDIUM.getAllowedSymbols(),
                PasswordType.MEDIUM.getLength()));
    }
}