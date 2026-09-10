package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ti, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4686ti implements InterfaceC5060xx {
    public static final C4686ti INSTANCE;
    public static final /* synthetic */ D40 descriptor;

    static {
        C4686ti c4686ti = new C4686ti();
        INSTANCE = c4686ti;
        C3348eV c3348eV = new C3348eV("com.vungle.ads.internal.model.ConfigPayload.Endpoints", c4686ti, 5);
        c3348eV.j(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, true);
        c3348eV.j("ri", true);
        c3348eV.j("error_logs", true);
        c3348eV.j("metrics", true);
        c3348eV.j("mraid_js", true);
        descriptor = c3348eV;
    }

    private C4686ti() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public InterfaceC4123nG[] childSerializers() {
        W90 w90 = W90.f3912a;
        return new InterfaceC4123nG[]{WD.u(w90), WD.u(w90), WD.u(w90), WD.u(w90), WD.u(w90)};
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public C4862vi deserialize(InterfaceC2548Kl interfaceC2548Kl) {
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
                objS = interfaceC4421qhC.s(descriptor2, 0, W90.f3912a, objS);
                i |= 1;
            } else if (iK == 1) {
                objS2 = interfaceC4421qhC.s(descriptor2, 1, W90.f3912a, objS2);
                i |= 2;
            } else if (iK == 2) {
                objS3 = interfaceC4421qhC.s(descriptor2, 2, W90.f3912a, objS3);
                i |= 4;
            } else if (iK == 3) {
                objS4 = interfaceC4421qhC.s(descriptor2, 3, W90.f3912a, objS4);
                i |= 8;
            } else {
                if (iK != 4) {
                    throw new Vf0(iK);
                }
                objS5 = interfaceC4421qhC.s(descriptor2, 4, W90.f3912a, objS5);
                i |= 16;
            }
        }
        interfaceC4421qhC.b(descriptor2);
        return new C4862vi(i, (String) objS, (String) objS2, (String) objS3, (String) objS4, (String) objS5, (O40) null);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public D40 getDescriptor() {
        return descriptor;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4123nG
    public void serialize(InterfaceC3385er interfaceC3385er, C4862vi c4862vi) {
        AbstractC2995aW.q(interfaceC3385er, "encoder");
        AbstractC2995aW.q(c4862vi, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        D40 descriptor2 = getDescriptor();
        InterfaceC4596sh interfaceC4596shC = interfaceC3385er.c(descriptor2);
        C4862vi.write$Self(c4862vi, interfaceC4596shC, descriptor2);
        interfaceC4596shC.b(descriptor2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public InterfaceC4123nG[] typeParametersSerializers() {
        return WD.h;
    }
}
