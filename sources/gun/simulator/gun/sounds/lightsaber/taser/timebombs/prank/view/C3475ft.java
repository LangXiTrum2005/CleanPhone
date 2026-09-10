package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ft, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3475ft implements InterfaceC4495ra0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4389a;
    public final AC b;

    public C3475ft(long j, C3965lY c3965lY) {
        this.f4389a = j;
        this.b = c3965lY;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4495ra0
    public final List getCues(long j) {
        if (j >= this.f4389a) {
            return this.b;
        }
        C5086yC c5086yC = AC.b;
        return C3965lY.e;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4495ra0
    public final long getEventTime(int i) {
        FW.h(i == 0);
        return this.f4389a;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4495ra0
    public final int getEventTimeCount() {
        return 1;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4495ra0
    public final int getNextEventTimeIndex(long j) {
        return this.f4389a > j ? 0 : -1;
    }
}
