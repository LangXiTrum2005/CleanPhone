package xj;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d0 extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f53839a;

    public d0(ArrayList arrayList) {
        this.f53839a = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        this.f53839a.add(n.f0(this, i10), obj);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f53839a.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return this.f53839a.get(n.e0(this, i10));
    }

    @Override // xj.g
    public final int h() {
        return this.f53839a.size();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new c0(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return new c0(this, 0);
    }

    @Override // xj.g
    public final Object m(int i10) {
        return this.f53839a.remove(n.e0(this, i10));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        return this.f53839a.set(n.e0(this, i10), obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new c0(this, i10);
    }
}
