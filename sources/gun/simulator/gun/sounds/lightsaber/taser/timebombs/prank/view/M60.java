package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: loaded from: classes4.dex */
public final class M60 implements InterfaceC5060xx {
    public static final M60 INSTANCE;
    public static final /* synthetic */ D40 descriptor;

    static {
        M60 m60 = new M60();
        INSTANCE = m60;
        C3348eV c3348eV = new C3348eV("com.vungle.ads.internal.signals.SignaledAd", m60, 5);
        c3348eV.j("500", true);
        c3348eV.j("109", false);
        c3348eV.j("107", true);
        c3348eV.j("110", true);
        c3348eV.j("108", true);
        descriptor = c3348eV;
    }

    private M60() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public InterfaceC4123nG[] childSerializers() {
        W90 w90 = W90.f3912a;
        InterfaceC4123nG interfaceC4123nGU = WD.u(w90);
        InterfaceC4123nG interfaceC4123nGU2 = WD.u(w90);
        FJ fj = FJ.f3064a;
        return new InterfaceC4123nG[]{interfaceC4123nGU, fj, interfaceC4123nGU2, fj, AD.f2808a};
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public O60 deserialize(InterfaceC2548Kl interfaceC2548Kl) {
        AbstractC2995aW.q(interfaceC2548Kl, "decoder");
        D40 descriptor2 = getDescriptor();
        InterfaceC4421qh interfaceC4421qhC = interfaceC2548Kl.c(descriptor2);
        Object objS = null;
        long jW = 0;
        long jW2 = 0;
        boolean z = true;
        int i = 0;
        int iD = 0;
        Object objS2 = null;
        while (z) {
            int iK = interfaceC4421qhC.k(descriptor2);
            if (iK == -1) {
                z = false;
            } else if (iK == 0) {
                objS = interfaceC4421qhC.s(descriptor2, 0, W90.f3912a, objS);
                i |= 1;
            } else if (iK == 1) {
                jW = interfaceC4421qhC.w(descriptor2, 1);
                i |= 2;
            } else if (iK == 2) {
                objS2 = interfaceC4421qhC.s(descriptor2, 2, W90.f3912a, objS2);
                i |= 4;
            } else if (iK == 3) {
                jW2 = interfaceC4421qhC.w(descriptor2, 3);
                i |= 8;
            } else {
                if (iK != 4) {
                    throw new Vf0(iK);
                }
                iD = interfaceC4421qhC.D(descriptor2, 4);
                i |= 16;
            }
        }
        interfaceC4421qhC.b(descriptor2);
        return new O60(i, (String) objS, jW, (String) objS2, jW2, iD, null);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public D40 getDescriptor() {
        return descriptor;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4123nG
    public void serialize(InterfaceC3385er interfaceC3385er, O60 o60) {
        AbstractC2995aW.q(interfaceC3385er, "encoder");
        AbstractC2995aW.q(o60, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        D40 descriptor2 = getDescriptor();
        InterfaceC4596sh interfaceC4596shC = interfaceC3385er.c(descriptor2);
        O60.write$Self(o60, interfaceC4596shC, descriptor2);
        interfaceC4596shC.b(descriptor2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public InterfaceC4123nG[] typeParametersSerializers() {
        return WD.h;
    }
}
