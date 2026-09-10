package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Hg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2465Hg implements InterfaceC5060xx {
    public static final C2465Hg INSTANCE;
    public static final /* synthetic */ D40 descriptor;

    static {
        C2465Hg c2465Hg = new C2465Hg();
        INSTANCE = c2465Hg;
        C3348eV c3348eV = new C3348eV("com.vungle.ads.internal.model.CommonRequestBody.User", c2465Hg, 5);
        c3348eV.j("gdpr", true);
        c3348eV.j("ccpa", true);
        c3348eV.j("coppa", true);
        c3348eV.j("fpd", true);
        c3348eV.j("iab", true);
        descriptor = c3348eV;
    }

    private C2465Hg() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public InterfaceC4123nG[] childSerializers() {
        return new InterfaceC4123nG[]{WD.u(C4858vg.INSTANCE), WD.u(C4243og.INSTANCE), WD.u(C4506rg.INSTANCE), WD.u(C2582Lu.INSTANCE), WD.u(C5122yg.INSTANCE)};
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public C2517Jg deserialize(InterfaceC2548Kl interfaceC2548Kl) {
        AbstractC2995aW.q(interfaceC2548Kl, "decoder");
        D40 descriptor2 = getDescriptor();
        InterfaceC4421qh interfaceC4421qhC = interfaceC2548Kl.c(descriptor2);
        Object objS = null;
        Object objS2 = null;
        Object objS3 = null;
        Object objS4 = null;
        Object objS5 = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int iK = interfaceC4421qhC.k(descriptor2);
            if (iK == -1) {
                z = false;
            } else if (iK == 0) {
                objS = interfaceC4421qhC.s(descriptor2, 0, C4858vg.INSTANCE, objS);
                i |= 1;
            } else if (iK == 1) {
                objS2 = interfaceC4421qhC.s(descriptor2, 1, C4243og.INSTANCE, objS2);
                i |= 2;
            } else if (iK == 2) {
                objS3 = interfaceC4421qhC.s(descriptor2, 2, C4506rg.INSTANCE, objS3);
                i |= 4;
            } else if (iK == 3) {
                objS4 = interfaceC4421qhC.s(descriptor2, 3, C2582Lu.INSTANCE, objS4);
                i |= 8;
            } else {
                if (iK != 4) {
                    throw new Vf0(iK);
                }
                objS5 = interfaceC4421qhC.s(descriptor2, 4, C5122yg.INSTANCE, objS5);
                i |= 16;
            }
        }
        interfaceC4421qhC.b(descriptor2);
        return new C2517Jg(i, (C5034xg) objS, (C4419qg) objS2, (C4682tg) objS3, (C2634Nu) objS4, (C2283Ag) objS5, (O40) null);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public D40 getDescriptor() {
        return descriptor;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4123nG
    public void serialize(InterfaceC3385er interfaceC3385er, C2517Jg c2517Jg) {
        AbstractC2995aW.q(interfaceC3385er, "encoder");
        AbstractC2995aW.q(c2517Jg, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        D40 descriptor2 = getDescriptor();
        InterfaceC4596sh interfaceC4596shC = interfaceC3385er.c(descriptor2);
        C2517Jg.write$Self(c2517Jg, interfaceC4596shC, descriptor2);
        interfaceC4596shC.b(descriptor2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public InterfaceC4123nG[] typeParametersSerializers() {
        return WD.h;
    }
}
