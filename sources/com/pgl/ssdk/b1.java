package com.pgl.ssdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.umeng.analytics.pro.bc;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f2424a = 504;
    public static String b = null;
    public static String c = "";
    static boolean d;
    private static long e;
    private static Context f;

    public static void a(Context context, String str) {
        a(context, str, null);
    }

    public static synchronized String b() {
        try {
            if (TextUtils.isEmpty(c)) {
                c = (String) com.pgl.ssdk.ces.a.meta(303, f, null);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c;
    }

    public static void c() {
        Context context = f;
        if (context != null) {
            f2424a = 102;
            o0.b(new c1(context, null));
            com.pgl.ssdk.ces.b.h().a();
            x.a();
        }
    }

    public static void a(Context context, String str, d1 d1Var) {
        if (f == null) {
            f = context;
        }
        int i = f2424a;
        if (i == 102 || i == 202 || i == 200) {
            return;
        }
        e = System.currentTimeMillis();
        d = false;
        b = str;
        f2424a = 102;
        o0.b(new c1(context, d1Var));
    }

    public static synchronized Object a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return com.pgl.ssdk.ces.a.meta(302, f, bArr);
    }

    public static String a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(bc.x, AnalyticsConstants.SDK_TYPE);
            jSONObject.put("version", "6.5.0.0.overseas-rc.1");
            String str = c;
            if (str != null && str.length() > 0) {
                jSONObject.put("token_id", c);
            } else {
                try {
                    jSONObject.put("token_id", b());
                } catch (Throwable unused) {
                    jSONObject.put("token_id", "");
                }
            }
            jSONObject.put("code", f2424a);
            return Base64.encodeToString(jSONObject.toString().getBytes(), 2);
        } catch (Throwable unused2) {
            r0.a("getGrilock Error");
            return "";
        }
    }
}
