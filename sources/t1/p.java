package t1;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends n {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f50402j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final t f50403k;
    public final long l;

    public p(j jVar, long j10, long j11, long j12, long j13, long j14, List list, long j15, t tVar, t tVar2, long j16, long j17) {
        super(jVar, j10, j11, j12, j14, list, j15, j16, j17);
        this.f50402j = tVar;
        this.f50403k = tVar2;
        this.l = j13;
    }

    @Override // t1.s
    public final j a(m mVar) {
        t tVar = this.f50402j;
        if (tVar == null) {
            return this.f50408a;
        }
        i1.p pVar = mVar.f50388a;
        return new j(tVar.a(pVar.f42631a, 0L, pVar.f42640j, 0L), 0L, -1L);
    }

    @Override // t1.n
    public final long d(long j10) {
        List list = this.f50397f;
        if (list != null) {
            return list.size();
        }
        long j11 = this.l;
        if (j11 != -1) {
            return (j11 - this.f50395d) + 1;
        }
        if (j10 == C.TIME_UNSET) {
            return -1L;
        }
        BigInteger bigIntegerMultiply = BigInteger.valueOf(j10).multiply(BigInteger.valueOf(this.f50409b));
        BigInteger bigIntegerMultiply2 = BigInteger.valueOf(this.f50396e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i10 = ra.a.f49515a;
        return new BigDecimal(bigIntegerMultiply).divide(new BigDecimal(bigIntegerMultiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override // t1.n
    public final j h(k kVar, long j10) {
        long j11 = this.f50395d;
        List list = this.f50397f;
        long j12 = list != null ? ((q) list.get((int) (j10 - j11))).f50404a : (j10 - j11) * this.f50396e;
        i1.p pVar = kVar.f50388a;
        return new j(this.f50403k.a(pVar.f42631a, j10, pVar.f42640j, j12), 0L, -1L);
    }
}
