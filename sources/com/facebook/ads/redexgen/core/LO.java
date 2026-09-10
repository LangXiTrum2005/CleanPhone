package com.facebook.ads.redexgen.core;

import java.io.IOException;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class LO {
    public final int A00;
    public final long A01;

    public LO(int i2, long j) {
        this.A00 = i2;
        this.A01 = j;
    }

    public static LO A00(InterfaceC2651ms interfaceC2651ms, C11074v c11074v) throws IOException {
        interfaceC2651ms.AGt(c11074v.A0l(), 0, 8);
        c11074v.A0f(0);
        int iA0C = c11074v.A0C();
        long size = c11074v.A0O();
        return new LO(iA0C, size);
    }
}
