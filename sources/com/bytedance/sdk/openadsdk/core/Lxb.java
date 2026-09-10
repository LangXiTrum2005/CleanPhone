package com.bytedance.sdk.openadsdk.core;

import android.util.Base64;

/* JADX INFO: loaded from: classes2.dex */
public final class Lxb {
    private static final String Lxb = lk();
    private static final String LD = kqm.ZU().lk();

    public static String LD() {
        return new String(Base64.decode(LD, 0)).substring(2);
    }

    public static String Lxb() {
        return new String(Base64.decode(Lxb, 0)).substring(2);
    }

    private static String lk() {
        char[] cArr = {203, 182, 168, 176, 207, 148, 149, 178, 205, 182, 149, 166, 134, 178, 184, 176, 206, 174, 187, 178, 150, 185, 167, 166};
        char[] cArr2 = new char[24];
        for (int i = 23; i >= 0; i--) {
            cArr2[23 - i] = (char) (cArr[i] ^ 255);
        }
        return new String(cArr2);
    }
}
