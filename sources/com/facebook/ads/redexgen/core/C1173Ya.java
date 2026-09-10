package com.facebook.ads.redexgen.core;

import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ya, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1173Ya {
    public final int A00;
    public final long A01;

    public C1173Ya(int i, long j) {
        this.A00 = i;
        this.A01 = j;
    }

    public static C1173Ya A00(WJ wj, C1576fq c1576fq) throws IOException {
        wj.AG1(c1576fq.A0l(), 0, 8);
        c1576fq.A0f(0);
        int iA0C = c1576fq.A0C();
        long size = c1576fq.A0O();
        return new C1173Ya(iA0C, size);
    }
}
