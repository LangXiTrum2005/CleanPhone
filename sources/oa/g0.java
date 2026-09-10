package oa;

import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class g0 extends j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient j0 f47254c;

    public g0(j0 j0Var) {
        this.f47254c = j0Var;
    }

    @Override // oa.j0
    public final j0 E() {
        return this.f47254c;
    }

    @Override // oa.j0, java.util.List
    /* JADX INFO: renamed from: G */
    public final j0 subList(int i10, int i11) {
        j0 j0Var = this.f47254c;
        go.k.r(i10, i11, j0Var.size());
        return j0Var.subList(j0Var.size() - i11, j0Var.size() - i10).E();
    }

    @Override // oa.j0, oa.c0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f47254c.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        j0 j0Var = this.f47254c;
        go.k.m(i10, j0Var.size());
        return j0Var.get((j0Var.size() - 1) - i10);
    }

    @Override // oa.j0, java.util.List
    public final int indexOf(Object obj) {
        j0 j0Var = this.f47254c;
        int iLastIndexOf = j0Var.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (j0Var.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // oa.j0, oa.c0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // oa.j0, java.util.List
    public final int lastIndexOf(Object obj) {
        j0 j0Var = this.f47254c;
        int iIndexOf = j0Var.indexOf(obj);
        if (iIndexOf >= 0) {
            return (j0Var.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // oa.j0, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // oa.c0
    public final boolean r() {
        return this.f47254c.r();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f47254c.size();
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
