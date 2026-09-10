package cc;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f6229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f6231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f6232e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f6233f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f6234g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f6235h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f6236i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte f6237j;

    public final r0 a() {
        String str;
        String str2;
        String str3;
        if (this.f6237j == 63 && (str = this.f6229b) != null && (str2 = this.f6235h) != null && (str3 = this.f6236i) != null) {
            return new r0(this.f6228a, str, this.f6230c, this.f6231d, this.f6232e, this.f6233f, this.f6234g, str2, str3);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f6237j & 1) == 0) {
            sb2.append(" arch");
        }
        if (this.f6229b == null) {
            sb2.append(" model");
        }
        if ((this.f6237j & 2) == 0) {
            sb2.append(" cores");
        }
        if ((this.f6237j & 4) == 0) {
            sb2.append(" ram");
        }
        if ((this.f6237j & 8) == 0) {
            sb2.append(" diskSpace");
        }
        if ((this.f6237j & 16) == 0) {
            sb2.append(" simulator");
        }
        if ((this.f6237j & 32) == 0) {
            sb2.append(" state");
        }
        if (this.f6235h == null) {
            sb2.append(" manufacturer");
        }
        if (this.f6236i == null) {
            sb2.append(" modelClass");
        }
        throw new IllegalStateException(wi.d.j(sb2, "Missing required properties:"));
    }
}
