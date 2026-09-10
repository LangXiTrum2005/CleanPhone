package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class Ae0 implements InterfaceC4495ra0 {
    public static final Ae0 b = new Ae0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f2825a;

    public Ae0(C2417Fk c2417Fk) {
        this.f2825a = Collections.singletonList(c2417Fk);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4495ra0
    public final List getCues(long j) {
        return j >= 0 ? this.f2825a : Collections.emptyList();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4495ra0
    public final long getEventTime(int i) {
        FW.h(i == 0);
        return 0L;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4495ra0
    public final int getEventTimeCount() {
        return 1;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4495ra0
    public final int getNextEventTimeIndex(long j) {
        return j < 0 ? 0 : -1;
    }

    public Ae0() {
        this.f2825a = Collections.emptyList();
    }
}
