package oa;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class p1 extends u0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient o0 f47292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Object[] f47293e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f47294f;

    public p1(o0 o0Var, Object[] objArr, int i10) {
        this.f47292d = o0Var;
        this.f47293e = objArr;
        this.f47294f = i10;
    }

    @Override // oa.c0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f47292d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // oa.c0
    public final int m(int i10, Object[] objArr) {
        return h().m(i10, objArr);
    }

    @Override // oa.c0
    public final boolean r() {
        return true;
    }

    @Override // oa.c0
    /* JADX INFO: renamed from: s */
    public final e2 iterator() {
        return h().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f47294f;
    }

    @Override // oa.u0, oa.c0
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // oa.u0
    public final j0 x() {
        return new o1(this);
    }
}
