package com.smartdigimkt.u6;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class l extends com.smartdigimkt.u6.b<com.smartdigimkt.w6.j> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static l f38904c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f38905b;

    public class a implements Runnable {
        final /* synthetic */ String X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ int f38906Y;
        final /* synthetic */ String Z;

        public a(String str, int i2, String str2) {
            this.X = str;
            this.f38906Y = i2;
            this.Z = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (l.this.b(this.X, this.f38906Y, this.Z)) {
                return;
            }
            l.this.a(this.X, this.f38906Y, this.Z);
        }
    }

    public class b implements Runnable {
        final /* synthetic */ com.smartdigimkt.w6.j X;

        public b(com.smartdigimkt.w6.j jVar) {
            this.X = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("type", Integer.valueOf(this.X.d()));
                contentValues.put("unit_id", this.X.e());
                contentValues.put("click_count", Integer.valueOf(this.X.a()));
                contentValues.put("show_count", Integer.valueOf(this.X.c()));
                contentValues.put("expire_time", Long.valueOf(this.X.b()));
                String unused = l.this.f38905b;
                l.this.b().update("offer_action_record", contentValues, "type = ? and unit_id = ?", new String[]{String.valueOf(this.X.d()), this.X.e()});
            } catch (Exception unused2) {
            }
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f38908a = "offer_action_record";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f38909b = "adsource_id";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f38910c = "type";
        public static final String d = "unit_id";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f38911e = "click_count";
        public static final String f = "show_count";
        public static final String g = "expire_time";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f38912h = "CREATE TABLE IF NOT EXISTS offer_action_record(adsource_id TEXT ,type INTEGER ,unit_id TEXT ,click_count INTEGER ,show_count INTEGER ,expire_time INTEGER )";
    }

    private l(com.smartdigimkt.u6.c cVar) {
        super(cVar);
        this.f38905b = l.class.getName();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0089 A[Catch: all -> 0x0083, PHI: r1
  0x0089: PHI (r1v5 android.database.Cursor) = 
  (r1v2 android.database.Cursor)
  (r1v3 android.database.Cursor)
  (r1v4 android.database.Cursor)
  (r1v6 android.database.Cursor)
 binds: [B:15:0x0072, B:18:0x0078, B:27:0x0087, B:13:0x006f] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #2 {all -> 0x0083, blocks: (B:3:0x0001, B:28:0x0089, B:23:0x007f, B:26:0x0086, B:17:0x0075), top: B:33:0x0001, inners: #4 }] */
    public synchronized List<com.smartdigimkt.w6.j> b(int i2) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Cursor cursorQuery = null;
            try {
                try {
                    cursorQuery = a().query("offer_action_record", null, "type = ? and expire_time > ?", new String[]{String.valueOf(i2), String.valueOf(System.currentTimeMillis())}, null, null, null);
                    if (cursorQuery != null && cursorQuery.getCount() > 0) {
                        while (cursorQuery.moveToNext()) {
                            com.smartdigimkt.w6.j jVar = new com.smartdigimkt.w6.j(i2, cursorQuery.getString(cursorQuery.getColumnIndex("unit_id")));
                            jVar.a(cursorQuery.getInt(cursorQuery.getColumnIndex("click_count")));
                            jVar.b(cursorQuery.getInt(cursorQuery.getColumnIndex("show_count")));
                            jVar.a(cursorQuery.getLong(cursorQuery.getColumnIndex("expire_time")));
                            arrayList.add(jVar);
                        }
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } catch (Exception unused) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } catch (OutOfMemoryError unused2) {
                    System.gc();
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } catch (Throwable unused3) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                }
            } catch (Throwable th) {
                if (cursorQuery == null) {
                    throw th;
                }
                cursorQuery.close();
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    public synchronized void c(String str, int i2, String str2) {
        com.smartdigimkt.l7.b.a().g(new a(str, i2, str2));
    }

    public String c(int i2) {
        if (i2 < 1) {
            throw new RuntimeException("No placeholders");
        }
        StringBuilder sb = new StringBuilder((i2 * 2) - 1);
        sb.append("?");
        for (int i3 = 1; i3 < i2; i3++) {
            sb.append(",?");
        }
        return sb.toString();
    }

    public static l a(com.smartdigimkt.u6.c cVar) {
        if (f38904c == null) {
            synchronized (l.class) {
                try {
                    if (f38904c == null) {
                        f38904c = new l(cVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f38904c;
    }

    public synchronized com.smartdigimkt.w6.j a(int i2, com.smartdigimkt.w6.j jVar, String str, int i3, int i4) {
        if (jVar == null) {
            try {
                jVar = b(i2, str);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (jVar != null) {
            jVar.a(jVar.a() + i3);
            jVar.b(jVar.c() + i4);
            a(jVar);
        }
        return jVar;
    }

    public synchronized com.smartdigimkt.w6.j a(int i2, com.smartdigimkt.w6.j jVar, String str, long j) {
        if (jVar == null) {
            try {
                jVar = b(i2, str);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (jVar != null) {
            jVar.a(j);
            a(jVar);
        }
        return jVar;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0079 A[Catch: all -> 0x0059, PHI: r1
  0x0079: PHI (r1v5 android.database.Cursor) = (r1v3 android.database.Cursor), (r1v4 android.database.Cursor), (r1v6 android.database.Cursor) binds: [B:19:0x0064, B:23:0x006b, B:31:0x0077] A[DONT_GENERATE, DONT_INLINE], TryCatch #4 {, blocks: (B:9:0x0054, B:15:0x005e, B:32:0x0079, B:28:0x0072, B:29:0x0075, B:22:0x0068), top: B:40:0x0002, inners: #7 }] */
    public synchronized com.smartdigimkt.w6.j b(int i2, String str) {
        Cursor cursorQuery;
        try {
            cursorQuery = a().query("offer_action_record", null, "type=? and unit_id = ?", new String[]{String.valueOf(i2), str}, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.getCount() > 0) {
                        cursorQuery.moveToNext();
                        com.smartdigimkt.w6.j jVar = new com.smartdigimkt.w6.j(i2, str);
                        jVar.a(cursorQuery.getInt(cursorQuery.getColumnIndex("click_count")));
                        jVar.b(cursorQuery.getInt(cursorQuery.getColumnIndex("show_count")));
                        jVar.a(cursorQuery.getLong(cursorQuery.getColumnIndex("expire_time")));
                        cursorQuery.close();
                        cursorQuery.close();
                        return jVar;
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
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (Exception unused4) {
            cursorQuery = null;
        } catch (OutOfMemoryError unused5) {
            cursorQuery = null;
        } catch (Throwable unused6) {
            cursorQuery = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0081 A[Catch: all -> 0x007b, PHI: r1
  0x0081: PHI (r1v5 android.database.Cursor) = 
  (r1v2 android.database.Cursor)
  (r1v3 android.database.Cursor)
  (r1v4 android.database.Cursor)
  (r1v6 android.database.Cursor)
 binds: [B:15:0x006a, B:18:0x0070, B:27:0x007f, B:13:0x0067] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #4 {all -> 0x007b, blocks: (B:3:0x0001, B:28:0x0081, B:23:0x0077, B:26:0x007e, B:17:0x006d), top: B:33:0x0001, inners: #1 }] */
    public synchronized List<com.smartdigimkt.w6.j> a(int i2) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Cursor cursorQuery = null;
            try {
                try {
                    cursorQuery = a().query("offer_action_record", null, "type = ?", new String[]{String.valueOf(i2)}, null, null, null);
                    if (cursorQuery != null && cursorQuery.getCount() > 0) {
                        while (cursorQuery.moveToNext()) {
                            com.smartdigimkt.w6.j jVar = new com.smartdigimkt.w6.j(i2, cursorQuery.getString(cursorQuery.getColumnIndex("unit_id")));
                            jVar.a(cursorQuery.getInt(cursorQuery.getColumnIndex("click_count")));
                            jVar.b(cursorQuery.getInt(cursorQuery.getColumnIndex("show_count")));
                            jVar.a(cursorQuery.getLong(cursorQuery.getColumnIndex("expire_time")));
                            arrayList.add(jVar);
                        }
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } catch (Exception unused) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } catch (OutOfMemoryError unused2) {
                    System.gc();
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } catch (Throwable unused3) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                }
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                    throw th;
                }
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00be A[Catch: all -> 0x00b8, PHI: r3
  0x00be: PHI (r3v6 android.database.Cursor) = 
  (r3v3 android.database.Cursor)
  (r3v4 android.database.Cursor)
  (r3v5 android.database.Cursor)
  (r3v7 android.database.Cursor)
 binds: [B:16:0x00a7, B:19:0x00ad, B:28:0x00bc, B:14:0x00a4] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #4 {all -> 0x00b8, blocks: (B:4:0x0005, B:29:0x00be, B:24:0x00b4, B:27:0x00bb, B:18:0x00aa), top: B:34:0x0005, inners: #0 }] */
    public synchronized List<com.smartdigimkt.w6.j> a(List<String> list, int i2) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            c(list.size());
            Cursor cursorQuery = null;
            try {
                try {
                    String[] strArr = new String[list.size() + 2];
                    list.toArray(strArr);
                    strArr[list.size()] = String.valueOf(i2);
                    strArr[list.size() + 1] = String.valueOf(System.currentTimeMillis());
                    cursorQuery = a().query("offer_action_record", null, "adsource_id IN (" + c(list.size()) + ") and type = ? and expire_time > ?", strArr, null, null, null);
                    if (cursorQuery != null && cursorQuery.getCount() > 0) {
                        while (cursorQuery.moveToNext()) {
                            com.smartdigimkt.w6.j jVar = new com.smartdigimkt.w6.j(i2, cursorQuery.getString(cursorQuery.getColumnIndex("unit_id")));
                            jVar.a(cursorQuery.getInt(cursorQuery.getColumnIndex("click_count")));
                            jVar.b(cursorQuery.getInt(cursorQuery.getColumnIndex("show_count")));
                            jVar.a(cursorQuery.getLong(cursorQuery.getColumnIndex("expire_time")));
                            arrayList.add(jVar);
                        }
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } catch (Exception unused) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } catch (OutOfMemoryError unused2) {
                    System.gc();
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } catch (Throwable unused3) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                }
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                    throw th;
                }
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(String str, int i2, String str2) {
        Cursor cursorQuery = a().query("offer_action_record", null, "adsource_id = ? and type = ? and unit_id = ?", new String[]{str, String.valueOf(i2), str2}, null, null, null);
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

    public synchronized long a(com.smartdigimkt.w6.j jVar) {
        if (b() != null && jVar != null) {
            com.smartdigimkt.l7.b.a().g(new b(jVar));
            return -1L;
        }
        return -1L;
    }

    public synchronized long a(String str, int i2, String str2) {
        try {
            if (b() == null) {
                return -1L;
            }
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("adsource_id", str);
                contentValues.put("type", Integer.valueOf(i2));
                contentValues.put("unit_id", str2);
                com.smartdigimkt.w6.j jVarB = b(i2, str2);
                if (jVarB != null) {
                    contentValues.put("click_count", Integer.valueOf(jVarB.a()));
                    contentValues.put("show_count", Integer.valueOf(jVarB.c()));
                    contentValues.put("expire_time", Long.valueOf(jVarB.b()));
                } else {
                    contentValues.put("click_count", (Integer) 0);
                    contentValues.put("show_count", (Integer) 0);
                    contentValues.put("expire_time", (Integer) (-1));
                }
                return b().insert("offer_action_record", null, contentValues);
            } catch (Exception unused) {
                return -1L;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private boolean a(int i2, String str) {
        Cursor cursorQuery = a().query("offer_action_record", null, "type = ? and unit_id = ?", new String[]{String.valueOf(i2), str}, null, null, null);
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
}
