package cc;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class o0 extends b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6211d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f6212e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f6213f;

    public o0(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f6208a = str;
        this.f6209b = str2;
        this.f6210c = str3;
        this.f6211d = str4;
        this.f6212e = str5;
        this.f6213f = str6;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        if (obj == this) {
            return true;
        }
        if (obj instanceof b2) {
            o0 o0Var = (o0) ((b2) obj);
            String str5 = o0Var.f6213f;
            String str6 = o0Var.f6212e;
            String str7 = o0Var.f6211d;
            String str8 = o0Var.f6210c;
            if (this.f6208a.equals(o0Var.f6208a) && this.f6209b.equals(o0Var.f6209b) && ((str = this.f6210c) != null ? str.equals(str8) : str8 == null) && ((str2 = this.f6211d) != null ? str2.equals(str7) : str7 == null) && ((str3 = this.f6212e) != null ? str3.equals(str6) : str6 == null) && ((str4 = this.f6213f) != null ? str4.equals(str5) : str5 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f6208a.hashCode() ^ 1000003) * 1000003) ^ this.f6209b.hashCode()) * 1000003;
        String str = this.f6210c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * (-721379959);
        String str2 = this.f6211d;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f6212e;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f6213f;
        return iHashCode4 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Application{identifier=");
        sb2.append(this.f6208a);
        sb2.append(", version=");
        sb2.append(this.f6209b);
        sb2.append(", displayVersion=");
        sb2.append(this.f6210c);
        sb2.append(", organization=null, installationUuid=");
        sb2.append(this.f6211d);
        sb2.append(", developmentPlatform=");
        sb2.append(this.f6212e);
        sb2.append(", developmentPlatformVersion=");
        return defpackage.e.q(this.f6213f, "}", sb2);
    }
}
