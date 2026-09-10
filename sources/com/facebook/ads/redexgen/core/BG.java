package com.facebook.ads.redexgen.core;

import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class BG extends AbstractC2846q4<Object> {
    public final /* synthetic */ int A00;

    public BG(final int val$expectedKeys) {
        this.A00 = val$expectedKeys;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2846q4
    public final <K, V> Map<K, Collection<V>> A04() {
        return AbstractC2863qN.A00(this.A00);
    }
}
