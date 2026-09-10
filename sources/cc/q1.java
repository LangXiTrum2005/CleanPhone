package cc;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6242e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v6.c f6243f;

    public q1(String str, String str2, String str3, String str4, int i10, v6.c cVar) {
        if (str == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.f6238a = str;
        if (str2 == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.f6239b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null versionName");
        }
        this.f6240c = str3;
        if (str4 == null) {
            throw new NullPointerException("Null installUuid");
        }
        this.f6241d = str4;
        this.f6242e = i10;
        this.f6243f = cVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj;
        return this.f6238a.equals(q1Var.f6238a) && this.f6239b.equals(q1Var.f6239b) && this.f6240c.equals(q1Var.f6240c) && this.f6241d.equals(q1Var.f6241d) && this.f6242e == q1Var.f6242e && this.f6243f.equals(q1Var.f6243f);
    }

    public final int hashCode() {
        return this.f6243f.hashCode() ^ ((((((((((this.f6238a.hashCode() ^ 1000003) * 1000003) ^ this.f6239b.hashCode()) * 1000003) ^ this.f6240c.hashCode()) * 1000003) ^ this.f6241d.hashCode()) * 1000003) ^ this.f6242e) * 1000003);
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f6238a + ", versionCode=" + this.f6239b + ", versionName=" + this.f6240c + ", installUuid=" + this.f6241d + ", deliveryMechanism=" + this.f6242e + ", developmentPlatformProvider=" + this.f6243f + "}";
    }
}
