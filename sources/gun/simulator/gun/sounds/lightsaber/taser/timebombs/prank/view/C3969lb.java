package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.lb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3969lb implements InterfaceC4123nG {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3969lb f4651a = new C3969lb();
    public static final FV b = new FV("kotlin.Boolean", CV.f2924a);

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public final Object deserialize(InterfaceC2548Kl interfaceC2548Kl) {
        AbstractC2995aW.q(interfaceC2548Kl, "decoder");
        return Boolean.valueOf(interfaceC2548Kl.r());
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public final D40 getDescriptor() {
        return b;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4123nG
    public final void serialize(InterfaceC3385er interfaceC3385er, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        AbstractC2995aW.q(interfaceC3385er, "encoder");
        interfaceC3385er.w(zBooleanValue);
    }
}
