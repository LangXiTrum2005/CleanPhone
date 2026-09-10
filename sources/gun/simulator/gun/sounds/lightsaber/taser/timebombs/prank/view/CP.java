package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.util.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class CP implements S30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f2919a;
    public final long[] b;
    public final long c;

    public CP(long[] jArr, long[] jArr2, long j) {
        this.f2919a = jArr;
        this.b = jArr2;
        this.c = j == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET ? Ug0.L(jArr2[jArr2.length - 1]) : j;
    }

    public static Pair a(long j, long[] jArr, long[] jArr2) {
        int iF = Ug0.f(jArr, j, true);
        long j2 = jArr[iF];
        long j3 = jArr2[iF];
        int i = iF + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((j4 == j2 ? 0.0d : (j - j2) / (j4 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.S30
    public final long c() {
        return -1L;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O30
    public final long getDurationUs() {
        return this.c;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O30
    public final N30 getSeekPoints(long j) {
        Pair pairA = a(Ug0.W(Ug0.k(j, 0L, this.c)), this.b, this.f2919a);
        Q30 q30 = new Q30(Ug0.L(((Long) pairA.first).longValue()), ((Long) pairA.second).longValue());
        return new N30(q30, q30);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.S30
    public final long getTimeUs(long j) {
        return Ug0.L(((Long) a(j, this.f2919a, this.b).second).longValue());
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O30
    public final boolean isSeekable() {
        return true;
    }
}
