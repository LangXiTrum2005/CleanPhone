package ud;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class m0 {
    public static final l0 Companion = new l0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f52123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f52124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f52125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f52126d;

    public /* synthetic */ m0(int i10, String str, int i11, String str2, long j10) {
        if (15 != (i10 & 15)) {
            rn.k.a(i10, 15, k0.f52118a.d());
            throw null;
        }
        this.f52123a = str;
        this.f52124b = str2;
        this.f52125c = i11;
        this.f52126d = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return kotlin.jvm.internal.n.a(this.f52123a, m0Var.f52123a) && kotlin.jvm.internal.n.a(this.f52124b, m0Var.f52124b) && this.f52125c == m0Var.f52125c && this.f52126d == m0Var.f52126d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f52126d) + wi.d.f(this.f52125c, d5.u.e(this.f52123a.hashCode() * 31, 31, this.f52124b), 31);
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f52123a + ", firstSessionId=" + this.f52124b + ", sessionIndex=" + this.f52125c + ", sessionStartTimestampUs=" + this.f52126d + ')';
    }

    public m0(String str, int i10, String str2, long j10) {
        this.f52123a = str;
        this.f52124b = str2;
        this.f52125c = i10;
        this.f52126d = j10;
    }
}
