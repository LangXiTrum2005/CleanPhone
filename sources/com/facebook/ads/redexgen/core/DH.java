package com.facebook.ads.redexgen.core;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class DH {
    public static DH A02;
    public final C1706hz A00;
    public final DJ A01;

    public DH(C1828k1 c1828k1, Executor executor, C05608t c05608t) {
        this.A01 = new DJ(c1828k1);
        this.A00 = new C1706hz(executor, c05608t, c1828k1);
    }

    private void A00() {
        this.A01.A03(this.A00);
    }

    public static void A01(C1828k1 c1828k1, Executor executor, C05608t c05608t) {
        if (!C05789m.A1V(c1828k1)) {
            return;
        }
        if (A02 == null) {
            A02 = new DH(c1828k1, executor, c05608t);
            A02.A00();
        } else {
            A02.A02(c05608t);
        }
    }

    private void A02(C05608t c05608t) {
        this.A00.A07(c05608t);
    }
}
