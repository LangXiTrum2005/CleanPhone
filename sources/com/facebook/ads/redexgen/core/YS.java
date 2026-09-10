package com.facebook.ads.redexgen.core;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class YS {
    public static YS A02;
    public final C1623Pp A00;
    public final YU A01;

    public YS(C2300gi c2300gi, Executor executor, C1731Tw c1731Tw) {
        this.A01 = new YU(c2300gi);
        this.A00 = new C1623Pp(executor, c1731Tw, c2300gi);
    }

    private void A00() {
        this.A01.A03(this.A00);
    }

    public static void A01(C2300gi c2300gi, Executor executor, C1731Tw c1731Tw) {
        if (!C1750Up.A1c(c2300gi)) {
            return;
        }
        if (A02 == null) {
            A02 = new YS(c2300gi, executor, c1731Tw);
            A02.A00();
        } else {
            A02.A02(c1731Tw);
        }
    }

    private void A02(C1731Tw c1731Tw) {
        this.A00.A07(c1731Tw);
    }
}
