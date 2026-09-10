package oa;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class o1 extends j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1 f47287c;

    public o1(p1 p1Var) {
        this.f47287c = p1Var;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        p1 p1Var = this.f47287c;
        go.k.m(i10, p1Var.f47294f);
        Object[] objArr = p1Var.f47293e;
        int i11 = i10 * 2;
        Object obj = objArr[i11];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i11 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // oa.c0
    public final boolean r() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f47287c.f47294f;
    }

    @Override // oa.j0, oa.c0
    public Object writeReplace() {
        return super.writeReplace();
    }
}
