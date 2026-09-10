package com.thinkup.core.common.oo;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.thinkup.core.common.on.o00o;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class o0o extends n<o00o> {
    private static volatile o0o m;
    private final String o;

    public static class o {
        public static final String m = "format";
        public static final String m0 = "date_imp";
        public static final String mm = "CREATE TABLE IF NOT EXISTS placement_ad_impression(format INTEGER ,placement_id TEXT ,adsource_id TEXT ,hour_time TEXT ,hour_imp INTEGER ,date_time TEXT ,date_imp INTEGER , show_time INTEGER)";
        public static final String mo = "show_time";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final String f42276n = "placement_id";
        public static final String o = "placement_ad_impression";
        public static final String o0 = "adsource_id";
        public static final String om = "hour_imp";
        public static final String on = "date_time";
        public static final String oo = "hour_time";
    }

    private o0o(o0 o0Var) {
        super(o0Var);
        this.o = o0o.class.getName();
    }

    private boolean m(String str) {
        Cursor cursorQuery = n().query(o.o, new String[]{"adsource_id"}, "adsource_id=?", new String[]{str}, "adsource_id", null, null);
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

    public static o0o o(o0 o0Var) {
        if (m == null) {
            synchronized (o0o.class) {
                try {
                    if (m == null) {
                        m = new o0o(o0Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return m;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x007c A[Catch: all -> 0x009d, OutOfMemoryError -> 0x00a0, Exception -> 0x00ae, TryCatch #6 {Exception -> 0x00ae, OutOfMemoryError -> 0x00a0, all -> 0x009d, blocks: (B:32:0x005d, B:34:0x007c, B:36:0x0082, B:38:0x008e, B:40:0x0094), top: B:63:0x005d }] */
    /* JADX WARN: Code duplicated, block: B:38:0x008e A[Catch: all -> 0x009d, OutOfMemoryError -> 0x00a0, Exception -> 0x00ae, TryCatch #6 {Exception -> 0x00ae, OutOfMemoryError -> 0x00a0, all -> 0x009d, blocks: (B:32:0x005d, B:34:0x007c, B:36:0x0082, B:38:0x008e, B:40:0x0094), top: B:63:0x005d }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0099 A[Catch: all -> 0x0045, PHI: r2
  0x0099: PHI (r2v10 android.database.Cursor) = 
  (r2v7 android.database.Cursor)
  (r2v8 android.database.Cursor)
  (r2v9 android.database.Cursor)
  (r2v11 android.database.Cursor)
 binds: [B:44:0x009d, B:47:0x00a3, B:54:0x00ae, B:41:0x0097] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #2 {, blocks: (B:4:0x0002, B:16:0x0041, B:42:0x0099, B:52:0x00aa, B:53:0x00ad, B:28:0x0056, B:29:0x0059, B:22:0x004c, B:46:0x00a0), top: B:60:0x0002, inners: #0, #3 }] */
    public final synchronized int[] o(int i2, String str, String str2) {
        int[] iArr;
        iArr = new int[2];
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = n().query(o.o, new String[]{"sum(date_imp)"}, "format=? AND date_time=?", new String[]{String.valueOf(i2), str}, null, null, null);
                if (cursorQuery != null && cursorQuery.getCount() > 0) {
                    cursorQuery.moveToNext();
                    iArr[0] = cursorQuery.getInt(0);
                }
                if (cursorQuery != null && cursorQuery.getCount() > 0) {
                    cursorQuery.close();
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (Exception unused) {
                if (cursorQuery != null) {
                }
                try {
                    cursorQuery = n().query(o.o, new String[]{"sum(hour_imp)"}, "format=? AND hour_time=?", new String[]{String.valueOf(i2), str2}, null, null, null);
                    if (cursorQuery != null) {
                        cursorQuery.moveToNext();
                        iArr[1] = cursorQuery.getInt(0);
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } catch (Exception unused2) {
                    if (cursorQuery != null) {
                    }
                } catch (OutOfMemoryError unused3) {
                    System.gc();
                    if (cursorQuery != null) {
                    }
                } catch (Throwable unused4) {
                    if (cursorQuery != null) {
                    }
                }
                return iArr;
            } catch (OutOfMemoryError unused5) {
                System.gc();
                if (cursorQuery != null) {
                }
                cursorQuery = n().query(o.o, new String[]{"sum(hour_imp)"}, "format=? AND hour_time=?", new String[]{String.valueOf(i2), str2}, null, null, null);
                if (cursorQuery != null) {
                    cursorQuery.moveToNext();
                    iArr[1] = cursorQuery.getInt(0);
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return iArr;
            } catch (Throwable unused6) {
                if (cursorQuery != null) {
                }
                cursorQuery = n().query(o.o, new String[]{"sum(hour_imp)"}, "format=? AND hour_time=?", new String[]{String.valueOf(i2), str2}, null, null, null);
                if (cursorQuery != null) {
                    cursorQuery.moveToNext();
                    iArr[1] = cursorQuery.getInt(0);
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return iArr;
            }
            try {
                cursorQuery = n().query(o.o, new String[]{"sum(hour_imp)"}, "format=? AND hour_time=?", new String[]{String.valueOf(i2), str2}, null, null, null);
                if (cursorQuery != null && cursorQuery.getCount() > 0) {
                    cursorQuery.moveToNext();
                    iArr[1] = cursorQuery.getInt(0);
                }
                if (cursorQuery != null && cursorQuery.getCount() > 0) {
                    cursorQuery.close();
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                    throw th;
                }
                throw th;
            }
        } catch (Throwable th2) {
            if (cursorQuery != null) {
                cursorQuery.close();
                throw th2;
            }
            throw th2;
        }
        return iArr;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:32:0x00da A[Catch: all -> 0x00d4, PHI: r10
  0x00da: PHI (r10v7 android.database.Cursor) = (r10v5 android.database.Cursor), (r10v6 android.database.Cursor), (r10v8 android.database.Cursor) binds: [B:31:0x00d8, B:36:0x00e2, B:45:0x00f0] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #2 {, blocks: (B:25:0x00cf, B:32:0x00da, B:41:0x00e9, B:42:0x00ec, B:35:0x00df), top: B:53:0x0002, inners: #3 }] */
    public final synchronized o00o o(String str, String str2, String str3) {
        Cursor cursorQuery;
        o00o o00oVar;
        try {
            cursorQuery = n().query(o.o, null, "placement_id=? AND date_time=?", new String[]{str, str2}, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.getCount() > 0) {
                        o00oVar = new o00o();
                        o00oVar.m0 = new ConcurrentHashMap<>();
                        while (cursorQuery.moveToNext()) {
                            o00oVar.o = cursorQuery.getInt(cursorQuery.getColumnIndex("format"));
                            o00oVar.m = cursorQuery.getString(cursorQuery.getColumnIndex("placement_id"));
                            o00o.o oVar = new o00o.o();
                            oVar.o = cursorQuery.getString(cursorQuery.getColumnIndex("adsource_id"));
                            oVar.m = cursorQuery.getString(cursorQuery.getColumnIndex(o.oo));
                            oVar.f42228n = cursorQuery.getString(cursorQuery.getColumnIndex(o.on));
                            if (!TextUtils.equals(oVar.m, str3)) {
                                oVar.oo = 0;
                            } else {
                                oVar.oo = cursorQuery.getInt(cursorQuery.getColumnIndex(o.om));
                            }
                            o00oVar.o0 += oVar.oo;
                            if (!TextUtils.equals(oVar.f42228n, str2)) {
                                oVar.o0 = 0;
                            } else {
                                oVar.o0 = cursorQuery.getInt(cursorQuery.getColumnIndex(o.m0));
                            }
                            o00oVar.f42227n += oVar.o0;
                            long j = cursorQuery.getLong(cursorQuery.getColumnIndex("show_time"));
                            oVar.om = j;
                            if (j >= o00oVar.oo) {
                                o00oVar.oo = j;
                            }
                            o00oVar.m0.put(oVar.o, oVar);
                        }
                    } else {
                        o00oVar = null;
                    }
                } catch (Exception unused) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                } catch (OutOfMemoryError unused2) {
                    try {
                        System.gc();
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return null;
                    } catch (Throwable th) {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                            throw th;
                        }
                        throw th;
                    }
                } catch (Throwable unused3) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } else {
                o00oVar = null;
            }
            cursorQuery.close();
            cursorQuery.close();
            return o00oVar;
        } catch (Exception unused4) {
            cursorQuery = null;
        } catch (OutOfMemoryError unused5) {
            cursorQuery = null;
        } catch (Throwable unused6) {
            cursorQuery = null;
        }
    }

    private synchronized long o(int i2, String str, o00o.o oVar) {
        if (o0() == null || oVar == null) {
            return -1L;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("format", Integer.valueOf(i2));
            contentValues.put("placement_id", str);
            contentValues.put("adsource_id", oVar.o);
            contentValues.put(o.oo, oVar.m);
            contentValues.put(o.om, Integer.valueOf(oVar.oo));
            contentValues.put(o.on, oVar.f42228n);
            contentValues.put(o.m0, Integer.valueOf(oVar.o0));
            contentValues.put("show_time", Long.valueOf(oVar.om));
            Cursor cursorQuery = n().query(o.o, new String[]{"adsource_id"}, "adsource_id=?", new String[]{oVar.o}, "adsource_id", null, null);
            if (cursorQuery != null && cursorQuery.getCount() > 0) {
                cursorQuery.close();
                return o0().update(o.o, contentValues, "adsource_id = ? ", new String[]{oVar.o});
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return o0().insert(o.o, null, contentValues);
        } catch (Exception unused) {
            return -1L;
        }
    }

    private static o00o o(Cursor cursor, String str, String str2) {
        if (cursor == null || cursor.getCount() <= 0) {
            return null;
        }
        o00o o00oVar = new o00o();
        o00oVar.m0 = new ConcurrentHashMap<>();
        while (cursor.moveToNext()) {
            o00oVar.o = cursor.getInt(cursor.getColumnIndex("format"));
            o00oVar.m = cursor.getString(cursor.getColumnIndex("placement_id"));
            o00o.o oVar = new o00o.o();
            oVar.o = cursor.getString(cursor.getColumnIndex("adsource_id"));
            oVar.m = cursor.getString(cursor.getColumnIndex(o.oo));
            oVar.f42228n = cursor.getString(cursor.getColumnIndex(o.on));
            if (!TextUtils.equals(oVar.m, str2)) {
                oVar.oo = 0;
            } else {
                oVar.oo = cursor.getInt(cursor.getColumnIndex(o.om));
            }
            o00oVar.o0 += oVar.oo;
            if (!TextUtils.equals(oVar.f42228n, str)) {
                oVar.o0 = 0;
            } else {
                oVar.o0 = cursor.getInt(cursor.getColumnIndex(o.m0));
            }
            o00oVar.f42227n += oVar.o0;
            long j = cursor.getLong(cursor.getColumnIndex("show_time"));
            oVar.om = j;
            if (j >= o00oVar.oo) {
                o00oVar.oo = j;
            }
            o00oVar.m0.put(oVar.o, oVar);
        }
        return o00oVar;
    }

    public final void o(String str) {
        synchronized (this) {
            try {
                String str2 = "date_time!='" + str + "'";
                if (o0() == null) {
                } else {
                    o0().delete(o.o, str2, null);
                }
            } catch (Exception unused) {
            }
        }
    }
}
