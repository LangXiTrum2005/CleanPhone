package com.bytedance.sdk.openadsdk.core;

import android.util.Base64;

/* JADX INFO: loaded from: classes3.dex */
public final class qdl {
    private static final String qdl = lnr();
    private static final String ud = yt.mml().mzz();

    private static String lnr() {
        char[] cArr = {203, 182, 168, 176, 207, 148, 149, 178, 205, 182, 149, 166, 134, 178, 184, 176, 206, 174, 187, 178, 150, 185, 167, 166};
        char[] cArr2 = new char[24];
        for (int i2 = 23; i2 >= 0; i2--) {
            cArr2[23 - i2] = (char) (cArr[i2] ^ 255);
        }
        return new String(cArr2);
    }

    public static String qdl() {
        return new String(Base64.decode(qdl, 0)).substring(2);
    }

    public static String ud() {
        return new String(Base64.decode(ud, 0)).substring(2);
    }
}
