package q8;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f48869a;

    public o(r rVar) {
        z zVar = z.f48894a;
        this.f48869a = rVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        if (!this.f48869a.equals(((o) ((a0) obj)).f48869a)) {
            return false;
        }
        Object obj2 = z.f48894a;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return ((this.f48869a.hashCode() ^ 1000003) * 1000003) ^ z.f48894a.hashCode();
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.f48869a + ", productIdOrigin=" + z.f48894a + "}";
    }
}
