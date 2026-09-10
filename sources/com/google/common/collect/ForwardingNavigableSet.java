package com.google.common.collect;

import java.util.Iterator;
import java.util.NavigableSet;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class ForwardingNavigableSet<E> extends ForwardingSortedSet<E> implements NavigableSet<E> {

    public class StandardDescendingSet extends Sets.DescendingSet<E> {
    }

    @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public abstract NavigableSet x();

    @Override // java.util.NavigableSet
    public Object ceiling(Object obj) {
        return x().ceiling(obj);
    }

    @Override // java.util.NavigableSet
    public Iterator descendingIterator() {
        return x().descendingIterator();
    }

    @Override // java.util.NavigableSet
    public NavigableSet descendingSet() {
        return x().descendingSet();
    }

    @Override // java.util.NavigableSet
    public Object floor(Object obj) {
        return x().floor(obj);
    }

    @Override // java.util.NavigableSet
    public NavigableSet headSet(Object obj, boolean z2) {
        return x().headSet(obj, z2);
    }

    @Override // java.util.NavigableSet
    public Object higher(Object obj) {
        return x().higher(obj);
    }

    @Override // java.util.NavigableSet
    public Object lower(Object obj) {
        return x().lower(obj);
    }

    @Override // java.util.NavigableSet
    public Object pollFirst() {
        return x().pollFirst();
    }

    @Override // java.util.NavigableSet
    public Object pollLast() {
        return x().pollLast();
    }

    @Override // java.util.NavigableSet
    public NavigableSet subSet(Object obj, boolean z2, Object obj2, boolean z3) {
        return x().subSet(obj, z2, obj2, z3);
    }

    @Override // java.util.NavigableSet
    public NavigableSet tailSet(Object obj, boolean z2) {
        return x().tailSet(obj, z2);
    }
}
