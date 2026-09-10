package cc;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class g0 extends t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6095c;

    public g0(String str, String str2, String str3) {
        this.f6093a = str;
        this.f6094b = str2;
        this.f6095c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t1) {
            g0 g0Var = (g0) ((t1) obj);
            if (this.f6093a.equals(g0Var.f6093a) && this.f6094b.equals(g0Var.f6094b) && this.f6095c.equals(g0Var.f6095c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f6095c.hashCode() ^ ((((this.f6093a.hashCode() ^ 1000003) * 1000003) ^ this.f6094b.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f6093a);
        sb2.append(", libraryName=");
        sb2.append(this.f6094b);
        sb2.append(", buildId=");
        return defpackage.e.q(this.f6095c, "}", sb2);
    }
}
