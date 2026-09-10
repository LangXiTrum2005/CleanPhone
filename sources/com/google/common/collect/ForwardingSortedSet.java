package com.google.common.collect;

import java.util.Comparator;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class ForwardingSortedSet<E> extends ForwardingSet<E> implements SortedSet<E> {
    @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public abstract SortedSet x();

    @Override // java.util.SortedSet
    public Comparator comparator() {
        return x().comparator();
    }

    @Override // java.util.SortedSet
    public Object first() {
        return x().first();
    }

    @Override // java.util.SortedSet
    public SortedSet headSet(Object obj) {
        return x().headSet(obj);
    }

    @Override // java.util.SortedSet
    public Object last() {
        return x().last();
    }

    @Override // java.util.SortedSet
    public SortedSet subSet(Object obj, Object obj2) {
        return x().subSet(obj, obj2);
    }

    @Override // java.util.SortedSet
    public SortedSet tailSet(Object obj) {
        return x().tailSet(obj);
    }
}
