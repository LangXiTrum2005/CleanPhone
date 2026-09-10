package com.facebook.ads.redexgen.core;

import android.os.Handler;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ox, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0948Ox implements InterfaceC1196Yy {
    public final /* synthetic */ C0T A00;

    public C0948Ox(C0T c0t, InterfaceC1197Yz interfaceC1197Yz) {
        this.A00 = c0t;
        interfaceC1197Yz.AIg(this, new Handler());
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1196Yy
    public final void ADE(InterfaceC1197Yz interfaceC1197Yz, long j, long j2) {
        if (this != this.A00.A00) {
            return;
        }
        this.A00.A27();
    }
}
