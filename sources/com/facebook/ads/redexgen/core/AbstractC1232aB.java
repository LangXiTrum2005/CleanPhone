package com.facebook.ads.redexgen.core;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1232aB implements K8 {
    public final C1242aL A00;
    public final KD A01;

    public AbstractC1232aB(C1242aL c1242aL, KD kd) {
        this.A00 = c1242aL;
        this.A01 = kd;
    }

    @Override // com.facebook.ads.redexgen.core.K8
    public void A43(Map<InterfaceC0824Jq, KD> map, Map<SyncModifiableBundle, K0> map2) {
        map.put(this.A00, this.A01);
    }
}
