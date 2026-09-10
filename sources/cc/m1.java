package cc;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f6177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f6178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f6179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte f6180e;

    public final n1 a() {
        String str;
        String str2;
        if (this.f6180e == 3 && (str = this.f6177b) != null && (str2 = this.f6178c) != null) {
            return new n1(str, this.f6176a, str2, this.f6179d);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f6180e & 1) == 0) {
            sb2.append(" platform");
        }
        if (this.f6177b == null) {
            sb2.append(" version");
        }
        if (this.f6178c == null) {
            sb2.append(" buildVersion");
        }
        if ((this.f6180e & 2) == 0) {
            sb2.append(" jailbroken");
        }
        throw new IllegalStateException(wi.d.j(sb2, "Missing required properties:"));
    }
}
