package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public class nBu {
    private static String LD(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return com.bytedance.sdk.openadsdk.multipro.ZU.ZU.LD(null, str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }

    public static void Lxb(String str) {
        Lxb("any_door_id", str);
    }

    public static String Lxb() {
        return LD("any_door_id", null);
    }

    private static void Lxb(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb((String) null, str, str2);
        } catch (Throwable unused) {
        }
    }
}
