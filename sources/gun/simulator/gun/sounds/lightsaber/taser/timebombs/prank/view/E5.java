package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: loaded from: classes4.dex */
public final class E5 implements InterfaceC5060xx {
    public static final E5 INSTANCE;
    public static final /* synthetic */ D40 descriptor;

    static {
        E5 e5 = new E5();
        INSTANCE = e5;
        C3348eV c3348eV = new C3348eV("com.vungle.ads.internal.model.AppNode", e5, 3);
        c3348eV.j("bundle", false);
        c3348eV.j("ver", false);
        c3348eV.j("id", false);
        descriptor = c3348eV;
    }

    private E5() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public InterfaceC4123nG[] childSerializers() {
        W90 w90 = W90.f3912a;
        return new InterfaceC4123nG[]{w90, w90, w90};
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public G5 deserialize(InterfaceC2548Kl interfaceC2548Kl) {
        AbstractC2995aW.q(interfaceC2548Kl, "decoder");
        D40 descriptor2 = getDescriptor();
        InterfaceC4421qh interfaceC4421qhC = interfaceC2548Kl.c(descriptor2);
        String strL = null;
        String strL2 = null;
        String strL3 = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int iK = interfaceC4421qhC.k(descriptor2);
            if (iK == -1) {
                z = false;
            } else if (iK == 0) {
                strL = interfaceC4421qhC.l(descriptor2, 0);
                i |= 1;
            } else if (iK == 1) {
                strL2 = interfaceC4421qhC.l(descriptor2, 1);
                i |= 2;
            } else {
                if (iK != 2) {
                    throw new Vf0(iK);
                }
                strL3 = interfaceC4421qhC.l(descriptor2, 2);
                i |= 4;
            }
        }
        interfaceC4421qhC.b(descriptor2);
        return new G5(i, strL, strL2, strL3, null);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public D40 getDescriptor() {
        return descriptor;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4123nG
    public void serialize(InterfaceC3385er interfaceC3385er, G5 g5) {
        AbstractC2995aW.q(interfaceC3385er, "encoder");
        AbstractC2995aW.q(g5, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        D40 descriptor2 = getDescriptor();
        InterfaceC4596sh interfaceC4596shC = interfaceC3385er.c(descriptor2);
        G5.write$Self(g5, interfaceC4596shC, descriptor2);
        interfaceC4596shC.b(descriptor2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public InterfaceC4123nG[] typeParametersSerializers() {
        return WD.h;
    }
}
