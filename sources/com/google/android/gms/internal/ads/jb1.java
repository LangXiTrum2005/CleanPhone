package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class jb1 extends hb1 implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f15245a).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f15245a.iterator();
        it.getClass();
        h81 h81Var = this.f15246b;
        h81Var.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (h81Var.zza(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new jb1(((SortedSet) this.f15245a).headSet(obj), this.f15246b);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSetHeadSet = (SortedSet) this.f15245a;
        while (true) {
            Object objLast = sortedSetHeadSet.last();
            if (this.f15246b.zza(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new jb1(((SortedSet) this.f15245a).subSet(obj, obj2), this.f15246b);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new jb1(((SortedSet) this.f15245a).tailSet(obj), this.f15246b);
    }
}
