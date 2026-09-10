package ea;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class n3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f39625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f39626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f2 f39627c;

    public n3(f2 f2Var, long j10, long j11) {
        Objects.requireNonNull(f2Var);
        this.f39627c = f2Var;
        this.f39625a = j10;
        this.f39626b = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j1 j1Var = ((m1) ((p3) this.f39627c.f39410c).f3623a).f39588g;
        m1.h(j1Var);
        j1Var.P0(new androidx.lifecycle.a0(this, 13));
    }
}
