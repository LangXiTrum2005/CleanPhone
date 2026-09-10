package cc;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class k0 extends z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f6139a;

    public k0(l0 l0Var) {
        this.f6139a = l0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z1)) {
            return false;
        }
        return this.f6139a.equals(((k0) ((z1) obj)).f6139a);
    }

    public final int hashCode() {
        return this.f6139a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ProfilingManagerInfo{profilingTrigger=" + this.f6139a + "}";
    }
}
