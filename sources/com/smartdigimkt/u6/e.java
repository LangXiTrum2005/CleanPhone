package com.smartdigimkt.u6;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class e extends b<com.smartdigimkt.v6.c> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f38839b = "com.smartdigimkt.u6.e";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile e f38840c;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f38841a = "sdkconfig";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f38842b = "key";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f38843c = "type";
        public static final String d = "value";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f38844e = "lastupdatetime";
        public static final String f = "CREATE TABLE IF NOT EXISTS sdkconfig(key TEXT ,type TEXT ,lastupdatetime TEXT ,value TEXT )";
    }

    public e(c cVar) {
        super(cVar);
    }

    public static e a(c cVar) {
        if (f38840c == null) {
            synchronized (e.class) {
                try {
                    if (f38840c == null) {
                        f38840c = new e(cVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f38840c;
    }

    public synchronized long b(String str, String str2, String str3) {
        if (b() == null) {
            return -1L;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("key", str);
            contentValues.put("type", str3);
            contentValues.put("value", str2);
            contentValues.put("lastupdatetime", System.currentTimeMillis() + "");
            if (b(str, str3)) {
                return b().update("sdkconfig", contentValues, "key = ? AND type = ?", new String[]{str, str3});
            }
            return b().insert("sdkconfig", null, contentValues);
        } catch (Exception unused) {
            return -1L;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x003b A[Catch: all -> 0x0020, PHI: r10
  0x003b: PHI (r10v7 android.database.Cursor) = (r10v5 android.database.Cursor), (r10v6 android.database.Cursor), (r10v8 android.database.Cursor) binds: [B:14:0x0026, B:18:0x002d, B:26:0x0039] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {, blocks: (B:7:0x001c, B:27:0x003b, B:23:0x0034, B:24:0x0037, B:17:0x002a), top: B:37:0x0002, inners: #0 }] */
    public synchronized List<com.smartdigimkt.v6.c> c(String str, String str2, String str3) {
        Cursor cursorQuery;
        try {
            cursorQuery = a().query("sdkconfig", null, "key = ? and type = ? and lastupdatetime = ?", new String[]{str, str3, str2}, null, null, null);
            try {
                List<com.smartdigimkt.v6.c> listA = a(cursorQuery);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return listA;
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
                    if (cursorQuery == null) {
                        throw th;
                    }
                    cursorQuery.close();
                    throw th;
                }
            } catch (Throwable unused3) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return null;
            }
        } catch (Exception unused4) {
            cursorQuery = null;
        } catch (OutOfMemoryError unused5) {
            cursorQuery = null;
        } catch (Throwable unused6) {
            cursorQuery = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x003b A[Catch: all -> 0x0020, PHI: r10
  0x003b: PHI (r10v7 android.database.Cursor) = (r10v5 android.database.Cursor), (r10v6 android.database.Cursor), (r10v8 android.database.Cursor) binds: [B:14:0x0026, B:18:0x002d, B:26:0x0039] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {, blocks: (B:7:0x001c, B:27:0x003b, B:23:0x0034, B:24:0x0037, B:17:0x002a), top: B:37:0x0002, inners: #0 }] */
    public synchronized List<com.smartdigimkt.v6.c> d(String str, String str2) {
        Cursor cursorQuery;
        try {
            cursorQuery = a().query("sdkconfig", null, "key != ? and type = ?", new String[]{str, str2}, null, null, null);
            try {
                List<com.smartdigimkt.v6.c> listA = a(cursorQuery);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return listA;
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
                    if (cursorQuery == null) {
                        throw th;
                    }
                    cursorQuery.close();
                    throw th;
                }
            } catch (Throwable unused3) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return null;
            }
        } catch (Exception unused4) {
            cursorQuery = null;
        } catch (OutOfMemoryError unused5) {
            cursorQuery = null;
        } catch (Throwable unused6) {
            cursorQuery = null;
        }
    }

    public synchronized long a(com.smartdigimkt.v6.c cVar) {
        if (b() == null || cVar == null) {
            return -1L;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("key", cVar.a());
            contentValues.put("type", cVar.b());
            contentValues.put("value", cVar.d());
            contentValues.put("lastupdatetime", cVar.c());
            if (a(cVar.a(), cVar.c(), cVar.b())) {
                return b().update("sdkconfig", contentValues, "key = ? AND type = ? AND lastupdatetime = ?  ", new String[]{cVar.a(), cVar.b(), cVar.c()});
            }
            return b().insert("sdkconfig", null, contentValues);
        } catch (Exception unused) {
            return -1L;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x003b A[Catch: all -> 0x0020, PHI: r10
  0x003b: PHI (r10v7 android.database.Cursor) = (r10v5 android.database.Cursor), (r10v6 android.database.Cursor), (r10v8 android.database.Cursor) binds: [B:14:0x0026, B:18:0x002d, B:26:0x0039] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {, blocks: (B:7:0x001c, B:27:0x003b, B:23:0x0034, B:24:0x0037, B:17:0x002a), top: B:37:0x0002, inners: #0 }] */
    public synchronized List<com.smartdigimkt.v6.c> c(String str, String str2) {
        Cursor cursorQuery;
        try {
            cursorQuery = a().query("sdkconfig", null, "key = ? and type = ?", new String[]{str, str2}, null, null, null);
            try {
                List<com.smartdigimkt.v6.c> listA = a(cursorQuery);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return listA;
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
        } catch (Exception unused4) {
            cursorQuery = null;
        } catch (OutOfMemoryError unused5) {
            cursorQuery = null;
        } catch (Throwable unused6) {
            cursorQuery = null;
        }
    }

    public synchronized boolean b(String str, String str2) {
        Cursor cursorQuery = a().query("sdkconfig", new String[]{"key"}, "key=? AND type=?", new String[]{str, str2}, null, null, null);
        if (cursorQuery != null && cursorQuery.getCount() > 0) {
            cursorQuery.close();
            return true;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x003a A[Catch: all -> 0x0020, PHI: r10
  0x003a: PHI (r10v7 android.database.Cursor) = (r10v5 android.database.Cursor), (r10v6 android.database.Cursor), (r10v8 android.database.Cursor) binds: [B:14:0x0026, B:18:0x002d, B:25:0x0038] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {, blocks: (B:7:0x001c, B:26:0x003a, B:22:0x0033, B:23:0x0036, B:17:0x002a), top: B:36:0x0002, inners: #0 }] */
    public synchronized List<com.smartdigimkt.v6.c> b(String str) {
        Cursor cursorQuery;
        try {
            cursorQuery = a().query("sdkconfig", null, "type = ?", new String[]{str}, null, null, null);
            try {
                List<com.smartdigimkt.v6.c> listA = a(cursorQuery);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return listA;
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
                    }
                    throw th;
                }
            } catch (Throwable unused3) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return null;
            }
        } catch (Exception unused4) {
            cursorQuery = null;
        } catch (OutOfMemoryError unused5) {
            cursorQuery = null;
        } catch (Throwable unused6) {
            cursorQuery = null;
        }
    }

    public synchronized boolean a(String str, String str2, String str3) {
        Cursor cursorQuery = a().query("sdkconfig", new String[]{"key"}, "key=? AND type=? AND lastupdatetime=?", new String[]{str, str3, str2}, null, null, null);
        if (cursorQuery != null && cursorQuery.getCount() > 0) {
            cursorQuery.close();
            return true;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return false;
    }

    public synchronized void a(String str, String str2) {
        try {
            List<com.smartdigimkt.v6.c> listC = c(str, str2, com.smartdigimkt.v6.c.a.f39180a);
            if (listC != null && listC.size() > 0) {
                for (com.smartdigimkt.v6.c cVar : listC) {
                    cVar.d((Integer.parseInt(cVar.d()) + 1) + "");
                    a(cVar);
                }
            } else {
                com.smartdigimkt.v6.c cVar2 = new com.smartdigimkt.v6.c();
                cVar2.c(str2);
                cVar2.d("1");
                cVar2.b(com.smartdigimkt.v6.c.a.f39180a);
                cVar2.a(str);
                a(cVar2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized List<com.smartdigimkt.v6.c> a(Cursor cursor) {
        if (cursor != null) {
            try {
                if (cursor.getCount() > 0) {
                    ArrayList arrayList = new ArrayList();
                    while (cursor.moveToNext()) {
                        com.smartdigimkt.v6.c cVar = new com.smartdigimkt.v6.c();
                        cVar.a(cursor.getString(cursor.getColumnIndex("key")));
                        cVar.b(cursor.getString(cursor.getColumnIndex("type")));
                        cVar.d(cursor.getString(cursor.getColumnIndex("value")));
                        cVar.c(cursor.getString(cursor.getColumnIndex("lastupdatetime")));
                        arrayList.add(cVar);
                    }
                    cursor.close();
                    return arrayList;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return null;
    }

    public synchronized void a(String str) {
        try {
            if (b() == null) {
            } else {
                b().delete("sdkconfig", "lastupdatetime< ? and type = ?", new String[]{str, com.smartdigimkt.v6.c.a.f39180a});
            }
        } catch (Exception unused) {
        }
    }
}
