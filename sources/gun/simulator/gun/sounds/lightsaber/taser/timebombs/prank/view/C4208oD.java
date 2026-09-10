package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.oD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4208oD implements InterfaceC5060xx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC4123nG f4784a;

    public C4208oD(InterfaceC4123nG interfaceC4123nG) {
        this.f4784a = interfaceC4123nG;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public final InterfaceC4123nG[] childSerializers() {
        return new InterfaceC4123nG[]{this.f4784a};
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public final Object deserialize(InterfaceC2548Kl interfaceC2548Kl) {
        AbstractC2995aW.q(interfaceC2548Kl, "decoder");
        throw new IllegalStateException("unsupported".toString());
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public final D40 getDescriptor() {
        throw new IllegalStateException("unsupported".toString());
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4123nG
    public final void serialize(InterfaceC3385er interfaceC3385er, Object obj) {
        AbstractC2995aW.q(interfaceC3385er, "encoder");
        throw new IllegalStateException("unsupported".toString());
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public final InterfaceC4123nG[] typeParametersSerializers() {
        return WD.h;
    }
}
