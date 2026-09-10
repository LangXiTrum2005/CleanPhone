package com.facebook.ads.redexgen.core;

import com.google.common.collect.ParametricNullness;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [V] */
/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2597lo<V> implements Iterator<V> {
    public final Collection<V> A00;
    public final Iterator<V> A01;
    public final /* synthetic */ C2598lp A02;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.lo != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedCollection$WrappedIterator */
    public C2597lo(final C2598lp this$1) {
        this.A02 = this$1;
        this.A00 = this.A02.A00;
        this.A01 = C2L.A05(this$1.A00);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.lo != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedCollection$WrappedIterator */
    public C2597lo(final C2598lp this$1, Iterator<V> delegateIterator) {
        this.A02 = this$1;
        this.A00 = this.A02.A00;
        this.A01 = delegateIterator;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.lo != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedCollection$WrappedIterator */
    private final void A01() {
        this.A02.A04();
        if (this.A02.A00 == this.A00) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.lo != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedCollection$WrappedIterator */
    public final Iterator<V> A02() {
        A01();
        return this.A01;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.lo != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedCollection$WrappedIterator */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        A01();
        return this.A01.hasNext();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.lo != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedCollection$WrappedIterator */
    @Override // java.util.Iterator
    @ParametricNullness
    public final V next() {
        A01();
        return this.A01.next();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.lo != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedCollection$WrappedIterator */
    @Override // java.util.Iterator
    public final void remove() {
        this.A01.remove();
        C2L.A01(this.A02.A04);
        this.A02.A05();
    }
}
