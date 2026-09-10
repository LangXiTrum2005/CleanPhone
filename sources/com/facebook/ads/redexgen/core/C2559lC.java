package com.facebook.ads.redexgen.core;

import com.inmobi.commons.core.configs.AdConfig;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2559lC extends H2 {
    public C2559lC(AnonymousClass53 anonymousClass53, long j, long j2) {
        super(new C2657mz(), new C2560lD(anonymousClass53), j, 0L, j + 1, 0L, j2, 188L, 1000);
    }

    public static int A00(byte[] bArr, int i2) {
        return ((bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[i2 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[i2 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[i2 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
    }
}
