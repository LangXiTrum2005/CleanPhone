package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ae, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2281Ae implements InterfaceC4123nG {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2281Ae f2824a = new C2281Ae();
    public static final FV b = new FV("kotlin.Char", CV.c);

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public final Object deserialize(InterfaceC2548Kl interfaceC2548Kl) {
        AbstractC2995aW.q(interfaceC2548Kl, "decoder");
        return Character.valueOf(interfaceC2548Kl.u());
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public final D40 getDescriptor() {
        return b;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4123nG
    public final void serialize(InterfaceC3385er interfaceC3385er, Object obj) {
        char cCharValue = ((Character) obj).charValue();
        AbstractC2995aW.q(interfaceC3385er, "encoder");
        interfaceC3385er.A(cCharValue);
    }
}
