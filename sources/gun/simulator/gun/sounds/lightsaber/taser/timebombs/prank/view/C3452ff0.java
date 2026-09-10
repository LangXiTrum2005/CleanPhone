package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ff0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3452ff0 implements InterfaceC4123nG {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3452ff0 f4377a = new C3452ff0();
    public static final C4120nD b = AbstractC4496rb.a("kotlin.UShort", A60.f2801a);

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public final Object deserialize(InterfaceC2548Kl interfaceC2548Kl) {
        AbstractC2995aW.q(interfaceC2548Kl, "decoder");
        return new C3099bf0(interfaceC2548Kl.f(b).o());
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public final D40 getDescriptor() {
        return b;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4123nG
    public final void serialize(InterfaceC3385er interfaceC3385er, Object obj) {
        short s = ((C3099bf0) obj).f4180a;
        AbstractC2995aW.q(interfaceC3385er, "encoder");
        interfaceC3385er.i(b).v(s);
    }
}
