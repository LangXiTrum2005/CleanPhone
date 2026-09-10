package com.bytedance.sdk.component.adexpress.ka;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public class di {
    public static boolean lr(String str) {
        return com.bytedance.sdk.component.adexpress.ka.lr() && ri(str);
    }

    public static boolean ri(String str) {
        return TextUtils.equals(str, "fullscreen_interstitial_ad") || TextUtils.equals(str, "rewarded_video");
    }
}
