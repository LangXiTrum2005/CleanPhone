package com.bytedance.sdk.openadsdk.core;

import android.content.ContentValues;
import android.content.Context;
import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public class mo {
    private static final Object lnr = new Object();
    private lnr qdl;
    private Context ud;

    public class ud extends AbstractCursor {
        private ud() {
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public String[] getColumnNames() {
            return new String[0];
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public int getCount() {
            return 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public double getDouble(int i2) {
            return 0.0d;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public float getFloat(int i2) {
            return 0.0f;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public int getInt(int i2) {
            return 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public long getLong(int i2) {
            return 0L;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public short getShort(int i2) {
            return (short) 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public String getString(int i2) {
            return null;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public boolean isNull(int i2) {
            return true;
        }
    }

    public mo(Context context) {
        try {
            this.ud = context == null ? yt.qdl() : context.getApplicationContext();
            if (this.qdl == null) {
                this.qdl = new lnr();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Context lnr() {
        Context context = this.ud;
        return context == null ? yt.qdl() : context;
    }

    public class lnr {
        private SQLiteDatabase ud = null;

        public lnr() {
        }

        private synchronized boolean mo() {
            SQLiteDatabase sQLiteDatabase = this.ud;
            return sQLiteDatabase != null && sQLiteDatabase.inTransaction();
        }

        private synchronized void mzz() {
            try {
                synchronized (mo.lnr) {
                    try {
                        SQLiteDatabase sQLiteDatabase = this.ud;
                        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
                            mo moVar = mo.this;
                            SQLiteDatabase writableDatabase = moVar.new qdl(moVar.lnr()).getWritableDatabase();
                            this.ud = writableDatabase;
                            writableDatabase.setLockingEnabled(false);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.aaj.lnr("DBHelper", th2.getMessage());
                if (mo()) {
                    throw th2;
                }
            }
        }

        public synchronized void lnr() {
            mzz();
            SQLiteDatabase sQLiteDatabase = this.ud;
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.setTransactionSuccessful();
        }

        public synchronized void mml() {
            mzz();
            SQLiteDatabase sQLiteDatabase = this.ud;
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.endTransaction();
        }

        public SQLiteDatabase qdl() {
            mzz();
            return this.ud;
        }

        public synchronized void ud() {
            mzz();
            SQLiteDatabase sQLiteDatabase = this.ud;
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.beginTransaction();
        }

        public synchronized void qdl(String str) throws SQLException {
            try {
                mzz();
                this.ud.execSQL(str);
            } catch (Throwable th) {
                if (mo()) {
                    throw th;
                }
            }
        }

        public synchronized Cursor qdl(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
            Cursor cursorQuery;
            try {
                mzz();
                cursorQuery = this.ud.query(str, strArr, str2, strArr2, str3, str4, str5);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.aaj.lnr("DBHelper", th.getMessage());
                ud udVar = new ud();
                if (mo()) {
                    throw th;
                }
                cursorQuery = udVar;
            }
            return cursorQuery;
        }

        public synchronized int qdl(String str, ContentValues contentValues, String str2, String[] strArr) {
            int iUpdate;
            try {
                mzz();
                iUpdate = this.ud.update(str, contentValues, str2, strArr);
            } catch (Exception e2) {
                com.bytedance.sdk.component.utils.aaj.lnr("DBHelper", e2.getMessage());
                if (mo()) {
                    throw e2;
                }
                iUpdate = 0;
            }
            return iUpdate;
        }

        public synchronized long qdl(String str, String str2, ContentValues contentValues) {
            long jReplace;
            try {
                mzz();
                jReplace = this.ud.replace(str, str2, contentValues);
            } catch (Exception e2) {
                com.bytedance.sdk.component.utils.aaj.lnr("DBHelper", e2.getMessage());
                if (mo()) {
                    throw e2;
                }
                jReplace = -1;
            }
            return jReplace;
        }

        public synchronized int qdl(String str, String str2, String[] strArr) {
            int iDelete;
            try {
                mzz();
                iDelete = this.ud.delete(str, str2, strArr);
            } catch (Exception e2) {
                com.bytedance.sdk.component.utils.aaj.lnr("DBHelper", e2.getMessage());
                if (mo()) {
                    throw e2;
                }
                iDelete = 0;
            }
            return iDelete;
        }
    }

    public lnr qdl() {
        return this.qdl;
    }

    public class qdl extends SQLiteOpenHelper {
        final Context qdl;

        public qdl(Context context) {
            super(context, "ttopensdk.db", (SQLiteDatabase.CursorFactory) null, 11);
            this.qdl = context;
        }

        private void lnr(SQLiteDatabase sQLiteDatabase) {
            ArrayList<String> arrayListMml = mml(sQLiteDatabase);
            if (arrayListMml == null || arrayListMml.size() <= 0) {
                return;
            }
            Iterator<String> it = arrayListMml.iterator();
            while (it.hasNext()) {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + it.next() + " ;");
            }
        }

        private ArrayList<String> mml(SQLiteDatabase sQLiteDatabase) {
            ArrayList<String> arrayList = new ArrayList<>();
            Cursor cursorRawQuery = null;
            try {
                cursorRawQuery = sQLiteDatabase.rawQuery("select name from sqlite_master where type='table' order by name", null);
                if (cursorRawQuery != null) {
                    while (cursorRawQuery.moveToNext()) {
                        String string = cursorRawQuery.getString(0);
                        if (!string.equals("android_metadata") && !string.equals("sqlite_sequence")) {
                            arrayList.add(string);
                        }
                    }
                }
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                    return arrayList;
                }
            } catch (Exception unused) {
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
            } catch (Throwable th) {
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                throw th;
            }
            return arrayList;
        }

        private void qdl(SQLiteDatabase sQLiteDatabase, Context context) {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.mml.mml.qdl());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.mml.to.lnr());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.mml.bjy.qdl());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.mml.rdp.qdl());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.bch.ud.qdl());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.mml.yt.lnr());
            sQLiteDatabase.execSQL(com.bytedance.sdk.component.adexpress.qdl.ud.ud.lnr());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.core.rq.qdl.lnr.lnr());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.mml.jtx.qdl());
        }

        private void ud(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.core.rq.qdl.lnr.mml());
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            try {
                qdl(sQLiteDatabase, this.qdl);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.aaj.lnr("DBHelper", th.getMessage());
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
            if (i2 > i3) {
                try {
                    lnr(sQLiteDatabase);
                    qdl(sQLiteDatabase, mo.this.ud);
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.aaj.lnr(th.getMessage(), new Object[0]);
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x002c A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        /* JADX WARN: Code duplicated, block: B:11:0x0037 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        /* JADX WARN: Code duplicated, block: B:12:0x0040 A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        /* JADX WARN: Code duplicated, block: B:6:0x0011 A[DONT_GENERATE] */
        /* JADX WARN: Code duplicated, block: B:7:0x0012 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        /* JADX WARN: Code duplicated, block: B:8:0x0016 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        /* JADX WARN: Code duplicated, block: B:9:0x0021 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
            if (i2 <= i3) {
                qdl(sQLiteDatabase, mo.this.ud);
                switch (i2) {
                    case 1:
                        qdl(sQLiteDatabase);
                        break;
                    case 2:
                        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'ad_video_info';");
                        qdl(sQLiteDatabase);
                        break;
                    case 3:
                        sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.mml.bjy.qdl());
                        qdl(sQLiteDatabase);
                        break;
                    case 4:
                        sQLiteDatabase.execSQL(com.bytedance.sdk.component.adexpress.qdl.ud.ud.lnr());
                        qdl(sQLiteDatabase);
                        break;
                    case 5:
                        sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.mml.rdp.qdl());
                        qdl(sQLiteDatabase);
                        break;
                    case 6:
                        qdl(sQLiteDatabase);
                        break;
                }
            } else {
                try {
                    lnr(sQLiteDatabase);
                    qdl(sQLiteDatabase, mo.this.ud);
                    switch (i2) {
                        case 1:
                            qdl(sQLiteDatabase);
                            break;
                        case 2:
                            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'ad_video_info';");
                            qdl(sQLiteDatabase);
                            break;
                        case 3:
                            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.mml.bjy.qdl());
                            qdl(sQLiteDatabase);
                            break;
                        case 4:
                            sQLiteDatabase.execSQL(com.bytedance.sdk.component.adexpress.qdl.ud.ud.lnr());
                            qdl(sQLiteDatabase);
                            break;
                        case 5:
                            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.mml.rdp.qdl());
                            qdl(sQLiteDatabase);
                            break;
                        case 6:
                            qdl(sQLiteDatabase);
                            break;
                    }
                } catch (Throwable unused) {
                }
            }
            if (i2 < 11) {
                try {
                    ud(sQLiteDatabase);
                    com.bytedance.sdk.openadsdk.bch.ud.qdl(sQLiteDatabase);
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.aaj.lnr("DBHelper", th.getMessage());
                }
            }
        }

        private void qdl(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.mml.mml.ud());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.mml.to.mml());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.mml.bjy.ud());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.mml.rdp.ud());
        }
    }
}
