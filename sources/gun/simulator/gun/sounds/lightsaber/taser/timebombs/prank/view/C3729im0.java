package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.im0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3729im0 implements S30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4519a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final long[] f;

    public C3729im0(long j, int i, long j2, long j3, long[] jArr) {
        this.f4519a = j;
        this.b = i;
        this.c = j2;
        this.f = jArr;
        this.d = j3;
        this.e = j3 != -1 ? j + j3 : -1L;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.S30
    public final long c() {
        return this.e;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O30
    public final long getDurationUs() {
        return this.c;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O30
    public final N30 getSeekPoints(long j) {
        double d;
        boolean zIsSeekable = isSeekable();
        int i = this.b;
        long j2 = this.f4519a;
        if (!zIsSeekable) {
            Q30 q30 = new Q30(0L, j2 + ((long) i));
            return new N30(q30, q30);
        }
        long jK = Ug0.k(j, 0L, this.c);
        double d2 = (jK * 100.0d) / this.c;
        double d3 = 0.0d;
        if (d2 <= 0.0d) {
            d = 256.0d;
        } else if (d2 >= 100.0d) {
            d = 256.0d;
            d3 = 256.0d;
        } else {
            int i2 = (int) d2;
            long[] jArr = this.f;
            FW.t(jArr);
            double d4 = jArr[i2];
            d3 = (((i2 == 99 ? 256.0d : jArr[i2 + 1]) - d4) * (d2 - ((double) i2))) + d4;
            d = 256.0d;
        }
        double d5 = d3 / d;
        long j3 = this.d;
        Q30 q31 = new Q30(jK, j2 + Ug0.k(Math.round(d5 * j3), i, j3 - 1));
        return new N30(q31, q31);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.S30
    public final long getTimeUs(long j) {
        long j2 = j - this.f4519a;
        if (!isSeekable() || j2 <= this.b) {
            return 0L;
        }
        long[] jArr = this.f;
        FW.t(jArr);
        double d = (j2 * 256.0d) / this.d;
        int iF = Ug0.f(jArr, (long) d, true);
        long j3 = this.c;
        long j4 = (((long) iF) * j3) / 100;
        long j5 = jArr[iF];
        int i = iF + 1;
        long j6 = (j3 * ((long) i)) / 100;
        long j7 = iF == 99 ? 256L : jArr[i];
        return Math.round((j5 == j7 ? 0.0d : (d - j5) / (j7 - j5)) * (j6 - j4)) + j4;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O30
    public final boolean isSeekable() {
        return this.f != null;
    }
}
