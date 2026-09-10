package cc;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class t0 extends q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k2 f6284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l2 f6285d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m2 f6286e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p2 f6287f;

    public t0(long j10, String str, k2 k2Var, l2 l2Var, m2 m2Var, p2 p2Var) {
        this.f6282a = j10;
        this.f6283b = str;
        this.f6284c = k2Var;
        this.f6285d = l2Var;
        this.f6286e = m2Var;
        this.f6287f = p2Var;
    }

    public final s0 a() {
        s0 s0Var = new s0();
        s0Var.f6269a = this.f6282a;
        s0Var.f6270b = this.f6283b;
        s0Var.f6271c = this.f6284c;
        s0Var.f6272d = this.f6285d;
        s0Var.f6273e = this.f6286e;
        s0Var.f6274f = this.f6287f;
        s0Var.f6275g = (byte) 1;
        return s0Var;
    }

    public final boolean equals(Object obj) {
        m2 m2Var;
        p2 p2Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof q2) {
            t0 t0Var = (t0) ((q2) obj);
            p2 p2Var2 = t0Var.f6287f;
            m2 m2Var2 = t0Var.f6286e;
            if (this.f6282a == t0Var.f6282a && this.f6283b.equals(t0Var.f6283b) && this.f6284c.equals(t0Var.f6284c) && this.f6285d.equals(t0Var.f6285d) && ((m2Var = this.f6286e) != null ? m2Var.equals(m2Var2) : m2Var2 == null) && ((p2Var = this.f6287f) != null ? p2Var.equals(p2Var2) : p2Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f6282a;
        int iHashCode = (((((((((int) ((j10 >>> 32) ^ j10)) ^ 1000003) * 1000003) ^ this.f6283b.hashCode()) * 1000003) ^ this.f6284c.hashCode()) * 1000003) ^ this.f6285d.hashCode()) * 1000003;
        m2 m2Var = this.f6286e;
        int iHashCode2 = (iHashCode ^ (m2Var == null ? 0 : m2Var.hashCode())) * 1000003;
        p2 p2Var = this.f6287f;
        return iHashCode2 ^ (p2Var != null ? p2Var.hashCode() : 0);
    }

    public final String toString() {
        return "Event{timestamp=" + this.f6282a + ", type=" + this.f6283b + ", app=" + this.f6284c + ", device=" + this.f6285d + ", log=" + this.f6286e + ", rollouts=" + this.f6287f + "}";
    }
}
