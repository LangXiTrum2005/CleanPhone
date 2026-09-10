package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class EE implements InterfaceC2185er {
    public final View A00;
    public final C2300gi A01;

    public EE(C2300gi c2300gi, View view) {
        this.A01 = c2300gi;
        this.A00 = view;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2185er
    public final double A9V() {
        C2246fq result = C2245fp.A0E(this.A00, 0, this.A01);
        return result.A00();
    }
}
