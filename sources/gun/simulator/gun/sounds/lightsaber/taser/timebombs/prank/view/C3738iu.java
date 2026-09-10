package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Iterator;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.iu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3738iu implements InterfaceC4545s40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4545s40 f4526a;
    public final boolean b;
    public final InterfaceC2766Sw c;

    public C3738iu(InterfaceC4545s40 interfaceC4545s40, boolean z, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC4545s40, "sequence");
        this.f4526a = interfaceC4545s40;
        this.b = z;
        this.c = interfaceC2766Sw;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4545s40
    public final Iterator iterator() {
        return new C3652hu(this);
    }
}
