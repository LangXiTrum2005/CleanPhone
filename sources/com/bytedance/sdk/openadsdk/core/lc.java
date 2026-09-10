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
/* JADX INFO: loaded from: classes2.dex */
public class lc {
    private static final Object lk = new Object();
    private Context LD;
    private lk Lxb;

    public class LD extends AbstractCursor {
        private LD() {
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
        public double getDouble(int i) {
            return 0.0d;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public float getFloat(int i) {
            return 0.0f;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public int getInt(int i) {
            return 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public long getLong(int i) {
            return 0L;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public short getShort(int i) {
            return (short) 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public String getString(int i) {
            return null;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public boolean isNull(int i) {
            return true;
        }
    }

    public lc(Context context) {
        try {
            this.LD = context == null ? kqm.Lxb() : context.getApplicationContext();
            if (this.Lxb == null) {
                this.Lxb = new lk();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Context lk() {
        Context context = this.LD;
        return context == null ? kqm.Lxb() : context;
    }

    public class lk {
        private SQLiteDatabase LD = null;

        public lk() {
        }

        private synchronized void JXs() {
            try {
                synchronized (lc.lk) {
                    try {
                        SQLiteDatabase sQLiteDatabase = this.LD;
                        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
                            lc lcVar = lc.this;
                            SQLiteDatabase writableDatabase = lcVar.new Lxb(lcVar.lk()).getWritableDatabase();
                            this.LD = writableDatabase;
                            writableDatabase.setLockingEnabled(false);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.sLN.Lxb("DBHelper", th2.getMessage());
                if (lc()) {
                    throw th2;
                }
            }
        }

        private synchronized boolean lc() {
            SQLiteDatabase sQLiteDatabase = this.LD;
            return sQLiteDatabase != null && sQLiteDatabase.inTransaction();
        }

        public synchronized void LD() {
            JXs();
            SQLiteDatabase sQLiteDatabase = this.LD;
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.beginTransaction();
        }

        public SQLiteDatabase Lxb() {
            JXs();
            return this.LD;
        }

        public synchronized void ZU() {
            JXs();
            SQLiteDatabase sQLiteDatabase = this.LD;
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.endTransaction();
        }

        public synchronized void lk() {
            JXs();
            SQLiteDatabase sQLiteDatabase = this.LD;
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.setTransactionSuccessful();
        }

        public synchronized void Lxb(String str) throws SQLException {
            try {
                JXs();
                this.LD.execSQL(str);
            } catch (Throwable th) {
                if (lc()) {
                    throw th;
                }
            }
        }

        public synchronized Cursor Lxb(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
            Cursor cursorQuery;
            try {
                JXs();
                cursorQuery = this.LD.query(str, strArr, str2, strArr2, str3, str4, str5);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.sLN.Lxb("DBHelper", th.getMessage());
                LD ld = new LD();
                if (lc()) {
                    throw th;
                }
                cursorQuery = ld;
            }
            return cursorQuery;
        }

        public synchronized int Lxb(String str, ContentValues contentValues, String str2, String[] strArr) {
            int iUpdate;
            try {
                JXs();
                iUpdate = this.LD.update(str, contentValues, str2, strArr);
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.sLN.Lxb("DBHelper", e.getMessage());
                if (lc()) {
                    throw e;
                }
                iUpdate = 0;
            }
            return iUpdate;
        }

        public synchronized long Lxb(String str, String str2, ContentValues contentValues) {
            long jReplace;
            try {
                JXs();
                jReplace = this.LD.replace(str, str2, contentValues);
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.sLN.Lxb("DBHelper", e.getMessage());
                if (lc()) {
                    throw e;
                }
                jReplace = -1;
            }
            return jReplace;
        }

        public synchronized int Lxb(String str, String str2, String[] strArr) {
            int iDelete;
            try {
                JXs();
                iDelete = this.LD.delete(str, str2, strArr);
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.sLN.Lxb("DBHelper", e.getMessage());
                if (lc()) {
                    throw e;
                }
                iDelete = 0;
            }
            return iDelete;
        }
    }

    public lk Lxb() {
        return this.Lxb;
    }

    public class Lxb extends SQLiteOpenHelper {
        final Context Lxb;

        public Lxb(Context context) {
            super(context, "ttopensdk.db", (SQLiteDatabase.CursorFactory) null, 11);
            this.Lxb = context;
        }

        private void LD(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.core.JVA.Lxb.lk.ZU());
        }

        private void Lxb(SQLiteDatabase sQLiteDatabase, Context context) {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.ZU.ZU.Lxb());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.ZU.QAg.lk());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.ZU.STP.Lxb());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.ZU.NXR.Lxb());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.eK.LD.Lxb());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.ZU.VVE.lk());
            sQLiteDatabase.execSQL(com.bytedance.sdk.component.adexpress.Lxb.LD.LD.lk());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.core.JVA.Lxb.lk.lk());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.ZU.IeN.Lxb());
        }

        private ArrayList<String> ZU(SQLiteDatabase sQLiteDatabase) {
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
                }
            } catch (Exception unused) {
                if (cursorRawQuery != null) {
                }
            } catch (Throwable th) {
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                throw th;
            }
            return arrayList;
        }

        private void lk(SQLiteDatabase sQLiteDatabase) {
            ArrayList<String> arrayListZU = ZU(sQLiteDatabase);
            if (arrayListZU == null || arrayListZU.size() <= 0) {
                return;
            }
            Iterator<String> it = arrayListZU.iterator();
            while (it.hasNext()) {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + it.next() + " ;");
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            try {
                Lxb(sQLiteDatabase, this.Lxb);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.sLN.Lxb("DBHelper", th.getMessage());
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            if (i > i2) {
                try {
                    lk(sQLiteDatabase);
                    Lxb(sQLiteDatabase, lc.this.LD);
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.sLN.LD(th.getMessage());
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0024 A[Catch: all -> 0x0006, TryCatch #1 {all -> 0x0006, blocks: (B:3:0x0002, B:5:0x0008, B:6:0x0011, B:8:0x0015, B:9:0x0019, B:10:0x0024, B:11:0x002f, B:12:0x003a, B:13:0x0043), top: B:23:0x0002 }] */
        /* JADX WARN: Code duplicated, block: B:11:0x002f A[Catch: all -> 0x0006, TryCatch #1 {all -> 0x0006, blocks: (B:3:0x0002, B:5:0x0008, B:6:0x0011, B:8:0x0015, B:9:0x0019, B:10:0x0024, B:11:0x002f, B:12:0x003a, B:13:0x0043), top: B:23:0x0002 }] */
        /* JADX WARN: Code duplicated, block: B:12:0x003a A[Catch: all -> 0x0006, TryCatch #1 {all -> 0x0006, blocks: (B:3:0x0002, B:5:0x0008, B:6:0x0011, B:8:0x0015, B:9:0x0019, B:10:0x0024, B:11:0x002f, B:12:0x003a, B:13:0x0043), top: B:23:0x0002 }] */
        /* JADX WARN: Code duplicated, block: B:13:0x0043 A[Catch: all -> 0x0006, TRY_LEAVE, TryCatch #1 {all -> 0x0006, blocks: (B:3:0x0002, B:5:0x0008, B:6:0x0011, B:8:0x0015, B:9:0x0019, B:10:0x0024, B:11:0x002f, B:12:0x003a, B:13:0x0043), top: B:23:0x0002 }] */
        /* JADX WARN: Code duplicated, block: B:7:0x0014 A[DONT_GENERATE] */
        /* JADX WARN: Code duplicated, block: B:8:0x0015 A[Catch: all -> 0x0006, TryCatch #1 {all -> 0x0006, blocks: (B:3:0x0002, B:5:0x0008, B:6:0x0011, B:8:0x0015, B:9:0x0019, B:10:0x0024, B:11:0x002f, B:12:0x003a, B:13:0x0043), top: B:23:0x0002 }] */
        /* JADX WARN: Code duplicated, block: B:9:0x0019 A[Catch: all -> 0x0006, TryCatch #1 {all -> 0x0006, blocks: (B:3:0x0002, B:5:0x0008, B:6:0x0011, B:8:0x0015, B:9:0x0019, B:10:0x0024, B:11:0x002f, B:12:0x003a, B:13:0x0043), top: B:23:0x0002 }] */
        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            if (i <= i2) {
                Lxb(sQLiteDatabase, lc.this.LD);
                switch (i) {
                    case 1:
                        Lxb(sQLiteDatabase);
                        break;
                    case 2:
                        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'ad_video_info';");
                        Lxb(sQLiteDatabase);
                        break;
                    case 3:
                        sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.ZU.STP.Lxb());
                        Lxb(sQLiteDatabase);
                        break;
                    case 4:
                        sQLiteDatabase.execSQL(com.bytedance.sdk.component.adexpress.Lxb.LD.LD.lk());
                        Lxb(sQLiteDatabase);
                        break;
                    case 5:
                        sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.ZU.NXR.Lxb());
                        Lxb(sQLiteDatabase);
                        break;
                    case 6:
                        Lxb(sQLiteDatabase);
                        break;
                }
            } else {
                try {
                    lk(sQLiteDatabase);
                    Lxb(sQLiteDatabase, lc.this.LD);
                    switch (i) {
                        case 1:
                            Lxb(sQLiteDatabase);
                            break;
                        case 2:
                            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'ad_video_info';");
                            Lxb(sQLiteDatabase);
                            break;
                        case 3:
                            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.ZU.STP.Lxb());
                            Lxb(sQLiteDatabase);
                            break;
                        case 4:
                            sQLiteDatabase.execSQL(com.bytedance.sdk.component.adexpress.Lxb.LD.LD.lk());
                            Lxb(sQLiteDatabase);
                            break;
                        case 5:
                            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.ZU.NXR.Lxb());
                            Lxb(sQLiteDatabase);
                            break;
                        case 6:
                            Lxb(sQLiteDatabase);
                            break;
                    }
                } catch (Throwable unused) {
                }
            }
            if (i < 11) {
                try {
                    LD(sQLiteDatabase);
                    com.bytedance.sdk.openadsdk.eK.LD.Lxb(sQLiteDatabase);
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.sLN.Lxb("DBHelper", th.getMessage());
                }
            }
        }

        private void Lxb(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.ZU.ZU.LD());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.ZU.QAg.ZU());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.ZU.STP.LD());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.ZU.NXR.LD());
        }
    }
}
