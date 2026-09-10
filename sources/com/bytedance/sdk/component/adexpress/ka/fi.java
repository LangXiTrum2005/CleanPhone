package com.bytedance.sdk.component.adexpress.ka;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public class fi {
    public static boolean ri(String str) {
        if (com.bytedance.sdk.component.adexpress.ka.lr()) {
            return TextUtils.equals(str, "embeded_ad") || TextUtils.equals(str, "banner_ad");
        }
        return false;
    }
}
