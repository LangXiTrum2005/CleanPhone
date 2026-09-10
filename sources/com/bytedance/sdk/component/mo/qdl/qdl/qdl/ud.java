package com.bytedance.sdk.component.mo.qdl.qdl.qdl;

import android.content.ContentValues;
import android.content.Context;
import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.bytedance.sdk.component.mo.qdl.jpc;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
class ud {
    private C0086ud qdl;
    private Context ud;

    public class qdl extends AbstractCursor {
        private qdl() {
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

    public ud(Context context) {
        try {
            this.ud = context.getApplicationContext();
            if (this.qdl == null) {
                this.qdl = new C0086ud();
            }
        } catch (Throwable unused) {
        }
    }

    public C0086ud qdl() {
        return this.qdl;
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.mo.qdl.qdl.qdl.ud$ud, reason: collision with other inner class name */
    public class C0086ud {
        private volatile SQLiteDatabase ud = null;

        public C0086ud() {
        }

        private void qdl() {
            try {
                if (this.ud != null && this.ud.isOpen()) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (this.ud == null || !this.ud.isOpen()) {
                            this.ud = jpc.wd().mml().qdl(jpc.wd().mo());
                            this.ud.setLockingEnabled(false);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                if (ud()) {
                    throw th2;
                }
            }
        }

        private boolean ud() {
            SQLiteDatabase sQLiteDatabase = this.ud;
            return sQLiteDatabase != null && sQLiteDatabase.inTransaction();
        }

        public void qdl(String str) throws SQLException {
            try {
                qdl();
                this.ud.execSQL(str);
            } catch (Throwable th) {
                if (ud()) {
                    throw th;
                }
            }
        }

        public Cursor qdl(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
            try {
                qdl();
                return this.ud.query(str, strArr, str2, strArr2, str3, str4, str5);
            } catch (Throwable th) {
                qdl qdlVar = new qdl();
                if (ud()) {
                    throw th;
                }
                return qdlVar;
            }
        }

        public int qdl(String str, ContentValues contentValues, String str2, String[] strArr) throws Exception {
            try {
                qdl();
                return this.ud.update(str, contentValues, str2, strArr);
            } catch (Exception e2) {
                if (ud()) {
                    throw e2;
                }
                return 0;
            }
        }

        public long qdl(String str, String str2, ContentValues contentValues) throws Exception {
            try {
                qdl();
                return this.ud.insert(str, str2, contentValues);
            } catch (Exception e2) {
                if (ud()) {
                    throw e2;
                }
                return -1L;
            }
        }

        public synchronized void qdl(String str, String str2, List<com.bytedance.sdk.component.mo.qdl.mml.qdl> list) {
            JSONObject jSONObjectWd;
            try {
                try {
                    qdl();
                    this.ud.beginTransaction();
                    ContentValues contentValues = new ContentValues();
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        com.bytedance.sdk.component.mo.qdl.mml.qdl qdlVar = list.get(i2);
                        if (qdlVar != null && (jSONObjectWd = qdlVar.wd()) != null) {
                            contentValues.put("id", qdlVar.lnr());
                            String strUd = jpc.wd().jtx().ud(jSONObjectWd.toString());
                            if (!TextUtils.isEmpty(strUd)) {
                                contentValues.put("value", strUd);
                                contentValues.put("gen_time", Long.valueOf(System.currentTimeMillis()));
                                contentValues.put("retry", (Integer) 0);
                                contentValues.put("encrypt", (Integer) 1);
                                if (com.bytedance.sdk.component.mo.qdl.lnr.qdl.mml() && qdlVar.to() > 0 && (qdlVar.mml() == 0 || qdlVar.mml() == 3)) {
                                    contentValues.put("channel", Integer.valueOf(qdlVar.to()));
                                }
                                this.ud.insert(str, str2, contentValues);
                            }
                            contentValues.clear();
                        }
                    }
                    this.ud.setTransactionSuccessful();
                    list.size();
                    if (this.ud != null) {
                        this.ud.endTransaction();
                    }
                } catch (Exception e2) {
                    list.size();
                    if (!ud()) {
                        if (this.ud != null) {
                            this.ud.endTransaction();
                        }
                    } else {
                        throw e2;
                    }
                }
            } catch (Throwable th) {
                if (this.ud != null) {
                    this.ud.endTransaction();
                }
                throw th;
            }
        }

        public int qdl(String str, String str2, String[] strArr) throws Exception {
            try {
                qdl();
                return this.ud.delete(str, str2, strArr);
            } catch (Exception e2) {
                if (ud()) {
                    throw e2;
                }
                return 0;
            }
        }
    }
}
