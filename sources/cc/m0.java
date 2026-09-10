package cc;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f6164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f6165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f6166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f6167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f6168e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f6169f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b2 f6170g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public s2 f6171h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public r2 f6172i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c2 f6173j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f6174k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte f6175m;

    public final n0 a() {
        String str;
        String str2;
        b2 b2Var;
        if (this.f6175m == 7 && (str = this.f6164a) != null && (str2 = this.f6165b) != null && (b2Var = this.f6170g) != null) {
            return new n0(str, str2, this.f6166c, this.f6167d, this.f6168e, this.f6169f, b2Var, this.f6171h, this.f6172i, this.f6173j, this.f6174k, this.l);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f6164a == null) {
            sb2.append(" generator");
        }
        if (this.f6165b == null) {
            sb2.append(" identifier");
        }
        if ((this.f6175m & 1) == 0) {
            sb2.append(" startedAt");
        }
        if ((this.f6175m & 2) == 0) {
            sb2.append(" crashed");
        }
        if (this.f6170g == null) {
            sb2.append(" app");
        }
        if ((this.f6175m & 4) == 0) {
            sb2.append(" generatorType");
        }
        throw new IllegalStateException(wi.d.j(sb2, "Missing required properties:"));
    }
}
