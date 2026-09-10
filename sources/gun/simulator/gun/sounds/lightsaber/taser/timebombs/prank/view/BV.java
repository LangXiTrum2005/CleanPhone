package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BV extends AbstractC2671Pf {
    public final AV b;

    public BV(InterfaceC4123nG interfaceC4123nG) {
        super(interfaceC4123nG);
        this.b = new AV(interfaceC4123nG.getDescriptor());
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3744j
    public final Object a() {
        return (AbstractC5193zV) g(j());
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3744j
    public final int b(Object obj) {
        AbstractC5193zV abstractC5193zV = (AbstractC5193zV) obj;
        AbstractC2995aW.q(abstractC5193zV, "<this>");
        return abstractC5193zV.d();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3744j
    public final Iterator c(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead".toString());
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3744j, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public final Object deserialize(InterfaceC2548Kl interfaceC2548Kl) {
        AbstractC2995aW.q(interfaceC2548Kl, "decoder");
        return e(interfaceC2548Kl);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public final D40 getDescriptor() {
        return this.b;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3744j
    public final Object h(Object obj) {
        AbstractC5193zV abstractC5193zV = (AbstractC5193zV) obj;
        AbstractC2995aW.q(abstractC5193zV, "<this>");
        return abstractC5193zV.a();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2671Pf
    public final void i(int i, Object obj, Object obj2) {
        AbstractC2995aW.q((AbstractC5193zV) obj, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead".toString());
    }

    public abstract Object j();

    public abstract void k(InterfaceC4596sh interfaceC4596sh, Object obj, int i);

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2671Pf, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4123nG
    public final void serialize(InterfaceC3385er interfaceC3385er, Object obj) {
        AbstractC2995aW.q(interfaceC3385er, "encoder");
        int iD = d(obj);
        AV av = this.b;
        InterfaceC4596sh interfaceC4596shZ = interfaceC3385er.z(av, iD);
        k(interfaceC4596shZ, obj, iD);
        interfaceC4596shZ.b(av);
    }
}
