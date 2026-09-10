package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Cj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C2338Cj implements O30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2936a;
    public final long b;
    public final int c;
    public final long d;
    public final int e;
    public final long f;
    public final boolean g;

    public C2338Cj(long j, long j2, int i, int i2, boolean z) {
        this.f2936a = j;
        this.b = j2;
        this.c = i2 == -1 ? 1 : i2;
        this.e = i;
        this.g = z;
        if (j == -1) {
            this.d = -1L;
            this.f = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        } else {
            long j3 = j - j2;
            this.d = j3;
            this.f = (Math.max(0L, j3) * 8000000) / ((long) i);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O30
    public final long getDurationUs() {
        return this.f;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O30
    public final N30 getSeekPoints(long j) {
        long j2 = this.b;
        long j3 = this.d;
        if (j3 == -1 && !this.g) {
            Q30 q30 = new Q30(0L, j2);
            return new N30(q30, q30);
        }
        int i = this.e;
        long j4 = this.c;
        long jMin = (((((long) i) * j) / 8000000) / j4) * j4;
        if (j3 != -1) {
            jMin = Math.min(jMin, j3 - j4);
        }
        long jMax = Math.max(jMin, 0L) + j2;
        long jMax2 = (Math.max(0L, jMax - j2) * 8000000) / ((long) i);
        Q30 q31 = new Q30(jMax2, jMax);
        if (j3 != -1 && jMax2 < j) {
            long j5 = jMax + j4;
            if (j5 < this.f2936a) {
                return new N30(q31, new Q30((Math.max(0L, j5 - j2) * 8000000) / ((long) i), j5));
            }
        }
        return new N30(q31, q31);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O30
    public final boolean isSeekable() {
        return this.d != -1 || this.g;
    }
}
