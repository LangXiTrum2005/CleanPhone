package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.lg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3979lg implements InterfaceC5060xx {
    public static final C3979lg INSTANCE;
    public static final /* synthetic */ D40 descriptor;

    static {
        C3979lg c3979lg = new C3979lg();
        INSTANCE = c3979lg;
        C3348eV c3348eV = new C3348eV("com.vungle.ads.internal.model.CommonRequestBody.AdSizeParam", c3979lg, 2);
        c3348eV.j("w", false);
        c3348eV.j(com.umeng.analytics.pro.bc.aM, false);
        descriptor = c3348eV;
    }

    private C3979lg() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public InterfaceC4123nG[] childSerializers() {
        AD ad = AD.f2808a;
        return new InterfaceC4123nG[]{ad, ad};
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public C4155ng deserialize(InterfaceC2548Kl interfaceC2548Kl) {
        AbstractC2995aW.q(interfaceC2548Kl, "decoder");
        D40 descriptor2 = getDescriptor();
        InterfaceC4421qh interfaceC4421qhC = interfaceC2548Kl.c(descriptor2);
        boolean z = true;
        int i = 0;
        int iD = 0;
        int iD2 = 0;
        while (z) {
            int iK = interfaceC4421qhC.k(descriptor2);
            if (iK == -1) {
                z = false;
            } else if (iK == 0) {
                iD = interfaceC4421qhC.D(descriptor2, 0);
                i |= 1;
            } else {
                if (iK != 1) {
                    throw new Vf0(iK);
                }
                iD2 = interfaceC4421qhC.D(descriptor2, 1);
                i |= 2;
            }
        }
        interfaceC4421qhC.b(descriptor2);
        return new C4155ng(i, iD, iD2, null);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public D40 getDescriptor() {
        return descriptor;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4123nG
    public void serialize(InterfaceC3385er interfaceC3385er, C4155ng c4155ng) {
        AbstractC2995aW.q(interfaceC3385er, "encoder");
        AbstractC2995aW.q(c4155ng, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        D40 descriptor2 = getDescriptor();
        InterfaceC4596sh interfaceC4596shC = interfaceC3385er.c(descriptor2);
        C4155ng.write$Self(c4155ng, interfaceC4596shC, descriptor2);
        interfaceC4596shC.b(descriptor2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public InterfaceC4123nG[] typeParametersSerializers() {
        return WD.h;
    }
}
