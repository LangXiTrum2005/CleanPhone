package com.bytedance.sdk.openadsdk.utils;

import com.umeng.analytics.pro.cw;
import java.security.SecureRandom;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class eK {
    private static final ThreadLocal<SecureRandom> Lxb = new ThreadLocal<>();

    public static String Lxb() {
        byte[] bArr = new byte[16];
        ThreadLocal<SecureRandom> threadLocal = Lxb;
        SecureRandom secureRandom = threadLocal.get();
        if (secureRandom == null) {
            secureRandom = new SecureRandom();
            threadLocal.set(secureRandom);
        }
        secureRandom.nextBytes(bArr);
        byte b = (byte) (bArr[6] & cw.m);
        bArr[6] = b;
        bArr[6] = (byte) (b | 64);
        byte b2 = (byte) (bArr[8] & 63);
        bArr[8] = b2;
        bArr[8] = (byte) (b2 | 128);
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < 8; i++) {
            j2 = (j2 << 8) | ((long) (bArr[i] & 255));
        }
        for (int i2 = 8; i2 < 16; i2++) {
            j = (j << 8) | ((long) (bArr[i2] & 255));
        }
        return new UUID(j2, j).toString();
    }
}
