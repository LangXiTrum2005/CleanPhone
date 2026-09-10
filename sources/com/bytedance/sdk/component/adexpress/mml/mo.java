package com.bytedance.sdk.component.adexpress.mml;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class mo {
    public static boolean qdl(String str) {
        return TextUtils.equals(str, "fullscreen_interstitial_ad") || TextUtils.equals(str, "rewarded_video");
    }

    public static boolean ud(String str) {
        return com.bytedance.sdk.component.adexpress.mml.ud() && qdl(str);
    }
}
