package oa;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class n1 extends j0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final n1 f47281e = new n1(0, new Object[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f47282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f47283d;

    public n1(int i10, Object[] objArr) {
        this.f47282c = objArr;
        this.f47283d = i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        go.k.m(i10, this.f47283d);
        Object obj = this.f47282c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // oa.j0, oa.c0
    public final int m(int i10, Object[] objArr) {
        Object[] objArr2 = this.f47282c;
        int i11 = this.f47283d;
        System.arraycopy(objArr2, 0, objArr, i10, i11);
        return i10 + i11;
    }

    @Override // oa.c0
    public final Object[] n() {
        return this.f47282c;
    }

    @Override // oa.c0
    public final int p() {
        return this.f47283d;
    }

    @Override // oa.c0
    public final int q() {
        return 0;
    }

    @Override // oa.c0
    public final boolean r() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f47283d;
    }

    @Override // oa.j0, oa.c0
    public Object writeReplace() {
        return super.writeReplace();
    }
}
