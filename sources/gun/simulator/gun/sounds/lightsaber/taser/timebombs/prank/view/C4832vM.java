package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.vM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4832vM extends Gc0 {
    public final C3693iO e;

    public C4832vM(C3693iO c3693iO) {
        this.e = c3693iO;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gc0
    public final int b(Object obj) {
        return obj == C4744uM.h ? 0 : -1;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gc0
    public final Ec0 g(int i, Ec0 ec0, boolean z) {
        ec0.i(z ? 0 : null, z ? C4744uM.h : null, 0, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, 0L, C2.g, true);
        return ec0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gc0
    public final int i() {
        return 1;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gc0
    public final Object m(int i) {
        return C4744uM.h;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gc0
    public final Fc0 n(int i, Fc0 fc0, long j) {
        fc0.b(Fc0.r, this.e, null, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, false, true, null, 0L, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, 0, 0, 0L);
        fc0.l = true;
        return fc0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gc0
    public final int p() {
        return 1;
    }
}
