package wj;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class k implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f53293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f53294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f53295c;

    public k(Object obj, Object obj2, Object obj3) {
        this.f53293a = obj;
        this.f53294b = obj2;
        this.f53295c = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kotlin.jvm.internal.n.a(this.f53293a, kVar.f53293a) && kotlin.jvm.internal.n.a(this.f53294b, kVar.f53294b) && kotlin.jvm.internal.n.a(this.f53295c, kVar.f53295c);
    }

    public final int hashCode() {
        Object obj = this.f53293a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f53294b;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f53295c;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f53293a + ", " + this.f53294b + ", " + this.f53295c + ')';
    }
}
