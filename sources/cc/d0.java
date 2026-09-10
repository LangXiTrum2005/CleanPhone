package cc;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class d0 extends u2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6041d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f6042e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f6043f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f6044g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f6045h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f6046i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f6047j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final t2 f6048k;
    public final x1 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final u1 f6049m;

    public d0(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, String str8, t2 t2Var, x1 x1Var, u1 u1Var) {
        this.f6039b = str;
        this.f6040c = str2;
        this.f6041d = i10;
        this.f6042e = str3;
        this.f6043f = str4;
        this.f6044g = str5;
        this.f6045h = str6;
        this.f6046i = str7;
        this.f6047j = str8;
        this.f6048k = t2Var;
        this.l = x1Var;
        this.f6049m = u1Var;
    }

    public final c0 a() {
        c0 c0Var = new c0();
        c0Var.f6010a = this.f6039b;
        c0Var.f6011b = this.f6040c;
        c0Var.f6012c = this.f6041d;
        c0Var.f6013d = this.f6042e;
        c0Var.f6014e = this.f6043f;
        c0Var.f6015f = this.f6044g;
        c0Var.f6016g = this.f6045h;
        c0Var.f6017h = this.f6046i;
        c0Var.f6018i = this.f6047j;
        c0Var.f6019j = this.f6048k;
        c0Var.f6020k = this.l;
        c0Var.l = this.f6049m;
        c0Var.f6021m = (byte) 1;
        return c0Var;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        t2 t2Var;
        x1 x1Var;
        u1 u1Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof u2) {
            d0 d0Var = (d0) ((u2) obj);
            u1 u1Var2 = d0Var.f6049m;
            x1 x1Var2 = d0Var.l;
            t2 t2Var2 = d0Var.f6048k;
            String str4 = d0Var.f6045h;
            String str5 = d0Var.f6044g;
            String str6 = d0Var.f6043f;
            if (this.f6039b.equals(d0Var.f6039b) && this.f6040c.equals(d0Var.f6040c) && this.f6041d == d0Var.f6041d && this.f6042e.equals(d0Var.f6042e) && ((str = this.f6043f) != null ? str.equals(str6) : str6 == null) && ((str2 = this.f6044g) != null ? str2.equals(str5) : str5 == null) && ((str3 = this.f6045h) != null ? str3.equals(str4) : str4 == null) && this.f6046i.equals(d0Var.f6046i) && this.f6047j.equals(d0Var.f6047j) && ((t2Var = this.f6048k) != null ? t2Var.equals(t2Var2) : t2Var2 == null) && ((x1Var = this.l) != null ? x1Var.equals(x1Var2) : x1Var2 == null) && ((u1Var = this.f6049m) != null ? u1Var.equals(u1Var2) : u1Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f6039b.hashCode() ^ 1000003) * 1000003) ^ this.f6040c.hashCode()) * 1000003) ^ this.f6041d) * 1000003) ^ this.f6042e.hashCode()) * 1000003;
        String str = this.f6043f;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f6044g;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f6045h;
        int iHashCode4 = (((((iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.f6046i.hashCode()) * 1000003) ^ this.f6047j.hashCode()) * 1000003;
        t2 t2Var = this.f6048k;
        int iHashCode5 = (iHashCode4 ^ (t2Var == null ? 0 : t2Var.hashCode())) * 1000003;
        x1 x1Var = this.l;
        int iHashCode6 = (iHashCode5 ^ (x1Var == null ? 0 : x1Var.hashCode())) * 1000003;
        u1 u1Var = this.f6049m;
        return iHashCode6 ^ (u1Var != null ? u1Var.hashCode() : 0);
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f6039b + ", gmpAppId=" + this.f6040c + ", platform=" + this.f6041d + ", installationUuid=" + this.f6042e + ", firebaseInstallationId=" + this.f6043f + ", firebaseAuthenticationToken=" + this.f6044g + ", appQualitySessionId=" + this.f6045h + ", buildVersion=" + this.f6046i + ", displayVersion=" + this.f6047j + ", session=" + this.f6048k + ", ndkPayload=" + this.l + ", appExitInfo=" + this.f6049m + "}";
    }
}
