package com.umeng.analytics.pro;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.umeng.analytics.MobclickAgent;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.UMUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f2577a = 2049;
    public static final int b = 2050;
    private static final int c = 1000;
    private static Context d = null;
    private static String e = null;
    private static final String f = "umeng+";
    private static final String g = "ek__id";
    private static final String h = "ek_key";
    private List<String> i;
    private List<Integer> j;
    private String k;
    private List<String> l;

    public enum a {
        AUTOPAGE,
        PAGE,
        BEGIN,
        END,
        NEWSESSION,
        INSTANTSESSIONBEGIN
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final k f2579a = new k();

        private b() {
        }
    }

    public static k a(Context context) {
        k kVar = b.f2579a;
        if (d == null && context != null) {
            d = context.getApplicationContext();
            kVar.k();
        }
        return kVar;
    }

    private void k() {
        synchronized (this) {
            l();
            this.i.clear();
            this.l.clear();
            this.j.clear();
        }
    }

    private void l() {
        try {
            if (TextUtils.isEmpty(e)) {
                String multiProcessSP = UMUtils.getMultiProcessSP(d, g);
                if (TextUtils.isEmpty(multiProcessSP)) {
                    multiProcessSP = PreferenceWrapper.getDefault(d).getString(g, null);
                    if (TextUtils.isEmpty(multiProcessSP)) {
                        multiProcessSP = UMUtils.genId();
                    }
                    if (!TextUtils.isEmpty(multiProcessSP)) {
                        UMUtils.setMultiProcessSP(d, g, multiProcessSP);
                    }
                }
                if (!TextUtils.isEmpty(multiProcessSP)) {
                    String strSubstring = multiProcessSP.substring(1, 9);
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < strSubstring.length(); i++) {
                        char cCharAt = strSubstring.charAt(i);
                        if (!Character.isDigit(cCharAt)) {
                            sb.append(cCharAt);
                        } else if (Integer.parseInt(Character.toString(cCharAt)) == 0) {
                            sb.append(0);
                        } else {
                            sb.append(10 - Integer.parseInt(Character.toString(cCharAt)));
                        }
                    }
                    e = sb.toString();
                }
                if (TextUtils.isEmpty(e)) {
                    return;
                }
                e += new StringBuilder(e).reverse().toString();
                String multiProcessSP2 = UMUtils.getMultiProcessSP(d, h);
                if (TextUtils.isEmpty(multiProcessSP2)) {
                    UMUtils.setMultiProcessSP(d, h, c(f));
                } else {
                    if (f.equals(d(multiProcessSP2))) {
                        return;
                    }
                    b(true, false);
                    a(true, false);
                    h();
                    i();
                }
            }
        } catch (Throwable unused) {
        }
    }

    public void b() {
        this.l.clear();
    }

    public boolean c() {
        return this.l.isEmpty();
    }

    public void d() {
        SQLiteDatabase sQLiteDatabaseA = null;
        try {
            try {
                sQLiteDatabaseA = i.a(d).a();
                sQLiteDatabaseA.beginTransaction();
                String strC = w.a().c();
                if (TextUtils.isEmpty(strC)) {
                    try {
                        sQLiteDatabaseA.endTransaction();
                    } catch (Throwable unused) {
                    }
                    i.a(d).b();
                    return;
                }
                String[] strArr = {"", "-1"};
                for (int i = 0; i < 2; i++) {
                    sQLiteDatabaseA.execSQL("update __et set __i=\"" + strC + "\" where __i=\"" + strArr[i] + "\"");
                }
                sQLiteDatabaseA.setTransactionSuccessful();
            } catch (SQLiteDatabaseCorruptException unused2) {
                j.a(d);
            } catch (Throwable unused3) {
                if (sQLiteDatabaseA != null) {
                }
            }
        } finally {
            if (sQLiteDatabaseA != null) {
                try {
                    sQLiteDatabaseA.endTransaction();
                } catch (Throwable unused4) {
                }
            }
            i.a(d).b();
        }
    }

    public boolean e() {
        return this.i.isEmpty();
    }

    /* JADX WARN: Code duplicated, block: B:51:0x008e A[DONT_GENERATE, EXC_TOP_SPLITTER, PHI: r2 r5
  0x008e: PHI (r2v5 android.database.sqlite.SQLiteDatabase) = (r2v4 android.database.sqlite.SQLiteDatabase), (r2v6 android.database.sqlite.SQLiteDatabase) binds: [B:29:0x008c, B:35:0x00a6] A[DONT_GENERATE, DONT_INLINE]
  0x008e: PHI (r5v3 org.json.JSONObject) = (r5v2 org.json.JSONObject), (r5v5 org.json.JSONObject) binds: [B:29:0x008c, B:35:0x00a6] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public JSONObject f() {
        SQLiteDatabase sQLiteDatabaseA;
        JSONObject jSONObject;
        Cursor cursor = null;
        jSONObject = null;
        jSONObject = null;
        jSONObject = null;
        JSONObject jSONObject2 = null;
        cursor = null;
        cursor = null;
        Cursor cursor2 = null;
        if (this.l.isEmpty()) {
            return null;
        }
        try {
            sQLiteDatabaseA = i.a(d).a();
            try {
                sQLiteDatabaseA.beginTransaction();
                Cursor cursorA = a(g.c.f2567a, sQLiteDatabaseA, null, "__ii=? ", new String[]{this.l.get(0)}, null, null, null, null);
                if (cursorA != null) {
                    try {
                        if (cursorA.moveToNext()) {
                            jSONObject = new JSONObject();
                            try {
                                String string = cursorA.getString(cursorA.getColumnIndex("__av"));
                                String string2 = cursorA.getString(cursorA.getColumnIndex("__vc"));
                                jSONObject.put("__av", string);
                                jSONObject.put("__vc", string2);
                                jSONObject2 = jSONObject;
                            } catch (SQLiteDatabaseCorruptException unused) {
                                cursor2 = cursorA;
                                try {
                                    j.a(d);
                                    return jSONObject;
                                } finally {
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    if (sQLiteDatabaseA != null) {
                                        try {
                                            sQLiteDatabaseA.endTransaction();
                                        } catch (Throwable unused2) {
                                        }
                                    }
                                    i.a(d).b();
                                }
                            } catch (Throwable unused3) {
                                cursor = cursorA;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                if (sQLiteDatabaseA != null) {
                                }
                                return jSONObject;
                            }
                        }
                    } catch (SQLiteDatabaseCorruptException unused4) {
                        jSONObject = jSONObject2;
                    } catch (Throwable unused5) {
                        jSONObject = jSONObject2;
                    }
                }
                sQLiteDatabaseA.setTransactionSuccessful();
                if (cursorA != null) {
                    cursorA.close();
                }
                try {
                    sQLiteDatabaseA.endTransaction();
                } catch (Throwable unused6) {
                }
                i.a(d).b();
                return jSONObject2;
            } catch (SQLiteDatabaseCorruptException unused7) {
                jSONObject = null;
            } catch (Throwable unused8) {
                jSONObject = null;
            }
        } catch (SQLiteDatabaseCorruptException unused9) {
            sQLiteDatabaseA = null;
            jSONObject = null;
        } catch (Throwable unused10) {
            sQLiteDatabaseA = null;
            jSONObject = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x008e A[DONT_GENERATE, EXC_TOP_SPLITTER, PHI: r2 r5
  0x008e: PHI (r2v5 android.database.sqlite.SQLiteDatabase) = (r2v4 android.database.sqlite.SQLiteDatabase), (r2v6 android.database.sqlite.SQLiteDatabase) binds: [B:29:0x008c, B:35:0x00a6] A[DONT_GENERATE, DONT_INLINE]
  0x008e: PHI (r5v3 org.json.JSONObject) = (r5v2 org.json.JSONObject), (r5v5 org.json.JSONObject) binds: [B:29:0x008c, B:35:0x00a6] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public JSONObject g() {
        SQLiteDatabase sQLiteDatabaseA;
        JSONObject jSONObject;
        Cursor cursor = null;
        jSONObject = null;
        jSONObject = null;
        jSONObject = null;
        JSONObject jSONObject2 = null;
        cursor = null;
        cursor = null;
        Cursor cursor2 = null;
        if (this.i.isEmpty()) {
            return null;
        }
        try {
            sQLiteDatabaseA = i.a(d).a();
            try {
                sQLiteDatabaseA.beginTransaction();
                Cursor cursorA = a(g.d.f2570a, sQLiteDatabaseA, null, "__ii=? ", new String[]{this.i.get(0)}, null, null, null, null);
                if (cursorA != null) {
                    try {
                        if (cursorA.moveToNext()) {
                            jSONObject = new JSONObject();
                            try {
                                String string = cursorA.getString(cursorA.getColumnIndex("__av"));
                                String string2 = cursorA.getString(cursorA.getColumnIndex("__vc"));
                                jSONObject.put("__av", string);
                                jSONObject.put("__vc", string2);
                                jSONObject2 = jSONObject;
                            } catch (SQLiteDatabaseCorruptException unused) {
                                cursor2 = cursorA;
                                try {
                                    j.a(d);
                                    return jSONObject;
                                } finally {
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    if (sQLiteDatabaseA != null) {
                                        try {
                                            sQLiteDatabaseA.endTransaction();
                                        } catch (Throwable unused2) {
                                        }
                                    }
                                    i.a(d).b();
                                }
                            } catch (Throwable unused3) {
                                cursor = cursorA;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                if (sQLiteDatabaseA != null) {
                                }
                                return jSONObject;
                            }
                        }
                    } catch (SQLiteDatabaseCorruptException unused4) {
                        jSONObject = jSONObject2;
                    } catch (Throwable unused5) {
                        jSONObject = jSONObject2;
                    }
                }
                sQLiteDatabaseA.setTransactionSuccessful();
                if (cursorA != null) {
                    cursorA.close();
                }
                try {
                    sQLiteDatabaseA.endTransaction();
                } catch (Throwable unused6) {
                }
                i.a(d).b();
                return jSONObject2;
            } catch (SQLiteDatabaseCorruptException unused7) {
                jSONObject = null;
            } catch (Throwable unused8) {
                jSONObject = null;
            }
        } catch (SQLiteDatabaseCorruptException unused9) {
            sQLiteDatabaseA = null;
            jSONObject = null;
        } catch (Throwable unused10) {
            sQLiteDatabaseA = null;
            jSONObject = null;
        }
    }

    public void h() {
        SQLiteDatabase sQLiteDatabaseA = null;
        try {
            try {
                sQLiteDatabaseA = i.a(d).a();
                sQLiteDatabaseA.beginTransaction();
                if (this.j.size() > 0) {
                    for (int i = 0; i < this.j.size(); i++) {
                        sQLiteDatabaseA.execSQL("delete from __et where rowid=" + this.j.get(i));
                    }
                }
                this.j.clear();
                sQLiteDatabaseA.setTransactionSuccessful();
            } catch (SQLiteDatabaseCorruptException unused) {
                j.a(d);
            } catch (Throwable unused2) {
                if (sQLiteDatabaseA != null) {
                }
            }
        } finally {
            if (sQLiteDatabaseA != null) {
                try {
                    sQLiteDatabaseA.endTransaction();
                } catch (Throwable unused3) {
                }
            }
            i.a(d).b();
        }
    }

    public void i() {
        SQLiteDatabase sQLiteDatabaseA = null;
        try {
            try {
                sQLiteDatabaseA = i.a(d).a();
                sQLiteDatabaseA.beginTransaction();
                sQLiteDatabaseA.execSQL("delete from __er");
                sQLiteDatabaseA.setTransactionSuccessful();
            } catch (SQLiteDatabaseCorruptException unused) {
                j.a(d);
            } catch (Throwable unused2) {
                if (sQLiteDatabaseA != null) {
                }
            }
        } finally {
            if (sQLiteDatabaseA != null) {
                try {
                    sQLiteDatabaseA.endTransaction();
                } catch (Throwable unused3) {
                }
            }
            i.a(d).b();
        }
    }

    public void j() {
        SQLiteDatabase sQLiteDatabaseA;
        if (!TextUtils.isEmpty(this.k)) {
            try {
                sQLiteDatabaseA = i.a(d).a();
                try {
                    sQLiteDatabaseA.beginTransaction();
                    sQLiteDatabaseA.execSQL("delete from __er where __i=\"" + this.k + "\"");
                    sQLiteDatabaseA.execSQL("delete from __et where __i=\"" + this.k + "\"");
                    sQLiteDatabaseA.setTransactionSuccessful();
                } catch (SQLiteDatabaseCorruptException unused) {
                    try {
                        j.a(d);
                        if (sQLiteDatabaseA != null) {
                        }
                        i.a(d).b();
                        this.k = null;
                    } catch (Throwable th) {
                        if (sQLiteDatabaseA != null) {
                            try {
                                sQLiteDatabaseA.endTransaction();
                            } catch (Throwable unused2) {
                            }
                        }
                        i.a(d).b();
                        throw th;
                    }
                } catch (Throwable unused3) {
                    if (sQLiteDatabaseA != null) {
                    }
                    i.a(d).b();
                    this.k = null;
                }
            } catch (SQLiteDatabaseCorruptException unused4) {
                sQLiteDatabaseA = null;
            } catch (Throwable unused5) {
                sQLiteDatabaseA = null;
            }
            try {
                sQLiteDatabaseA.endTransaction();
            } catch (Throwable unused6) {
            }
            i.a(d).b();
        }
        this.k = null;
    }

    private k() {
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = null;
        this.l = new ArrayList();
    }

    private void b(String str, JSONObject jSONObject, SQLiteDatabase sQLiteDatabase) {
        try {
            long jLongValue = ((Long) jSONObject.get("__e")).longValue();
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("__sp");
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("__pp");
            String strC = "";
            String strC2 = (jSONObjectOptJSONObject == null || jSONObjectOptJSONObject.length() <= 0) ? "" : c(jSONObjectOptJSONObject.toString());
            if (jSONObjectOptJSONObject2 != null && jSONObjectOptJSONObject2.length() > 0) {
                strC = c(jSONObjectOptJSONObject2.toString());
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("__ii", str);
            contentValues.put("__e", String.valueOf(jLongValue));
            contentValues.put("__sp", strC2);
            contentValues.put("__pp", strC);
            contentValues.put("__av", UMGlobalContext.getInstance(d).getAppVersion());
            contentValues.put("__vc", UMUtils.getAppVersionCode(d));
            sQLiteDatabase.insert(g.c.f2567a, null, contentValues);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x011e  */
    /* JADX WARN: Code duplicated, block: B:47:? A[RETURN, SYNTHETIC] */
    private void c(String str, JSONObject jSONObject, SQLiteDatabase sQLiteDatabase) {
        Cursor cursor;
        JSONObject jSONObject2;
        String str2;
        Cursor cursor2;
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(g.d.a.e);
            if (jSONObjectOptJSONObject != null) {
                jSONObject2 = jSONObjectOptJSONObject;
                Cursor cursorA = a(g.d.f2570a, sQLiteDatabase, new String[]{g.d.a.e}, "__ii=? ", new String[]{str}, null, null, null, null);
                if (cursorA != null) {
                    String strD = null;
                    while (cursorA.moveToNext()) {
                        try {
                            strD = d(cursorA.getString(cursorA.getColumnIndex(g.d.a.e)));
                        } catch (Throwable unused) {
                            cursor = cursorA;
                            if (cursor != null) {
                                cursor.close();
                                return;
                            }
                            return;
                        }
                    }
                    String str3 = strD;
                    cursor2 = cursorA;
                    str2 = str3;
                } else {
                    cursor2 = cursorA;
                    str2 = null;
                }
            } else {
                jSONObject2 = jSONObjectOptJSONObject;
                str2 = null;
                cursor2 = null;
            }
            if (jSONObject2 != null) {
                try {
                    JSONArray jSONArray = new JSONArray();
                    if (!TextUtils.isEmpty(str2)) {
                        jSONArray = new JSONArray(str2);
                    }
                    jSONArray.put(jSONObject2);
                    String strC = c(jSONArray.toString());
                    if (!TextUtils.isEmpty(strC)) {
                        sQLiteDatabase.execSQL("update  __sd set __d=\"" + strC + "\" where __ii=\"" + str + "\"");
                    }
                } catch (Throwable unused2) {
                    cursor = cursor2;
                    if (cursor != null) {
                        cursor.close();
                        return;
                    }
                    return;
                }
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(g.d.a.d);
            if (jSONObjectOptJSONObject2 != null) {
                String strC2 = c(jSONObjectOptJSONObject2.toString());
                if (!TextUtils.isEmpty(strC2)) {
                    sQLiteDatabase.execSQL("update  __sd set __c=\"" + strC2 + "\" where __ii=\"" + str + "\"");
                }
            }
            sQLiteDatabase.execSQL("update  __sd set __f=\"" + String.valueOf(jSONObject.optLong(g.d.a.g)) + "\" where __ii=\"" + str + "\"");
            if (cursor2 != null) {
                cursor2.close();
            }
        } catch (Throwable unused3) {
            cursor = null;
        }
    }

    private Cursor a(String str, SQLiteDatabase sQLiteDatabase, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        if (sQLiteDatabase == null) {
            return null;
        }
        try {
            if (sQLiteDatabase.isOpen()) {
                return sQLiteDatabase.query(str, strArr, str2, strArr2, str3, str4, str5, str6);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public void a() {
        this.i.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a4, code lost:
    
        if (r2 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a6, code lost:
    
        r2.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00af, code lost:
    
        if (r2 != null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(org.json.JSONArray r11) {
        /*
            r10 = this;
            java.lang.String r0 = "__t"
            java.lang.String r1 = "__i"
            r2 = 0
            android.content.Context r3 = com.umeng.analytics.pro.k.d     // Catch: java.lang.Throwable -> La3 android.database.sqlite.SQLiteDatabaseCorruptException -> Laa
            com.umeng.analytics.pro.i r3 = com.umeng.analytics.pro.i.a(r3)     // Catch: java.lang.Throwable -> La3 android.database.sqlite.SQLiteDatabaseCorruptException -> Laa
            android.database.sqlite.SQLiteDatabase r3 = r3.a()     // Catch: java.lang.Throwable -> La3 android.database.sqlite.SQLiteDatabaseCorruptException -> Laa
            r3.beginTransaction()     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteDatabaseCorruptException -> La1
            r4 = 0
        L13:
            int r5 = r11.length()     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteDatabaseCorruptException -> La1
            if (r4 >= r5) goto L91
            org.json.JSONObject r5 = r11.getJSONObject(r4)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L8e
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L8e
            r6.<init>()     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L8e
            java.lang.String r7 = r5.optString(r1)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L8e
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L8e
            java.lang.String r9 = "-1"
            if (r8 != 0) goto L38
            boolean r8 = r9.equals(r7)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L8e
            if (r8 == 0) goto L47
            goto L38
        L35:
            r2 = r3
            goto La4
        L38:
            com.umeng.analytics.pro.w r7 = com.umeng.analytics.pro.w.a()     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L8e
            java.lang.String r7 = r7.b()     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L8e
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L8e
            if (r8 == 0) goto L47
            r7 = r9
        L47:
            r6.put(r1, r7)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L8e
            java.lang.String r7 = "__e"
            java.lang.String r8 = "id"
            java.lang.String r8 = r5.optString(r8)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L8e
            r6.put(r7, r8)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L8e
            int r7 = r5.optInt(r0)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L8e
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L8e
            r6.put(r0, r7)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L8e
            java.lang.String r7 = "__av"
            android.content.Context r8 = com.umeng.analytics.pro.k.d     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L8e
            java.lang.String r8 = com.umeng.commonsdk.utils.UMUtils.getAppVersionName(r8)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L8e
            r6.put(r7, r8)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L8e
            java.lang.String r7 = "__vc"
            android.content.Context r8 = com.umeng.analytics.pro.k.d     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L8e
            java.lang.String r8 = com.umeng.commonsdk.utils.UMUtils.getAppVersionCode(r8)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L8e
            r6.put(r7, r8)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L8e
            r5.remove(r1)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L8e
            r5.remove(r0)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L8e
            java.lang.String r7 = "__s"
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L8e
            java.lang.String r5 = r10.c(r5)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L8e
            r6.put(r7, r5)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L8e
            java.lang.String r5 = "__et"
            r3.insert(r5, r2, r6)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L8e
        L8e:
            int r4 = r4 + 1
            goto L13
        L91:
            r3.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteDatabaseCorruptException -> La1
            r3.endTransaction()     // Catch: java.lang.Throwable -> L97
        L97:
            android.content.Context r11 = com.umeng.analytics.pro.k.d
            com.umeng.analytics.pro.i r11 = com.umeng.analytics.pro.i.a(r11)
            r11.b()
            goto Lb2
        La1:
            r2 = r3
            goto Laa
        La3:
        La4:
            if (r2 == 0) goto L97
        La6:
            r2.endTransaction()     // Catch: java.lang.Throwable -> L97
            goto L97
        Laa:
            android.content.Context r11 = com.umeng.analytics.pro.k.d     // Catch: java.lang.Throwable -> Lb3
            com.umeng.analytics.pro.j.a(r11)     // Catch: java.lang.Throwable -> Lb3
            if (r2 == 0) goto L97
            goto La6
        Lb2:
            return
        Lb3:
            r11 = move-exception
            if (r2 == 0) goto Lb9
            r2.endTransaction()     // Catch: java.lang.Throwable -> Lb9
        Lb9:
            android.content.Context r0 = com.umeng.analytics.pro.k.d
            com.umeng.analytics.pro.i r0 = com.umeng.analytics.pro.i.a(r0)
            r0.b()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.k.a(org.json.JSONArray):void");
    }

    public JSONObject b(boolean z) {
        JSONObject jSONObject = new JSONObject();
        b(jSONObject, z);
        return jSONObject;
    }

    public String d(String str) {
        try {
            return TextUtils.isEmpty(e) ? str : new String(DataHelper.decrypt(Base64.decode(str.getBytes(), 0), e.getBytes()));
        } catch (Exception unused) {
            if (Build.VERSION.SDK_INT >= 29 && !TextUtils.isEmpty(str)) {
                try {
                    new JSONObject(str);
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> UMStoreManager decrypt failed, return origin data.");
                    return str;
                } catch (Throwable unused2) {
                    return null;
                }
            }
            return null;
        }
    }

    private void b(JSONObject jSONObject, String str) {
        SQLiteDatabase sQLiteDatabaseA;
        Cursor cursorA;
        Cursor cursor = null;
        try {
            try {
                sQLiteDatabaseA = i.a(d).a();
                try {
                    sQLiteDatabaseA.beginTransaction();
                    if (!TextUtils.isEmpty(str)) {
                        cursorA = a(g.a.f2561a, sQLiteDatabaseA, null, "__i=? ", new String[]{str}, null, null, null, null);
                    } else {
                        cursorA = a(g.a.f2561a, sQLiteDatabaseA, null, null, null, null, null, null, null);
                    }
                    cursor = cursorA;
                    if (cursor != null) {
                        JSONArray jSONArray = new JSONArray();
                        while (cursor.moveToNext()) {
                            String string = cursor.getString(cursor.getColumnIndex("__a"));
                            if (!TextUtils.isEmpty(string)) {
                                jSONArray.put(new JSONObject(d(string)));
                            }
                        }
                        if (jSONArray.length() > 0) {
                            jSONObject.put("error", jSONArray);
                        }
                    }
                    sQLiteDatabaseA.setTransactionSuccessful();
                    if (cursor != null) {
                        cursor.close();
                    }
                } catch (SQLiteDatabaseCorruptException unused) {
                    j.a(d);
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (sQLiteDatabaseA != null) {
                    }
                    i.a(d).b();
                } catch (Throwable unused2) {
                    j.a(d);
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (sQLiteDatabaseA != null) {
                    }
                    i.a(d).b();
                }
            } catch (SQLiteDatabaseCorruptException unused3) {
                sQLiteDatabaseA = null;
            } catch (Throwable unused4) {
                sQLiteDatabaseA = null;
            }
            try {
                sQLiteDatabaseA.endTransaction();
            } catch (Throwable unused5) {
            }
            i.a(d).b();
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            if (sQLiteDatabaseA != null) {
                try {
                    sQLiteDatabaseA.endTransaction();
                } catch (Throwable unused6) {
                }
            }
            i.a(d).b();
            throw th;
        }
    }

    public String c(String str) {
        try {
            return TextUtils.isEmpty(e) ? str : Base64.encodeToString(DataHelper.encrypt(str.getBytes(), e.getBytes()), 0);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0062, code lost:
    
        if (r0 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0064, code lost:
    
        r0.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006d, code lost:
    
        if (r0 != null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(java.lang.String r5, java.lang.String r6, int r7) {
        /*
            r4 = this;
            r0 = 0
            android.content.Context r1 = com.umeng.analytics.pro.k.d     // Catch: java.lang.Throwable -> L61 android.database.sqlite.SQLiteDatabaseCorruptException -> L68
            com.umeng.analytics.pro.i r1 = com.umeng.analytics.pro.i.a(r1)     // Catch: java.lang.Throwable -> L61 android.database.sqlite.SQLiteDatabaseCorruptException -> L68
            android.database.sqlite.SQLiteDatabase r1 = r1.a()     // Catch: java.lang.Throwable -> L61 android.database.sqlite.SQLiteDatabaseCorruptException -> L68
            r1.beginTransaction()     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteDatabaseCorruptException -> L4f
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteDatabaseCorruptException -> L4f
            r2.<init>()     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteDatabaseCorruptException -> L4f
            java.lang.String r3 = "__i"
            r2.put(r3, r5)     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteDatabaseCorruptException -> L4f
            java.lang.String r5 = r4.c(r6)     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteDatabaseCorruptException -> L4f
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteDatabaseCorruptException -> L4f
            if (r6 != 0) goto L51
            java.lang.String r6 = "__a"
            r2.put(r6, r5)     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteDatabaseCorruptException -> L4f
            java.lang.String r5 = "__t"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteDatabaseCorruptException -> L4f
            r2.put(r5, r6)     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteDatabaseCorruptException -> L4f
            java.lang.String r5 = "__av"
            android.content.Context r6 = com.umeng.analytics.pro.k.d     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteDatabaseCorruptException -> L4f
            java.lang.String r6 = com.umeng.commonsdk.utils.UMUtils.getAppVersionName(r6)     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteDatabaseCorruptException -> L4f
            r2.put(r5, r6)     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteDatabaseCorruptException -> L4f
            java.lang.String r5 = "__vc"
            android.content.Context r6 = com.umeng.analytics.pro.k.d     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteDatabaseCorruptException -> L4f
            java.lang.String r6 = com.umeng.commonsdk.utils.UMUtils.getAppVersionCode(r6)     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteDatabaseCorruptException -> L4f
            r2.put(r5, r6)     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteDatabaseCorruptException -> L4f
            java.lang.String r5 = "__er"
            r1.insert(r5, r0, r2)     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteDatabaseCorruptException -> L4f
            goto L51
        L4c:
            r0 = r1
            goto L62
        L4f:
            r0 = r1
            goto L68
        L51:
            r1.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteDatabaseCorruptException -> L4f
            r1.endTransaction()     // Catch: java.lang.Throwable -> L57
        L57:
            android.content.Context r5 = com.umeng.analytics.pro.k.d
            com.umeng.analytics.pro.i r5 = com.umeng.analytics.pro.i.a(r5)
            r5.b()
            goto L70
        L61:
        L62:
            if (r0 == 0) goto L57
        L64:
            r0.endTransaction()     // Catch: java.lang.Throwable -> L57
            goto L57
        L68:
            android.content.Context r5 = com.umeng.analytics.pro.k.d     // Catch: java.lang.Throwable -> L72
            com.umeng.analytics.pro.j.a(r5)     // Catch: java.lang.Throwable -> L72
            if (r0 == 0) goto L57
            goto L64
        L70:
            r5 = 0
            return r5
        L72:
            r5 = move-exception
            if (r0 == 0) goto L78
            r0.endTransaction()     // Catch: java.lang.Throwable -> L78
        L78:
            android.content.Context r6 = com.umeng.analytics.pro.k.d
            com.umeng.analytics.pro.i r6 = com.umeng.analytics.pro.i.a(r6)
            r6.b()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.k.a(java.lang.String, java.lang.String, int):boolean");
    }

    private JSONArray b(JSONArray jSONArray) {
        JSONArray jSONArray2 = new JSONArray();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optLong("duration") > 0) {
                jSONArray2.put(jSONObjectOptJSONObject);
            }
        }
        return jSONArray2;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00de A[EXC_TOP_SPLITTER, PHI: r1 r13
  0x00de: PHI (r1v4 android.database.sqlite.SQLiteDatabase) = (r1v3 android.database.sqlite.SQLiteDatabase), (r1v6 android.database.sqlite.SQLiteDatabase) binds: [B:38:0x00dc, B:46:0x00f8] A[DONT_GENERATE, DONT_INLINE]
  0x00de: PHI (r13v5 ??) = (r13v4 ??), (r13v7 ??) binds: [B:38:0x00dc, B:46:0x00f8] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r13v0, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    private String b(JSONObject jSONObject, boolean z) {
        ?? r13;
        SQLiteDatabase sQLiteDatabaseA;
        ?? r0 = 0;
        String string = null;
        r0 = 0;
        r0 = 0;
        r0 = 0;
        cursor = null;
        cursor = null;
        Cursor cursor = null;
        Cursor cursor2 = null;
        try {
            try {
                sQLiteDatabaseA = i.a(d).a();
                try {
                    sQLiteDatabaseA.beginTransaction();
                    Cursor cursorA = a(g.c.f2567a, sQLiteDatabaseA, null, null, null, null, null, null, null);
                    if (cursorA != null) {
                        try {
                            JSONArray jSONArray = new JSONArray();
                            while (cursorA.moveToNext()) {
                                JSONObject jSONObject2 = new JSONObject();
                                String string2 = cursorA.getString(cursorA.getColumnIndex("__e"));
                                string = cursorA.getString(cursorA.getColumnIndex("__ii"));
                                this.l.add(string);
                                String string3 = cursorA.getString(cursorA.getColumnIndex("__sp"));
                                String string4 = cursorA.getString(cursorA.getColumnIndex("__pp"));
                                if (!TextUtils.isEmpty(string3)) {
                                    jSONObject2.put(f.aA, new JSONObject(d(string3)));
                                }
                                if (!TextUtils.isEmpty(string4)) {
                                    jSONObject2.put(f.aB, new JSONObject(d(string4)));
                                }
                                if (!TextUtils.isEmpty(string2)) {
                                    jSONObject2.put("id", string);
                                    jSONObject2.put(f.p, string2);
                                    if (jSONObject2.length() > 0) {
                                        jSONArray.put(jSONObject2);
                                    }
                                    if (z) {
                                        break;
                                    }
                                }
                            }
                            r0 = string;
                            if (jSONArray.length() > 0) {
                                jSONObject.put(f.n, jSONArray);
                                r0 = string;
                            }
                        } catch (SQLiteDatabaseCorruptException unused) {
                            r13 = r0;
                            cursor = cursorA;
                            j.a(d);
                            if (cursor != null) {
                                cursor.close();
                            }
                            if (sQLiteDatabaseA != null) {
                                try {
                                    sQLiteDatabaseA.endTransaction();
                                } catch (Throwable unused2) {
                                }
                            }
                            i.a(d).b();
                            r0 = r13;
                        } catch (Throwable unused3) {
                            r13 = r0;
                            cursor2 = cursorA;
                            j.a(d);
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            if (sQLiteDatabaseA != null) {
                                sQLiteDatabaseA.endTransaction();
                            }
                            i.a(d).b();
                            r0 = r13;
                        }
                    }
                    sQLiteDatabaseA.setTransactionSuccessful();
                    if (cursorA != null) {
                        cursorA.close();
                    }
                    try {
                        sQLiteDatabaseA.endTransaction();
                    } catch (Throwable unused4) {
                    }
                    i.a(d).b();
                } catch (SQLiteDatabaseCorruptException unused5) {
                    r13 = 0;
                } catch (Throwable unused6) {
                    r13 = 0;
                }
            } catch (SQLiteDatabaseCorruptException unused7) {
                r13 = 0;
                sQLiteDatabaseA = null;
            } catch (Throwable unused8) {
                r13 = 0;
                sQLiteDatabaseA = null;
            }
            return r0;
        } catch (Throwable th) {
            if (r0 != 0) {
                r0.close();
            }
            if (sQLiteDatabaseA != null) {
                try {
                    sQLiteDatabaseA.endTransaction();
                } catch (Throwable unused9) {
                }
            }
            i.a(d).b();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0090, code lost:
    
        if (r2 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0092, code lost:
    
        r2.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009b, code lost:
    
        if (r2 != null) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(java.lang.String r7, org.json.JSONObject r8, com.umeng.analytics.pro.k.a r9) {
        /*
            r6 = this;
            java.lang.String r0 = "__e"
            r1 = 0
            if (r8 != 0) goto L6
            return r1
        L6:
            r2 = 0
            android.content.Context r3 = com.umeng.analytics.pro.k.d     // Catch: java.lang.Throwable -> L8f android.database.sqlite.SQLiteDatabaseCorruptException -> L96
            com.umeng.analytics.pro.i r3 = com.umeng.analytics.pro.i.a(r3)     // Catch: java.lang.Throwable -> L8f android.database.sqlite.SQLiteDatabaseCorruptException -> L96
            android.database.sqlite.SQLiteDatabase r3 = r3.a()     // Catch: java.lang.Throwable -> L8f android.database.sqlite.SQLiteDatabaseCorruptException -> L96
            r3.beginTransaction()     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L52
            com.umeng.analytics.pro.k$a r4 = com.umeng.analytics.pro.k.a.BEGIN     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L52
            if (r9 != r4) goto L54
            java.lang.Object r8 = r8.opt(r0)     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L52
            java.lang.Long r8 = (java.lang.Long) r8     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L52
            long r8 = r8.longValue()     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L52
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L52
            r4.<init>()     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L52
            java.lang.String r5 = "__ii"
            r4.put(r5, r7)     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L52
            java.lang.String r7 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L52
            r4.put(r0, r7)     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L52
            java.lang.String r7 = "__av"
            android.content.Context r8 = com.umeng.analytics.pro.k.d     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L52
            java.lang.String r8 = com.umeng.commonsdk.utils.UMUtils.getAppVersionName(r8)     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L52
            r4.put(r7, r8)     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L52
            java.lang.String r7 = "__vc"
            android.content.Context r8 = com.umeng.analytics.pro.k.d     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L52
            java.lang.String r8 = com.umeng.commonsdk.utils.UMUtils.getAppVersionCode(r8)     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L52
            r4.put(r7, r8)     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L52
            java.lang.String r7 = "__sd"
            r3.insert(r7, r2, r4)     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L52
            goto L7f
        L4f:
            r2 = r3
            goto L90
        L52:
            r2 = r3
            goto L96
        L54:
            com.umeng.analytics.pro.k$a r0 = com.umeng.analytics.pro.k.a.INSTANTSESSIONBEGIN     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L52
            if (r9 != r0) goto L5c
            r6.b(r7, r8, r3)     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L52
            goto L7f
        L5c:
            com.umeng.analytics.pro.k$a r0 = com.umeng.analytics.pro.k.a.END     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L52
            if (r9 != r0) goto L64
            r6.a(r7, r8, r3)     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L52
            goto L7f
        L64:
            com.umeng.analytics.pro.k$a r0 = com.umeng.analytics.pro.k.a.PAGE     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L52
            if (r9 != r0) goto L6e
            java.lang.String r9 = "__a"
            r6.a(r7, r8, r3, r9)     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L52
            goto L7f
        L6e:
            com.umeng.analytics.pro.k$a r0 = com.umeng.analytics.pro.k.a.AUTOPAGE     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L52
            if (r9 != r0) goto L78
            java.lang.String r9 = "__b"
            r6.a(r7, r8, r3, r9)     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L52
            goto L7f
        L78:
            com.umeng.analytics.pro.k$a r0 = com.umeng.analytics.pro.k.a.NEWSESSION     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L52
            if (r9 != r0) goto L7f
            r6.c(r7, r8, r3)     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L52
        L7f:
            r3.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L52
            r3.endTransaction()     // Catch: java.lang.Throwable -> L85
        L85:
            android.content.Context r7 = com.umeng.analytics.pro.k.d
            com.umeng.analytics.pro.i r7 = com.umeng.analytics.pro.i.a(r7)
            r7.b()
            goto L9e
        L8f:
        L90:
            if (r2 == 0) goto L85
        L92:
            r2.endTransaction()     // Catch: java.lang.Throwable -> L85
            goto L85
        L96:
            android.content.Context r7 = com.umeng.analytics.pro.k.d     // Catch: java.lang.Throwable -> L9f
            com.umeng.analytics.pro.j.a(r7)     // Catch: java.lang.Throwable -> L9f
            if (r2 == 0) goto L85
            goto L92
        L9e:
            return r1
        L9f:
            r7 = move-exception
            if (r2 == 0) goto La5
            r2.endTransaction()     // Catch: java.lang.Throwable -> La5
        La5:
            android.content.Context r8 = com.umeng.analytics.pro.k.d
            com.umeng.analytics.pro.i r8 = com.umeng.analytics.pro.i.a(r8)
            r8.b()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.k.a(java.lang.String, org.json.JSONObject, com.umeng.analytics.pro.k$a):boolean");
    }

    private void a(String str, JSONObject jSONObject, SQLiteDatabase sQLiteDatabase) {
        String strC;
        try {
            long jLongValue = ((Long) jSONObject.opt(g.d.a.g)).longValue();
            Object objOpt = jSONObject.opt(g.d.a.h);
            long jLongValue2 = (objOpt == null || !(objOpt instanceof Long)) ? 0L : ((Long) objOpt).longValue();
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("__sp");
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("__pp");
            String strC2 = "";
            if (jSONObjectOptJSONObject == null || jSONObjectOptJSONObject.length() <= 0) {
                strC = "";
            } else {
                strC = c(jSONObjectOptJSONObject.toString());
            }
            if (jSONObjectOptJSONObject2 != null && jSONObjectOptJSONObject2.length() > 0) {
                strC2 = c(jSONObjectOptJSONObject2.toString());
            }
            sQLiteDatabase.execSQL("update __sd set __f=\"" + jLongValue + "\", __g=\"" + jLongValue2 + "\", __sp=\"" + strC + "\", __pp=\"" + strC2 + "\" where __ii=\"" + str + "\"");
        } catch (Throwable unused) {
        }
    }

    public void b(boolean z, boolean z2) {
        SQLiteDatabase sQLiteDatabaseA = null;
        try {
            try {
                sQLiteDatabaseA = i.a(d).a();
                sQLiteDatabaseA.beginTransaction();
                if (z2) {
                    if (z) {
                        sQLiteDatabaseA.execSQL("delete from __sd");
                    }
                } else if (this.i.size() > 0) {
                    for (int i = 0; i < this.i.size(); i++) {
                        sQLiteDatabaseA.execSQL("delete from __sd where __ii=\"" + this.i.get(i) + "\"");
                    }
                }
                sQLiteDatabaseA.setTransactionSuccessful();
            } catch (SQLiteDatabaseCorruptException unused) {
                j.a(d);
            } catch (Throwable unused2) {
                if (sQLiteDatabaseA != null) {
                }
            }
        } finally {
            if (sQLiteDatabaseA != null) {
                try {
                    sQLiteDatabaseA.endTransaction();
                } catch (Throwable unused3) {
                }
            }
            i.a(d).b();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005b A[Catch: Exception -> 0x005e, TRY_LEAVE, TryCatch #0 {Exception -> 0x005e, blocks: (B:19:0x0056, B:21:0x005b), top: B:31:0x0056 }] */
    public long a(String str) throws Throwable {
        SQLiteDatabase sQLiteDatabaseA;
        Cursor cursorA = null;
        long j = 0;
        try {
            try {
                sQLiteDatabaseA = i.a(d).a();
                try {
                    sQLiteDatabaseA.beginTransaction();
                    cursorA = a(g.d.f2570a, sQLiteDatabaseA, new String[]{g.d.a.g}, "__ii=? ", new String[]{str}, null, null, null, null);
                    if (cursorA != null) {
                        cursorA.moveToFirst();
                        j = cursorA.getLong(cursorA.getColumnIndex(g.d.a.g));
                    }
                    if (cursorA != null) {
                        cursorA.close();
                    }
                } catch (Exception unused) {
                    if (cursorA != null) {
                        cursorA.close();
                    }
                    if (sQLiteDatabaseA != null) {
                    }
                    i.a(d).b();
                    return j;
                } catch (Throwable th) {
                    th = th;
                    if (cursorA != null) {
                        try {
                            cursorA.close();
                            if (sQLiteDatabaseA != null) {
                                sQLiteDatabaseA.endTransaction();
                            }
                        } catch (Exception unused2) {
                            i.a(d).b();
                            throw th;
                        }
                    } else if (sQLiteDatabaseA != null) {
                        sQLiteDatabaseA.endTransaction();
                    }
                    i.a(d).b();
                    throw th;
                }
            } catch (Exception unused3) {
                sQLiteDatabaseA = null;
            } catch (Throwable th2) {
                th = th2;
                sQLiteDatabaseA = null;
            }
            sQLiteDatabaseA.endTransaction();
        } catch (Exception unused4) {
        }
        i.a(d).b();
        return j;
    }

    public void b(String str) {
        SQLiteDatabase sQLiteDatabaseA = null;
        try {
            try {
                sQLiteDatabaseA = i.a(d).a();
                sQLiteDatabaseA.beginTransaction();
                if (!TextUtils.isEmpty(str)) {
                    sQLiteDatabaseA.execSQL("delete from __is where __ii=\"" + str + "\"");
                }
                sQLiteDatabaseA.setTransactionSuccessful();
            } catch (SQLiteDatabaseCorruptException unused) {
                j.a(d);
            } catch (Throwable unused2) {
                if (sQLiteDatabaseA != null) {
                }
            }
        } finally {
            if (sQLiteDatabaseA != null) {
                try {
                    sQLiteDatabaseA.endTransaction();
                } catch (Throwable unused3) {
                }
            }
            i.a(d).b();
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0058 A[Catch: all -> 0x0065, LOOP:1: B:54:0x0052->B:25:0x0058, LOOP_END, TryCatch #1 {all -> 0x0065, blocks: (B:23:0x0052, B:25:0x0058, B:27:0x0069, B:29:0x0074, B:30:0x0079, B:37:0x0088, B:39:0x008e, B:41:0x0094, B:43:0x009a, B:45:0x00a8, B:42:0x0097), top: B:54:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0074 A[Catch: all -> 0x0065, TryCatch #1 {all -> 0x0065, blocks: (B:23:0x0052, B:25:0x0058, B:27:0x0069, B:29:0x0074, B:30:0x0079, B:37:0x0088, B:39:0x008e, B:41:0x0094, B:43:0x009a, B:45:0x00a8, B:42:0x0097), top: B:54:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0081 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0083  */
    /* JADX WARN: Code duplicated, block: B:36:0x0087  */
    /* JADX WARN: Code duplicated, block: B:41:0x0094 A[Catch: all -> 0x0065, TRY_ENTER, TryCatch #1 {all -> 0x0065, blocks: (B:23:0x0052, B:25:0x0058, B:27:0x0069, B:29:0x0074, B:30:0x0079, B:37:0x0088, B:39:0x008e, B:41:0x0094, B:43:0x009a, B:45:0x00a8, B:42:0x0097), top: B:54:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00a8 A[Catch: all -> 0x0065, TRY_LEAVE, TryCatch #1 {all -> 0x0065, blocks: (B:23:0x0052, B:25:0x0058, B:27:0x0069, B:29:0x0074, B:30:0x0079, B:37:0x0088, B:39:0x008e, B:41:0x0094, B:43:0x009a, B:45:0x00a8, B:42:0x0097), top: B:54:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:54:0x0052 A[EXC_TOP_SPLITTER, LOOP:1: B:54:0x0052->B:25:0x0058, LOOP_START, PHI: r13
  0x0052: PHI (r13v2 java.lang.String) = (r13v7 java.lang.String), (r13v3 java.lang.String) binds: [B:22:0x0050, B:25:0x0058] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x008e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:45:0x00a8, please report this as an issue */
    @SuppressLint({"Range"})
    private void a(String str, JSONObject jSONObject, SQLiteDatabase sQLiteDatabase, String str2) throws JSONException {
        JSONArray jSONArray;
        JSONArray jSONArrayOptJSONArray;
        Cursor cursorA;
        JSONArray jSONArray2;
        int i;
        String strC;
        JSONObject jSONObject2;
        Cursor cursor = null;
        strD = null;
        String strD = null;
        try {
            if ("__a".equals(str2)) {
                jSONArrayOptJSONArray = jSONObject.optJSONArray("__a");
                if (jSONArrayOptJSONArray == null) {
                    return;
                }
                if (jSONArrayOptJSONArray.length() <= 0) {
                    return;
                }
            } else {
                if (g.d.a.c.equals(str2)) {
                    jSONArrayOptJSONArray = jSONObject.optJSONArray(g.d.a.c);
                    if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
                        return;
                    }
                } else {
                    jSONArray = null;
                }
                cursorA = a(g.d.f2570a, sQLiteDatabase, new String[]{str2}, "__ii=? ", new String[]{str}, null, null, null, null);
                if (cursorA != null) {
                    while (cursorA.moveToNext()) {
                        try {
                            strD = d(cursorA.getString(cursorA.getColumnIndex(str2)));
                        } catch (Throwable unused) {
                            cursor = cursorA;
                            if (cursor != null) {
                                cursor.close();
                                return;
                            }
                            return;
                        }
                    }
                }
                jSONArray2 = new JSONArray();
                if (!TextUtils.isEmpty(strD)) {
                    jSONArray2 = new JSONArray(strD);
                }
                if (jSONArray2.length() > 1000) {
                    if (cursorA != null) {
                        cursorA.close();
                        return;
                    }
                    return;
                }
                for (i = 0; i < jSONArray.length(); i++) {
                    try {
                        jSONObject2 = jSONArray.getJSONObject(i);
                        if (jSONObject2 != null) {
                            jSONArray2.put(jSONObject2);
                        }
                    } catch (JSONException unused2) {
                    }
                }
                strC = c(jSONArray2.toString());
                if (!TextUtils.isEmpty(strC)) {
                    sQLiteDatabase.execSQL("update __sd set " + str2 + "=\"" + strC + "\" where __ii=\"" + str + "\"");
                }
                if (cursorA != null) {
                    cursorA.close();
                }
            }
            jSONArray = jSONArrayOptJSONArray;
            cursorA = a(g.d.f2570a, sQLiteDatabase, new String[]{str2}, "__ii=? ", new String[]{str}, null, null, null, null);
            if (cursorA != null) {
                while (cursorA.moveToNext()) {
                    strD = d(cursorA.getString(cursorA.getColumnIndex(str2)));
                }
            }
            jSONArray2 = new JSONArray();
            if (!TextUtils.isEmpty(strD)) {
                jSONArray2 = new JSONArray(strD);
            }
            if (jSONArray2.length() > 1000) {
                if (cursorA != null) {
                    cursorA.close();
                    return;
                }
                return;
            }
            while (i < jSONArray.length()) {
                jSONObject2 = jSONArray.getJSONObject(i);
                if (jSONObject2 != null) {
                    jSONArray2.put(jSONObject2);
                }
            }
            strC = c(jSONArray2.toString());
            if (!TextUtils.isEmpty(strC)) {
                sQLiteDatabase.execSQL("update __sd set " + str2 + "=\"" + strC + "\" where __ii=\"" + str + "\"");
            }
            if (cursorA != null) {
                cursorA.close();
            }
        } catch (Throwable unused3) {
        }
    }

    public JSONObject a(boolean z) {
        a();
        this.j.clear();
        JSONObject jSONObject = new JSONObject();
        if (!z) {
            a(jSONObject, z);
            b(jSONObject, (String) null);
            a(jSONObject, (String) null);
        } else {
            String strA = a(jSONObject, z);
            if (!TextUtils.isEmpty(strA)) {
                b(jSONObject, strA);
                a(jSONObject, strA);
            }
        }
        return jSONObject;
    }

    private void a(JSONObject jSONObject, String str) {
        SQLiteDatabase sQLiteDatabaseA;
        Cursor cursorA;
        JSONArray jSONArray;
        JSONArray jSONArray2;
        Cursor cursor = null;
        try {
            try {
                sQLiteDatabaseA = i.a(d).a();
                try {
                    sQLiteDatabaseA.beginTransaction();
                    if (!TextUtils.isEmpty(str)) {
                        cursorA = a(g.b.f2564a, sQLiteDatabaseA, null, "__i=? ", new String[]{str}, null, null, null, null);
                    } else {
                        cursorA = a(g.b.f2564a, sQLiteDatabaseA, null, null, null, null, null, null, null);
                    }
                    cursor = cursorA;
                    if (cursor != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        JSONObject jSONObject3 = new JSONObject();
                        String strB = w.a().b();
                        while (cursor.moveToNext()) {
                            int i = cursor.getInt(cursor.getColumnIndex("__t"));
                            String string = cursor.getString(cursor.getColumnIndex("__i"));
                            String string2 = cursor.getString(cursor.getColumnIndex("__s"));
                            if (TextUtils.isEmpty(string) || "-1".equals(string)) {
                                if (!TextUtils.isEmpty(strB)) {
                                    string = strB;
                                }
                            }
                            this.j.add(Integer.valueOf(cursor.getInt(0)));
                            if (i != 2049) {
                                if (i == 2050 && !TextUtils.isEmpty(string2)) {
                                    JSONObject jSONObject4 = new JSONObject(d(string2));
                                    if (jSONObject3.has(string)) {
                                        jSONArray = jSONObject3.optJSONArray(string);
                                    } else {
                                        jSONArray = new JSONArray();
                                    }
                                    jSONArray.put(jSONObject4);
                                    jSONObject3.put(string, jSONArray);
                                }
                            } else if (!TextUtils.isEmpty(string2)) {
                                JSONObject jSONObject5 = new JSONObject(d(string2));
                                if (jSONObject2.has(string)) {
                                    jSONArray2 = jSONObject2.optJSONArray(string);
                                } else {
                                    jSONArray2 = new JSONArray();
                                }
                                jSONArray2.put(jSONObject5);
                                jSONObject2.put(string, jSONArray2);
                            }
                        }
                        if (jSONObject2.length() > 0) {
                            JSONArray jSONArray3 = new JSONArray();
                            Iterator<String> itKeys = jSONObject2.keys();
                            while (itKeys.hasNext()) {
                                JSONObject jSONObject6 = new JSONObject();
                                String next = itKeys.next();
                                jSONObject6.put(next, new JSONArray(jSONObject2.optString(next)));
                                if (jSONObject6.length() > 0) {
                                    jSONArray3.put(jSONObject6);
                                }
                            }
                            if (jSONArray3.length() > 0) {
                                jSONObject.put("ekv", jSONArray3);
                            }
                        }
                        if (jSONObject3.length() > 0) {
                            JSONArray jSONArray4 = new JSONArray();
                            Iterator<String> itKeys2 = jSONObject3.keys();
                            while (itKeys2.hasNext()) {
                                JSONObject jSONObject7 = new JSONObject();
                                String next2 = itKeys2.next();
                                jSONObject7.put(next2, new JSONArray(jSONObject3.optString(next2)));
                                if (jSONObject7.length() > 0) {
                                    jSONArray4.put(jSONObject7);
                                }
                            }
                            if (jSONArray4.length() > 0) {
                                jSONObject.put(f.Z, jSONArray4);
                            }
                        }
                    }
                    sQLiteDatabaseA.setTransactionSuccessful();
                    if (cursor != null) {
                        cursor.close();
                    }
                } catch (SQLiteDatabaseCorruptException unused) {
                    j.a(d);
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (sQLiteDatabaseA != null) {
                    }
                    i.a(d).b();
                } catch (Throwable unused2) {
                    j.a(d);
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (sQLiteDatabaseA != null) {
                    }
                    i.a(d).b();
                }
            } catch (SQLiteDatabaseCorruptException unused3) {
                sQLiteDatabaseA = null;
            } catch (Throwable unused4) {
                sQLiteDatabaseA = null;
            }
            try {
                sQLiteDatabaseA.endTransaction();
            } catch (Throwable unused5) {
            }
            i.a(d).b();
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            if (sQLiteDatabaseA != null) {
                try {
                    sQLiteDatabaseA.endTransaction();
                } catch (Throwable unused6) {
                }
            }
            i.a(d).b();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x023b  */
    /* JADX WARN: Code duplicated, block: B:123:0x020e A[EXC_TOP_SPLITTER, PHI: r0 r12 r14
  0x020e: PHI (r0v6 java.lang.String) = (r0v2 java.lang.String), (r0v3 java.lang.String), (r0v39 java.lang.String), (r0v39 java.lang.String) binds: [B:94:0x022f, B:101:0x023e, B:83:0x0209, B:84:0x020b] A[DONT_GENERATE, DONT_INLINE]
  0x020e: PHI (r12v6 android.database.sqlite.SQLiteDatabase) = 
  (r12v3 android.database.sqlite.SQLiteDatabase)
  (r12v4 android.database.sqlite.SQLiteDatabase)
  (r12v7 android.database.sqlite.SQLiteDatabase)
  (r12v7 android.database.sqlite.SQLiteDatabase)
 binds: [B:94:0x022f, B:101:0x023e, B:83:0x0209, B:84:0x020b] A[DONT_GENERATE, DONT_INLINE]
  0x020e: PHI (r14v6 android.database.Cursor) = 
  (r14v3 android.database.Cursor)
  (r14v4 android.database.Cursor)
  (r14v33 android.database.Cursor)
  (r14v33 android.database.Cursor)
 binds: [B:94:0x022f, B:101:0x023e, B:83:0x0209, B:84:0x020b] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x022c  */
    private String a(JSONObject jSONObject, boolean z) {
        SQLiteDatabase sQLiteDatabaseA;
        Cursor cursorA;
        JSONArray jSONArray;
        String str;
        String string = null;
        try {
            try {
                sQLiteDatabaseA = i.a(d).a();
                try {
                    sQLiteDatabaseA.beginTransaction();
                    cursorA = a(g.d.f2570a, sQLiteDatabaseA, null, null, null, null, null, null, null);
                    if (cursorA != null) {
                        try {
                            JSONArray jSONArray2 = new JSONArray();
                            while (true) {
                                if (!cursorA.moveToNext()) {
                                    cursorA = cursorA;
                                    jSONArray = jSONArray2;
                                    break;
                                }
                                JSONObject jSONObject2 = new JSONObject();
                                String string2 = cursorA.getString(cursorA.getColumnIndex(g.d.a.g));
                                String string3 = cursorA.getString(cursorA.getColumnIndex("__e"));
                                String string4 = cursorA.getString(cursorA.getColumnIndex(g.d.a.h));
                                string = cursorA.getString(cursorA.getColumnIndex("__ii"));
                                try {
                                    if (TextUtils.isEmpty(string2) || TextUtils.isEmpty(string3)) {
                                        str = string;
                                        cursorA = cursorA;
                                        jSONArray = jSONArray2;
                                    } else {
                                        if (Long.parseLong(string2) - Long.parseLong(string3) > 0) {
                                            String string5 = cursorA.getString(cursorA.getColumnIndex("__a"));
                                            String string6 = cursorA.getString(cursorA.getColumnIndex(g.d.a.c));
                                            String string7 = cursorA.getString(cursorA.getColumnIndex(g.d.a.d));
                                            String string8 = cursorA.getString(cursorA.getColumnIndex(g.d.a.e));
                                            this.i.add(string);
                                            String string9 = cursorA.getString(cursorA.getColumnIndex("__sp"));
                                            String string10 = cursorA.getString(cursorA.getColumnIndex("__pp"));
                                            jSONObject2.put("id", string);
                                            jSONObject2.put(f.p, string3);
                                            jSONObject2.put(f.q, string2);
                                            str = string;
                                            if (!FieldManager.allow(com.umeng.commonsdk.utils.d.E)) {
                                                jSONObject2.put("duration", Long.parseLong(string2) - Long.parseLong(string3));
                                            } else {
                                                try {
                                                    if (Long.parseLong(string4) <= 0) {
                                                        jSONObject2.put("duration", Long.parseLong(string2) - Long.parseLong(string3));
                                                    } else {
                                                        jSONObject2.put("duration", Long.parseLong(string4));
                                                        jSONObject2.put(f.s, Long.parseLong(string2) - Long.parseLong(string3));
                                                    }
                                                } catch (SQLiteDatabaseCorruptException unused) {
                                                    cursorA = cursorA;
                                                    string = str;
                                                    j.a(d);
                                                    if (cursorA != null) {
                                                        cursorA.close();
                                                    }
                                                    if (sQLiteDatabaseA != null) {
                                                        sQLiteDatabaseA.endTransaction();
                                                    }
                                                    i.a(d).b();
                                                    return string;
                                                } catch (Throwable unused2) {
                                                    cursorA = cursorA;
                                                    string = str;
                                                    j.a(d);
                                                    if (cursorA != null) {
                                                        cursorA.close();
                                                    }
                                                    if (sQLiteDatabaseA != null) {
                                                        sQLiteDatabaseA.endTransaction();
                                                    }
                                                    i.a(d).b();
                                                    return string;
                                                }
                                            }
                                            try {
                                                if (!TextUtils.isEmpty(string5)) {
                                                    jSONObject2.put(f.t, new JSONArray(d(string5)));
                                                }
                                                boolean z2 = UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION == MobclickAgent.PageMode.AUTO;
                                                if (!TextUtils.isEmpty(string6) && z2) {
                                                    JSONArray jSONArray3 = new JSONArray(d(string6));
                                                    JSONArray jSONArray4 = new JSONArray();
                                                    if (jSONArray3.length() > 0) {
                                                        jSONArray4 = b(jSONArray3);
                                                    }
                                                    jSONObject2.put(f.u, jSONArray4);
                                                }
                                                if (!TextUtils.isEmpty(string7)) {
                                                    jSONObject2.put(f.F, new JSONObject(d(string7)));
                                                }
                                                if (!TextUtils.isEmpty(string8)) {
                                                    jSONObject2.put(f.B, new JSONArray(d(string8)));
                                                }
                                                if (!TextUtils.isEmpty(string9)) {
                                                    jSONObject2.put(f.aA, new JSONObject(d(string9)));
                                                }
                                                if (!TextUtils.isEmpty(string10)) {
                                                    jSONObject2.put(f.aB, new JSONObject(d(string10)));
                                                }
                                                if (jSONObject2.length() > 0) {
                                                    jSONArray = jSONArray2;
                                                    jSONArray.put(jSONObject2);
                                                } else {
                                                    jSONArray = jSONArray2;
                                                }
                                            } catch (SQLiteDatabaseCorruptException unused3) {
                                                string = str;
                                                j.a(d);
                                                if (cursorA != null) {
                                                    cursorA.close();
                                                }
                                                if (sQLiteDatabaseA != null) {
                                                }
                                                i.a(d).b();
                                                return string;
                                            } catch (Throwable unused4) {
                                                string = str;
                                                j.a(d);
                                                if (cursorA != null) {
                                                    cursorA.close();
                                                }
                                                if (sQLiteDatabaseA != null) {
                                                }
                                                i.a(d).b();
                                                return string;
                                            }
                                        } else {
                                            str = string;
                                            cursorA = cursorA;
                                            jSONArray = jSONArray2;
                                        }
                                        if (z) {
                                            string = str;
                                            break;
                                        }
                                    }
                                    jSONArray2 = jSONArray;
                                    cursorA = cursorA;
                                    string = str;
                                } catch (SQLiteDatabaseCorruptException unused5) {
                                    cursorA = cursorA;
                                    j.a(d);
                                    if (cursorA != null) {
                                        cursorA.close();
                                    }
                                    if (sQLiteDatabaseA != null) {
                                        sQLiteDatabaseA.endTransaction();
                                    }
                                    i.a(d).b();
                                    return string;
                                } catch (Throwable unused6) {
                                    cursorA = cursorA;
                                    j.a(d);
                                    if (cursorA != null) {
                                        cursorA.close();
                                    }
                                    if (sQLiteDatabaseA != null) {
                                        sQLiteDatabaseA.endTransaction();
                                    }
                                    i.a(d).b();
                                    return string;
                                }
                            }
                            try {
                                if (this.i.size() < 1) {
                                    cursorA.close();
                                    try {
                                        sQLiteDatabaseA.endTransaction();
                                    } catch (Throwable unused7) {
                                    }
                                    i.a(d).b();
                                    return string;
                                }
                                if (jSONArray.length() > 0) {
                                    jSONObject.put(f.n, jSONArray);
                                }
                            } catch (SQLiteDatabaseCorruptException unused8) {
                                j.a(d);
                                if (cursorA != null) {
                                    cursorA.close();
                                }
                                if (sQLiteDatabaseA != null) {
                                }
                                i.a(d).b();
                                return string;
                            } catch (Throwable unused9) {
                                j.a(d);
                                if (cursorA != null) {
                                    cursorA.close();
                                }
                                if (sQLiteDatabaseA != null) {
                                }
                                i.a(d).b();
                                return string;
                            }
                        } catch (SQLiteDatabaseCorruptException unused10) {
                        } catch (Throwable unused11) {
                        }
                    } else {
                        cursorA = cursorA;
                    }
                    sQLiteDatabaseA.setTransactionSuccessful();
                    if (cursorA != null) {
                        cursorA.close();
                    }
                } catch (SQLiteDatabaseCorruptException unused12) {
                    cursorA = null;
                } catch (Throwable unused13) {
                    cursorA = null;
                }
            } catch (SQLiteDatabaseCorruptException unused14) {
                sQLiteDatabaseA = null;
                cursorA = null;
            } catch (Throwable unused15) {
                sQLiteDatabaseA = null;
                cursorA = null;
            }
            try {
                sQLiteDatabaseA.endTransaction();
            } catch (Throwable unused16) {
            }
            i.a(d).b();
            return string;
        } catch (Throwable th) {
            if (cursorA != null) {
                cursorA.close();
            }
            if (sQLiteDatabaseA != null) {
                try {
                    sQLiteDatabaseA.endTransaction();
                } catch (Throwable unused17) {
                }
            }
            i.a(d).b();
            throw th;
        }
    }

    public void a(boolean z, boolean z2) {
        SQLiteDatabase sQLiteDatabaseA = null;
        try {
            try {
                sQLiteDatabaseA = i.a(d).a();
                sQLiteDatabaseA.beginTransaction();
                if (!z2) {
                    int size = this.l.size();
                    if (size > 0) {
                        boolean z3 = false;
                        for (int i = 0; i < size; i++) {
                            String str = this.l.get(i);
                            if (str == null) {
                                z3 = true;
                            }
                            sQLiteDatabaseA.execSQL("delete from __is where __ii=\"" + str + "\"");
                        }
                        if (z3) {
                            sQLiteDatabaseA.execSQL("delete from __is where __ii is null");
                        }
                    }
                } else if (z) {
                    sQLiteDatabaseA.execSQL("delete from __is");
                }
                sQLiteDatabaseA.setTransactionSuccessful();
            } catch (SQLiteDatabaseCorruptException unused) {
                j.a(d);
                if (sQLiteDatabaseA != null) {
                }
                i.a(d).b();
            } catch (Throwable unused2) {
                j.a(d);
                if (sQLiteDatabaseA != null) {
                }
                i.a(d).b();
            }
            try {
                sQLiteDatabaseA.endTransaction();
            } catch (Throwable unused3) {
            }
            i.a(d).b();
        } catch (Throwable th) {
            if (sQLiteDatabaseA != null) {
                try {
                    sQLiteDatabaseA.endTransaction();
                } catch (Throwable unused4) {
                }
            }
            i.a(d).b();
            throw th;
        }
    }

    public void a(boolean z, String str) {
        SQLiteDatabase sQLiteDatabaseA = null;
        try {
            try {
                sQLiteDatabaseA = i.a(d).a();
                sQLiteDatabaseA.beginTransaction();
                if (!TextUtils.isEmpty(str)) {
                    sQLiteDatabaseA.execSQL("delete from __er where __i=\"" + str + "\"");
                    sQLiteDatabaseA.execSQL("delete from __et where __i=\"" + str + "\"");
                    this.j.clear();
                    sQLiteDatabaseA.execSQL("delete from __sd where __ii=\"" + str + "\"");
                }
                sQLiteDatabaseA.setTransactionSuccessful();
            } catch (SQLiteDatabaseCorruptException unused) {
                j.a(d);
            } catch (Throwable unused2) {
                if (sQLiteDatabaseA != null) {
                }
            }
        } finally {
            if (sQLiteDatabaseA != null) {
                try {
                    sQLiteDatabaseA.endTransaction();
                } catch (Throwable unused3) {
                }
            }
            i.a(d).b();
        }
    }
}
