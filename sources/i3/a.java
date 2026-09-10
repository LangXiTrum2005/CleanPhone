package i3;

import com.google.android.gms.internal.ads.b7;
import com.google.android.gms.internal.ads.k7;
import java.math.BigInteger;
import l1.y;
import n2.s;
import n2.t;
import n2.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b7 f42842a;

    public a(b7 b7Var) {
        this.f42842a = b7Var;
    }

    @Override // n2.t
    public final long getDurationUs() {
        b7 b7Var = this.f42842a;
        return (b7Var.f12663d * 1000000) / ((long) ((k7) b7Var.l).f16351e);
    }

    @Override // n2.t
    public final s getSeekPoints(long j10) {
        b7 b7Var = this.f42842a;
        long j11 = (((long) ((k7) b7Var.l).f16351e) * j10) / 1000000;
        long j12 = b7Var.f12660a;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(j11);
        long j13 = b7Var.f12661b;
        u uVar = new u(j10, y.k((bigIntegerValueOf.multiply(BigInteger.valueOf(j13 - j12)).divide(BigInteger.valueOf(b7Var.f12663d)).longValue() + j12) - 30000, b7Var.f12660a, j13 - 1));
        return new s(uVar, uVar);
    }

    @Override // n2.t
    public final boolean isSeekable() {
        return true;
    }
}
