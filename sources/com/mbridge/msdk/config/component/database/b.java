package com.mbridge.msdk.config.component.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
class b extends SQLiteOpenHelper {
    public b(Context context) {
        super(context, "component_data.db", (SQLiteDatabase.CursorFactory) null, 2);
    }

    private void a(SQLiteDatabase sQLiteDatabase) {
        ArrayList<String> arrayListA = c.a("CREATE_");
        if (arrayListA == null || arrayListA.isEmpty()) {
            return;
        }
        Iterator<String> it = arrayListA.iterator();
        while (it.hasNext()) {
            sQLiteDatabase.execSQL(it.next());
        }
    }

    private void b(SQLiteDatabase sQLiteDatabase) {
        ArrayList<String> arrayListA = c.a("DROP_");
        if (arrayListA == null || arrayListA.isEmpty()) {
            return;
        }
        Iterator<String> it = arrayListA.iterator();
        while (it.hasNext()) {
            sQLiteDatabase.execSQL(it.next());
        }
    }

    private boolean c(SQLiteDatabase sQLiteDatabase) {
        return (sQLiteDatabase == null || !sQLiteDatabase.isOpen() || sQLiteDatabase.isReadOnly()) ? false : true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (c(sQLiteDatabase)) {
            a(sQLiteDatabase);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        super.onDowngrade(sQLiteDatabase, i10, i11);
        if (c(sQLiteDatabase)) {
            b(sQLiteDatabase);
            a(sQLiteDatabase);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        if (c(sQLiteDatabase)) {
            b(sQLiteDatabase);
            a(sQLiteDatabase);
        }
    }
}
