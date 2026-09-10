package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class hkc {
    private static final Map<String, hkc> qdl = new HashMap();
    private SharedPreferences ud;

    private hkc(String str, Context context) {
        if (context != null) {
            this.ud = context.getSharedPreferences(str, 0);
        }
    }

    public static hkc qdl(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            str = "tt_ad_sdk_sp";
        }
        Map<String, hkc> map = qdl;
        hkc hkcVar = map.get(str);
        if (hkcVar != null) {
            return hkcVar;
        }
        synchronized (hkc.class) {
            if (hkcVar == null) {
                try {
                    hkcVar = new hkc(str, com.bytedance.sdk.openadsdk.core.yt.qdl());
                } catch (Throwable th) {
                    throw th;
                }
            }
            map.put(str, hkcVar);
        }
        return hkcVar;
    }

    public String qdl(String str, String str2) {
        try {
            return this.ud.getString(str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }

    public void qdl(String str) {
        try {
            this.ud.edit().remove(str).apply();
        } catch (Throwable unused) {
        }
    }
}
