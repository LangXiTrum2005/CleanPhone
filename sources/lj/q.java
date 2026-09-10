package lj;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f45438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f45440c;

    public q(p pVar, String str, long j10) {
        this.f45438a = pVar;
        this.f45439b = str;
        this.f45440c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(q.class)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        q qVar = (q) obj;
        return t9.e.d(this.f45438a, qVar.f45438a) && t9.e.d(this.f45439b, qVar.f45439b) && t9.e.d(Long.valueOf(this.f45440c), Long.valueOf(qVar.f45440c));
    }

    public final int hashCode() {
        return t9.e.e(Long.valueOf(this.f45440c)) + l1.d.c((t9.e.e(this.f45438a) + (q.class.hashCode() * 31)) * 31, 31, this.f45439b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlatformBillingResult(responseCode=");
        sb2.append(this.f45438a);
        sb2.append(", debugMessage=");
        sb2.append(this.f45439b);
        sb2.append(", subResponseCode=");
        return defpackage.e.r(sb2, this.f45440c, ")");
    }
}
