package fn;

import com.google.android.gms.internal.ads.fs1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class v0 extends gn.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f41176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public cn.l f41177b;

    @Override // gn.c
    public final boolean a(fs1 fs1Var) {
        u0 u0Var = (u0) fs1Var;
        if (this.f41176a >= 0) {
            return false;
        }
        long j10 = u0Var.f41169h;
        if (j10 < u0Var.f41170i) {
            u0Var.f41170i = j10;
        }
        this.f41176a = j10;
        return true;
    }

    @Override // gn.c
    public final ak.f[] b(fs1 fs1Var) {
        long j10 = this.f41176a;
        this.f41176a = -1L;
        this.f41177b = null;
        return ((u0) fs1Var).o0(j10);
    }
}
