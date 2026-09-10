package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes4.dex */
public final class ZR implements InterfaceC4123nG {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4123nG f4071a;
    public final E40 b;

    public ZR(InterfaceC4123nG interfaceC4123nG) {
        AbstractC2995aW.q(interfaceC4123nG, "serializer");
        this.f4071a = interfaceC4123nG;
        this.b = new E40(interfaceC4123nG.getDescriptor());
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public final Object deserialize(InterfaceC2548Kl interfaceC2548Kl) {
        AbstractC2995aW.q(interfaceC2548Kl, "decoder");
        if (interfaceC2548Kl.C()) {
            return interfaceC2548Kl.j(this.f4071a);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && AbstractC2995aW.i(AbstractC3263dY.a(ZR.class), AbstractC3263dY.a(obj.getClass())) && AbstractC2995aW.i(this.f4071a, ((ZR) obj).f4071a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public final D40 getDescriptor() {
        return this.b;
    }

    public final int hashCode() {
        return this.f4071a.hashCode();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4123nG
    public final void serialize(InterfaceC3385er interfaceC3385er, Object obj) {
        AbstractC2995aW.q(interfaceC3385er, "encoder");
        if (obj != null) {
            interfaceC3385er.x(this.f4071a, obj);
        } else {
            interfaceC3385er.t();
        }
    }
}
