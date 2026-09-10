package com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb;

import android.content.ContentValues;
import android.content.Context;
import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.bytedance.sdk.component.lc.Lxb.OY;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
class LD {
    private Context LD;
    private C0065LD Lxb;

    public class Lxb extends AbstractCursor {
        private Lxb() {
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

    public LD(Context context) {
        try {
            this.LD = context.getApplicationContext();
            if (this.Lxb == null) {
                this.Lxb = new C0065LD();
            }
        } catch (Throwable unused) {
        }
    }

    public C0065LD Lxb() {
        return this.Lxb;
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb.LD$LD, reason: collision with other inner class name */
    public class C0065LD {
        private volatile SQLiteDatabase LD = null;

        public C0065LD() {
        }

        private boolean LD() {
            SQLiteDatabase sQLiteDatabase = this.LD;
            return sQLiteDatabase != null && sQLiteDatabase.inTransaction();
        }

        private void Lxb() {
            try {
                if (this.LD != null && this.LD.isOpen()) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (this.LD == null || !this.LD.isOpen()) {
                            this.LD = OY.ebl().ZU().Lxb(OY.ebl().lc());
                            this.LD.setLockingEnabled(false);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                if (LD()) {
                    throw th2;
                }
            }
        }

        public void Lxb(String str) throws SQLException {
            try {
                Lxb();
                this.LD.execSQL(str);
            } catch (Throwable th) {
                if (LD()) {
                    throw th;
                }
            }
        }

        public Cursor Lxb(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
            try {
                Lxb();
                return this.LD.query(str, strArr, str2, strArr2, str3, str4, str5);
            } catch (Throwable th) {
                Lxb lxb = new Lxb();
                if (LD()) {
                    throw th;
                }
                return lxb;
            }
        }

        public int Lxb(String str, ContentValues contentValues, String str2, String[] strArr) throws Exception {
            try {
                Lxb();
                return this.LD.update(str, contentValues, str2, strArr);
            } catch (Exception e) {
                if (LD()) {
                    throw e;
                }
                return 0;
            }
        }

        public long Lxb(String str, String str2, ContentValues contentValues) throws Exception {
            try {
                Lxb();
                return this.LD.insert(str, str2, contentValues);
            } catch (Exception e) {
                if (LD()) {
                    throw e;
                }
                return -1L;
            }
        }

        public synchronized void Lxb(String str, String str2, List<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb> list) {
            JSONObject jSONObjectEbl;
            try {
                try {
                    Lxb();
                    this.LD.beginTransaction();
                    ContentValues contentValues = new ContentValues();
                    for (int i = 0; i < list.size(); i++) {
                        com.bytedance.sdk.component.lc.Lxb.ZU.Lxb lxb = list.get(i);
                        if (lxb != null && (jSONObjectEbl = lxb.ebl()) != null) {
                            contentValues.put("id", lxb.lk());
                            String strLD = OY.ebl().VVE().LD(jSONObjectEbl.toString());
                            if (!TextUtils.isEmpty(strLD)) {
                                contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, strLD);
                                contentValues.put("gen_time", Long.valueOf(System.currentTimeMillis()));
                                contentValues.put("retry", (Integer) 0);
                                contentValues.put("encrypt", (Integer) 1);
                                if (com.bytedance.sdk.component.lc.Lxb.lk.Lxb.ZU() && lxb.nBu() > 0 && (lxb.ZU() == 0 || lxb.ZU() == 3)) {
                                    contentValues.put("channel", Integer.valueOf(lxb.nBu()));
                                }
                                this.LD.insert(str, str2, contentValues);
                            }
                            contentValues.clear();
                        }
                    }
                    this.LD.setTransactionSuccessful();
                    list.size();
                    if (this.LD != null) {
                        this.LD.endTransaction();
                    }
                } catch (Exception e) {
                    list.size();
                    if (!LD()) {
                        if (this.LD != null) {
                            this.LD.endTransaction();
                        }
                    } else {
                        throw e;
                    }
                }
            } catch (Throwable th) {
                if (this.LD != null) {
                    this.LD.endTransaction();
                }
                throw th;
            }
        }

        public int Lxb(String str, String str2, String[] strArr) throws Exception {
            try {
                Lxb();
                return this.LD.delete(str, str2, strArr);
            } catch (Exception e) {
                if (LD()) {
                    throw e;
                }
                return 0;
            }
        }
    }
}
