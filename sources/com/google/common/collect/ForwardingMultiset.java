package com.google.common.collect;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class ForwardingMultiset<E> extends ForwardingCollection<E> implements Multiset<E> {

    public class StandardElementSet extends Multisets.ElementSet<E> {
        @Override // com.google.common.collect.Multisets.ElementSet
        public final Multiset a() {
            return null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            throw null;
        }
    }

    @Override // com.google.common.collect.ForwardingCollection
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public abstract Multiset w();

    @Override // com.google.common.collect.Multiset
    public int Q0(Object obj) {
        return w().Q0(obj);
    }

    @Override // com.google.common.collect.Multiset
    public int add(int i2, Object obj) {
        return w().add(i2, obj);
    }

    public Set entrySet() {
        return w().entrySet();
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public final boolean equals(Object obj) {
        return obj == this || w().equals(obj);
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public final int hashCode() {
        return w().hashCode();
    }

    public Set k() {
        return w().k();
    }

    @Override // com.google.common.collect.Multiset
    public int m(int i2, Object obj) {
        return w().m(i2, obj);
    }

    @Override // com.google.common.collect.Multiset
    public boolean r(int i2, Object obj) {
        return w().r(i2, obj);
    }

    @Override // com.google.common.collect.Multiset
    public final int w0(Object obj) {
        return w().w0(obj);
    }
}
