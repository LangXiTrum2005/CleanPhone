package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class Ld0 implements InterfaceC4545s40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4545s40 f3363a;
    public final InterfaceC2766Sw b;

    public Ld0(InterfaceC4545s40 interfaceC4545s40, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC4545s40, "sequence");
        AbstractC2995aW.q(interfaceC2766Sw, "transformer");
        this.f3363a = interfaceC4545s40;
        this.b = interfaceC2766Sw;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4545s40
    public final Iterator iterator() {
        return new Kd0(this);
    }
}
