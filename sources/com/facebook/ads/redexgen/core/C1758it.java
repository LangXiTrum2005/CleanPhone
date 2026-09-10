package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.it, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1758it implements FA {
    public final /* synthetic */ C1755iq A00;

    public C1758it(C1755iq c1755iq) {
        this.A00 = c1755iq;
    }

    @Override // com.facebook.ads.redexgen.core.FA
    public final void ADM(boolean z) {
        this.A00.A0D.set(z);
        if (this.A00.A0E.get() && this.A00.A02 != null) {
            this.A00.A02.AEQ(z);
        }
    }
}
