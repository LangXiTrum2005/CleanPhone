package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public class fs {
    public static void qdl(String str) {
        qdl("any_door_id", str);
    }

    private static String ud(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return com.bytedance.sdk.openadsdk.multipro.mml.mml.ud(null, str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }

    public static String qdl() {
        return ud("any_door_id", null);
    }

    private static void qdl(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.multipro.mml.mml.qdl((String) null, str, str2);
        } catch (Throwable unused) {
        }
    }
}
