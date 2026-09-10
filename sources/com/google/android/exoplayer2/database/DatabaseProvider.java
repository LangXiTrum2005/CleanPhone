package com.google.android.exoplayer2.database;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes3.dex */
public interface DatabaseProvider {
    SQLiteDatabase getReadableDatabase();

    SQLiteDatabase getWritableDatabase();
}
