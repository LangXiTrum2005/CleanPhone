package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.oa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC2086oa {
    public InterfaceC2087ob A00;

    public final void A00() {
        if (this.A00 != null) {
            this.A00.onStart();
        }
    }

    public final void A01() {
        if (this.A00 != null) {
            this.A00.onStop();
        }
    }

    public final void A02(InterfaceC2087ob interfaceC2087ob) {
        this.A00 = interfaceC2087ob;
    }
}
