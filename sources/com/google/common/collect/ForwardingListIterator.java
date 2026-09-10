package com.google.common.collect;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class ForwardingListIterator<E> extends ForwardingIterator<E> implements ListIterator<E> {
    @Override // java.util.ListIterator
    public final void add(Object obj) {
        w().add(obj);
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return w().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return w().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return w().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return w().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        w().set(obj);
    }

    @Override // com.google.common.collect.ForwardingIterator
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public abstract ListIterator w();
}
