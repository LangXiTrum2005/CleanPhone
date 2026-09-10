package com.bytedance.sdk.openadsdk.utils;

import com.inmobi.commons.core.configs.AdConfig;
import java.security.SecureRandom;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public class uw {
    private static final ThreadLocal<SecureRandom> qdl = new ThreadLocal<>();

    public static String qdl() {
        byte[] bArr = new byte[16];
        ThreadLocal<SecureRandom> threadLocal = qdl;
        SecureRandom secureRandom = threadLocal.get();
        if (secureRandom == null) {
            secureRandom = new SecureRandom();
            threadLocal.set(secureRandom);
        }
        secureRandom.nextBytes(bArr);
        byte b2 = (byte) (bArr[6] & 15);
        bArr[6] = b2;
        bArr[6] = (byte) (b2 | 64);
        byte b3 = (byte) (bArr[8] & 63);
        bArr[8] = b3;
        bArr[8] = (byte) (b3 | 128);
        long j = 0;
        long j2 = 0;
        for (int i2 = 0; i2 < 8; i2++) {
            j2 = (j2 << 8) | ((long) (bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
        }
        for (int i3 = 8; i3 < 16; i3++) {
            j = (j << 8) | ((long) (bArr[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
        }
        return new UUID(j2, j).toString();
    }
}
