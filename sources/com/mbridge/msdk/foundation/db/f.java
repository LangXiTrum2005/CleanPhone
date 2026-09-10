package com.mbridge.msdk.foundation.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f33485a;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends SQLiteOpenHelper {
        public a(Context context, String str, int i10) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, i10);
            if (MBridgeConstans.DEBUG) {
                q0.a("DatabaseOpenHelper", "数据库： name :" + str + "  " + i10);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            if (MBridgeConstans.DEBUG) {
                q0.a("DatabaseOpenHelper", "数据库创建了");
            }
            f.this.a(sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            f.this.a(sQLiteDatabase, i10, i11);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            if (MBridgeConstans.DEBUG) {
                q0.a("DatabaseOpenHelper", "数据库升级了");
            }
            f.this.b(sQLiteDatabase, i10, i11);
        }
    }

    public f(Context context) {
        this.f33485a = new a(context, a(), b());
    }

    public abstract String a();

    public abstract void a(SQLiteDatabase sQLiteDatabase);

    public abstract void a(SQLiteDatabase sQLiteDatabase, int i10, int i11);

    public abstract int b();

    public abstract void b(SQLiteDatabase sQLiteDatabase, int i10, int i11);

    public SQLiteDatabase c() {
        return this.f33485a.getReadableDatabase();
    }

    public synchronized SQLiteDatabase d() {
        SQLiteDatabase writableDatabase;
        try {
            writableDatabase = this.f33485a.getWritableDatabase();
        } catch (Exception unused) {
            writableDatabase = null;
        }
        return writableDatabase;
    }
}
