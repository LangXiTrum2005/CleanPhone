package oa;

import com.ironsource.X3;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class b2 extends u0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object f47229d;

    public b2(Object obj) {
        obj.getClass();
        this.f47229d = obj;
    }

    @Override // oa.c0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f47229d.equals(obj);
    }

    @Override // oa.u0, oa.c0
    public final j0 h() {
        return j0.B(this.f47229d);
    }

    @Override // oa.u0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f47229d.hashCode();
    }

    @Override // oa.c0
    public final int m(int i10, Object[] objArr) {
        objArr[i10] = this.f47229d;
        return i10 + 1;
    }

    @Override // oa.c0
    public final boolean r() {
        return false;
    }

    @Override // oa.c0
    /* JADX INFO: renamed from: s */
    public final e2 iterator() {
        return new a1(this.f47229d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return X3.j.f27834d + this.f47229d.toString() + ']';
    }

    @Override // oa.u0, oa.c0
    public Object writeReplace() {
        return super.writeReplace();
    }
}
