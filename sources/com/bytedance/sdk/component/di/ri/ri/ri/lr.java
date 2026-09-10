package com.bytedance.sdk.component.di.ri.ri.ri;

import android.content.ContentValues;
import android.content.Context;
import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.appsflyer.AppsFlyerProperties;
import com.bytedance.sdk.component.di.ri.xha;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
class lr {
    private Context lr;
    private C0209lr ri;

    public class ri extends AbstractCursor {
        private ri() {
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

    public lr(Context context) {
        try {
            this.lr = context.getApplicationContext();
            if (this.ri == null) {
                this.ri = new C0209lr();
            }
        } catch (Throwable unused) {
        }
    }

    public C0209lr ri() {
        return this.ri;
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.di.ri.ri.ri.lr$lr, reason: collision with other inner class name */
    public class C0209lr {
        private volatile SQLiteDatabase lr = null;

        public C0209lr() {
        }

        private boolean lr() {
            SQLiteDatabase sQLiteDatabase = this.lr;
            return sQLiteDatabase != null && sQLiteDatabase.inTransaction();
        }

        /* JADX WARN: Bottom block not found for handler: all -> 0x000d */
        /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void ri() {
            /*
                r2 = this;
                android.database.sqlite.SQLiteDatabase r0 = r2.lr     // Catch: java.lang.Throwable -> Ld
                if (r0 == 0) goto Lf
                android.database.sqlite.SQLiteDatabase r0 = r2.lr     // Catch: java.lang.Throwable -> Ld
                boolean r0 = r0.isOpen()     // Catch: java.lang.Throwable -> Ld
                if (r0 != 0) goto L45
                goto Lf
            Ld:
                r0 = move-exception
                goto L3f
            Lf:
                monitor-enter(r2)     // Catch: java.lang.Throwable -> Ld
                android.database.sqlite.SQLiteDatabase r0 = r2.lr     // Catch: java.lang.Throwable -> L1d
                if (r0 == 0) goto L1f
                android.database.sqlite.SQLiteDatabase r0 = r2.lr     // Catch: java.lang.Throwable -> L1d
                boolean r0 = r0.isOpen()     // Catch: java.lang.Throwable -> L1d
                if (r0 != 0) goto L3b
                goto L1f
            L1d:
                r0 = move-exception
                goto L3d
            L1f:
                com.bytedance.sdk.component.di.ri.xha r0 = com.bytedance.sdk.component.di.ri.xha.di()     // Catch: java.lang.Throwable -> L1d
                com.bytedance.sdk.component.di.ri.ri.fi r0 = r0.ik()     // Catch: java.lang.Throwable -> L1d
                com.bytedance.sdk.component.di.ri.xha r1 = com.bytedance.sdk.component.di.ri.xha.di()     // Catch: java.lang.Throwable -> L1d
                android.content.Context r1 = r1.fi()     // Catch: java.lang.Throwable -> L1d
                android.database.sqlite.SQLiteDatabase r0 = r0.ri(r1)     // Catch: java.lang.Throwable -> L1d
                r2.lr = r0     // Catch: java.lang.Throwable -> L1d
                android.database.sqlite.SQLiteDatabase r0 = r2.lr     // Catch: java.lang.Throwable -> L1d
                r1 = 0
                r0.setLockingEnabled(r1)     // Catch: java.lang.Throwable -> L1d
            L3b:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1d
                return
            L3d:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
                throw r0     // Catch: java.lang.Throwable -> Ld
            L3f:
                boolean r1 = r2.lr()
                if (r1 != 0) goto L46
            L45:
                return
            L46:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.di.ri.ri.ri.lr.C0209lr.ri():void");
        }

        public void ri(String str) throws SQLException {
            try {
                ri();
                this.lr.execSQL(str);
            } catch (Throwable th) {
                if (lr()) {
                    throw th;
                }
            }
        }

        public Cursor ri(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
            try {
                ri();
                return this.lr.query(str, strArr, str2, strArr2, str3, str4, str5);
            } catch (Throwable th) {
                ri riVar = new ri();
                if (lr()) {
                    throw th;
                }
                return riVar;
            }
        }

        public int ri(String str, ContentValues contentValues, String str2, String[] strArr) throws Exception {
            try {
                ri();
                return this.lr.update(str, contentValues, str2, strArr);
            } catch (Exception e) {
                if (lr()) {
                    throw e;
                }
                return 0;
            }
        }

        public long ri(String str, String str2, ContentValues contentValues) throws Exception {
            try {
                ri();
                return this.lr.insert(str, str2, contentValues);
            } catch (Exception e) {
                if (lr()) {
                    throw e;
                }
                return -1L;
            }
        }

        public synchronized void ri(String str, String str2, List<com.bytedance.sdk.component.di.ri.ka.ri> list) {
            JSONObject jSONObjectDi;
            try {
                try {
                    ri();
                    this.lr.beginTransaction();
                    ContentValues contentValues = new ContentValues();
                    for (int i = 0; i < list.size(); i++) {
                        com.bytedance.sdk.component.di.ri.ka.ri riVar = list.get(i);
                        if (riVar != null && (jSONObjectDi = riVar.di()) != null) {
                            contentValues.put("id", riVar.ik());
                            String strLr = xha.di().vr().lr(jSONObjectDi.toString());
                            if (!TextUtils.isEmpty(strLr)) {
                                contentValues.put("value", strLr);
                                contentValues.put("gen_time", Long.valueOf(System.currentTimeMillis()));
                                contentValues.put("retry", (Integer) 0);
                                contentValues.put("encrypt", (Integer) 1);
                                if (com.bytedance.sdk.component.di.ri.ik.ri.ka() && riVar.jbs() > 0 && (riVar.ka() == 0 || riVar.ka() == 3)) {
                                    contentValues.put(AppsFlyerProperties.CHANNEL, Integer.valueOf(riVar.jbs()));
                                }
                                this.lr.insert(str, str2, contentValues);
                            }
                            contentValues.clear();
                        }
                    }
                    this.lr.setTransactionSuccessful();
                    list.size();
                    if (this.lr != null) {
                        this.lr.endTransaction();
                    }
                } catch (Exception e) {
                    list.size();
                    if (!lr()) {
                        if (this.lr != null) {
                            this.lr.endTransaction();
                        }
                    } else {
                        throw e;
                    }
                }
            } catch (Throwable th) {
                if (this.lr != null) {
                    this.lr.endTransaction();
                }
                throw th;
            }
        }

        public int ri(String str, String str2, String[] strArr) throws Exception {
            try {
                ri();
                return this.lr.delete(str, str2, strArr);
            } catch (Exception e) {
                if (lr()) {
                    throw e;
                }
                return 0;
            }
        }
    }
}
