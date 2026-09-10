package ud;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f52128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f52129b;

    public n0(v0 v0Var, b bVar) {
        this.f52128a = v0Var;
        this.f52129b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return this.f52128a.equals(n0Var.f52128a) && this.f52129b.equals(n0Var.f52129b);
    }

    public final int hashCode() {
        return this.f52129b.hashCode() + ((this.f52128a.hashCode() + (m.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + m.SESSION_START + ", sessionData=" + this.f52128a + ", applicationInfo=" + this.f52129b + ')';
    }
}
