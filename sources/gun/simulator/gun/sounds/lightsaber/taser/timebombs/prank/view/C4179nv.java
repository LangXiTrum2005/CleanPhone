package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.nv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4179nv implements InterfaceC4123nG {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4179nv f4766a = new C4179nv();
    public static final FV b = new FV("kotlin.Float", CV.e);

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public final Object deserialize(InterfaceC2548Kl interfaceC2548Kl) {
        AbstractC2995aW.q(interfaceC2548Kl, "decoder");
        return Float.valueOf(interfaceC2548Kl.p());
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public final D40 getDescriptor() {
        return b;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4123nG
    public final void serialize(InterfaceC3385er interfaceC3385er, Object obj) {
        float fFloatValue = ((Number) obj).floatValue();
        AbstractC2995aW.q(interfaceC3385er, "encoder");
        interfaceC3385er.y(fFloatValue);
    }
}
