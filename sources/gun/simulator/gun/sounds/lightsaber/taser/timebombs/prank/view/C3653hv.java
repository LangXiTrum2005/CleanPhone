package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Iterator;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.hv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3653hv implements InterfaceC4545s40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4545s40 f4479a;
    public final InterfaceC2766Sw b;
    public final InterfaceC2766Sw c;

    public C3653hv(InterfaceC4545s40 interfaceC4545s40, InterfaceC2766Sw interfaceC2766Sw) {
        C5161z40 c5161z40 = C5161z40.g;
        AbstractC2995aW.q(interfaceC4545s40, "sequence");
        AbstractC2995aW.q(interfaceC2766Sw, "transformer");
        this.f4479a = interfaceC4545s40;
        this.b = interfaceC2766Sw;
        this.c = c5161z40;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4545s40
    public final Iterator iterator() {
        return new C3565gv(this);
    }
}
