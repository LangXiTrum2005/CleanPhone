package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Iterator;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.zx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5236zx implements InterfaceC4545s40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2714Qw f5353a;
    public final InterfaceC2766Sw b;

    public C5236zx(InterfaceC2714Qw interfaceC2714Qw, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "getNextValue");
        this.f5353a = interfaceC2714Qw;
        this.b = interfaceC2766Sw;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4545s40
    public final Iterator iterator() {
        return new C5148yx(this);
    }
}
