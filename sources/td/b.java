package td;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f50730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f50731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f50732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f50733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f50734e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte f50735f;

    public final c a() {
        if (this.f50735f == 1 && this.f50730a != null && this.f50731b != null && this.f50732c != null && this.f50733d != null) {
            return new c(this.f50730a, this.f50731b, this.f50732c, this.f50733d, this.f50734e);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f50730a == null) {
            sb2.append(" rolloutId");
        }
        if (this.f50731b == null) {
            sb2.append(" variantId");
        }
        if (this.f50732c == null) {
            sb2.append(" parameterKey");
        }
        if (this.f50733d == null) {
            sb2.append(" parameterValue");
        }
        if ((this.f50735f & 1) == 0) {
            sb2.append(" templateVersion");
        }
        throw new IllegalStateException(wi.d.j(sb2, "Missing required properties:"));
    }
}
