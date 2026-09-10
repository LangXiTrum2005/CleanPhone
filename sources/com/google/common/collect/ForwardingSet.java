package com.google.common.collect;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class ForwardingSet<E> extends ForwardingCollection<E> implements Set<E> {
    @Override // com.google.common.collect.ForwardingCollection
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public abstract Set x();

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return obj == this || x().equals(obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return x().hashCode();
    }
}
