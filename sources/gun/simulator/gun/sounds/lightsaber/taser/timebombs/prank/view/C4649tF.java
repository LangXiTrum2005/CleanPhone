package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.tF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4649tF implements D40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ma0 f5027a;

    public C4649tF(C4386qF c4386qF) {
        this.f5027a = AbstractC2340Cl.I(c4386qF);
    }

    public final D40 a() {
        return (D40) this.f5027a.getValue();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final boolean b() {
        return false;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final int c(String str) {
        AbstractC2995aW.q(str, "name");
        return a().c(str);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final int d() {
        return a().d();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final String e(int i) {
        return a().e(i);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final List f(int i) {
        return a().f(i);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final D40 g(int i) {
        return a().g(i);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final List getAnnotations() {
        return C2812Uq.f3846a;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final L40 getKind() {
        return a().getKind();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final String h() {
        return a().h();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final boolean i(int i) {
        return a().i(i);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final boolean isInline() {
        return false;
    }
}
