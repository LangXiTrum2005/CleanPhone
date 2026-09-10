package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.MBridgeConstans;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.kg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3891kg implements InterfaceC5060xx {
    public static final C3891kg INSTANCE;
    public static final /* synthetic */ D40 descriptor;

    static {
        C3891kg c3891kg = new C3891kg();
        INSTANCE = c3891kg;
        C3348eV c3348eV = new C3348eV("com.vungle.ads.internal.model.CommonRequestBody", c3891kg, 5);
        c3348eV.j("device", false);
        c3348eV.j(MBridgeConstans.DYNAMIC_VIEW_WX_APP, true);
        c3348eV.j(com.umeng.analytics.pro.ay.m, true);
        c3348eV.j("ext", true);
        c3348eV.j(J0.REQUEST_KEY_EXTRA, true);
        descriptor = c3348eV;
    }

    private C3891kg() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public InterfaceC4123nG[] childSerializers() {
        return new InterfaceC4123nG[]{C2447Go.INSTANCE, WD.u(E5.INSTANCE), WD.u(C2465Hg.INSTANCE), WD.u(C2309Bg.INSTANCE), WD.u(C2387Eg.INSTANCE)};
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public C2543Kg deserialize(InterfaceC2548Kl interfaceC2548Kl) {
        AbstractC2995aW.q(interfaceC2548Kl, "decoder");
        D40 descriptor2 = getDescriptor();
        InterfaceC4421qh interfaceC4421qhC = interfaceC2548Kl.c(descriptor2);
        Object objZ = null;
        Object objS = null;
        Object objS2 = null;
        Object objS3 = null;
        Object objS4 = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int iK = interfaceC4421qhC.k(descriptor2);
            if (iK == -1) {
                z = false;
            } else if (iK == 0) {
                objZ = interfaceC4421qhC.z(descriptor2, 0, C2447Go.INSTANCE, objZ);
                i |= 1;
            } else if (iK == 1) {
                objS = interfaceC4421qhC.s(descriptor2, 1, E5.INSTANCE, objS);
                i |= 2;
            } else if (iK == 2) {
                objS2 = interfaceC4421qhC.s(descriptor2, 2, C2465Hg.INSTANCE, objS2);
                i |= 4;
            } else if (iK == 3) {
                objS3 = interfaceC4421qhC.s(descriptor2, 3, C2309Bg.INSTANCE, objS3);
                i |= 8;
            } else {
                if (iK != 4) {
                    throw new Vf0(iK);
                }
                objS4 = interfaceC4421qhC.s(descriptor2, 4, C2387Eg.INSTANCE, objS4);
                i |= 16;
            }
        }
        interfaceC4421qhC.b(descriptor2);
        return new C2543Kg(i, (C2577Lo) objZ, (G5) objS, (C2517Jg) objS2, (C2361Dg) objS3, (C2439Gg) objS4, (O40) null);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public D40 getDescriptor() {
        return descriptor;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4123nG
    public void serialize(InterfaceC3385er interfaceC3385er, C2543Kg c2543Kg) {
        AbstractC2995aW.q(interfaceC3385er, "encoder");
        AbstractC2995aW.q(c2543Kg, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        D40 descriptor2 = getDescriptor();
        InterfaceC4596sh interfaceC4596shC = interfaceC3385er.c(descriptor2);
        C2543Kg.write$Self(c2543Kg, interfaceC4596shC, descriptor2);
        interfaceC4596shC.b(descriptor2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public InterfaceC4123nG[] typeParametersSerializers() {
        return WD.h;
    }
}
