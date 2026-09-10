package kj;

import cc.a2;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f44657b;

    public a(String code, String str) {
        kotlin.jvm.internal.n.f(code, "code");
        this.f44656a = code;
        this.f44657b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(a.class)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        a aVar = (a) obj;
        return a2.g(this.f44656a, aVar.f44656a) && a2.g(this.f44657b, aVar.f44657b);
    }

    public final int hashCode() {
        return a2.i(this.f44657b) + ((a2.i(this.f44656a) + (a.class.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return l1.d.h("CacheRetrievalError(code=", this.f44656a, ", message=", this.f44657b, ")");
    }
}
