package com.smartdigimkt.v0;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.smartdigimkt.expressad.atsignalcommon.webEnvCheck.WebEnvCheckEntry;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f38978a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f38979b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f38980c = "";
    private static boolean d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f38981e = false;
    private static boolean f = false;

    public static String a() {
        if (d) {
            return f38979b;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            int i2 = com.smartdigimkt.n8.c.g() == 2 ? 0 : 1;
            String strF = com.smartdigimkt.n8.c.f();
            jSONObject.put("status", i2);
            jSONObject.put("amazonId", strF);
            String string = jSONObject.toString();
            if (!TextUtils.isEmpty(string)) {
                f38980c = string;
                f38979b = com.smartdigimkt.r4.a.c(string);
            }
        } catch (Throwable unused) {
        }
        d = true;
        return f38979b;
    }

    public static void b(Context context) {
    }

    public static void c(Context context) {
        if (context == null) {
            return;
        }
        try {
            WebEnvCheckEntry.class.getMethod("check", Context.class).invoke(WebEnvCheckEntry.class.newInstance(), context);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static String b() {
        if (TextUtils.isEmpty(f38980c) && !d) {
            a();
        }
        return f38980c;
    }

    public static boolean a(Context context) {
        try {
            if (f) {
                return f38981e;
            }
            if (Build.VERSION.SDK_INT >= 30) {
                f38981e = context.getPackageManager().checkPermission(com.smartdigimkt.r4.a.b("DkP3hrKuHoPMH+zwL+fALkK/WQc5x5zH+TcincKNNVfWNVJcVM=="), context.getPackageName()) == 0;
            } else {
                f38981e = true;
            }
            f = true;
            return f38981e;
        } catch (Exception unused) {
            f38981e = false;
        }
    }
}
