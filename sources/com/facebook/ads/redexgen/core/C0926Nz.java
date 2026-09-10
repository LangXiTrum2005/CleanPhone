package com.facebook.ads.redexgen.core;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: Add missing generic type declarations: [K0] */
/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Nz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0926Nz<K0> extends AbstractC2025nI<K0> {
    public final /* synthetic */ Comparator A00;

    public C0926Nz(final Comparator val$comparator) {
        this.A00 = val$comparator;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2025nI
    public final <K extends K0, V> Map<K, Collection<V>> A04() {
        return new TreeMap(this.A00);
    }
}
