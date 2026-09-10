package g3;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import l1.y;
import n2.s;
import n2.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f41431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f41432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f41433c;

    public c(long[] jArr, long[] jArr2, long j10) {
        this.f41431a = jArr;
        this.f41432b = jArr2;
        this.f41433c = j10 == C.TIME_UNSET ? y.M(jArr2[jArr2.length - 1]) : j10;
    }

    public static Pair d(long[] jArr, long[] jArr2, long j10) {
        int iF = y.f(jArr, j10, true);
        long j11 = jArr[iF];
        long j12 = jArr2[iF];
        int i10 = iF + 1;
        if (i10 == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        long j13 = jArr[i10];
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) ((j13 == j11 ? 0.0d : (j10 - j11) / (j13 - j11)) * (jArr2[i10] - j12))) + j12));
    }

    @Override // g3.h
    public final long b() {
        return -1L;
    }

    @Override // g3.h
    public final int c() {
        return -2147483647;
    }

    @Override // n2.t
    public final long getDurationUs() {
        return this.f41433c;
    }

    @Override // n2.t
    public final s getSeekPoints(long j10) {
        Pair pairD = d(this.f41432b, this.f41431a, y.Z(y.k(j10, 0L, this.f41433c)));
        u uVar = new u(y.M(((Long) pairD.first).longValue()), ((Long) pairD.second).longValue());
        return new s(uVar, uVar);
    }

    @Override // g3.h
    public final long getTimeUs(long j10) {
        return y.M(((Long) d(this.f41431a, this.f41432b, j10).second).longValue());
    }

    @Override // n2.t
    public final boolean isSeekable() {
        return true;
    }
}
