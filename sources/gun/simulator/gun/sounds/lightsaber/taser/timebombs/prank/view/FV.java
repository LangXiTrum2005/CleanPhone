package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class FV implements D40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3067a;
    public final DV b;

    public FV(String str, DV dv) {
        this.f3067a = str;
        this.b = dv;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final boolean b() {
        return false;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final int c(String str) {
        AbstractC2995aW.q(str, "name");
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final int d() {
        return 0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final String e(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final List f(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final D40 g(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final List getAnnotations() {
        return C2812Uq.f3846a;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final L40 getKind() {
        return this.b;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final String h() {
        return this.f3067a;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final boolean i(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return DM.l(new StringBuilder("PrimitiveDescriptor("), this.f3067a, ')');
    }
}
