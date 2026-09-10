package cc;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k1 f6117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f6118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f6119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f6120d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte f6121e;

    public final j1 a() {
        k1 k1Var;
        String str;
        String str2;
        if (this.f6121e == 1 && (k1Var = this.f6117a) != null && (str = this.f6118b) != null && (str2 = this.f6119c) != null) {
            return new j1(k1Var, str, str2, this.f6120d);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f6117a == null) {
            sb2.append(" rolloutVariant");
        }
        if (this.f6118b == null) {
            sb2.append(" parameterKey");
        }
        if (this.f6119c == null) {
            sb2.append(" parameterValue");
        }
        if ((this.f6121e & 1) == 0) {
            sb2.append(" templateVersion");
        }
        throw new IllegalStateException(wi.d.j(sb2, "Missing required properties:"));
    }
}
