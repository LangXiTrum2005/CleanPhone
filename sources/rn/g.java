package rn;

import java.util.List;
import xj.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements pn.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pn.d f49715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pn.d f49716b;

    public g(pn.d keyDesc, pn.d valueDesc) {
        kotlin.jvm.internal.n.f(keyDesc, "keyDesc");
        kotlin.jvm.internal.n.f(valueDesc, "valueDesc");
        this.f49715a = keyDesc;
        this.f49716b = valueDesc;
    }

    @Override // pn.d
    public final boolean b() {
        return false;
    }

    @Override // pn.d
    public final int c(String name) {
        kotlin.jvm.internal.n.f(name, "name");
        Integer numE0 = an.o.e0(name);
        if (numE0 != null) {
            return numE0.intValue();
        }
        throw new IllegalArgumentException(name.concat(" is not a valid map index"));
    }

    @Override // pn.d
    public final int d() {
        return 2;
    }

    @Override // pn.d
    public final String e(int i10) {
        return String.valueOf(i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return kotlin.jvm.internal.n.a(this.f49715a, gVar.f49715a) && kotlin.jvm.internal.n.a(this.f49716b, gVar.f49716b);
    }

    @Override // pn.d
    public final List f(int i10) {
        if (i10 >= 0) {
            return v.f53866a;
        }
        throw new IllegalArgumentException(defpackage.e.h(i10, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    @Override // pn.d
    public final pn.d g(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(defpackage.e.h(i10, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
        }
        int i11 = i10 % 2;
        if (i11 == 0) {
            return this.f49715a;
        }
        if (i11 == 1) {
            return this.f49716b;
        }
        throw new IllegalStateException("Unreached");
    }

    @Override // pn.d
    public final List getAnnotations() {
        return v.f53866a;
    }

    @Override // pn.d
    public final com.google.android.gms.internal.auth.o getKind() {
        return pn.f.f48505g;
    }

    @Override // pn.d
    public final String h() {
        return "kotlin.collections.LinkedHashMap";
    }

    public final int hashCode() {
        return this.f49716b.hashCode() + ((this.f49715a.hashCode() + 710441009) * 31);
    }

    @Override // pn.d
    public final boolean i(int i10) {
        if (i10 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(defpackage.e.h(i10, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    @Override // pn.d
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return "kotlin.collections.LinkedHashMap(" + this.f49715a + ", " + this.f49716b + ')';
    }
}
