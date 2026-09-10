package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.xa0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5023xa0 extends AbstractC2703Ql implements InterfaceC4495ra0 {
    public InterfaceC4495ra0 d;
    public long e;

    public final void f(long j, InterfaceC4495ra0 interfaceC4495ra0, long j2) {
        this.c = j;
        this.d = interfaceC4495ra0;
        if (j2 != Long.MAX_VALUE) {
            j = j2;
        }
        this.e = j;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4495ra0
    public final List getCues(long j) {
        InterfaceC4495ra0 interfaceC4495ra0 = this.d;
        interfaceC4495ra0.getClass();
        return interfaceC4495ra0.getCues(j - this.e);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4495ra0
    public final long getEventTime(int i) {
        InterfaceC4495ra0 interfaceC4495ra0 = this.d;
        interfaceC4495ra0.getClass();
        return interfaceC4495ra0.getEventTime(i) + this.e;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4495ra0
    public final int getEventTimeCount() {
        InterfaceC4495ra0 interfaceC4495ra0 = this.d;
        interfaceC4495ra0.getClass();
        return interfaceC4495ra0.getEventTimeCount();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4495ra0
    public final int getNextEventTimeIndex(long j) {
        InterfaceC4495ra0 interfaceC4495ra0 = this.d;
        interfaceC4495ra0.getClass();
        return interfaceC4495ra0.getNextEventTimeIndex(j - this.e);
    }
}
