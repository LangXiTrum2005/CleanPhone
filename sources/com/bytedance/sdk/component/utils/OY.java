package com.bytedance.sdk.component.utils;

import com.umeng.analytics.pro.cw;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public class OY {
    private static final byte[] JXs;
    private static final byte[] LD;
    private static final byte[] Lxb;
    private static final byte[] ZU;
    private static final int ebl;
    private static final byte[] lc;
    private static final byte[] lk;

    static {
        byte[] bArr = {-1, -40, -1};
        Lxb = bArr;
        byte[] bArr2 = {-119, 80, 78, 71, cw.k, 10, 26, 10};
        LD = bArr2;
        byte[] bArr3 = {0, 0, 1, 0};
        lk = bArr3;
        byte[] bArrLxb = Lxb("BM");
        ZU = bArrLxb;
        JXs = Lxb("GIF87a");
        lc = Lxb("GIF89a");
        ebl = ((Integer) Collections.max(Arrays.asList(Integer.valueOf(bArr.length), Integer.valueOf(bArr2.length), Integer.valueOf(bArr3.length), Integer.valueOf(bArrLxb.length), 6))).intValue();
    }

    private static boolean JXs(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = ZU;
        return length >= bArr2.length && Lxb(bArr, bArr2);
    }

    private static boolean LD(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = Lxb;
        return length >= bArr2.length && Lxb(bArr, bArr2);
    }

    public static int Lxb() {
        return ebl;
    }

    private static boolean ZU(byte[] bArr) {
        return (bArr.length >= 6 && Lxb(bArr, JXs)) || Lxb(bArr, lc);
    }

    private static boolean lc(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = lk;
        return length >= bArr2.length && Lxb(bArr, bArr2);
    }

    private static boolean lk(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = LD;
        return length >= bArr2.length && Lxb(bArr, bArr2);
    }

    public static final String Lxb(byte[] bArr) {
        if (LD(bArr)) {
            return "jpeg";
        }
        if (lk(bArr)) {
            return "png";
        }
        if (ZU(bArr)) {
            return "gif";
        }
        if (JXs(bArr)) {
            return "bmp";
        }
        return lc(bArr) ? "ico" : "other";
    }

    private static boolean Lxb(byte[] bArr, byte[] bArr2) {
        return Lxb(bArr, bArr2, 0);
    }

    private static boolean Lxb(byte[] bArr, byte[] bArr2, int i) {
        if (bArr2.length + i > bArr.length) {
            return false;
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            if (bArr[i + i2] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    private static byte[] Lxb(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("ASCII not found!", e);
        }
    }
}
