package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Dz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2380Dz extends E9 {
    public final List d;
    public final long e;

    public C2380Dz(long j, List list) {
        super(0L, list.size() - 1);
        this.e = j;
        this.d = list;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3954lN
    public final long g() {
        a();
        return this.e + ((AbstractC2691Pz) this.d.get((int) this.c)).e;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3954lN
    public final long i() {
        a();
        AbstractC2691Pz abstractC2691Pz = (AbstractC2691Pz) this.d.get((int) this.c);
        return this.e + abstractC2691Pz.e + abstractC2691Pz.c;
    }
}
