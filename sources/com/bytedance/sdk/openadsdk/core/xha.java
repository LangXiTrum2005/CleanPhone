package com.bytedance.sdk.openadsdk.core;

import android.content.ContentValues;
import android.content.Context;
import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public class xha {
    private static final Object ik = new Object();
    private Context lr;
    private ik ri;

    public class lr extends AbstractCursor {
        private lr() {
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
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
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

    public xha(Context context) {
        try {
            this.lr = context == null ? nr.ri() : context.getApplicationContext();
            if (this.ri == null) {
                this.ri = new ik();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Context ik() {
        Context context = this.lr;
        return context == null ? nr.ri() : context;
    }

    public class ik {
        private SQLiteDatabase lr = null;

        public ik() {
        }

        private synchronized boolean ik() {
            SQLiteDatabase sQLiteDatabase = this.lr;
            return sQLiteDatabase != null && sQLiteDatabase.inTransaction();
        }

        private synchronized void lr() {
            ri riVar;
            try {
                synchronized (xha.ik) {
                    try {
                        SQLiteDatabase sQLiteDatabase = this.lr;
                        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
                            if (com.bytedance.sdk.component.utils.ihz.ri(xha.this.ik())) {
                                xha xhaVar = xha.this;
                                riVar = xhaVar.new ri(xhaVar.ik(), "ttopensdk.db");
                            } else {
                                xha xhaVar2 = xha.this;
                                riVar = xhaVar2.new ri(xhaVar2.ik(), "ttopensdk_" + com.bytedance.sdk.component.utils.ihz.ik(xha.this.ik()) + ".db");
                            }
                            SQLiteDatabase writableDatabase = riVar.getWritableDatabase();
                            this.lr = writableDatabase;
                            writableDatabase.setLockingEnabled(false);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.ac.ik("DBHelper", th2.getMessage());
                if (ik()) {
                    throw th2;
                }
            }
        }

        public SQLiteDatabase ri() {
            lr();
            return this.lr;
        }

        public synchronized Cursor ri(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
            Cursor cursorQuery;
            try {
                lr();
                cursorQuery = this.lr.query(str, strArr, str2, strArr2, str3, str4, str5);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.ac.ik("DBHelper", th.getMessage());
                lr lrVar = new lr();
                if (ik()) {
                    throw th;
                }
                cursorQuery = lrVar;
            }
            return cursorQuery;
        }

        public synchronized int ri(String str, ContentValues contentValues, String str2, String[] strArr) {
            int iUpdate;
            try {
                lr();
                iUpdate = this.lr.update(str, contentValues, str2, strArr);
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.ac.ik("DBHelper", e.getMessage());
                if (ik()) {
                    throw e;
                }
                iUpdate = 0;
            }
            return iUpdate;
        }

        public synchronized long ri(String str, String str2, ContentValues contentValues) {
            long jReplace;
            try {
                lr();
                jReplace = this.lr.replace(str, str2, contentValues);
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.ac.ik("DBHelper", e.getMessage());
                if (ik()) {
                    throw e;
                }
                jReplace = -1;
            }
            return jReplace;
        }

        public synchronized int ri(String str, String str2, String[] strArr) {
            int iDelete;
            try {
                lr();
                iDelete = this.lr.delete(str, str2, strArr);
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.ac.ik("DBHelper", e.getMessage());
                if (ik()) {
                    throw e;
                }
                iDelete = 0;
            }
            return iDelete;
        }
    }

    public ik ri() {
        return this.ri;
    }

    public class ri extends SQLiteOpenHelper {
        final Context ri;

        public ri(Context context, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 11);
            this.ri = context;
        }

        private void ik(SQLiteDatabase sQLiteDatabase) {
            ArrayList<String> arrayListKa = ka(sQLiteDatabase);
            if (arrayListKa == null || arrayListKa.size() <= 0) {
                return;
            }
            Iterator<String> it = arrayListKa.iterator();
            while (it.hasNext()) {
                sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s ;", it.next()));
            }
        }

        private ArrayList<String> ka(SQLiteDatabase sQLiteDatabase) {
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

        private void lr(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.core.co.ri.ik.ka());
        }

        private void ri(SQLiteDatabase sQLiteDatabase, Context context) {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.ka.ka.ri());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.ka.sf.ik());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.ka.slm.ri());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.ka.vr.ri());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.ay.lr.ri());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.ka.nr.ik());
            sQLiteDatabase.execSQL(com.bytedance.sdk.component.adexpress.ri.lr.lr.ik());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.core.co.ri.ik.ik());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.ka.bu.ri());
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            try {
                ri(sQLiteDatabase, this.ri);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.ac.ik("DBHelper", th.getMessage());
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            if (i > i2) {
                try {
                    ik(sQLiteDatabase);
                    ri(sQLiteDatabase, xha.this.lr);
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.ac.ik(th.getMessage(), new Object[0]);
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
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            if (i <= i2) {
                ri(sQLiteDatabase, xha.this.lr);
                switch (i) {
                    case 1:
                        ri(sQLiteDatabase);
                        break;
                    case 2:
                        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'ad_video_info';");
                        ri(sQLiteDatabase);
                        break;
                    case 3:
                        sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.ka.slm.ri());
                        ri(sQLiteDatabase);
                        break;
                    case 4:
                        sQLiteDatabase.execSQL(com.bytedance.sdk.component.adexpress.ri.lr.lr.ik());
                        ri(sQLiteDatabase);
                        break;
                    case 5:
                        sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.ka.vr.ri());
                        ri(sQLiteDatabase);
                        break;
                    case 6:
                        ri(sQLiteDatabase);
                        break;
                }
            } else {
                try {
                    ik(sQLiteDatabase);
                    ri(sQLiteDatabase, xha.this.lr);
                    switch (i) {
                        case 1:
                            ri(sQLiteDatabase);
                            break;
                        case 2:
                            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'ad_video_info';");
                            ri(sQLiteDatabase);
                            break;
                        case 3:
                            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.ka.slm.ri());
                            ri(sQLiteDatabase);
                            break;
                        case 4:
                            sQLiteDatabase.execSQL(com.bytedance.sdk.component.adexpress.ri.lr.lr.ik());
                            ri(sQLiteDatabase);
                            break;
                        case 5:
                            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.ka.vr.ri());
                            ri(sQLiteDatabase);
                            break;
                        case 6:
                            ri(sQLiteDatabase);
                            break;
                    }
                } catch (Throwable unused) {
                }
            }
            if (i < 11) {
                try {
                    lr(sQLiteDatabase);
                    com.bytedance.sdk.openadsdk.ay.lr.ri(sQLiteDatabase);
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.ac.ik("DBHelper", th.getMessage());
                }
            }
        }

        private void ri(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.ka.ka.lr());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.ka.sf.ka());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.ka.slm.lr());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.ka.vr.lr());
        }
    }
}
