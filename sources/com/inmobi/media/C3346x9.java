package com.inmobi.media;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Iterator;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.x9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3346x9 extends SQLiteOpenHelper {
    public final C3018k5 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3346x9(C3018k5 databaseConfig) {
        super(databaseConfig.a, "com.im_11.1.0.db", (SQLiteDatabase.CursorFactory) null, 1);
        Intrinsics.checkNotNullParameter(databaseConfig, "databaseConfig");
        this.a = databaseConfig;
    }

    public static void a(SQLiteDatabase sQLiteDatabase, Nj nj) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS " + nj.a + " " + nj.b);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final String getDatabaseName() {
        this.a.getClass();
        return "com.im_11.1.0.db";
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        super.onConfigure(sQLiteDatabase);
        if (this.a.c != 2 || sQLiteDatabase == null) {
            return;
        }
        sQLiteDatabase.disableWriteAheadLogging();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            Iterator it = this.a.b.iterator();
            while (it.hasNext()) {
                a(sQLiteDatabase, (Nj) it.next());
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
