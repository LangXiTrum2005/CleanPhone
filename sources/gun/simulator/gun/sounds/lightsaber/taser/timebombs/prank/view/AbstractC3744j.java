package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Iterator;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3744j implements InterfaceC4123nG {
    public abstract Object a();

    public abstract int b(Object obj);

    public abstract Iterator c(Object obj);

    public abstract int d(Object obj);

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public Object deserialize(InterfaceC2548Kl interfaceC2548Kl) {
        AbstractC2995aW.q(interfaceC2548Kl, "decoder");
        return e(interfaceC2548Kl);
    }

    public final Object e(InterfaceC2548Kl interfaceC2548Kl) {
        AbstractC2995aW.q(interfaceC2548Kl, "decoder");
        Object objA = a();
        int iB = b(objA);
        InterfaceC4421qh interfaceC4421qhC = interfaceC2548Kl.c(getDescriptor());
        while (true) {
            int iK = interfaceC4421qhC.k(getDescriptor());
            if (iK == -1) {
                interfaceC4421qhC.b(getDescriptor());
                return h(objA);
            }
            f(interfaceC4421qhC, iK + iB, objA, true);
        }
    }

    public abstract void f(InterfaceC4421qh interfaceC4421qh, int i, Object obj, boolean z);

    public abstract Object g(Object obj);

    public abstract Object h(Object obj);
}
