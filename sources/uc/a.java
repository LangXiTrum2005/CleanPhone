package uc;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f51979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f51980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f51981c;

    public a(String str, long j10, long j11) {
        this.f51979a = str;
        this.f51980b = j10;
        this.f51981c = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f51979a.equals(aVar.f51979a) && this.f51980b == aVar.f51980b && this.f51981c == aVar.f51981c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f51979a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f51980b;
        long j11 = this.f51981c;
        return ((int) (j11 ^ (j11 >>> 32))) ^ ((iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f51979a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f51980b);
        sb2.append(", tokenCreationTimestamp=");
        return defpackage.e.r(sb2, this.f51981c, "}");
    }
}
