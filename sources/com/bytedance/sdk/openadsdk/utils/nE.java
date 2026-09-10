package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class nE {
    private static final Map<String, nE> Lxb = new HashMap();
    private SharedPreferences LD;

    private nE(String str, Context context) {
        if (context != null) {
            this.LD = context.getSharedPreferences(str, 0);
        }
    }

    public static nE Lxb(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            str = "tt_ad_sdk_sp";
        }
        Map<String, nE> map = Lxb;
        nE nEVar = map.get(str);
        if (nEVar != null) {
            return nEVar;
        }
        nE nEVar2 = new nE(str, context);
        map.put(str, nEVar2);
        return nEVar2;
    }

    public String Lxb(String str, String str2) {
        try {
            return this.LD.getString(str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }

    public void Lxb(String str) {
        try {
            this.LD.edit().remove(str).apply();
        } catch (Throwable unused) {
        }
    }
}
