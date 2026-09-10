package oa;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class q1 extends u0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient o0 f47298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient r1 f47299e;

    public q1(o0 o0Var, r1 r1Var) {
        this.f47298d = o0Var;
        this.f47299e = r1Var;
    }

    @Override // oa.c0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f47298d.get(obj) != null;
    }

    @Override // oa.u0, oa.c0
    public final j0 h() {
        return this.f47299e;
    }

    @Override // oa.c0
    public final int m(int i10, Object[] objArr) {
        return this.f47299e.m(i10, objArr);
    }

    @Override // oa.c0
    public final boolean r() {
        return true;
    }

    @Override // oa.c0
    /* JADX INFO: renamed from: s */
    public final e2 iterator() {
        return this.f47299e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ((s1) this.f47298d).f47310f;
    }

    @Override // oa.u0, oa.c0
    public Object writeReplace() {
        return super.writeReplace();
    }
}
