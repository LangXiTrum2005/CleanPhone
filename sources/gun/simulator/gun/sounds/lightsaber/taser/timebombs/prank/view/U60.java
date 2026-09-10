package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes2.dex */
public final class U60 extends D9 {
    public final int o;
    public final C4619sw p;
    public long q;
    public boolean r;

    public U60(InterfaceC4429ql interfaceC4429ql, C4868vl c4868vl, C4619sw c4619sw, int i, Object obj, long j, long j2, long j3, int i2, C4619sw c4619sw2) {
        super(interfaceC4429ql, c4868vl, c4619sw, i, obj, j, j2, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, j3);
        this.o = i2;
        this.p = c4619sw2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3866kN
    public final boolean b() {
        return this.r;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.LI
    public final void load() {
        B90 b90 = this.i;
        F9 f9 = this.m;
        FW.t(f9);
        for (V20 v20 : f9.b) {
            if (v20.F != 0) {
                v20.F = 0L;
                v20.z = true;
            }
        }
        InterfaceC4326pd0 interfaceC4326pd0A = f9.a(this.o);
        interfaceC4326pd0A.e(this.p);
        try {
            long jD = b90.d(this.b.b(this.q));
            if (jD != -1) {
                jD += this.q;
            }
            C2938Zm c2938Zm = new C2938Zm(this.i, this.q, jD);
            for (int iC = 0; iC != -1; iC = interfaceC4326pd0A.c(c2938Zm, Integer.MAX_VALUE, true)) {
                this.q += (long) iC;
            }
            interfaceC4326pd0A.a(this.g, 1, (int) this.q, 0, null);
            FW.v(b90);
            this.r = true;
        } catch (Throwable th) {
            FW.v(b90);
            throw th;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.LI
    public final void cancelLoad() {
    }
}
