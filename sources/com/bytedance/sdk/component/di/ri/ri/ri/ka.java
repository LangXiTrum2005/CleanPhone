package com.bytedance.sdk.component.di.ri.ri.ri;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.sdk.component.di.ri.ri.ri.ri.di;
import com.bytedance.sdk.component.di.ri.xha;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class ka extends SQLiteOpenHelper {
    final Context ri;

    public ka(Context context) {
        super(context, "ttadlog.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.ri = context;
    }

    private ArrayList<String> ik(SQLiteDatabase sQLiteDatabase) {
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

    private void lr(SQLiteDatabase sQLiteDatabase) {
        ArrayList<String> arrayListIk = ik(sQLiteDatabase);
        if (arrayListIk == null || arrayListIk.size() <= 0) {
            return;
        }
        Iterator<String> it = arrayListIk.iterator();
        while (it.hasNext()) {
            sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s ;", it.next()));
        }
    }

    private void ri(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.di.ri.ri.ri.ri.ri.lr(xha.di().ik().lr()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.di.ri.ri.ri.ri.ka.ik(xha.di().ik().ri()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.di.ri.ri.ri.ri.xha.ik(xha.di().ik().ka()));
        sQLiteDatabase.execSQL(di.ri(xha.di().ik().fi()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.di.ri.di.di.lr());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            ri(sQLiteDatabase);
        } catch (Throwable unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        try {
            if (i <= i2) {
                ri(sQLiteDatabase);
            } else {
                lr(sQLiteDatabase);
                ri(sQLiteDatabase);
            }
        } catch (Throwable unused) {
        }
    }
}
