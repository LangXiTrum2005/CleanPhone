package com.bytedance.sdk.openadsdk.nr.ri;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.component.utils.ihz;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class ri extends SQLiteOpenHelper {
    private static volatile ri lr;
    final Context ri;

    private ri(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        this.ri = context;
    }

    private static ri ik() {
        if (lr == null) {
            synchronized (ri.class) {
                try {
                    if (lr == null) {
                        if (ihz.ri(com.bytedance.sdk.openadsdk.nr.ri.ri())) {
                            lr = new ri(com.bytedance.sdk.openadsdk.nr.ri.ri(), "pag_monitor.db");
                        } else {
                            lr = new ri(com.bytedance.sdk.openadsdk.nr.ri.ri(), "pag_monitor_" + ihz.ik(com.bytedance.sdk.openadsdk.nr.ri.ri()) + ".db");
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return lr;
    }

    public static SQLiteDatabase lr() {
        try {
            ri riVarIk = ik();
            if (riVarIk == null) {
                return null;
            }
            SQLiteDatabase readableDatabase = riVarIk.getReadableDatabase();
            if (readableDatabase.isOpen()) {
                return readableDatabase;
            }
            return null;
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    public static SQLiteDatabase ri() {
        try {
            ri riVarIk = ik();
            if (riVarIk == null) {
                return null;
            }
            SQLiteDatabase writableDatabase = riVarIk.getWritableDatabase();
            if (writableDatabase.isOpen()) {
                return writableDatabase;
            }
            return null;
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL(new StringBuilder("CREATE TABLE IF NOT EXISTS monitor_table (_id INTEGER PRIMARY KEY AUTOINCREMENT,sdk_version TEXT ,scene TEXT ,start_count INTEGER default 0 , success_count INTEGER default 0  , fail_count INTEGER default 0  , rit TEXT  , tag TEXT  , label TEXT  , timestamp INTEGER default 0 ,mediation TEXT  , is_init INTEGER , extra TEXT )").toString());
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
                ri(sQLiteDatabase);
                onCreate(sQLiteDatabase);
            }
        } catch (Throwable unused) {
        }
    }

    private ArrayList<String> lr(SQLiteDatabase sQLiteDatabase) {
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
            return arrayList;
        } catch (Exception e) {
            ac.ik("MonitorSQLiteOpenHelper", e.getMessage());
            return arrayList;
        }
    }

    private void ri(SQLiteDatabase sQLiteDatabase) {
        ArrayList<String> arrayListLr = lr(sQLiteDatabase);
        if (arrayListLr == null || arrayListLr.size() <= 0) {
            return;
        }
        Iterator<String> it = arrayListLr.iterator();
        while (it.hasNext()) {
            sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s ;", it.next()));
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
