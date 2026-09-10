package com.bytedance.sdk.component.adexpress.ZU;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public class ebl {
    public static boolean LD(String str) {
        return com.bytedance.sdk.component.adexpress.ZU.LD() && Lxb(str);
    }

    public static boolean Lxb(String str) {
        return TextUtils.equals(str, "fullscreen_interstitial_ad") || TextUtils.equals(str, "rewarded_video");
    }
}
