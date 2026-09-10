package q8;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f48872a;

    public q(Integer num) {
        this.f48872a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        Integer num = this.f48872a;
        q qVar = (q) ((c0) obj);
        if (num == null) {
            return qVar.f48872a == null;
        }
        return num.equals(qVar.f48872a);
    }

    public final int hashCode() {
        Integer num = this.f48872a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.f48872a + "}";
    }
}
