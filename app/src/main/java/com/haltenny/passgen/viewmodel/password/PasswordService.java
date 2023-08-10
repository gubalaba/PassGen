package com.haltenny.passgen.model.password;

import lombok.NonNull;
import lombok.experimental.NonFinal;

public interface PasswordService {
    String generate(@NonNull String allowedSymbols, @NonNull int length);
}
