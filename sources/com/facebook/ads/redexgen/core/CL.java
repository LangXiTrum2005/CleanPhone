package com.facebook.ads.redexgen.core;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class CL implements InterfaceC2294gc {
    public final C1278Cb A00;
    public final EnumC2299gh A01;

    public CL(C1278Cb c1278Cb, EnumC2299gh enumC2299gh) {
        this.A00 = c1278Cb;
        this.A01 = enumC2299gh;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2294gc
    public void A4D(Map<InterfaceC2276gK, EnumC2299gh> map, Map<SyncModifiableBundle, EnumC2286gU> map2) {
        map.put(this.A00, this.A01);
    }
}
