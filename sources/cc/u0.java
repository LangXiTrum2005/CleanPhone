package cc;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i2 f6295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f6296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f6297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f6298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j2 f6299e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f6300f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f6301g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte f6302h;

    public final v0 a() {
        i2 i2Var;
        if (this.f6302h == 1 && (i2Var = this.f6295a) != null) {
            return new v0(i2Var, this.f6296b, this.f6297c, this.f6298d, this.f6299e, this.f6300f, this.f6301g);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f6295a == null) {
            sb2.append(" execution");
        }
        if ((this.f6302h & 1) == 0) {
            sb2.append(" uiOrientation");
        }
        throw new IllegalStateException(wi.d.j(sb2, "Missing required properties:"));
    }
}
