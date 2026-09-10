package q8;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f48873a;

    public r(q qVar) {
        this.f48873a = qVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        return this.f48873a.equals(((r) ((d0) obj)).f48873a);
    }

    public final int hashCode() {
        return this.f48873a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ExternalPrivacyContext{prequest=" + this.f48873a + "}";
    }
}
