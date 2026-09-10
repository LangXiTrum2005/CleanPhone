package com.smartdigimkt.u6;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: loaded from: classes6.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f38835a;

    public class a extends SQLiteOpenHelper {
        public a(Context context, String str, int i2) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, i2);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            c.this.a(sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
            c.this.a(sQLiteDatabase, i2, i3);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
            c.this.b(sQLiteDatabase, i2, i3);
        }
    }

    public c(Context context) {
        this.f38835a = new a(context, a(), b());
    }

    public abstract String a();

    public abstract void a(SQLiteDatabase sQLiteDatabase);

    public abstract void a(SQLiteDatabase sQLiteDatabase, int i2, int i3);

    public abstract int b();

    public abstract void b(SQLiteDatabase sQLiteDatabase, int i2, int i3);

    public synchronized SQLiteDatabase c() {
        return this.f38835a.getReadableDatabase();
    }

    public synchronized SQLiteDatabase d() {
        SQLiteDatabase writableDatabase;
        try {
            writableDatabase = this.f38835a.getWritableDatabase();
        } catch (Exception unused) {
            writableDatabase = null;
        }
        return writableDatabase;
    }
}
