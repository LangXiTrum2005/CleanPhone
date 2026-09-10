package cc;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f6269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f6270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k2 f6271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l2 f6272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m2 f6273e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p2 f6274f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte f6275g;

    public final t0 a() {
        String str;
        k2 k2Var;
        l2 l2Var;
        if (this.f6275g == 1 && (str = this.f6270b) != null && (k2Var = this.f6271c) != null && (l2Var = this.f6272d) != null) {
            return new t0(this.f6269a, str, k2Var, l2Var, this.f6273e, this.f6274f);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((1 & this.f6275g) == 0) {
            sb2.append(" timestamp");
        }
        if (this.f6270b == null) {
            sb2.append(" type");
        }
        if (this.f6271c == null) {
            sb2.append(" app");
        }
        if (this.f6272d == null) {
            sb2.append(" device");
        }
        throw new IllegalStateException(wi.d.j(sb2, "Missing required properties:"));
    }
}
