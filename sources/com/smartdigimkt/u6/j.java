package com.smartdigimkt.u6;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class j extends b<com.smartdigimkt.v6.b> {
    private static final String d = "com.smartdigimkt.u6.j";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile j f38887e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f38888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f38889c;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f38890a = "inspect_info";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f38891b = "inspect_id";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f38892c = "inspect_result";
        public static final String d = "inspect_name";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f38893e = "update_time";
        public static final String f = "CREATE TABLE IF NOT EXISTS inspect_info(inspect_id TEXT, inspect_result INTEGER, inspect_name TEXT, update_time INTEGER )";
    }

    public j(c cVar) {
        super(cVar);
        this.f38888b = 500;
        this.f38889c = -1627869184;
    }

    public static j a(c cVar) {
        if (f38887e == null) {
            synchronized (j.class) {
                try {
                    if (f38887e == null) {
                        f38887e = new j(cVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f38887e;
    }

    public synchronized void b(String str) {
        try {
            b().delete("inspect_info", "inspect_id = ? ", new String[]{str});
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0055 A[Catch: all -> 0x0050, PHI: r0 r1
  0x0055: PHI (r0v7 android.database.Cursor) = 
  (r0v1 android.database.Cursor)
  (r0v4 android.database.Cursor)
  (r0v5 android.database.Cursor)
  (r0v13 android.database.Cursor)
 binds: [B:13:0x003c, B:17:0x0044, B:25:0x0053, B:11:0x0039] A[DONT_GENERATE, DONT_INLINE]
  0x0055: PHI (r1v7 long) = (r1v1 long), (r1v5 long), (r1v6 long), (r1v13 long) binds: [B:13:0x003c, B:17:0x0044, B:25:0x0053, B:11:0x0039] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0050, blocks: (B:27:0x0058, B:26:0x0055, B:21:0x004c, B:24:0x0052, B:4:0x0004, B:6:0x001d, B:8:0x0025, B:15:0x003f), top: B:41:0x0004, inners: #2, #3, #6, #5 }] */
    public synchronized void c() {
        Cursor cursorQuery = null;
        long j = -1;
        try {
            try {
                cursorQuery = a().query("inspect_info", null, null, null, null, null, "update_time DESC", String.valueOf(this.f38888b));
                if (cursorQuery != null && cursorQuery.getCount() >= this.f38888b) {
                    cursorQuery.moveToLast();
                    j = cursorQuery.getLong(cursorQuery.getColumnIndex("update_time"));
                    cursorQuery.close();
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (Exception unused) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (OutOfMemoryError unused2) {
                long j2 = j;
                Cursor cursor = cursorQuery;
                try {
                    System.gc();
                    if (cursor != null) {
                        cursorQuery = cursor;
                        j = j2;
                        cursorQuery.close();
                    } else {
                        j = j2;
                    }
                } catch (Throwable th) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable unused3) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - ((long) this.f38889c);
            if (j == 0 || j > jCurrentTimeMillis) {
                j = jCurrentTimeMillis;
            }
            if (j > 0) {
                try {
                    b().delete("inspect_info", "update_time<?", new String[]{String.valueOf(j)});
                } catch (Throwable unused4) {
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x008c A[Catch: all -> 0x0072, PHI: r1
  0x008c: PHI (r1v6 android.database.Cursor) = 
  (r1v3 android.database.Cursor)
  (r1v4 android.database.Cursor)
  (r1v5 android.database.Cursor)
  (r1v8 android.database.Cursor)
 binds: [B:25:0x0078, B:29:0x007f, B:36:0x008a, B:22:0x0074] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {, blocks: (B:17:0x006d, B:37:0x008c, B:33:0x0085, B:34:0x0088, B:28:0x007c), top: B:50:0x0002, inners: #1 }] */
    public synchronized List<com.smartdigimkt.v6.b> d() {
        Cursor cursorQuery;
        try {
            cursorQuery = a().query("inspect_info", null, null, null, null, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.getCount() > 0) {
                        ArrayList arrayList = new ArrayList();
                        while (cursorQuery.moveToNext()) {
                            com.smartdigimkt.v6.b bVar = new com.smartdigimkt.v6.b();
                            String string = cursorQuery.getString(cursorQuery.getColumnIndex("inspect_id"));
                            if (!TextUtils.isEmpty(string)) {
                                int i2 = cursorQuery.getInt(cursorQuery.getColumnIndex("inspect_result"));
                                String string2 = cursorQuery.getString(cursorQuery.getColumnIndex(a.d));
                                long j = cursorQuery.getLong(cursorQuery.getColumnIndex("update_time"));
                                bVar.b(string);
                                bVar.a(i2);
                                bVar.a(string2);
                                bVar.a(j);
                                arrayList.add(bVar);
                            }
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

    public synchronized long a(String str, boolean z2, String str2) {
        if (b() == null) {
            return -1L;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("inspect_id", str);
            contentValues.put(a.d, com.smartdigimkt.n8.b.b(str2));
            contentValues.put("inspect_result", Integer.valueOf(z2 ? 1 : 2));
            contentValues.put("update_time", Long.valueOf(System.currentTimeMillis()));
            if (a(str)) {
                return b().update("inspect_info", contentValues, "inspect_id = ? ", new String[]{str});
            }
            return b().insert("inspect_info", null, contentValues);
        } catch (Exception unused) {
            return -1L;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0039 A[Catch: all -> 0x0030, PHI: r10
  0x0039: PHI (r10v4 android.database.Cursor) = (r10v3 android.database.Cursor), (r10v5 android.database.Cursor) binds: [B:21:0x0037, B:18:0x0033] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #0 {all -> 0x0030, blocks: (B:12:0x002a, B:22:0x0039), top: B:28:0x0002 }] */
    private synchronized boolean a(String str) {
        Cursor cursorQuery;
        try {
            if (str == null) {
                return false;
            }
            try {
                cursorQuery = a().query("inspect_info", new String[]{"inspect_id"}, "inspect_id=?", new String[]{str}, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.getCount() > 0) {
                            cursorQuery.close();
                            cursorQuery.close();
                            return true;
                        }
                    } catch (Throwable unused) {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    }
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (Throwable unused2) {
                cursorQuery = null;
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }
}
