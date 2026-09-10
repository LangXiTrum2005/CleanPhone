package com.startapp.sdk.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: loaded from: classes6.dex */
public abstract class m6 extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile SQLiteDatabase f41240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f41241b;

    public m6(Context context) {
        super(context, "StartApp-d6864f2502af7851", (SQLiteDatabase.CursorFactory) null, 1);
        this.f41241b = new Object();
    }

    public final SQLiteDatabase a() {
        SQLiteDatabase writableDatabase;
        SQLiteDatabase sQLiteDatabase = this.f41240a;
        if (sQLiteDatabase != null) {
            return sQLiteDatabase;
        }
        synchronized (this.f41241b) {
            try {
                writableDatabase = this.f41240a;
                if (writableDatabase == null) {
                    writableDatabase = getWritableDatabase();
                    this.f41240a = writableDatabase;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return writableDatabase;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
    }
}
