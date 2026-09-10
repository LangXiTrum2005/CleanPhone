package el;

import an.p;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f40112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eo.g f40113b;

    public b(Class cls, eo.g gVar) {
        this.f40112a = cls;
        this.f40113b = gVar;
    }

    public final String a() {
        return p.m0(this.f40112a.getName(), '.', '/').concat(".class");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return n.a(this.f40112a, ((b) obj).f40112a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f40112a.hashCode();
    }

    public final String toString() {
        return b.class.getName() + ": " + this.f40112a;
    }
}
