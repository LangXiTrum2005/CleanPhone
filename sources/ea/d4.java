package ea;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class d4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e4 f39349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39350b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f39351c = a();

    public d4(e4 e4Var) {
        this.f39349a = e4Var;
    }

    public final long a() {
        e4 e4Var = this.f39349a;
        k9.c0.h(e4Var);
        long jLongValue = ((Long) d0.f39334v.a(null)).longValue();
        long jLongValue2 = ((Long) d0.f39336w.a(null)).longValue();
        for (int i10 = 1; i10 < this.f39350b; i10++) {
            jLongValue += jLongValue;
            if (jLongValue >= jLongValue2) {
                break;
            }
        }
        ((p9.b) e4Var.i0()).getClass();
        return Math.min(jLongValue, jLongValue2) + System.currentTimeMillis();
    }
}
