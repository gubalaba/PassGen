package com.haltenny.passgen.viewmodel.database;

import android.database.Cursor;

public interface DatabaseService {
    void add(String title, String description);
    Cursor read();
    void deleteAll();
    void delete(String id);
    void update(String title, String description, String id);
}
