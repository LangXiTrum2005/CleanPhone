package com.facebook.ads.redexgen.core;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1233aC implements K8 {
    public final K0 A00;
    public final HX A01;

    public AbstractC1233aC(HX hx, K0 k0) {
        this.A01 = hx;
        this.A00 = k0;
    }

    @Override // com.facebook.ads.redexgen.core.K8
    public void A43(Map<InterfaceC0824Jq, KD> map, Map<SyncModifiableBundle, K0> map2) {
        map2.put(null, this.A00);
    }
}
