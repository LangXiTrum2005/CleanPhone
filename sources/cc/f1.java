package cc;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Double f6084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f6086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f6088e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f6089f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte f6090g;

    public final g1 a() {
        if (this.f6090g == 31) {
            return new g1(this.f6084a, this.f6085b, this.f6086c, this.f6087d, this.f6088e, this.f6089f);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f6090g & 1) == 0) {
            sb2.append(" batteryVelocity");
        }
        if ((this.f6090g & 2) == 0) {
            sb2.append(" proximityOn");
        }
        if ((this.f6090g & 4) == 0) {
            sb2.append(" orientation");
        }
        if ((this.f6090g & 8) == 0) {
            sb2.append(" ramUsed");
        }
        if ((this.f6090g & 16) == 0) {
            sb2.append(" diskUsed");
        }
        throw new IllegalStateException(wi.d.j(sb2, "Missing required properties:"));
    }
}
