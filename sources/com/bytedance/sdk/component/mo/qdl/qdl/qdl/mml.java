package com.bytedance.sdk.component.mo.qdl.qdl.qdl;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.sdk.component.mo.qdl.jpc;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class mml extends SQLiteOpenHelper {
    final Context qdl;

    public mml(Context context) {
        super(context, "ttadlog.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.qdl = context;
    }

    private ArrayList<String> lnr(SQLiteDatabase sQLiteDatabase) {
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

    private void qdl(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.mo.qdl.qdl.qdl.qdl.qdl.ud(jpc.wd().mml().ud()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.mo.qdl.qdl.qdl.qdl.mml.lnr(jpc.wd().mml().qdl()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.mo.qdl.qdl.qdl.qdl.wd.lnr(jpc.wd().mml().mml()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.mo.qdl.qdl.qdl.qdl.mo.qdl(jpc.wd().mml().mzz()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.mo.qdl.mo.mo.ud());
    }

    private void ud(SQLiteDatabase sQLiteDatabase) {
        ArrayList<String> arrayListLnr = lnr(sQLiteDatabase);
        if (arrayListLnr == null || arrayListLnr.size() <= 0) {
            return;
        }
        Iterator<String> it = arrayListLnr.iterator();
        while (it.hasNext()) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + it.next() + " ;");
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            qdl(sQLiteDatabase);
        } catch (Throwable unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        try {
            if (i2 <= i3) {
                qdl(sQLiteDatabase);
            } else {
                ud(sQLiteDatabase);
                qdl(sQLiteDatabase);
            }
        } catch (Throwable unused) {
        }
    }
}
