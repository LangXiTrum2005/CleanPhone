package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ep, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2396Ep implements InterfaceC4123nG {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2396Ep f3041a = new C2396Ep();
    public static final FV b = new FV("kotlin.Double", CV.d);

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public final Object deserialize(InterfaceC2548Kl interfaceC2548Kl) {
        AbstractC2995aW.q(interfaceC2548Kl, "decoder");
        return Double.valueOf(interfaceC2548Kl.q());
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public final D40 getDescriptor() {
        return b;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4123nG
    public final void serialize(InterfaceC3385er interfaceC3385er, Object obj) {
        double dDoubleValue = ((Number) obj).doubleValue();
        AbstractC2995aW.q(interfaceC3385er, "encoder");
        interfaceC3385er.e(dDoubleValue);
    }
}
