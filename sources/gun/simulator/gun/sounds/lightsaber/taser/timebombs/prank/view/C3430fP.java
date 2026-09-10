package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.fP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3430fP implements InterfaceC4395qO, InterfaceC4307pO {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4395qO f4366a;
    public final long b;
    public InterfaceC4307pO c;

    public C3430fP(InterfaceC4395qO interfaceC4395qO, long j) {
        this.f4366a = interfaceC4395qO;
        this.b = j;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final long b(long j, P30 p30) {
        long j2 = this.b;
        return this.f4366a.b(j - j2, p30) + j2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4985x40
    public final boolean continueLoading(long j) {
        return this.f4366a.continueLoading(j - this.b);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4985x40
    public final long getBufferedPositionUs() {
        long bufferedPositionUs = this.f4366a.getBufferedPositionUs();
        if (bufferedPositionUs == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.b + bufferedPositionUs;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4985x40
    public final long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.f4366a.getNextLoadPositionUs();
        if (nextLoadPositionUs == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.b + nextLoadPositionUs;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final C4062md0 getTrackGroups() {
        return this.f4366a.getTrackGroups();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4985x40
    public final boolean isLoading() {
        return this.f4366a.isLoading();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final long k(InterfaceC3299dt[] interfaceC3299dtArr, boolean[] zArr, W20[] w20Arr, boolean[] zArr2, long j) {
        W20[] w20Arr2 = new W20[w20Arr.length];
        int i = 0;
        while (true) {
            W20 w20 = null;
            if (i >= w20Arr.length) {
                break;
            }
            C3518gP c3518gP = (C3518gP) w20Arr[i];
            if (c3518gP != null) {
                w20 = c3518gP.f4414a;
            }
            w20Arr2[i] = w20;
            i++;
        }
        long j2 = this.b;
        long jK = this.f4366a.k(interfaceC3299dtArr, zArr, w20Arr2, zArr2, j - j2);
        for (int i2 = 0; i2 < w20Arr.length; i2++) {
            W20 w21 = w20Arr2[i2];
            if (w21 == null) {
                w20Arr[i2] = null;
            } else {
                W20 w22 = w20Arr[i2];
                if (w22 == null || ((C3518gP) w22).f4414a != w21) {
                    w20Arr[i2] = new C3518gP(w21, j2);
                }
            }
        }
        return jK + j2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final void maybeThrowPrepareError() {
        this.f4366a.maybeThrowPrepareError();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4897w40
    public final void o(InterfaceC4985x40 interfaceC4985x40) {
        InterfaceC4307pO interfaceC4307pO = this.c;
        interfaceC4307pO.getClass();
        interfaceC4307pO.o(this);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4307pO
    public final void p(InterfaceC4395qO interfaceC4395qO) {
        InterfaceC4307pO interfaceC4307pO = this.c;
        interfaceC4307pO.getClass();
        interfaceC4307pO.p(this);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final void q(long j) {
        this.f4366a.q(j - this.b);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final void r(InterfaceC4307pO interfaceC4307pO, long j) {
        this.c = interfaceC4307pO;
        this.f4366a.r(this, j - this.b);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final long readDiscontinuity() {
        long discontinuity = this.f4366a.readDiscontinuity();
        return discontinuity == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET ? com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET : this.b + discontinuity;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4985x40
    public final void reevaluateBuffer(long j) {
        this.f4366a.reevaluateBuffer(j - this.b);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final long seekToUs(long j) {
        long j2 = this.b;
        return this.f4366a.seekToUs(j - j2) + j2;
    }
}
