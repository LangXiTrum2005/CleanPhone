package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.sn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4608sn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4998a;
    public final long b;
    public final float c;
    public long d = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    public long e = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    public long g = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    public long h = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    public float k = 0.97f;
    public float j = 1.03f;
    public float l = 1.0f;
    public long m = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    public long f = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    public long i = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    public long n = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    public long o = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;

    public C4608sn(long j, long j2, float f) {
        this.f4998a = j;
        this.b = j2;
        this.c = f;
    }

    public final void a() {
        long j = this.d;
        if (j != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            long j2 = this.e;
            if (j2 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                j = j2;
            }
            long j3 = this.g;
            if (j3 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET && j < j3) {
                j = j3;
            }
            long j4 = this.h;
            if (j4 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET && j > j4) {
                j = j4;
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.f == j) {
            return;
        }
        this.f = j;
        this.i = j;
        this.n = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.o = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.m = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }
}
