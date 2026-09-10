package zb;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f54673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f54674c;

    public b(String str, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null crashlyticsInstallId");
        }
        this.f54672a = str;
        this.f54673b = str2;
        this.f54674c = str3;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            String str3 = bVar.f54674c;
            String str4 = bVar.f54673b;
            if (this.f54672a.equals(bVar.f54672a) && ((str = this.f54673b) != null ? str.equals(str4) : str4 == null) && ((str2 = this.f54674c) != null ? str2.equals(str3) : str3 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f54672a.hashCode() ^ 1000003) * 1000003;
        String str = this.f54673b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f54674c;
        return iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb2.append(this.f54672a);
        sb2.append(", firebaseInstallationId=");
        sb2.append(this.f54673b);
        sb2.append(", firebaseAuthenticationToken=");
        return defpackage.e.q(this.f54674c, "}", sb2);
    }
}
