package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.dc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3269dc implements InterfaceC4123nG {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3269dc f4277a = new C3269dc();
    public static final FV b = new FV("kotlin.Byte", CV.b);

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public final Object deserialize(InterfaceC2548Kl interfaceC2548Kl) {
        AbstractC2995aW.q(interfaceC2548Kl, "decoder");
        return Byte.valueOf(interfaceC2548Kl.E());
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public final D40 getDescriptor() {
        return b;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4123nG
    public final void serialize(InterfaceC3385er interfaceC3385er, Object obj) {
        byte bByteValue = ((Number) obj).byteValue();
        AbstractC2995aW.q(interfaceC3385er, "encoder");
        interfaceC3385er.f(bByteValue);
    }
}
