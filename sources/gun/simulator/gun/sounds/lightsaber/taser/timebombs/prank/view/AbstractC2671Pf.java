package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Iterator;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Pf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2671Pf extends AbstractC3744j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4123nG f3562a;

    public AbstractC2671Pf(InterfaceC4123nG interfaceC4123nG) {
        this.f3562a = interfaceC4123nG;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3744j
    public void f(InterfaceC4421qh interfaceC4421qh, int i, Object obj, boolean z) {
        i(i, obj, interfaceC4421qh.z(getDescriptor(), i, this.f3562a, null));
    }

    public abstract void i(int i, Object obj, Object obj2);

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4123nG
    public void serialize(InterfaceC3385er interfaceC3385er, Object obj) {
        AbstractC2995aW.q(interfaceC3385er, "encoder");
        int iD = d(obj);
        D40 descriptor = getDescriptor();
        InterfaceC4596sh interfaceC4596shZ = interfaceC3385er.z(descriptor, iD);
        Iterator itC = c(obj);
        for (int i = 0; i < iD; i++) {
            interfaceC4596shZ.B(getDescriptor(), i, this.f3562a, itC.next());
        }
        interfaceC4596shZ.b(descriptor);
    }
}
