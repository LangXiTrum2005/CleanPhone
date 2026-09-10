package xk;

import d5.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f53885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f53886b;

    public d(e eVar, int i10) {
        this.f53885a = eVar;
        this.f53886b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f53885a == dVar.f53885a && this.f53886b == dVar.f53886b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f53886b) + (this.f53885a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("KindWithArity(kind=");
        sb2.append(this.f53885a);
        sb2.append(", arity=");
        return u.g(sb2, this.f53886b, ')');
    }
}
