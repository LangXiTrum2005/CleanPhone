package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.hD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3594hD extends AbstractC2567Le {
    public final InterfaceC2618Ne j;
    public InterfaceC2592Me k;
    public long l;
    public volatile boolean m;

    public C3594hD(InterfaceC4429ql interfaceC4429ql, C4868vl c4868vl, C4619sw c4619sw, int i, Object obj, InterfaceC2618Ne interfaceC2618Ne) {
        super(interfaceC4429ql, c4868vl, 2, c4619sw, i, obj, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
        this.j = interfaceC2618Ne;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.LI
    public final void cancelLoad() {
        this.m = true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.LI
    public final void load() {
        if (this.l == 0) {
            ((C2589Mb) this.j).b(this.k, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
        }
        try {
            C4868vl c4868vlB = this.b.b(this.l);
            B90 b90 = this.i;
            C2938Zm c2938Zm = new C2938Zm(b90, c4868vlB.f, b90.d(c4868vlB));
            while (!this.m) {
                try {
                    C2589Mb c2589Mb = (C2589Mb) this.j;
                    int iA = c2589Mb.f3410a.a(c2938Zm, C2589Mb.j);
                    boolean z = true;
                    if (iA == 1) {
                        z = false;
                    }
                    FW.s(z);
                    if (iA != 0) {
                        break;
                    }
                } catch (Throwable th) {
                    this.l = c2938Zm.d - this.b.f;
                    throw th;
                }
            }
            this.l = c2938Zm.d - this.b.f;
            FW.v(this.i);
        } catch (Throwable th2) {
            FW.v(this.i);
            throw th2;
        }
    }
}
