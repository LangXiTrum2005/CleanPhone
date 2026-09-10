package cc;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f6050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f6053d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte f6054e;

    public final e1 a() {
        String str;
        if (this.f6054e == 7 && (str = this.f6050a) != null) {
            return new e1(str, this.f6051b, this.f6052c, this.f6053d);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f6050a == null) {
            sb2.append(" processName");
        }
        if ((this.f6054e & 1) == 0) {
            sb2.append(" pid");
        }
        if ((this.f6054e & 2) == 0) {
            sb2.append(" importance");
        }
        if ((this.f6054e & 4) == 0) {
            sb2.append(" defaultProcess");
        }
        throw new IllegalStateException(wi.d.j(sb2, "Missing required properties:"));
    }
}
