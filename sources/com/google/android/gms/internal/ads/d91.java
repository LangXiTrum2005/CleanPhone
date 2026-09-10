package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d91 extends g91 implements NavigableSet {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ua1 f13471e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d91(ua1 ua1Var, NavigableMap navigableMap) {
        super(ua1Var, navigableMap);
        Objects.requireNonNull(ua1Var);
        this.f13471e = ua1Var;
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final /* synthetic */ SortedMap b() {
        return (NavigableMap) ((SortedMap) this.f11941b);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f11941b)).ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((a91) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new d91(this.f13471e, ((NavigableMap) ((SortedMap) this.f11941b)).descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f11941b)).floorKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.g91, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f11941b)).higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f11941b)).lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        y81 y81Var = (y81) iterator();
        if (!y81Var.hasNext()) {
            return null;
        }
        Object next = y81Var.next();
        y81Var.remove();
        return next;
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        Iterator itDescendingIterator = descendingIterator();
        if (!itDescendingIterator.hasNext()) {
            return null;
        }
        Object next = itDescendingIterator.next();
        itDescendingIterator.remove();
        return next;
    }

    @Override // com.google.android.gms.internal.ads.g91, java.util.SortedSet, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // com.google.android.gms.internal.ads.g91, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z10) {
        return new d91(this.f13471e, ((NavigableMap) ((SortedMap) this.f11941b)).headMap(obj, z10));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z10, Object obj2, boolean z11) {
        return new d91(this.f13471e, ((NavigableMap) ((SortedMap) this.f11941b)).subMap(obj, z10, obj2, z11));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z10) {
        return new d91(this.f13471e, ((NavigableMap) ((SortedMap) this.f11941b)).tailMap(obj, z10));
    }
}
