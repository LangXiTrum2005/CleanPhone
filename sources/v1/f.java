package v1;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends g2.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f52305d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f52306e;

    public f(long j10, List list) {
        super(0L, list.size() - 1);
        this.f52306e = j10;
        this.f52305d = list;
    }

    @Override // g2.n
    public final long c() {
        a();
        return this.f52306e + ((w1.k) this.f52305d.get((int) this.f41346c)).f52821e;
    }

    @Override // g2.n
    public final long d() {
        a();
        w1.k kVar = (w1.k) this.f52305d.get((int) this.f41346c);
        return this.f52306e + kVar.f52821e + kVar.f52819c;
    }
}
