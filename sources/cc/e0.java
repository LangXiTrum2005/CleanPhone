package cc;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f6059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6061d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f6062e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f6063f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f6064g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f6065h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f6066i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte f6067j;

    public final f0 a() {
        String str;
        if (this.f6067j == 63 && (str = this.f6059b) != null) {
            return new f0(this.f6058a, str, this.f6060c, this.f6061d, this.f6062e, this.f6063f, this.f6064g, this.f6065h, this.f6066i);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f6067j & 1) == 0) {
            sb2.append(" pid");
        }
        if (this.f6059b == null) {
            sb2.append(" processName");
        }
        if ((this.f6067j & 2) == 0) {
            sb2.append(" reasonCode");
        }
        if ((this.f6067j & 4) == 0) {
            sb2.append(" importance");
        }
        if ((this.f6067j & 8) == 0) {
            sb2.append(" pss");
        }
        if ((this.f6067j & 16) == 0) {
            sb2.append(" rss");
        }
        if ((this.f6067j & 32) == 0) {
            sb2.append(" timestamp");
        }
        throw new IllegalStateException(wi.d.j(sb2, "Missing required properties:"));
    }
}
