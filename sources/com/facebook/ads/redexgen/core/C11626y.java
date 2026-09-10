package com.facebook.ads.redexgen.core;

import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C11626y implements InterfaceC1730Tv {
    public NativeAdBase A00;
    public NativeAdListener A01;

    public C11626y(NativeAdListener nativeAdListener, NativeAdBase nativeAdBase) {
        this.A01 = nativeAdListener;
        this.A00 = nativeAdBase;
    }

    @Override // com.facebook.ads.redexgen.core.VP
    public final void ACm() {
        WT.A00(new C1725Tq(this));
    }

    @Override // com.facebook.ads.redexgen.core.VP
    public final void ACq() {
        WT.A00(new C1726Tr(this));
    }

    @Override // com.facebook.ads.redexgen.core.VP
    public final void ADp(C1772Vm c1772Vm) {
        WT.A00(new C1728Tt(this, c1772Vm));
    }

    @Override // com.facebook.ads.redexgen.core.VP
    public final void AEl() {
        WT.A00(new C1724Tp(this));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1730Tv
    public final void AEq() {
        WT.A00(new C1727Ts(this));
    }
}
