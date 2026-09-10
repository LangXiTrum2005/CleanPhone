package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.wo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4962wo implements InterfaceC5060xx {
    public static final C4962wo INSTANCE;
    public static final /* synthetic */ D40 descriptor;

    static {
        C4962wo c4962wo = new C4962wo();
        INSTANCE = c4962wo;
        C3348eV c3348eV = new C3348eV("com.vungle.ads.fpd.Demographic", c4962wo, 4);
        c3348eV.j("age_range", true);
        c3348eV.j("length_of_residence", true);
        c3348eV.j("median_home_value_usd", true);
        c3348eV.j("monthly_housing_payment_usd", true);
        descriptor = c3348eV;
    }

    private C4962wo() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public InterfaceC4123nG[] childSerializers() {
        AD ad = AD.f2808a;
        return new InterfaceC4123nG[]{WD.u(ad), WD.u(ad), WD.u(ad), WD.u(ad)};
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public C5138yo deserialize(InterfaceC2548Kl interfaceC2548Kl) {
        AbstractC2995aW.q(interfaceC2548Kl, "decoder");
        D40 descriptor2 = getDescriptor();
        InterfaceC4421qh interfaceC4421qhC = interfaceC2548Kl.c(descriptor2);
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
                objS = interfaceC4421qhC.s(descriptor2, 0, AD.f2808a, objS);
                i |= 1;
            } else if (iK == 1) {
                objS2 = interfaceC4421qhC.s(descriptor2, 1, AD.f2808a, objS2);
                i |= 2;
            } else if (iK == 2) {
                objS3 = interfaceC4421qhC.s(descriptor2, 2, AD.f2808a, objS3);
                i |= 4;
            } else {
                if (iK != 3) {
                    throw new Vf0(iK);
                }
                objS4 = interfaceC4421qhC.s(descriptor2, 3, AD.f2808a, objS4);
                i |= 8;
            }
        }
        interfaceC4421qhC.b(descriptor2);
        return new C5138yo(i, (Integer) objS, (Integer) objS2, (Integer) objS3, (Integer) objS4, null);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public D40 getDescriptor() {
        return descriptor;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4123nG
    public void serialize(InterfaceC3385er interfaceC3385er, C5138yo c5138yo) {
        AbstractC2995aW.q(interfaceC3385er, "encoder");
        AbstractC2995aW.q(c5138yo, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        D40 descriptor2 = getDescriptor();
        InterfaceC4596sh interfaceC4596shC = interfaceC3385er.c(descriptor2);
        C5138yo.write$Self(c5138yo, interfaceC4596shC, descriptor2);
        interfaceC4596shC.b(descriptor2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public InterfaceC4123nG[] typeParametersSerializers() {
        return WD.h;
    }
}
