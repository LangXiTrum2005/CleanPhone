package com.bytedance.sdk.component.utils;

import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes.dex */
public class rq {
    private static final byte[] qdl = qdl("VP8X");

    private static byte[] qdl(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException unused) {
            return new byte[1];
        }
    }

    public static boolean qdl(byte[] bArr, int i2) {
        try {
            boolean zQdl = qdl(bArr, i2 + 12, qdl);
            int i3 = i2 + 20;
            if (bArr.length <= i3) {
                return false;
            }
            boolean z2 = (bArr[i3] & 2) == 2;
            if (zQdl && z2) {
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static boolean qdl(byte[] bArr, int i2, byte[] bArr2) {
        if (bArr2 == null || bArr == null || bArr2.length + i2 > bArr.length) {
            return false;
        }
        for (int i3 = 0; i3 < bArr2.length; i3++) {
            if (bArr[i3 + i2] != bArr2[i3]) {
                return false;
            }
        }
        return true;
    }
}
