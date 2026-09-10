package com.facebook.ads.redexgen.core;

import java.util.AbstractSet;
import java.util.Collection;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC2059nt<E> extends AbstractSet<E> {
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nt != com.google.common.collect.Sets$ImprovedAbstractSet<E> */
    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> c) {
        return AbstractC2062nx.A0A(this, c);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nt != com.google.common.collect.Sets$ImprovedAbstractSet<E> */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> c) {
        return super.retainAll((Collection) AbstractC1718iD.A04(c));
    }
}
