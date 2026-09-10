package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class MO implements FO {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4920wM f3403a;
    public int d;
    public boolean e;
    public final ArrayList c = new ArrayList();
    public final Object b = new Object();

    public MO(G9 g9, boolean z) {
        this.f3403a = new C4920wM(g9, z);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FO
    public final Gc0 a() {
        return this.f3403a.o;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FO
    public final Object getUid() {
        return this.b;
    }
}
