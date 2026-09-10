package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.protocol.AdErrorType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.k4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2323k4 implements SM {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass81 A01;
    public final /* synthetic */ AnonymousClass81 A02;
    public final /* synthetic */ C1563Tx A03;

    public C2323k4(AnonymousClass81 anonymousClass81, int i, C1563Tx c1563Tx, AnonymousClass81 anonymousClass82) {
        this.A01 = anonymousClass81;
        this.A00 = i;
        this.A03 = c1563Tx;
        this.A02 = anonymousClass82;
    }

    @Override // com.facebook.ads.redexgen.core.SM
    public final void ACx() {
        this.A01.A0C(this.A00, this.A03);
    }

    @Override // com.facebook.ads.redexgen.core.SM
    public final void ACy() {
        this.A01.A00.AEN(this.A02, C1603Vm.A00(AdErrorType.NO_FILL));
    }
}
