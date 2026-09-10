package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes4.dex */
public final class Qe0 implements InterfaceC4123nG {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Qe0 f3612a = new Qe0();
    public static final C4120nD b = AbstractC4496rb.a("kotlin.UByte", C3269dc.f4277a);

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public final Object deserialize(InterfaceC2548Kl interfaceC2548Kl) {
        AbstractC2995aW.q(interfaceC2548Kl, "decoder");
        return new Le0(interfaceC2548Kl.f(b).E());
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public final D40 getDescriptor() {
        return b;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4123nG
    public final void serialize(InterfaceC3385er interfaceC3385er, Object obj) {
        byte b2 = ((Le0) obj).f3365a;
        AbstractC2995aW.q(interfaceC3385er, "encoder");
        interfaceC3385er.i(b).f(b2);
    }
}
