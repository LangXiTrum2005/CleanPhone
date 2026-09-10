package com.thinkup.core.common.oo;

import android.content.ContentValues;
import android.database.Cursor;
import com.thinkup.core.common.on.o0oo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class om extends n<o0oo> {
    private static volatile om m = null;
    private static final String o = "com.thinkup.core.common.oo.om";

    public static class o {
        public static final String m = "key";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final String f42277n = "type";
        public static final String o = "sdkconfig";
        public static final String o0 = "value";
        public static final String om = "CREATE TABLE IF NOT EXISTS sdkconfig(key TEXT ,type TEXT ,lastupdatetime TEXT ,value TEXT )";
        public static final String oo = "lastupdatetime";
    }

    private om(o0 o0Var) {
        super(o0Var);
    }

    private synchronized boolean m(String str, String str2) {
        Cursor cursorQuery = n().query("sdkconfig", new String[]{"key"}, "key=? AND type=?", new String[]{str, str2}, null, null, null);
        if (cursorQuery != null && cursorQuery.getCount() > 0) {
            cursorQuery.close();
            return true;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return false;
    }

    private synchronized void n(String str, String str2) {
        List<o0oo> listN = n(str, str2, o0oo.o.o);
        if (listN == null || listN.size() <= 0) {
            o0oo o0ooVar = new o0oo();
            o0ooVar.o(str2);
            o0ooVar.o0("1");
            o0ooVar.n(o0oo.o.o);
            o0ooVar.m(str);
            o(o0ooVar);
            return;
        }
        for (o0oo o0ooVar2 : listN) {
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.parseInt(o0ooVar2.o0()) + 1);
            o0ooVar2.o0(sb.toString());
            o(o0ooVar2);
        }
    }

    public static om o(o0 o0Var) {
        if (m == null) {
            synchronized (om.class) {
                try {
                    if (m == null) {
                        m = new om(o0Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return m;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028 A[Catch: all -> 0x0020, PHI: r10
  0x0028: PHI (r10v7 android.database.Cursor) = (r10v5 android.database.Cursor), (r10v6 android.database.Cursor), (r10v8 android.database.Cursor) binds: [B:14:0x0026, B:19:0x0030, B:28:0x003e] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x001c, B:15:0x0028, B:24:0x0037, B:25:0x003a, B:18:0x002d), top: B:36:0x0002, inners: #1 }] */
    private synchronized List<o0oo> o0(String str, String str2) {
        Cursor cursorQuery;
        try {
            cursorQuery = n().query("sdkconfig", null, "key != ? and type = ?", new String[]{str, str2}, null, null, null);
            try {
                List<o0oo> listO = o(cursorQuery);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return listO;
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

    private synchronized boolean m(String str, String str2, String str3) {
        Cursor cursorQuery = n().query("sdkconfig", new String[]{"key"}, "key=? AND type=? AND lastupdatetime=?", new String[]{str, str3, str2}, null, null, null);
        if (cursorQuery != null && cursorQuery.getCount() > 0) {
            cursorQuery.close();
            return true;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return false;
    }

    public final synchronized long o(String str, String str2, String str3) {
        if (o0() == null) {
            return -1L;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("key", str);
            contentValues.put("type", str3);
            contentValues.put("value", str2);
            StringBuilder sb = new StringBuilder();
            sb.append(System.currentTimeMillis());
            contentValues.put("lastupdatetime", sb.toString());
            if (m(str, str3)) {
                return o0().update("sdkconfig", contentValues, "key = ? AND type = ?", new String[]{str, str3});
            }
            return o0().insert("sdkconfig", null, contentValues);
        } catch (Exception unused) {
            return -1L;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028 A[Catch: all -> 0x0020, PHI: r10
  0x0028: PHI (r10v7 android.database.Cursor) = (r10v5 android.database.Cursor), (r10v6 android.database.Cursor), (r10v8 android.database.Cursor) binds: [B:14:0x0026, B:19:0x0030, B:27:0x003d] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x001c, B:15:0x0028, B:23:0x0036, B:24:0x0039, B:18:0x002d), top: B:35:0x0002, inners: #1 }] */
    private synchronized List<o0oo> m(String str) {
        Cursor cursorQuery;
        try {
            cursorQuery = n().query("sdkconfig", null, "type = ?", new String[]{str}, null, null, null);
            try {
                List<o0oo> listO = o(cursorQuery);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return listO;
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

    /* JADX WARN: Code duplicated, block: B:15:0x0028 A[Catch: all -> 0x0020, PHI: r10
  0x0028: PHI (r10v7 android.database.Cursor) = (r10v5 android.database.Cursor), (r10v6 android.database.Cursor), (r10v8 android.database.Cursor) binds: [B:14:0x0026, B:19:0x0030, B:28:0x003e] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x001c, B:15:0x0028, B:24:0x0037, B:25:0x003a, B:18:0x002d), top: B:36:0x0002, inners: #1 }] */
    private synchronized List<o0oo> n(String str, String str2, String str3) {
        Cursor cursorQuery;
        try {
            cursorQuery = n().query("sdkconfig", null, "key = ? and type = ? and lastupdatetime = ?", new String[]{str, str3, str2}, null, null, null);
            try {
                List<o0oo> listO = o(cursorQuery);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return listO;
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

    private synchronized long o(o0oo o0ooVar) {
        if (o0() == null || o0ooVar == null) {
            return -1L;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("key", o0ooVar.m());
            contentValues.put("type", o0ooVar.n());
            contentValues.put("value", o0ooVar.o0());
            contentValues.put("lastupdatetime", o0ooVar.o());
            if (m(o0ooVar.m(), o0ooVar.o(), o0ooVar.n())) {
                return o0().update("sdkconfig", contentValues, "key = ? AND type = ? AND lastupdatetime = ?  ", new String[]{o0ooVar.m(), o0ooVar.n(), o0ooVar.o()});
            }
            return o0().insert("sdkconfig", null, contentValues);
        } catch (Exception unused) {
            return -1L;
        }
    }

    private synchronized List<o0oo> o(Cursor cursor) {
        if (cursor != null) {
            try {
                if (cursor.getCount() > 0) {
                    ArrayList arrayList = new ArrayList();
                    while (cursor.moveToNext()) {
                        o0oo o0ooVar = new o0oo();
                        o0ooVar.m(cursor.getString(cursor.getColumnIndex("key")));
                        o0ooVar.n(cursor.getString(cursor.getColumnIndex("type")));
                        o0ooVar.o0(cursor.getString(cursor.getColumnIndex("value")));
                        o0ooVar.o(cursor.getString(cursor.getColumnIndex("lastupdatetime")));
                        arrayList.add(o0ooVar);
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

    private synchronized void o(String str) {
        try {
            if (o0() == null) {
                return;
            }
            o0().delete("sdkconfig", "lastupdatetime< ? and type = ?", new String[]{str, o0oo.o.o});
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028 A[Catch: all -> 0x0020, PHI: r10
  0x0028: PHI (r10v7 android.database.Cursor) = (r10v5 android.database.Cursor), (r10v6 android.database.Cursor), (r10v8 android.database.Cursor) binds: [B:14:0x0026, B:19:0x0030, B:28:0x003e] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x001c, B:15:0x0028, B:24:0x0037, B:25:0x003a, B:18:0x002d), top: B:36:0x0002, inners: #1 }] */
    public final synchronized List<o0oo> o(String str, String str2) {
        Cursor cursorQuery;
        try {
            cursorQuery = n().query("sdkconfig", null, "key = ? and type = ?", new String[]{str, str2}, null, null, null);
            try {
                List<o0oo> listO = o(cursorQuery);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return listO;
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
}
