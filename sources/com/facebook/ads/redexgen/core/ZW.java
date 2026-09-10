package com.facebook.ads.redexgen.core;

import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ZW implements InterfaceC2291gZ {
    public final /* synthetic */ C2296ge A00;
    public final /* synthetic */ WA A01;

    public ZW(WA wa, C2296ge c2296ge) {
        this.A01 = wa;
        this.A00 = c2296ge;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2291gZ
    public final Map<String, String> A7z() {
        return this.A01.A0A(UG.A00().A01(this.A00, true).A06());
    }
}
