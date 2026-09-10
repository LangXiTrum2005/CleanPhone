package com.facebook.ads.redexgen.core;

import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C09936y implements InterfaceC1561Tv {
    public NativeAdBase A00;
    public NativeAdListener A01;

    public C09936y(NativeAdListener nativeAdListener, NativeAdBase nativeAdBase) {
        this.A01 = nativeAdListener;
        this.A00 = nativeAdBase;
    }

    @Override // com.facebook.ads.redexgen.core.VP
    public final void ACm() {
        WT.A00(new C1556Tq(this));
    }

    @Override // com.facebook.ads.redexgen.core.VP
    public final void ACq() {
        WT.A00(new C1557Tr(this));
    }

    @Override // com.facebook.ads.redexgen.core.VP
    public final void ADp(C1603Vm c1603Vm) {
        WT.A00(new C1559Tt(this, c1603Vm));
    }

    @Override // com.facebook.ads.redexgen.core.VP
    public final void AEl() {
        WT.A00(new C1555Tp(this));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1561Tv
    public final void AEq() {
        WT.A00(new C1558Ts(this));
    }
}
