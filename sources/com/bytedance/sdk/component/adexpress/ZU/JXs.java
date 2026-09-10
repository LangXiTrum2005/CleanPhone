package com.bytedance.sdk.component.adexpress.ZU;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public class JXs {
    public static boolean Lxb(String str) {
        if (com.bytedance.sdk.component.adexpress.ZU.LD()) {
            return TextUtils.equals(str, "embeded_ad") || TextUtils.equals(str, "banner_ad");
        }
        return false;
    }
}
