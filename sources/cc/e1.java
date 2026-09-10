package cc;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class e1 extends j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f6071d;

    public e1(String str, int i10, int i11, boolean z10) {
        this.f6068a = str;
        this.f6069b = i10;
        this.f6070c = i11;
        this.f6071d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j2) {
            e1 e1Var = (e1) ((j2) obj);
            if (this.f6068a.equals(e1Var.f6068a) && this.f6069b == e1Var.f6069b && this.f6070c == e1Var.f6070c && this.f6071d == e1Var.f6071d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f6071d ? 1231 : 1237) ^ ((((((this.f6068a.hashCode() ^ 1000003) * 1000003) ^ this.f6069b) * 1000003) ^ this.f6070c) * 1000003);
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f6068a + ", pid=" + this.f6069b + ", importance=" + this.f6070c + ", defaultProcess=" + this.f6071d + "}";
    }
}
