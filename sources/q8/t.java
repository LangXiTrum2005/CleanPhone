package q8;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f48883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f48884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f48885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f48886d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f48887e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f48888f;

    public t(long j10, long j11, n nVar, Integer num, String str, ArrayList arrayList) {
        j0 j0Var = j0.f48851a;
        this.f48883a = j10;
        this.f48884b = j11;
        this.f48885c = nVar;
        this.f48886d = num;
        this.f48887e = str;
        this.f48888f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        t tVar = (t) ((f0) obj);
        Object obj2 = j0.f48851a;
        ArrayList arrayList = tVar.f48888f;
        String str = tVar.f48887e;
        Integer num = tVar.f48886d;
        n nVar = tVar.f48885c;
        if (this.f48883a != tVar.f48883a || this.f48884b != tVar.f48884b || !this.f48885c.equals(nVar)) {
            return false;
        }
        Integer num2 = this.f48886d;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str2 = this.f48887e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        return this.f48888f.equals(arrayList) && obj2.equals(obj2);
    }

    public final int hashCode() {
        long j10 = this.f48883a;
        long j11 = this.f48884b;
        int iHashCode = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f48885c.hashCode()) * 1000003;
        Integer num = this.f48886d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f48887e;
        return ((this.f48888f.hashCode() ^ ((iHashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003)) * 1000003) ^ j0.f48851a.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f48883a + ", requestUptimeMs=" + this.f48884b + ", clientInfo=" + this.f48885c + ", logSource=" + this.f48886d + ", logSourceName=" + this.f48887e + ", logEvents=" + this.f48888f + ", qosTier=" + j0.f48851a + "}";
    }
}
