package com.iab.omid.library.applovin.utils;

import android.os.Build;
import com.ironsource.O6;
import com.ironsource.X3;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public static String a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    public static String b() {
        return X3.f27645d;
    }

    public static String c() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    public static JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        c.a(jSONObject, "deviceType", a());
        c.a(jSONObject, "osVersion", c());
        c.a(jSONObject, O6.F, b());
        return jSONObject;
    }
}
