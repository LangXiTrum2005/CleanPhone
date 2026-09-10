package com.startapp.sdk.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Pair;
import androidx.core.app.NotificationCompat;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONTokener;

/* JADX INFO: loaded from: classes6.dex */
public final class k9 extends m6 {
    public static final String[] d = {"rowid", "timestamp", "sdkVersion", "category", "appActivity", "value", "details", "detailsJson", "dParam", NotificationCompat.CATEGORY_SERVICE, "tag"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedList f41181c;

    public k9(Context context) {
        super(context);
        this.f41181c = new LinkedList();
    }

    public static boolean a(g9 g9Var, m9 m9Var, SQLiteDatabase sQLiteDatabase, HashMap map, long j) {
        if (m9Var.f41244a.size() > 0 && !m9Var.f41244a.contains(g9Var.d)) {
            return false;
        }
        if (m9Var.f41245b.size() > 0 && m9Var.f41245b.contains(g9Var.d)) {
            return false;
        }
        if (m9Var.f41246c.size() > 0 && !m9Var.f41246c.contains(g9Var.f41004i)) {
            return false;
        }
        if (m9Var.d.size() > 0 && m9Var.d.contains(g9Var.f41004i)) {
            return false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map.containsKey("sdkVersion")) {
            linkedHashMap.put("sdkVersion", (String) map.get("sdkVersion"));
        }
        if (map.containsKey("category")) {
            linkedHashMap.put("category", (String) map.get("category"));
        }
        for (String str : m9Var.f41247e) {
            if (map.containsKey(str)) {
                linkedHashMap.put(str, (String) map.get(str));
            }
        }
        int size = linkedHashMap.size();
        if (size < 1) {
            throw new IllegalArgumentException();
        }
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList(size);
        String str2 = "";
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            sb.append(str2);
            sb.append((String) entry.getKey());
            if (entry.getValue() == null) {
                sb.append(" IS NULL");
            } else {
                sb.append(" = ?");
                arrayList.add((String) entry.getValue());
            }
            str2 = " AND ";
        }
        Pair pair = new Pair(sb.toString(), (String[]) arrayList.toArray(new String[0]));
        Cursor cursorQuery = null;
        try {
            cursorQuery = sQLiteDatabase.query("events", new String[]{"sendSuccess"}, (String) pair.first, (String[]) pair.second, null, null, "sendSuccess DESC");
            if (cursorQuery.moveToFirst()) {
                long j2 = cursorQuery.getLong(0);
                if (j2 <= 0) {
                    return true;
                }
                long j3 = j - j2;
                long j4 = m9Var.f;
                if (j4 > 0 && j3 < j4) {
                    a(cursorQuery);
                    return true;
                }
            }
            return false;
        } finally {
            a(cursorQuery);
        }
    }

    public static g9 b(Cursor cursor) {
        long j = cursor.getLong(0);
        long j2 = cursor.getLong(1);
        a(j, j2);
        String string = cursor.getString(2);
        h9 h9Var = (h9) h9.f41039c.get(cursor.getString(3));
        String string2 = cursor.getString(4);
        String string3 = cursor.getString(5);
        String string4 = cursor.getString(6);
        String string5 = cursor.getString(7);
        String string6 = cursor.getString(8);
        boolean z2 = cursor.getInt(9) == 1;
        String string7 = cursor.getString(10);
        if (string == null || string.trim().length() < 1) {
            throw new IllegalArgumentException();
        }
        if (h9Var == null) {
            throw new IllegalArgumentException();
        }
        Object objNextValue = null;
        if (string5 != null) {
            try {
                objNextValue = new JSONTokener(string5).nextValue();
            } catch (JSONException unused) {
            }
        }
        g9 g9Var = new g9(h9Var, j);
        g9Var.f41003h = Long.valueOf(j2);
        g9Var.f41001c = string;
        g9Var.f41004i = string2;
        g9Var.d = string3;
        g9Var.f41002e = string4;
        g9Var.f = objNextValue;
        g9Var.g = string6;
        g9Var.j = z2;
        g9Var.k = string7;
        return g9Var;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS events ( timestamp INTEGER NOT NULL, validTill INTEGER NOT NULL, sdkVersion TEXT NOT NULL, category TEXT NOT NULL, appActivity TEXT, value TEXT, details TEXT, detailsJson TEXT, dParam TEXT, service INTEGER NOT NULL DEFAULT 0, tag TEXT, priority INTEGER NOT NULL, attempt INTEGER NOT NULL DEFAULT 0, send INTEGER NOT NULL DEFAULT 0, sendFailure INTEGER NOT NULL DEFAULT 0, sendSuccess INTEGER NOT NULL DEFAULT 0, CHECK (attempt >= 0), CHECK (send >= 0), CHECK (sendFailure >= 0), CHECK (sendSuccess >= 0));");
    }

    public final void a(v9 v9Var, int i2, int i3) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = a().query("events", d, "attempt < " + i2 + " AND validTill >= " + System.currentTimeMillis() + " AND sendSuccess = 0  AND send <= sendFailure", null, null, null, "priority DESC, timestamp ASC", String.valueOf(Math.max(1, i3)));
            while (cursorQuery.moveToNext()) {
                v9Var.a(b(cursorQuery));
            }
            a(cursorQuery);
        } catch (Throwable th) {
            a(cursorQuery);
            throw th;
        }
    }

    public final boolean a(g9 g9Var, j9 j9Var) {
        long jLongValue;
        SQLiteDatabase sQLiteDatabaseA = a();
        sQLiteDatabaseA.beginTransaction();
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = j9Var.f41139e + jCurrentTimeMillis;
            Long l2 = g9Var.f41003h;
            if (l2 != null) {
                jLongValue = l2.longValue();
            } else {
                g9Var.f41003h = Long.valueOf(jCurrentTimeMillis);
                jLongValue = jCurrentTimeMillis;
            }
            Object obj = g9Var.f;
            String string = obj != null ? obj.toString() : null;
            String str = g9Var.f41001c;
            if (str == null) {
                str = "5.2.4";
            }
            String str2 = str;
            List list = j9Var.g;
            if (list.size() > 0) {
                HashMap map = new HashMap();
                map.put("sdkVersion", str2);
                map.put("category", g9Var.f40999a.f41046a);
                map.put("appActivity", g9Var.f41004i);
                map.put("value", g9Var.d);
                map.put("details", g9Var.f41002e);
                map.put("detailsJson", string);
                map.put("dParam", g9Var.g);
                map.put(NotificationCompat.CATEGORY_SERVICE, g9Var.j ? "1" : "0");
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (a(g9Var, (m9) it.next(), sQLiteDatabaseA, map, jCurrentTimeMillis)) {
                        sQLiteDatabaseA.endTransaction();
                        return false;
                    }
                }
            }
            sQLiteDatabaseA.delete("events", "validTill < " + jCurrentTimeMillis, null);
            ContentValues contentValues = new ContentValues();
            contentValues.put("timestamp", Long.valueOf(jLongValue));
            contentValues.put("validTill", Long.valueOf(j));
            contentValues.put("sdkVersion", str2);
            contentValues.put("category", g9Var.f40999a.f41046a);
            contentValues.put("appActivity", g9Var.f41004i);
            contentValues.put("value", g9Var.d);
            contentValues.put("details", g9Var.f41002e);
            contentValues.put("detailsJson", string);
            contentValues.put("dParam", g9Var.g);
            contentValues.put(NotificationCompat.CATEGORY_SERVICE, Integer.valueOf(g9Var.j ? 1 : 0));
            contentValues.put("tag", g9Var.k);
            contentValues.put(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, Integer.valueOf(j9Var.f41138c));
            sQLiteDatabaseA.insertOrThrow("events", null, contentValues);
            sQLiteDatabaseA.setTransactionSuccessful();
            sQLiteDatabaseA.endTransaction();
            synchronized (this) {
                Iterator it2 = this.f41181c.iterator();
                while (it2.hasNext()) {
                    ((k7) it2.next()).a();
                }
            }
            return true;
        } catch (Throwable th) {
            sQLiteDatabaseA.endTransaction();
            throw th;
        }
    }

    public static void a(long j, long j2) {
        if (j <= 0) {
            throw new IllegalArgumentException();
        }
        if (j2 <= 0) {
            throw new IllegalArgumentException();
        }
    }

    public static int a(SQLiteDatabase sQLiteDatabase, long j) {
        try {
            Cursor cursorQuery = sQLiteDatabase.query("events", new String[]{"attempt"}, "rowid = ?", new String[]{String.valueOf(j)}, null, null, null);
            if (cursorQuery.moveToFirst()) {
                int i2 = cursorQuery.getInt(0);
                a(cursorQuery);
                return i2;
            }
            throw new IllegalStateException();
        } catch (Throwable th) {
            a(null);
            throw th;
        }
    }

    public static void a(Cursor cursor) {
        if (cursor != null) {
            try {
                cursor.close();
            } catch (Exception unused) {
            }
        }
    }
}
