package oa;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class r1 extends j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f47302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f47303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f47304e;

    public r1(int i10, int i11, Object[] objArr) {
        this.f47302c = objArr;
        this.f47303d = i10;
        this.f47304e = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        go.k.m(i10, this.f47304e);
        Object obj = this.f47302c[(i10 * 2) + this.f47303d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // oa.c0
    public final boolean r() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f47304e;
    }

    @Override // oa.j0, oa.c0
    public Object writeReplace() {
        return super.writeReplace();
    }
}
