package oa;

import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class i0 extends j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient int f47260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f47261d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j0 f47262e;

    public i0(j0 j0Var, int i10, int i11) {
        this.f47262e = j0Var;
        this.f47260c = i10;
        this.f47261d = i11;
    }

    @Override // oa.j0, java.util.List
    /* JADX INFO: renamed from: G */
    public final j0 subList(int i10, int i11) {
        go.k.r(i10, i11, this.f47261d);
        int i12 = this.f47260c;
        return this.f47262e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        go.k.m(i10, this.f47261d);
        return this.f47262e.get(i10 + this.f47260c);
    }

    @Override // oa.j0, oa.c0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // oa.j0, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // oa.c0
    public final Object[] n() {
        return this.f47262e.n();
    }

    @Override // oa.c0
    public final int p() {
        return this.f47262e.q() + this.f47260c + this.f47261d;
    }

    @Override // oa.c0
    public final int q() {
        return this.f47262e.q() + this.f47260c;
    }

    @Override // oa.c0
    public final boolean r() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f47261d;
    }

    @Override // oa.j0, oa.c0
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // oa.j0, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
        return listIterator(i10);
    }
}
