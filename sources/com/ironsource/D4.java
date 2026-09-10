package com.ironsource;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class D4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f25926a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f25927b = new Object();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        private a() {
        }
    }

    public final SQLiteDatabase a(SQLiteOpenHelper sqliteOpenHelper) {
        kotlin.jvm.internal.n.f(sqliteOpenHelper, "sqliteOpenHelper");
        return a(this, false, sqliteOpenHelper, 1, null);
    }

    public static /* synthetic */ SQLiteDatabase a(D4 d10, boolean z10, SQLiteOpenHelper sQLiteOpenHelper, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return d10.a(z10, sQLiteOpenHelper);
    }

    public final SQLiteDatabase a(boolean z10, SQLiteOpenHelper sqliteOpenHelper) {
        SQLiteDatabase readableDatabase;
        kotlin.jvm.internal.n.f(sqliteOpenHelper, "sqliteOpenHelper");
        synchronized (f25927b) {
            try {
                if (z10) {
                    readableDatabase = sqliteOpenHelper.getWritableDatabase();
                } else {
                    readableDatabase = sqliteOpenHelper.getReadableDatabase();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return readableDatabase;
    }
}
