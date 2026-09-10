package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Jj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2520Jj extends D9 {
    public final int o;
    public final long p;
    public final InterfaceC2618Ne q;
    public long r;
    public volatile boolean s;
    public boolean t;

    public C2520Jj(InterfaceC4429ql interfaceC4429ql, C4868vl c4868vl, C4619sw c4619sw, int i, Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, InterfaceC2618Ne interfaceC2618Ne) {
        super(interfaceC4429ql, c4868vl, c4619sw, i, obj, j, j2, j3, j4, j5);
        this.o = i2;
        this.p = j6;
        this.q = interfaceC2618Ne;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3866kN
    public final long a() {
        return this.j + ((long) this.o);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3866kN
    public final boolean b() {
        return this.t;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.LI
    public final void cancelLoad() {
        this.s = true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.LI
    public final void load() {
        if (this.r == 0) {
            F9 f9 = this.m;
            FW.t(f9);
            long j = this.p;
            for (V20 v20 : f9.b) {
                if (v20.F != j) {
                    v20.F = j;
                    v20.z = true;
                }
            }
            InterfaceC2618Ne interfaceC2618Ne = this.q;
            long j2 = this.k;
            long j3 = j2 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET ? -9223372036854775807L : j2 - this.p;
            long j4 = this.l;
            ((C2589Mb) interfaceC2618Ne).b(f9, j3, j4 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET ? -9223372036854775807L : j4 - this.p);
        }
        try {
            C4868vl c4868vlB = this.b.b(this.r);
            B90 b90 = this.i;
            C2938Zm c2938Zm = new C2938Zm(b90, c4868vlB.f, b90.d(c4868vlB));
            while (!this.s) {
                try {
                    int iA = ((C2589Mb) this.q).f3410a.a(c2938Zm, C2589Mb.j);
                    FW.s(iA != 1);
                    if (iA != 0) {
                        break;
                    }
                } catch (Throwable th) {
                    this.r = c2938Zm.d - this.b.f;
                    throw th;
                }
            }
            this.r = c2938Zm.d - this.b.f;
            FW.v(this.i);
            this.t = !this.s;
        } catch (Throwable th2) {
            FW.v(this.i);
            throw th2;
        }
    }
}
