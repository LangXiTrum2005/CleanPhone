package com.thinkup.core.o0.m;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.thinkup.core.common.n.o0n;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class oo extends com.thinkup.core.common.oo.n<com.thinkup.core.o0.o.o> {
    private static final int m = 50;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static volatile oo f42441n = null;
    private static final String o = "PlacementStatisticsDao";

    public static class o {
        public static final String m = "type";
        public static final String m0 = "price";
        public static final String mm = "ps_id";
        public static final String mn = "segment_id";
        public static final String mo = "record_time";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final String f42442n = "placement_id";
        public static final String n0 = "CREATE TABLE IF NOT EXISTS user_value_placement(type INTEGER, placement_id TEXT, request_id TEXT, network_firm_id INTEGER, ad_source_id TEXT, dsp_id TEXT, price DOUBLE, record_time INTEGER, ps_id TEXT )";
        public static final String nm = "CREATE INDEX placement_id ON user_value_placement (placement_id)";
        public static final String no = "ALTER TABLE user_value_placement ADD COLUMN segment_id INTEGER";
        public static final String o = "user_value_placement";
        public static final String o0 = "request_id";
        public static final String om = "ad_source_id";
        public static final String on = "dsp_id";
        public static final String oo = "network_firm_id";
    }

    private oo(com.thinkup.core.common.oo.o0 o0Var) {
        super(o0Var);
    }

    public static oo o() {
        if (f42441n == null) {
            synchronized (oo.class) {
                try {
                    if (f42441n == null) {
                        f42441n = new oo(com.thinkup.core.common.oo.oo.o(o0n.m().on()));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f42441n;
    }

    public final synchronized void o(com.thinkup.core.o0.o.o oVar) {
        int iMn = oVar.mn();
        Cursor cursor = null;
        try {
            try {
                String strMm = oVar.mm();
                String strM = oVar.m();
                SQLiteDatabase sQLiteDatabaseO0 = o0();
                ContentValues contentValues = new ContentValues();
                contentValues.put("type", Integer.valueOf(iMn));
                contentValues.put("placement_id", strMm);
                contentValues.put("request_id", strM);
                contentValues.put("ad_source_id", oVar.o0());
                contentValues.put("network_firm_id", Integer.valueOf(oVar.n()));
                contentValues.put("dsp_id", oVar.oo());
                contentValues.put("price", Double.valueOf(oVar.om()));
                contentValues.put(o.mo, Long.valueOf(oVar.on()));
                contentValues.put("ps_id", oVar.m0());
                contentValues.put("segment_id", Integer.valueOf(oVar.o()));
                Cursor cursorQuery = n().query(o.o, new String[]{"placement_id", "request_id"}, "placement_id=? AND request_id=? AND type=?", new String[]{strMm, strM, String.valueOf(iMn)}, null, null, null);
                if (cursorQuery != null && cursorQuery.getCount() > 0) {
                    cursorQuery.close();
                    o0().update(o.o, contentValues, "placement_id = ? AND request_id = ? AND type = ?", new String[]{strMm, strM, String.valueOf(iMn)});
                    return;
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                Cursor cursorQuery2 = sQLiteDatabaseO0.query(o.o, new String[]{o.mo}, "type = ? AND placement_id = ?", new String[]{String.valueOf(iMn), strMm}, null, null, "record_time ASC");
                try {
                    if (cursorQuery2.getCount() > 50) {
                        long j = cursorQuery2.moveToNext() ? cursorQuery2.getLong(cursorQuery2.getColumnIndexOrThrow(o.mo)) : 0L;
                        if (j != 0) {
                            sQLiteDatabaseO0.delete(o.o, "record_time = ?", new String[]{String.valueOf(j)});
                        }
                    }
                    sQLiteDatabaseO0.insertOrThrow(o.o, null, contentValues);
                    Thread.currentThread().getName();
                    cursorQuery2.close();
                } catch (Exception e2) {
                    e = e2;
                    cursor = cursorQuery2;
                    e.getMessage();
                    Thread.currentThread().getName();
                    if (cursor != null) {
                        cursor.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorQuery2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private boolean o(String str, String str2, int i2) {
        Cursor cursorQuery = n().query(o.o, new String[]{"placement_id", "request_id"}, "placement_id=? AND request_id=? AND type=?", new String[]{str, str2, String.valueOf(i2)}, null, null, null);
        if (cursorQuery != null && cursorQuery.getCount() > 0) {
            cursorQuery.close();
            return true;
        }
        if (cursorQuery == null) {
            return false;
        }
        cursorQuery.close();
        return false;
    }

    public final synchronized List<com.thinkup.core.o0.o.o> o(String str, int i2, long j, int i3) {
        ArrayList arrayList;
        String[] strArr;
        String str2;
        arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            if (i2 == -1) {
                strArr = new String[]{str, String.valueOf(j), "0"};
                str2 = "placement_id = ? AND record_time > ? AND price > ?";
            } else {
                strArr = new String[]{str, String.valueOf(i2), String.valueOf(j), "0"};
                str2 = "placement_id = ? AND segment_id = ? AND record_time > ? AND price > ?";
            }
            cursorQuery = n().query(o.o, null, str2, strArr, null, null, null, String.valueOf(i3));
            while (cursorQuery.moveToNext()) {
                arrayList.add(o(cursorQuery));
                Thread.currentThread().getName();
            }
            cursorQuery.close();
        } catch (Exception e2) {
            e2.getMessage();
            Thread.currentThread().getName();
            return arrayList;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0064 A[Catch: all -> 0x0048, TRY_ENTER, TryCatch #2 {all -> 0x0048, blocks: (B:13:0x0043, B:28:0x0064, B:29:0x0067, B:24:0x005d), top: B:33:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:38:? A[Catch: all -> 0x0048, SYNTHETIC, TryCatch #2 {all -> 0x0048, blocks: (B:13:0x0043, B:28:0x0064, B:29:0x0067, B:24:0x005d), top: B:33:0x0002 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public final synchronized List<com.thinkup.core.o0.o.o> o(int i2, String str, int i3) {
        Throwable th;
        Exception exc;
        Cursor cursorQuery;
        ?? r1 = 0;
        try {
            try {
                try {
                    ArrayList arrayList = new ArrayList();
                    cursorQuery = n().query(o.o, null, "type = ? AND placement_id = ?", new String[]{String.valueOf((int) i2), str}, null, null, "record_time DESC", String.valueOf(i3));
                    while (cursorQuery.moveToNext()) {
                        try {
                            arrayList.add(o(cursorQuery));
                        } catch (Exception e2) {
                            exc = e2;
                            exc.getMessage();
                            Thread.currentThread().getName();
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            return null;
                        }
                    }
                    arrayList.size();
                    Thread.currentThread().getId();
                    cursorQuery.close();
                    return arrayList;
                } catch (Exception e3) {
                    exc = e3;
                    cursorQuery = null;
                } catch (Throwable th2) {
                    th = th2;
                    if (r1 != 0) {
                        r1.close();
                        throw th;
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                r1 = i2;
                if (r1 != 0) {
                    r1.close();
                    throw th;
                }
                throw th;
            }
        } catch (Throwable th4) {
            throw th4;
        }
    }

    private static com.thinkup.core.o0.o.o o(Cursor cursor) {
        com.thinkup.core.o0.o.o oVar = new com.thinkup.core.o0.o.o();
        int i2 = cursor.getInt(cursor.getColumnIndexOrThrow("type"));
        String string = cursor.getString(cursor.getColumnIndexOrThrow("placement_id"));
        String string2 = cursor.getString(cursor.getColumnIndexOrThrow("request_id"));
        int i3 = cursor.getInt(cursor.getColumnIndexOrThrow("network_firm_id"));
        String string3 = cursor.getString(cursor.getColumnIndexOrThrow("ad_source_id"));
        String string4 = cursor.getString(cursor.getColumnIndexOrThrow("dsp_id"));
        double d = cursor.getDouble(cursor.getColumnIndexOrThrow("price"));
        long j = cursor.getLong(cursor.getColumnIndexOrThrow(o.mo));
        String string5 = cursor.getString(cursor.getColumnIndexOrThrow("ps_id"));
        int i4 = cursor.getInt(cursor.getColumnIndexOrThrow("segment_id"));
        oVar.n(i2);
        oVar.oo(string);
        oVar.o(string2);
        oVar.m(i3);
        oVar.m(string3);
        oVar.n(string4);
        oVar.o(d);
        oVar.o(j);
        oVar.o0(string5);
        oVar.o(i4);
        return oVar;
    }

    public final synchronized void o(String str) {
        try {
            o0().delete(o.o, "placement_id = ?", new String[]{str});
        } catch (Exception e2) {
            e2.getMessage();
            Thread.currentThread().getName();
        }
    }

    public final synchronized double[] o(String[] strArr, String str) {
        double[] dArr;
        dArr = new double[2];
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = n().query(str, strArr, null, null, null, null, null, null);
                if (cursorQuery.moveToNext()) {
                    dArr[0] = cursorQuery.getDouble(0);
                    dArr[1] = cursorQuery.getInt(1);
                }
            } catch (Exception e2) {
                e2.getMessage();
                Thread.currentThread().getName();
                if (cursorQuery != null) {
                }
            }
            cursorQuery.close();
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
                throw th;
            }
            throw th;
        }
        return dArr;
    }
}
