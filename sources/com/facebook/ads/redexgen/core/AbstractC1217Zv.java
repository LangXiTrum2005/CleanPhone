package com.facebook.ads.redexgen.core;

import android.util.Log;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1217Zv implements InterfaceC0857Kx {
    public int A00;

    @Override // com.facebook.ads.redexgen.core.InterfaceC0857Kx
    public final void A9j(String str, String str2) {
        Log.i(str, str2);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0857Kx
    public final void A9k(String str, String str2, Throwable th) {
        Log.i(str, str2, th);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0857Kx
    public final boolean AAN(int i) {
        return this.A00 <= i;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0857Kx
    public final void AIe(int i) {
        this.A00 = i;
    }
}
