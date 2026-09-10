package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.tM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4656tM implements InterfaceC4395qO, InterfaceC4307pO {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5186zO f5032a;
    public final long b;
    public final C2833Vl c;
    public G9 d;
    public InterfaceC4395qO e;
    public InterfaceC4307pO f;
    public long g = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;

    public C4656tM(C5186zO c5186zO, C2833Vl c2833Vl, long j) {
        this.f5032a = c5186zO;
        this.c = c2833Vl;
        this.b = j;
    }

    public final void a(C5186zO c5186zO) {
        long j = this.g;
        if (j == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            j = this.b;
        }
        G9 g9 = this.d;
        g9.getClass();
        InterfaceC4395qO interfaceC4395qOB = g9.b(c5186zO, this.c, j);
        this.e = interfaceC4395qOB;
        if (this.f != null) {
            interfaceC4395qOB.r(this, j);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final long b(long j, P30 p30) {
        InterfaceC4395qO interfaceC4395qO = this.e;
        int i = Ug0.f3833a;
        return interfaceC4395qO.b(j, p30);
    }

    public final void c() {
        if (this.e != null) {
            G9 g9 = this.d;
            g9.getClass();
            g9.q(this.e);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4985x40
    public final boolean continueLoading(long j) {
        InterfaceC4395qO interfaceC4395qO = this.e;
        return interfaceC4395qO != null && interfaceC4395qO.continueLoading(j);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4985x40
    public final long getBufferedPositionUs() {
        InterfaceC4395qO interfaceC4395qO = this.e;
        int i = Ug0.f3833a;
        return interfaceC4395qO.getBufferedPositionUs();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4985x40
    public final long getNextLoadPositionUs() {
        InterfaceC4395qO interfaceC4395qO = this.e;
        int i = Ug0.f3833a;
        return interfaceC4395qO.getNextLoadPositionUs();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final C4062md0 getTrackGroups() {
        InterfaceC4395qO interfaceC4395qO = this.e;
        int i = Ug0.f3833a;
        return interfaceC4395qO.getTrackGroups();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4985x40
    public final boolean isLoading() {
        InterfaceC4395qO interfaceC4395qO = this.e;
        return interfaceC4395qO != null && interfaceC4395qO.isLoading();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final long k(InterfaceC3299dt[] interfaceC3299dtArr, boolean[] zArr, W20[] w20Arr, boolean[] zArr2, long j) {
        long j2;
        long j3 = this.g;
        if (j3 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET || j != this.b) {
            j2 = j;
        } else {
            this.g = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
            j2 = j3;
        }
        InterfaceC4395qO interfaceC4395qO = this.e;
        int i = Ug0.f3833a;
        return interfaceC4395qO.k(interfaceC3299dtArr, zArr, w20Arr, zArr2, j2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final void maybeThrowPrepareError() {
        InterfaceC4395qO interfaceC4395qO = this.e;
        if (interfaceC4395qO != null) {
            interfaceC4395qO.maybeThrowPrepareError();
            return;
        }
        G9 g9 = this.d;
        if (g9 != null) {
            g9.m();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4897w40
    public final void o(InterfaceC4985x40 interfaceC4985x40) {
        InterfaceC4307pO interfaceC4307pO = this.f;
        int i = Ug0.f3833a;
        interfaceC4307pO.o(this);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4307pO
    public final void p(InterfaceC4395qO interfaceC4395qO) {
        InterfaceC4307pO interfaceC4307pO = this.f;
        int i = Ug0.f3833a;
        interfaceC4307pO.p(this);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final void q(long j) {
        InterfaceC4395qO interfaceC4395qO = this.e;
        int i = Ug0.f3833a;
        interfaceC4395qO.q(j);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final void r(InterfaceC4307pO interfaceC4307pO, long j) {
        this.f = interfaceC4307pO;
        InterfaceC4395qO interfaceC4395qO = this.e;
        if (interfaceC4395qO != null) {
            long j2 = this.g;
            if (j2 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                j2 = this.b;
            }
            interfaceC4395qO.r(this, j2);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final long readDiscontinuity() {
        InterfaceC4395qO interfaceC4395qO = this.e;
        int i = Ug0.f3833a;
        return interfaceC4395qO.readDiscontinuity();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4985x40
    public final void reevaluateBuffer(long j) {
        InterfaceC4395qO interfaceC4395qO = this.e;
        int i = Ug0.f3833a;
        interfaceC4395qO.reevaluateBuffer(j);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final long seekToUs(long j) {
        InterfaceC4395qO interfaceC4395qO = this.e;
        int i = Ug0.f3833a;
        return interfaceC4395qO.seekToUs(j);
    }
}
