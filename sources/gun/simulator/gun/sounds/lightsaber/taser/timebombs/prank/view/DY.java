package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class DY extends FY implements InterfaceC3021al {
    public final X30 h;

    public DY(long j, C4619sw c4619sw, AC ac, X30 x30, ArrayList arrayList, List list, List list2) {
        super(c4619sw, ac, x30, arrayList, list, list2);
        this.h = x30;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FY
    public final String a() {
        return null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3021al
    public final long c(long j, long j2) {
        return this.h.e(j, j2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FY
    public final C3614hX d() {
        return null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3021al
    public final long e(long j, long j2) {
        return this.h.c(j, j2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3021al
    public final long f(long j, long j2) {
        X30 x30 = this.h;
        if (x30.f != null) {
            return com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        }
        long jB = x30.b(j, j2) + x30.c(j, j2);
        return (x30.e(jB, j) + x30.g(jB)) - x30.i;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3021al
    public final C3614hX g(long j) {
        return this.h.h(j, this);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3021al
    public final long getTimeUs(long j) {
        return this.h.g(j);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3021al
    public final long h(long j, long j2) {
        return this.h.f(j, j2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3021al
    public final long m(long j) {
        return this.h.d(j);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3021al
    public final boolean t() {
        return this.h.i();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3021al
    public final long u() {
        return this.h.d;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3021al
    public final long v(long j, long j2) {
        return this.h.b(j, j2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FY
    public final InterfaceC3021al b() {
        return this;
    }
}
