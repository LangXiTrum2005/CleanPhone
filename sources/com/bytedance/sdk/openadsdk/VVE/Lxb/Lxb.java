package com.bytedance.sdk.openadsdk.VVE.Lxb;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.sdk.component.utils.sLN;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb extends SQLiteOpenHelper {
    private static volatile Lxb LD;
    final Context Lxb;

    private Lxb(Context context) {
        super(context, "pag_monitor.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.Lxb = context;
    }

    public static SQLiteDatabase LD() {
        try {
            Lxb lxbLk = lk();
            if (lxbLk == null) {
                return null;
            }
            SQLiteDatabase readableDatabase = lxbLk.getReadableDatabase();
            if (readableDatabase.isOpen()) {
                return readableDatabase;
            }
            return null;
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    public static SQLiteDatabase Lxb() {
        try {
            Lxb lxbLk = lk();
            if (lxbLk == null) {
                return null;
            }
            SQLiteDatabase writableDatabase = lxbLk.getWritableDatabase();
            if (writableDatabase.isOpen()) {
                return writableDatabase;
            }
            return null;
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    private static Lxb lk() {
        if (LD == null) {
            synchronized (Lxb.class) {
                try {
                    if (LD == null) {
                        LD = new Lxb(com.bytedance.sdk.openadsdk.VVE.Lxb.Lxb());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return LD;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS monitor_table (_id INTEGER PRIMARY KEY AUTOINCREMENT,sdk_version TEXT ,scene TEXT ,start_count INTEGER default 0 , success_count INTEGER default 0  , fail_count INTEGER default 0  , rit TEXT  , tag TEXT  , label TEXT  , timestamp INTEGER default 0 ,mediation TEXT  , is_init INTEGER , extra TEXT )");
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        try {
            if (i <= i2) {
                onCreate(sQLiteDatabase);
            } else {
                Lxb(sQLiteDatabase);
                onCreate(sQLiteDatabase);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private ArrayList<String> LD(SQLiteDatabase sQLiteDatabase) {
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
        } catch (Exception e) {
            sLN.Lxb("MonitorSQLiteOpenHelper", e.getMessage());
        }
        return arrayList;
    }

    private void Lxb(SQLiteDatabase sQLiteDatabase) {
        ArrayList<String> arrayListLD = LD(sQLiteDatabase);
        if (arrayListLD == null || arrayListLD.size() <= 0) {
            return;
        }
        Iterator<String> it = arrayListLD.iterator();
        while (it.hasNext()) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + it.next() + " ;");
        }
    }
}
