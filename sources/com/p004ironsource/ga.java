package com.p004ironsource;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Lcom/ironsource/ga;", "", "", "write", "Landroid/database/sqlite/SQLiteOpenHelper;", "sqliteOpenHelper", "Landroid/database/sqlite/SQLiteDatabase;", "a", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class ga {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f25136b = new Object();

    public final SQLiteDatabase a(SQLiteOpenHelper sqliteOpenHelper) {
        Intrinsics.f(sqliteOpenHelper, "sqliteOpenHelper");
        return a(this, false, sqliteOpenHelper, 1, null);
    }

    public static /* synthetic */ SQLiteDatabase a(ga gaVar, boolean z2, SQLiteOpenHelper sQLiteOpenHelper, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        return gaVar.a(z2, sQLiteOpenHelper);
    }

    public final SQLiteDatabase a(boolean write, SQLiteOpenHelper sqliteOpenHelper) {
        SQLiteDatabase writableDatabase;
        Intrinsics.f(sqliteOpenHelper, "sqliteOpenHelper");
        synchronized (f25136b) {
            try {
                writableDatabase = write ? sqliteOpenHelper.getWritableDatabase() : sqliteOpenHelper.getReadableDatabase();
            } catch (Throwable th) {
                throw th;
            }
        }
        return writableDatabase;
    }
}
