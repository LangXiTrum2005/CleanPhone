package oa;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class x1 extends m1 implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m1 f47345a;

    public x1(m1 m1Var) {
        this.f47345a = m1Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f47345a.compare(obj2, obj);
    }

    @Override // oa.m1
    public final m1 d() {
        return this.f47345a;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x1) {
            return this.f47345a.equals(((x1) obj).f47345a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f47345a.hashCode();
    }

    public final String toString() {
        return this.f47345a + ".reverse()";
    }
}
