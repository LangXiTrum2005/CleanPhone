package com.thinkup.core.common.oo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: loaded from: classes6.dex */
public abstract class o0 {
    private o o;

    public class o extends SQLiteOpenHelper {
        public o(Context context, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 20);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            o0.this.o(sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
            o0.this.m(sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
            o0.this.o(sQLiteDatabase, i2, i3);
        }
    }

    public o0(Context context) {
        this.o = new o(context, n());
    }

    public final synchronized SQLiteDatabase m() {
        SQLiteDatabase writableDatabase;
        try {
            writableDatabase = this.o.getWritableDatabase();
        } catch (Exception unused) {
            writableDatabase = null;
        }
        return writableDatabase;
    }

    public abstract void m(SQLiteDatabase sQLiteDatabase);

    public abstract String n();

    public final synchronized SQLiteDatabase o() {
        return this.o.getReadableDatabase();
    }

    public abstract void o(SQLiteDatabase sQLiteDatabase);

    public abstract void o(SQLiteDatabase sQLiteDatabase, int i2, int i3);

    public abstract int o0();
}
