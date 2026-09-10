package com.bytedance.sdk.component.adexpress.mml;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class mzz {
    public static boolean qdl(String str) {
        if (com.bytedance.sdk.component.adexpress.mml.ud()) {
            return TextUtils.equals(str, "embeded_ad") || TextUtils.equals(str, "banner_ad");
        }
        return false;
    }
}
