package com.thinkup.core.common.oo;

import android.content.ContentValues;
import android.database.Cursor;
import android.provider.BaseColumns;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class o extends n<com.thinkup.core.common.on.o0> {
    public static final String m = "2";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f42270n = "3";
    public static final String o = "1";
    public static final String o0 = "4";
    private static volatile o on;
    private final String om;

    /* JADX INFO: renamed from: com.thinkup.core.common.oo.o$o, reason: collision with other inner class name */
    public static class C0684o implements BaseColumns {
        public static final String m = "event_type";
        public static final String m0 = "source_id";
        public static final String mm = "month";
        public static final String mn = "day";
        public static final String mo = "extra";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final String f42273n = "app";
        public static final String n0 = "hour";
        public static final String nm = "req_num";
        public static final String nn = "rule_id";
        public static final String no = "time_stamp";
        public static final String o = "ad_frequency";
        public static final String o0 = "format";
        public static final String o00 = "fail_count";
        public static final String o0m = "CREATE TABLE IF NOT EXISTS ad_frequency(_id INTEGER PRIMARY KEY AUTOINCREMENT ,event_type TEXT ,app TEXT ,network_id TEXT ,format TEXT ,network_format TEXT ,placement_id TEXT ,source_id TEXT ,extra TEXT ,month INTEGER ,day INTEGER ,hour INTEGER , req_num INTEGER , time_stamp INTEGER)";
        public static final String o0n = "ALTER TABLE ad_frequency ADD COLUMN rule_id INTEGER;";
        public static final String o0o = "next_req_timestamp";
        public static final String om = "network_format";
        public static final String on = "placement_id";
        public static final String oo = "network_id";
        public static final String oo0 = "ALTER TABLE ad_frequency ADD COLUMN fail_count INTEGER;";
        public static final String ooo = "ALTER TABLE ad_frequency ADD COLUMN next_req_timestamp INTEGER;";
    }

    private o(o0 o0Var) {
        super(o0Var);
        this.om = "AdFrequencyDao";
    }

    public static o o(o0 o0Var) {
        if (on == null) {
            synchronized (o.class) {
                try {
                    if (on == null) {
                        on = new o(o0Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return on;
    }

    public final com.thinkup.core.common.on.o0 n(String str, String str2) {
        com.thinkup.core.common.on.o0 o0Var;
        Cursor cursorRawQuery;
        synchronized (this) {
            o0Var = null;
            try {
                cursorRawQuery = n().rawQuery(String.format("select * from ad_frequency where event_type = '2' and %s = '" + str + "' order by time_stamp DESC limit 1", str2), null);
                try {
                    List<com.thinkup.core.common.on.o0> listO = o(cursorRawQuery);
                    o0Var = listO.isEmpty() ? null : listO.get(0);
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    try {
                        th.printStackTrace();
                        if (cursorRawQuery != null) {
                        }
                        return o0Var;
                    } catch (Throwable th2) {
                        if (cursorRawQuery != null) {
                            cursorRawQuery.close();
                        }
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                cursorRawQuery = null;
            }
        }
        return o0Var;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007b A[Catch: all -> 0x006a, TRY_ENTER, TryCatch #3 {, blocks: (B:13:0x0066, B:27:0x007f, B:25:0x007b, B:32:0x0085, B:33:0x0088, B:23:0x0076), top: B:42:0x0004, inners: #1 }] */
    public final com.thinkup.core.common.on.o0 o0(String str, String str2) {
        Throwable th;
        com.thinkup.core.common.on.o0 o0Var;
        com.thinkup.core.common.on.o0 o0Var2;
        synchronized (this) {
            Cursor cursor = null;
            o0Var2 = null;
            try {
                try {
                    Cursor cursorQuery = n().query(C0684o.o, null, "event_type = ? and " + str2 + " = ?", new String[]{"1", str}, null, null, null, "1");
                    while (cursorQuery.moveToNext()) {
                        try {
                            String str3 = str2;
                            o0Var2 = new com.thinkup.core.common.on.o0(cursorQuery.getString(cursorQuery.getColumnIndex(C0684o.m)), cursorQuery.getString(cursorQuery.getColumnIndex(str2)), str3, cursorQuery.getLong(cursorQuery.getColumnIndex(C0684o.no)), cursorQuery.getInt(cursorQuery.getColumnIndex(C0684o.nm)));
                            str2 = str3;
                        } catch (Throwable th2) {
                            th = th2;
                            com.thinkup.core.common.on.o0 o0Var3 = o0Var2;
                            cursor = cursorQuery;
                            o0Var = o0Var3;
                            try {
                                th.printStackTrace();
                                if (cursor != null) {
                                    cursor.close();
                                }
                                o0Var2 = o0Var;
                            } catch (Throwable th3) {
                                if (cursor == null) {
                                    throw th3;
                                }
                                cursor.close();
                                throw th3;
                            }
                        }
                    }
                    cursorQuery.close();
                } catch (Throwable th4) {
                    th = th4;
                    o0Var = null;
                    th.printStackTrace();
                    if (cursor != null) {
                        cursor.close();
                    }
                    o0Var2 = o0Var;
                    return o0Var2;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
        return o0Var2;
    }

    public final void oo(String str, String str2) {
        synchronized (this) {
            try {
                if (o0() == null) {
                    return;
                }
                o0().delete(C0684o.o, "event_type = ? and month != ? or day != ?", new String[]{"2", str, str2});
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void m(com.thinkup.core.common.on.o0 o0Var) {
        synchronized (this) {
            try {
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(C0684o.m, "2");
                    contentValues.put("app", o0Var.mm());
                    contentValues.put("placement_id", o0Var.o0());
                    contentValues.put("network_id", o0Var.m());
                    contentValues.put("format", o0Var.n());
                    contentValues.put(C0684o.om, o0Var.mn());
                    contentValues.put(C0684o.m0, o0Var.oo());
                    contentValues.put(C0684o.mm, Integer.valueOf(o0Var.om()));
                    contentValues.put(C0684o.mn, Integer.valueOf(o0Var.on()));
                    contentValues.put(C0684o.n0, Integer.valueOf(o0Var.m0()));
                    contentValues.put(C0684o.no, Long.valueOf(o0Var.mo()));
                    o0().insert(C0684o.o, null, contentValues);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void o(final com.thinkup.core.common.on.o0 o0Var) {
        try {
            com.thinkup.core.common.ooo.m.m.o().m(new Runnable() { // from class: com.thinkup.core.common.oo.o.1
                @Override // java.lang.Runnable
                public final void run() {
                    o.this.m(o0Var);
                }
            }, 2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003c A[Catch: all -> 0x0040, PHI: r2 r13
  0x003c: PHI (r2v3 java.util.List<com.thinkup.core.common.on.o0>) = (r2v0 java.util.List<com.thinkup.core.common.on.o0>), (r2v5 java.util.List<com.thinkup.core.common.on.o0>) binds: [B:23:0x0052, B:9:0x003a] A[DONT_GENERATE, DONT_INLINE]
  0x003c: PHI (r13v5 android.database.Cursor) = (r13v4 android.database.Cursor), (r13v6 android.database.Cursor) binds: [B:23:0x0052, B:9:0x003a] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:10:0x003c, B:25:0x0055, B:30:0x005b, B:31:0x005e, B:22:0x004f), top: B:34:0x0003, inners: #3 }] */
    public final List<com.thinkup.core.common.on.o0> o(String str, String str2) {
        List<com.thinkup.core.common.on.o0> listO;
        Throwable th;
        Cursor cursorQuery;
        synchronized (this) {
            Date date = new Date();
            listO = null;
            try {
                try {
                    cursorQuery = n().query(C0684o.o, null, "event_type = ? and " + str2 + " = ? and month = ? and day = ?", new String[]{"2", str, com.thinkup.core.m.m.o(date), com.thinkup.core.m.m.m(date)}, null, null, null);
                    try {
                        listO = o(cursorQuery);
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            th.printStackTrace();
                            if (cursorQuery != null) {
                            }
                            return listO;
                        } catch (Throwable th3) {
                            if (cursorQuery != null) {
                                cursorQuery.close();
                                throw th3;
                            }
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    cursorQuery = null;
                    th.printStackTrace();
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return listO;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
        return listO;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006b  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void n(String str, String str2, int i2, long j) {
        byte b2;
        synchronized (this) {
            try {
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(C0684o.m, "1");
                    contentValues.put(C0684o.nm, Integer.valueOf(i2));
                    contentValues.put(C0684o.no, Long.valueOf(j));
                    switch (str2.hashCode()) {
                        case -1928631512:
                            if (!str2.equals(C0684o.om)) {
                                b2 = -1;
                            } else {
                                b2 = 3;
                            }
                            break;
                        case -1698410561:
                            if (!str2.equals(C0684o.m0)) {
                                b2 = -1;
                            } else {
                                b2 = 5;
                            }
                            break;
                        case -1268779017:
                            if (!str2.equals("format")) {
                                b2 = -1;
                            } else {
                                b2 = 1;
                            }
                            break;
                        case -478232372:
                            if (!str2.equals("network_id")) {
                                b2 = -1;
                            } else {
                                b2 = 2;
                            }
                            break;
                        case 96801:
                            if (!str2.equals("app")) {
                                b2 = -1;
                            } else {
                                b2 = 0;
                            }
                            break;
                        case 1224358069:
                            if (!str2.equals("placement_id")) {
                                b2 = -1;
                            } else {
                                b2 = 4;
                            }
                            break;
                        default:
                            b2 = -1;
                            break;
                    }
                    if (b2 == 0) {
                        contentValues.put("app", str);
                    } else if (b2 == 1) {
                        contentValues.put("format", str);
                    } else if (b2 == 2) {
                        contentValues.put("network_id", str);
                    } else if (b2 == 3) {
                        contentValues.put(C0684o.om, str);
                    } else if (b2 == 4) {
                        contentValues.put("placement_id", str);
                    } else if (b2 == 5) {
                        contentValues.put(C0684o.m0, str);
                    }
                    o0().insert(C0684o.o, null, contentValues);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void o0(com.thinkup.core.common.on.o0 o0Var) {
        synchronized (this) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put(C0684o.no, Long.valueOf(o0Var.mo()));
                contentValues.put(C0684o.o0o, Long.valueOf(o0Var.nm()));
                contentValues.put(C0684o.o00, Integer.valueOf(o0Var.no()));
                contentValues.put(C0684o.nm, Integer.valueOf(o0Var.o));
                if (o0().update(C0684o.o, contentValues, "event_type = ? and source_id = ? and rule_id = ?", new String[]{o0Var.o(), o0Var.oo(), String.valueOf(o0Var.n0())}) < 0) {
                    o0Var.oo();
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0040 A[Catch: all -> 0x0044, PHI: r2 r13
  0x0040: PHI (r2v3 java.util.List<com.thinkup.core.common.on.o0>) = (r2v0 java.util.List<com.thinkup.core.common.on.o0>), (r2v5 java.util.List<com.thinkup.core.common.on.o0>) binds: [B:23:0x0056, B:9:0x003e] A[DONT_GENERATE, DONT_INLINE]
  0x0040: PHI (r13v5 android.database.Cursor) = (r13v4 android.database.Cursor), (r13v6 android.database.Cursor) binds: [B:23:0x0056, B:9:0x003e] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0003, B:10:0x0040, B:25:0x0059, B:30:0x005f, B:31:0x0062, B:22:0x0053), top: B:36:0x0003, inners: #4 }] */
    public final List<com.thinkup.core.common.on.o0> m(String str, String str2) {
        List<com.thinkup.core.common.on.o0> listO;
        Throwable th;
        Cursor cursorQuery;
        synchronized (this) {
            Date date = new Date();
            listO = null;
            try {
                try {
                    cursorQuery = n().query(C0684o.o, null, "event_type = ? and " + str2 + " = ? and month = ? and day = ? and hour = ?", new String[]{"2", str, com.thinkup.core.m.m.o(date), com.thinkup.core.m.m.m(date), com.thinkup.core.m.m.n(date)}, null, null, null);
                    try {
                        listO = o(cursorQuery);
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            th.printStackTrace();
                            if (cursorQuery != null) {
                            }
                            return listO;
                        } catch (Throwable th3) {
                            if (cursorQuery != null) {
                                cursorQuery.close();
                                throw th3;
                            }
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    cursorQuery = null;
                    th.printStackTrace();
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return listO;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
        return listO;
    }

    private static List<com.thinkup.core.common.on.o0> o(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        if (cursor != null) {
            while (cursor.moveToNext()) {
                try {
                    arrayList.add(new com.thinkup.core.common.on.o0(cursor.getString(cursor.getColumnIndex(C0684o.m)), cursor.getString(cursor.getColumnIndex("app")), cursor.getString(cursor.getColumnIndex("network_id")), cursor.getString(cursor.getColumnIndex("format")), cursor.getString(cursor.getColumnIndex(C0684o.om)), cursor.getString(cursor.getColumnIndex("placement_id")), cursor.getString(cursor.getColumnIndex(C0684o.m0)), cursor.getInt(cursor.getColumnIndex(C0684o.mm)), cursor.getInt(cursor.getColumnIndex(C0684o.mn)), cursor.getInt(cursor.getColumnIndex(C0684o.n0)), cursor.getLong(cursor.getColumnIndex(C0684o.no))));
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
        return arrayList;
    }

    private void n(com.thinkup.core.common.on.o0 o0Var) {
        synchronized (this) {
            try {
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(C0684o.m, o0Var.o());
                    contentValues.put(C0684o.nn, Integer.valueOf(o0Var.n0()));
                    contentValues.put(C0684o.m0, o0Var.oo());
                    contentValues.put(C0684o.no, Long.valueOf(o0Var.mo()));
                    contentValues.put(C0684o.o0o, Long.valueOf(o0Var.nm()));
                    contentValues.put(C0684o.o00, Integer.valueOf(o0Var.no()));
                    contentValues.put(C0684o.nm, Integer.valueOf(o0Var.o));
                    if (o0().insert(C0684o.o, null, contentValues) < 0) {
                        o0Var.oo();
                    }
                } catch (Throwable unused) {
                    o0Var.oo();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m(final String str, final String str2, final int i2, final long j) {
        try {
            com.thinkup.core.common.ooo.m.m.o().m(new Runnable() { // from class: com.thinkup.core.common.oo.o.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (o.this.o0(str, str2) != null) {
                        o.this.o(str, str2, i2, j);
                    } else {
                        o.this.n(str, str2, i2, j);
                    }
                }
            }, 2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static /* synthetic */ void m(o oVar, com.thinkup.core.common.on.o0 o0Var) {
        synchronized (oVar) {
            try {
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(C0684o.m, o0Var.o());
                    contentValues.put(C0684o.nn, Integer.valueOf(o0Var.n0()));
                    contentValues.put(C0684o.m0, o0Var.oo());
                    contentValues.put(C0684o.no, Long.valueOf(o0Var.mo()));
                    contentValues.put(C0684o.o0o, Long.valueOf(o0Var.nm()));
                    contentValues.put(C0684o.o00, Integer.valueOf(o0Var.no()));
                    contentValues.put(C0684o.nm, Integer.valueOf(o0Var.o));
                    if (oVar.o0().insert(C0684o.o, null, contentValues) < 0) {
                        o0Var.oo();
                    }
                } catch (Throwable unused) {
                    o0Var.oo();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o(String str, String str2, int i2, long j) {
        synchronized (this) {
            try {
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(C0684o.nm, Integer.valueOf(i2));
                    contentValues.put(C0684o.no, Long.valueOf(j));
                    o0().update(C0684o.o, contentValues, "event_type = ? and " + str2 + " = ?", new String[]{"1", str});
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Pair<String, String[]> n(List<Pair<String, String>> list) {
        String[] strArr;
        StringBuilder sb = new StringBuilder();
        if (list == null || list.isEmpty()) {
            strArr = null;
        } else {
            strArr = new String[list.size()];
            for (int i2 = 0; i2 < list.size(); i2++) {
                Pair<String, String> pair = list.get(i2);
                sb.append((String) pair.first);
                if (i2 != list.size() - 1) {
                    sb.append(" and ");
                }
                strArr[i2] = (String) pair.second;
            }
        }
        return new Pair<>(sb.toString(), strArr);
    }

    public final void o(final com.thinkup.core.common.on.o0 o0Var, final boolean z2) {
        if (o0Var == null) {
            return;
        }
        try {
            com.thinkup.core.common.ooo.m.m.o().n(new Runnable() { // from class: com.thinkup.core.common.oo.o.3
                @Override // java.lang.Runnable
                public final void run() {
                    if (z2) {
                        o.o(o.this, o0Var);
                    } else {
                        o.m(o.this, o0Var);
                    }
                }
            }, 13);
        } catch (Throwable unused) {
        }
    }

    public final List<com.thinkup.core.common.on.o0> o(List<Pair<String, String>> list, int i2) {
        Cursor cursorQuery;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Pair<String, String[]> pairN = n(list);
                cursorQuery = i2 > 0 ? n().query(C0684o.o, null, (String) pairN.first, (String[]) pairN.second, null, null, "time_stamp DESC", String.valueOf(i2)) : n().query(C0684o.o, null, (String) pairN.first, (String[]) pairN.second, null, null, "time_stamp DESC", null);
                while (cursorQuery.moveToNext()) {
                    try {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndex(C0684o.m));
                        long j = cursorQuery.getLong(cursorQuery.getColumnIndex(C0684o.no));
                        int i3 = cursorQuery.getInt(cursorQuery.getColumnIndex(C0684o.nm));
                        String string2 = cursorQuery.getString(cursorQuery.getColumnIndex(C0684o.m0));
                        int i4 = cursorQuery.getInt(cursorQuery.getColumnIndex(C0684o.nn));
                        int i5 = cursorQuery.getInt(cursorQuery.getColumnIndex(C0684o.o00));
                        long j2 = cursorQuery.getLong(cursorQuery.getColumnIndex(C0684o.o0o));
                        com.thinkup.core.common.on.o0 o0Var = new com.thinkup.core.common.on.o0(string, string2, C0684o.m0, j, i3);
                        o0Var.o(i4);
                        o0Var.m(i5);
                        o0Var.m(j2);
                        arrayList.add(o0Var);
                    } catch (Throwable unused) {
                        if (cursorQuery != null) {
                        }
                        return arrayList;
                    }
                }
            } catch (Throwable unused2) {
                cursorQuery = null;
            }
            try {
                cursorQuery.close();
            } catch (Throwable unused3) {
            }
        }
        return arrayList;
    }

    public final void o(final List<Pair<String, String>> list) {
        com.thinkup.core.common.ooo.m.m.o().n(new Runnable() { // from class: com.thinkup.core.common.oo.o.4
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (this) {
                    try {
                        Pair pairN = o.n((List<Pair<String, String>>) list);
                        o.this.o0().delete(C0684o.o, (String) pairN.first, (String[]) pairN.second);
                    } catch (Throwable unused) {
                    }
                }
            }
        }, 13);
    }

    public static /* synthetic */ void o(o oVar, com.thinkup.core.common.on.o0 o0Var) {
        synchronized (oVar) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put(C0684o.no, Long.valueOf(o0Var.mo()));
                contentValues.put(C0684o.o0o, Long.valueOf(o0Var.nm()));
                contentValues.put(C0684o.o00, Integer.valueOf(o0Var.no()));
                contentValues.put(C0684o.nm, Integer.valueOf(o0Var.o));
                if (oVar.o0().update(C0684o.o, contentValues, "event_type = ? and source_id = ? and rule_id = ?", new String[]{o0Var.o(), o0Var.oo(), String.valueOf(o0Var.n0())}) < 0) {
                    o0Var.oo();
                }
            } catch (Throwable unused) {
            }
        }
    }
}
