package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public class co {
    private static String lr(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return com.bytedance.sdk.openadsdk.tan.ka.ri.lr((String) null, str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }

    public static void ri(String str) {
        ri("any_door_id", str);
    }

    public static String ri() {
        return lr("any_door_id", null);
    }

    private static void ri(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.tan.ka.ri.ri((String) null, str, str2);
        } catch (Throwable unused) {
        }
    }
}
