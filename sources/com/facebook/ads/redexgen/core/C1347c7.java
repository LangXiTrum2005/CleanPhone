package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.c7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1347c7 implements IN {
    public final View A00;
    public final C1828k1 A01;

    public C1347c7(C1828k1 c1828k1, View view) {
        this.A01 = c1828k1;
        this.A00 = view;
    }

    @Override // com.facebook.ads.redexgen.core.IN
    public final double A9L() {
        JM result = JL.A0E(this.A00, 0, this.A01);
        return result.A00();
    }
}
