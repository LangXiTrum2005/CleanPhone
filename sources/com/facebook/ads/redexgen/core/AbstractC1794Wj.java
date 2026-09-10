package com.facebook.ads.redexgen.core;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1794Wj {
    public static final AtomicReference<InterfaceC1793Wi> A00 = new AtomicReference<>(null);

    public static InterfaceC1793Wi A00() {
        InterfaceC1793Wi errorLogger = A00.get();
        if (errorLogger == null) {
            return new R1();
        }
        return errorLogger;
    }

    public static void A01(InterfaceC1793Wi interfaceC1793Wi) {
        A00.set(interfaceC1793Wi);
    }
}
