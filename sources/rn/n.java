package rn;

import java.util.List;
import xj.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class n implements pn.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f49737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pn.c f49738b;

    public n(String str, pn.c kind) {
        kotlin.jvm.internal.n.f(kind, "kind");
        this.f49737a = str;
        this.f49738b = kind;
    }

    @Override // pn.d
    public final boolean b() {
        return false;
    }

    @Override // pn.d
    public final int c(String name) {
        kotlin.jvm.internal.n.f(name, "name");
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // pn.d
    public final int d() {
        return 0;
    }

    @Override // pn.d
    public final String e(int i10) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return kotlin.jvm.internal.n.a(this.f49737a, nVar.f49737a) && kotlin.jvm.internal.n.a(this.f49738b, nVar.f49738b);
    }

    @Override // pn.d
    public final List f(int i10) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // pn.d
    public final pn.d g(int i10) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // pn.d
    public final List getAnnotations() {
        return v.f53866a;
    }

    @Override // pn.d
    public final com.google.android.gms.internal.auth.o getKind() {
        return this.f49738b;
    }

    @Override // pn.d
    public final String h() {
        return this.f49737a;
    }

    public final int hashCode() {
        return (this.f49738b.hashCode() * 31) + this.f49737a.hashCode();
    }

    @Override // pn.d
    public final boolean i(int i10) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // pn.d
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return wi.d.k(new StringBuilder("PrimitiveDescriptor("), this.f49737a, ')');
    }
}
