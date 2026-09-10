package com.mbridge.msdk.tracker;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
class b extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f36844a;

    public b(Context context, String str, String str2) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 2);
        this.f36844a = str2;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (y.b(sQLiteDatabase)) {
            return;
        }
        try {
            sQLiteDatabase.execSQL(String.format(i.f36863i, this.f36844a));
        } catch (Exception e10) {
            if (a.f36843a) {
                Log.e("TrackManager", "create table error", e10);
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        if (y.b(sQLiteDatabase)) {
            return;
        }
        try {
            sQLiteDatabase.execSQL(String.format(i.f36864j, this.f36844a));
            sQLiteDatabase.execSQL(String.format(i.f36863i, this.f36844a));
        } catch (Exception e10) {
            if (a.f36843a) {
                Log.e("TrackManager", "downgrade table error", e10);
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        if (y.b(sQLiteDatabase)) {
            return;
        }
        try {
            sQLiteDatabase.execSQL(String.format(i.f36864j, this.f36844a));
            sQLiteDatabase.execSQL(String.format(i.f36863i, this.f36844a));
        } catch (Exception e10) {
            if (a.f36843a) {
                Log.e("TrackManager", "upgrade table error", e10);
            }
        }
    }
}
