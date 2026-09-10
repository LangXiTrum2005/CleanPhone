package en;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f40168b = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f40169a;

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return kotlin.jvm.internal.n.a(this.f40169a, ((l) obj).f40169a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f40169a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f40169a;
        if (obj instanceof j) {
            return ((j) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
