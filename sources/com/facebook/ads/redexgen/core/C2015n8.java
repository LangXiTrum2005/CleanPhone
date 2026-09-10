package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.protocol.AdErrorType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.n8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2015n8 implements C7I {
    public final /* synthetic */ int A00;
    public final /* synthetic */ N5 A01;
    public final /* synthetic */ N5 A02;
    public final /* synthetic */ C05618u A03;

    public C2015n8(N5 n5, int i, C05618u c05618u, N5 n6) {
        this.A01 = n5;
        this.A00 = i;
        this.A03 = c05618u;
        this.A02 = n6;
    }

    @Override // com.facebook.ads.redexgen.core.C7I
    public final void ACF() {
        this.A01.A0C(this.A00, this.A03);
    }

    @Override // com.facebook.ads.redexgen.core.C7I
    public final void ACG() {
        this.A01.A00.ADc(this.A02, C0597Ag.A00(AdErrorType.NO_FILL));
    }
}
