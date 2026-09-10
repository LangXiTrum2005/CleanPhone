package cc;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f6010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f6011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f6013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f6014e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f6015f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f6016g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f6017h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f6018i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public t2 f6019j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public x1 f6020k;
    public u1 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte f6021m;

    public final d0 a() {
        if (this.f6021m == 1 && this.f6010a != null && this.f6011b != null && this.f6013d != null && this.f6017h != null && this.f6018i != null) {
            return new d0(this.f6010a, this.f6011b, this.f6012c, this.f6013d, this.f6014e, this.f6015f, this.f6016g, this.f6017h, this.f6018i, this.f6019j, this.f6020k, this.l);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f6010a == null) {
            sb2.append(" sdkVersion");
        }
        if (this.f6011b == null) {
            sb2.append(" gmpAppId");
        }
        if ((1 & this.f6021m) == 0) {
            sb2.append(" platform");
        }
        if (this.f6013d == null) {
            sb2.append(" installationUuid");
        }
        if (this.f6017h == null) {
            sb2.append(" buildVersion");
        }
        if (this.f6018i == null) {
            sb2.append(" displayVersion");
        }
        throw new IllegalStateException(wi.d.j(sb2, "Missing required properties:"));
    }
}
