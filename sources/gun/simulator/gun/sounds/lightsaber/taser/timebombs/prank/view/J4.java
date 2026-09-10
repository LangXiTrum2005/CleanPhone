package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class J4 implements O4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G4 f3252a;
    public final G4 b;

    public J4(G4 g4, G4 g5) {
        this.f3252a = g4;
        this.b = g5;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O4
    public final AbstractC5170z9 d() {
        return new L80(this.f3252a.d(), this.b.d());
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O4
    public final List f() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O4
    public final boolean g() {
        return this.f3252a.g() && this.b.g();
    }
}
