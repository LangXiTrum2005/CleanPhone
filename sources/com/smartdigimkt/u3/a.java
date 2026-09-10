package com.smartdigimkt.u3;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static a f38799b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f38800a;

    /* JADX INFO: renamed from: com.smartdigimkt.u3.a$a, reason: collision with other inner class name */
    public static class C0625a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f38801a = "my_offer_cap_pacing";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f38802b = "offer_id";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f38803c = "offer_cap";
        public static final String d = "offer_pacing";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f38804e = "show_num";
        public static final String f = "show_time";
        public static final String g = "record_date";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f38805h = "CREATE TABLE IF NOT EXISTS my_offer_cap_pacing (offer_id TEXT,offer_cap INTEGER,offer_pacing INTEGER,show_num INTEGER,show_time INTEGER,record_date INTEGER )";
    }

    private a(Context context) {
        this.f38800a = context;
    }

    public static a a(Context context) {
        if (f38799b == null) {
            f38799b = new a(context);
        }
        return f38799b;
    }

    public synchronized boolean b(String str) {
        Cursor cursorQuery = c.a(this.f38800a).getReadableDatabase().query(C0625a.f38801a, new String[]{"offer_id"}, "offer_id = ?", new String[]{str}, null, null, null);
        if (cursorQuery != null && cursorQuery.getCount() > 0) {
            cursorQuery.close();
            return true;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004e A[Catch: all -> 0x0033, PHI: r11
  0x004e: PHI (r11v8 android.database.Cursor) = 
  (r11v5 android.database.Cursor)
  (r11v6 android.database.Cursor)
  (r11v7 android.database.Cursor)
  (r11v9 android.database.Cursor)
 binds: [B:17:0x003a, B:21:0x0041, B:28:0x004c, B:14:0x0036] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:9:0x002e, B:29:0x004e, B:25:0x0047, B:26:0x004a, B:20:0x003e), top: B:37:0x0002, inners: #1 }] */
    public synchronized com.smartdigimkt.v3.c c(String str) {
        Cursor cursorQuery;
        try {
            cursorQuery = c.a(this.f38800a).getReadableDatabase().query(C0625a.f38801a, null, "offer_id = ?", new String[]{str}, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.getCount() > 0) {
                        cursorQuery.moveToNext();
                        com.smartdigimkt.v3.c cVarA = a(cursorQuery);
                        cursorQuery.close();
                        cursorQuery.close();
                        return cVarA;
                    }
                } catch (Exception unused) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } catch (OutOfMemoryError unused2) {
                    try {
                        System.gc();
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    } catch (Throwable th) {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        throw th;
                    }
                } catch (Throwable unused3) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } catch (Exception unused4) {
            cursorQuery = null;
        } catch (OutOfMemoryError unused5) {
            cursorQuery = null;
        } catch (Throwable unused6) {
            cursorQuery = null;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x005c A[Catch: all -> 0x0041, PHI: r11
  0x005c: PHI (r11v8 android.database.Cursor) = 
  (r11v5 android.database.Cursor)
  (r11v6 android.database.Cursor)
  (r11v7 android.database.Cursor)
  (r11v9 android.database.Cursor)
 binds: [B:21:0x0048, B:25:0x004f, B:32:0x005a, B:18:0x0044] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:13:0x003c, B:33:0x005c, B:29:0x0055, B:30:0x0058, B:24:0x004c), top: B:41:0x0002, inners: #1 }] */
    public synchronized List<com.smartdigimkt.v3.c> d(String str) {
        Cursor cursorQuery;
        try {
            cursorQuery = c.a(this.f38800a).getReadableDatabase().query(C0625a.f38801a, null, "offer_cap <= show_num AND record_date = ? AND offer_cap  >= ?", new String[]{str, "0"}, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.getCount() > 0) {
                        ArrayList arrayList = new ArrayList();
                        while (cursorQuery.moveToNext()) {
                            arrayList.add(a(cursorQuery));
                        }
                        cursorQuery.close();
                        cursorQuery.close();
                        return arrayList;
                    }
                } catch (Exception unused) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } catch (OutOfMemoryError unused2) {
                    try {
                        System.gc();
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    } catch (Throwable th) {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        throw th;
                    }
                } catch (Throwable unused3) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } catch (Exception unused4) {
            cursorQuery = null;
        } catch (OutOfMemoryError unused5) {
            cursorQuery = null;
        } catch (Throwable unused6) {
            cursorQuery = null;
        }
        return null;
    }

    public synchronized void a(String str) {
        synchronized (this) {
            try {
                String str2 = "record_date != '" + str + "'";
                if (c.a(this.f38800a).getWritableDatabase() == null) {
                } else {
                    c.a(this.f38800a).getWritableDatabase().delete(C0625a.f38801a, str2, null);
                }
            } catch (Exception unused) {
            }
        }
    }

    public synchronized long a(com.smartdigimkt.v3.c cVar) {
        synchronized (this) {
            if (cVar == null) {
                return 0L;
            }
            try {
                if (c.a(this.f38800a).getWritableDatabase() == null) {
                    return -1L;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("offer_id", cVar.f39080a);
                contentValues.put(C0625a.f38804e, Integer.valueOf(cVar.d));
                contentValues.put("show_time", Long.valueOf(cVar.f39083e));
                contentValues.put(C0625a.g, cVar.f);
                contentValues.put(C0625a.f38803c, Integer.valueOf(cVar.f39081b));
                contentValues.put(C0625a.d, Long.valueOf(cVar.f39082c));
                if (b(cVar.f39080a)) {
                    return c.a(this.f38800a).getWritableDatabase().update(C0625a.f38801a, contentValues, "offer_id = '" + cVar.f39080a + "'", null);
                }
                return c.a(this.f38800a).getWritableDatabase().insert(C0625a.f38801a, null, contentValues);
            } catch (Exception e2) {
                e2.printStackTrace();
                return -1L;
            }
        }
    }

    private com.smartdigimkt.v3.c a(Cursor cursor) {
        com.smartdigimkt.v3.c cVar = new com.smartdigimkt.v3.c();
        cVar.f39080a = cursor.getString(cursor.getColumnIndex("offer_id"));
        cVar.d = cursor.getInt(cursor.getColumnIndex(C0625a.f38804e));
        cVar.f39083e = cursor.getLong(cursor.getColumnIndex("show_time"));
        cVar.f = cursor.getString(cursor.getColumnIndex(C0625a.g));
        cVar.f39081b = cursor.getInt(cursor.getColumnIndex(C0625a.f38803c));
        cVar.f39082c = cursor.getLong(cursor.getColumnIndex(C0625a.d));
        return cVar;
    }
}
