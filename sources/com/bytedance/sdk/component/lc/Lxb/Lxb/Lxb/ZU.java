package com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.sdk.component.lc.Lxb.OY;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class ZU extends SQLiteOpenHelper {
    final Context Lxb;

    public ZU(Context context) {
        super(context, "ttadlog.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.Lxb = context;
    }

    private void LD(SQLiteDatabase sQLiteDatabase) {
        ArrayList<String> arrayListLk = lk(sQLiteDatabase);
        if (arrayListLk == null || arrayListLk.size() <= 0) {
            return;
        }
        Iterator<String> it = arrayListLk.iterator();
        while (it.hasNext()) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + it.next() + " ;");
        }
    }

    private void Lxb(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb.Lxb.Lxb.LD(OY.ebl().ZU().LD()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb.Lxb.ZU.lk(OY.ebl().ZU().Lxb()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb.Lxb.ebl.lk(OY.ebl().ZU().ZU()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb.Lxb.lc.Lxb(OY.ebl().ZU().JXs()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.lc.Lxb.lc.lc.LD());
    }

    private ArrayList<String> lk(SQLiteDatabase sQLiteDatabase) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery("select name from sqlite_master where type='table' order by name", null);
            if (cursorRawQuery != null) {
                while (cursorRawQuery.moveToNext()) {
                    String string = cursorRawQuery.getString(0);
                    if (!string.equals("android_metadata") && !string.equals("sqlite_sequence")) {
                        arrayList.add(string);
                    }
                }
                cursorRawQuery.close();
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            Lxb(sQLiteDatabase);
        } catch (Throwable unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        try {
            if (i <= i2) {
                Lxb(sQLiteDatabase);
            } else {
                LD(sQLiteDatabase);
                Lxb(sQLiteDatabase);
            }
        } catch (Throwable unused) {
        }
    }
}
