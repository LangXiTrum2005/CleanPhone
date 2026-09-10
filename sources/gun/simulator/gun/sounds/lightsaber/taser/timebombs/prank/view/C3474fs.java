package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.fs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3474fs implements W20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4619sw f4388a;
    public long[] c;
    public boolean d;
    public C3650hs e;
    public boolean f;
    public int g;
    public final C3491g4 b = new C3491g4(8);
    public long h = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;

    public C3474fs(C3650hs c3650hs, C4619sw c4619sw, boolean z) {
        this.f4388a = c4619sw;
        this.e = c3650hs;
        this.c = c3650hs.b;
        b(c3650hs, z);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.W20
    public final int a(C3692iN c3692iN, C2677Pl c2677Pl, int i) {
        int i2 = this.g;
        boolean z = i2 == this.c.length;
        if (z && !this.d) {
            c2677Pl.b = 4;
            return -4;
        }
        if ((i & 2) != 0 || !this.f) {
            c3692iN.c = this.f4388a;
            this.f = true;
            return -5;
        }
        if (z) {
            return -3;
        }
        if ((i & 1) == 0) {
            this.g = i2 + 1;
        }
        if ((i & 4) == 0) {
            byte[] bArrV = this.b.v(this.e.f4477a[i2]);
            c2677Pl.g(bArrV.length);
            c2677Pl.d.put(bArrV);
        }
        c2677Pl.f = this.c[i2];
        c2677Pl.b = 1;
        return -4;
    }

    public final void b(C3650hs c3650hs, boolean z) {
        int i = this.g;
        long j = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        long j2 = i == 0 ? -9223372036854775807L : this.c[i - 1];
        this.d = z;
        this.e = c3650hs;
        long[] jArr = c3650hs.b;
        this.c = jArr;
        long j3 = this.h;
        if (j3 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            if (j2 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                this.g = Ug0.b(jArr, j2, false);
            }
        } else {
            int iB = Ug0.b(jArr, j3, true);
            this.g = iB;
            if (this.d && iB == this.c.length) {
                j = j3;
            }
            this.h = j;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.W20
    public final boolean isReady() {
        return true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.W20
    public final int skipData(long j) {
        int iMax = Math.max(this.g, Ug0.b(this.c, j, true));
        int i = iMax - this.g;
        this.g = iMax;
        return i;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.W20
    public final void maybeThrowError() {
    }
}
