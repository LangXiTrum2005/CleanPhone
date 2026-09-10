package cc;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class n1 extends r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f6200d;

    public n1(String str, int i10, String str2, boolean z10) {
        this.f6197a = i10;
        this.f6198b = str;
        this.f6199c = str2;
        this.f6200d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r2) {
            n1 n1Var = (n1) ((r2) obj);
            if (this.f6197a == n1Var.f6197a && this.f6198b.equals(n1Var.f6198b) && this.f6199c.equals(n1Var.f6199c) && this.f6200d == n1Var.f6200d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f6200d ? 1231 : 1237) ^ ((((((this.f6197a ^ 1000003) * 1000003) ^ this.f6198b.hashCode()) * 1000003) ^ this.f6199c.hashCode()) * 1000003);
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f6197a + ", version=" + this.f6198b + ", buildVersion=" + this.f6199c + ", jailbroken=" + this.f6200d + "}";
    }
}
