package com.haltenny.passgen.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public enum PasswordType {
    PINCODE("1234567890", 4),
    MEDIUM("1234567890qwertyuiopasdfghjklzxcvbnm", 16),
    HARD("1234567890QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm!@#$%^&*()", 32);

    String allowedSymbols;
    int length;
}
