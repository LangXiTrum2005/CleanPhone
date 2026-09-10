package v3;

import com.google.android.gms.internal.ads.ta1;
import java.math.RoundingMode;
import l1.y;
import n2.s;
import n2.t;
import n2.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ta1 f52475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f52476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f52477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f52478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f52479e;

    public e(ta1 ta1Var, int i10, long j10, long j11) {
        this.f52475a = ta1Var;
        this.f52476b = i10;
        this.f52477c = j10;
        long j12 = (j11 - j10) / ((long) ta1Var.f20276c);
        this.f52478d = j12;
        this.f52479e = d(j12);
    }

    public final long d(long j10) {
        long j11 = j10 * ((long) this.f52476b);
        long j12 = this.f52475a.f20275b;
        String str = y.f44830a;
        return y.U(j11, 1000000L, j12, RoundingMode.DOWN);
    }

    @Override // n2.t
    public final long getDurationUs() {
        return this.f52479e;
    }

    @Override // n2.t
    public final s getSeekPoints(long j10) {
        ta1 ta1Var = this.f52475a;
        long j11 = (((long) ta1Var.f20275b) * j10) / (((long) this.f52476b) * 1000000);
        long j12 = this.f52478d;
        long jK = y.k(j11, 0L, j12 - 1);
        long j13 = ((long) ta1Var.f20276c) * jK;
        long j14 = this.f52477c;
        long jD = d(jK);
        u uVar = new u(jD, j13 + j14);
        if (jD >= j10 || jK == j12 - 1) {
            return new s(uVar, uVar);
        }
        long j15 = jK + 1;
        return new s(uVar, new u(d(j15), (((long) ta1Var.f20276c) * j15) + j14));
    }

    @Override // n2.t
    public final boolean isSeekable() {
        return true;
    }
}
