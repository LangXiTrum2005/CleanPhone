package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: loaded from: classes4.dex */
public final class UI implements InterfaceC5060xx {
    public static final UI INSTANCE;
    public static final /* synthetic */ D40 descriptor;

    static {
        UI ui = new UI();
        INSTANCE = ui;
        C3348eV c3348eV = new C3348eV("com.vungle.ads.fpd.Location", ui, 3);
        c3348eV.j(com.umeng.analytics.pro.bc.O, true);
        c3348eV.j("region_state", true);
        c3348eV.j("dma", true);
        descriptor = c3348eV;
    }

    private UI() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public InterfaceC4123nG[] childSerializers() {
        W90 w90 = W90.f3912a;
        return new InterfaceC4123nG[]{WD.u(w90), WD.u(w90), WD.u(AD.f2808a)};
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public WI deserialize(InterfaceC2548Kl interfaceC2548Kl) {
        AbstractC2995aW.q(interfaceC2548Kl, "decoder");
        D40 descriptor2 = getDescriptor();
        InterfaceC4421qh interfaceC4421qhC = interfaceC2548Kl.c(descriptor2);
        Object objS = null;
        Object objS2 = null;
        Object objS3 = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int iK = interfaceC4421qhC.k(descriptor2);
            if (iK == -1) {
                z = false;
            } else if (iK == 0) {
                objS = interfaceC4421qhC.s(descriptor2, 0, W90.f3912a, objS);
                i |= 1;
            } else if (iK == 1) {
                objS2 = interfaceC4421qhC.s(descriptor2, 1, W90.f3912a, objS2);
                i |= 2;
            } else {
                if (iK != 2) {
                    throw new Vf0(iK);
                }
                objS3 = interfaceC4421qhC.s(descriptor2, 2, AD.f2808a, objS3);
                i |= 4;
            }
        }
        interfaceC4421qhC.b(descriptor2);
        return new WI(i, (String) objS, (String) objS2, (Integer) objS3, null);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public D40 getDescriptor() {
        return descriptor;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4123nG
    public void serialize(InterfaceC3385er interfaceC3385er, WI wi) {
        AbstractC2995aW.q(interfaceC3385er, "encoder");
        AbstractC2995aW.q(wi, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        D40 descriptor2 = getDescriptor();
        InterfaceC4596sh interfaceC4596shC = interfaceC3385er.c(descriptor2);
        WI.write$Self(wi, interfaceC4596shC, descriptor2);
        interfaceC4596shC.b(descriptor2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public InterfaceC4123nG[] typeParametersSerializers() {
        return WD.h;
    }
}
