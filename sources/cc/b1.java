package cc;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f6001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f6002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f6003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f6004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6005e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte f6006f;

    public final c1 a() {
        String str;
        if (this.f6006f == 7 && (str = this.f6002b) != null) {
            return new c1(this.f6001a, str, this.f6003c, this.f6004d, this.f6005e);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f6006f & 1) == 0) {
            sb2.append(" pc");
        }
        if (this.f6002b == null) {
            sb2.append(" symbol");
        }
        if ((this.f6006f & 2) == 0) {
            sb2.append(" offset");
        }
        if ((this.f6006f & 4) == 0) {
            sb2.append(" importance");
        }
        throw new IllegalStateException(wi.d.j(sb2, "Missing required properties:"));
    }
}
