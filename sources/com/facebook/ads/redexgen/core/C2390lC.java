package com.facebook.ads.redexgen.core;

import com.inmobi.media.core.config.models.AdConfig;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2390lC extends H2 {
    public C2390lC(AnonymousClass53 anonymousClass53, long j, long j2) {
        super(new C2488mz(), new C2391lD(anonymousClass53), j, 0L, j + 1, 0L, j2, 188L, 1000);
    }

    public static int A00(byte[] bArr, int i) {
        return ((bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[i + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[i + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[i + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
    }
}
