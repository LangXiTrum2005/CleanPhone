package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Cf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2334Cf extends AbstractC4971ww {
    public final long f;
    public final long g;
    public final long h;
    public final boolean i;

    public C2334Cf(Gc0 gc0, long j, long j2) throws C2360Df {
        super(gc0);
        boolean z = false;
        if (gc0.i() != 1) {
            throw new C2360Df(0);
        }
        Fc0 fc0N = gc0.n(0, new Fc0(), 0L);
        long jMax = Math.max(0L, j);
        if (!fc0N.l && jMax != 0 && !fc0N.h) {
            throw new C2360Df(1);
        }
        long jMax2 = j2 == Long.MIN_VALUE ? fc0N.n : Math.max(0L, j2);
        long j3 = fc0N.n;
        if (j3 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            jMax2 = jMax2 > j3 ? j3 : jMax2;
            if (jMax > jMax2) {
                throw new C2360Df(2);
            }
        }
        this.f = jMax;
        this.g = jMax2;
        this.h = jMax2 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET ? -9223372036854775807L : jMax2 - jMax;
        if (fc0N.i && (jMax2 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET || (j3 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET && jMax2 == j3))) {
            z = true;
        }
        this.i = z;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4971ww, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gc0
    public final Ec0 g(int i, Ec0 ec0, boolean z) {
        this.e.g(0, ec0, z);
        long j = ec0.e - this.f;
        long j2 = this.h;
        ec0.i(ec0.f3030a, ec0.b, 0, j2 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET ? -9223372036854775807L : j2 - j, j, C2.g, false);
        return ec0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4971ww, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gc0
    public final Fc0 n(int i, Fc0 fc0, long j) {
        this.e.n(0, fc0, 0L);
        long j2 = fc0.q;
        long j3 = this.f;
        fc0.q = j2 + j3;
        fc0.n = this.h;
        fc0.i = this.i;
        long j4 = fc0.m;
        if (j4 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            long jMax = Math.max(j4, j3);
            fc0.m = jMax;
            long j5 = this.g;
            if (j5 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                jMax = Math.min(jMax, j5);
            }
            fc0.m = jMax - j3;
        }
        long jW = Ug0.W(j3);
        long j6 = fc0.e;
        if (j6 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            fc0.e = j6 + jW;
        }
        long j7 = fc0.f;
        if (j7 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            fc0.f = j7 + jW;
        }
        return fc0;
    }
}
