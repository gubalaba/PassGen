package com.haltenny.passgen.model.password.impl;

import com.haltenny.passgen.model.password.PasswordService;

public class PasswordServiceImpl implements PasswordService {
    @Override
    public String generate(String allowedSymbols, int length) {
        StringBuilder passwd = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = (int) Math.floor(Math.random() * allowedSymbols.length());
            passwd.append(allowedSymbols.charAt(index));
        }
        return passwd.toString();
    }
}
