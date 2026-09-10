package com.facebook.ads.redexgen.core;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class CM implements InterfaceC2294gc {
    public final EnumC2286gU A00;
    public final AbstractC10412d A01;

    public CM(AbstractC10412d abstractC10412d, EnumC2286gU enumC2286gU) {
        this.A01 = abstractC10412d;
        this.A00 = enumC2286gU;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2294gc
    public void A4D(Map<InterfaceC2276gK, EnumC2299gh> map, Map<SyncModifiableBundle, EnumC2286gU> map2) {
        map2.put(null, this.A00);
    }
}
