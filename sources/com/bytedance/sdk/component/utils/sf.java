package com.bytedance.sdk.component.utils;

import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes2.dex */
public class sf {
    private static final byte[] ri = ri("VP8X");

    private static byte[] ri(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException unused) {
            return new byte[1];
        }
    }

    public static boolean ri(byte[] bArr, int i) {
        try {
            boolean zRi = ri(bArr, i + 12, ri);
            int i2 = i + 20;
            if (bArr.length <= i2) {
                return false;
            }
            boolean z = (bArr[i2] & 2) == 2;
            if (zRi && z) {
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static boolean ri(byte[] bArr, int i, byte[] bArr2) {
        if (bArr2 == null || bArr == null || bArr2.length + i > bArr.length) {
            return false;
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            if (bArr[i2 + i] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }
}
