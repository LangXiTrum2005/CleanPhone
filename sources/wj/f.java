package wj;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f53283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f53284b;

    public f(Object obj, Object obj2) {
        this.f53283a = obj;
        this.f53284b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return kotlin.jvm.internal.n.a(this.f53283a, fVar.f53283a) && kotlin.jvm.internal.n.a(this.f53284b, fVar.f53284b);
    }

    public final int hashCode() {
        Object obj = this.f53283a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f53284b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f53283a + ", " + this.f53284b + ')';
    }
}
