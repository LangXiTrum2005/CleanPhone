package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Hi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2467Hi implements InterfaceC5060xx {
    public static final C2467Hi INSTANCE;
    public static final /* synthetic */ D40 descriptor;

    static {
        C2467Hi c2467Hi = new C2467Hi();
        INSTANCE = c2467Hi;
        C3348eV c3348eV = new C3348eV("com.vungle.ads.internal.model.ConfigPayload.UserPrivacy", c2467Hi, 2);
        c3348eV.j("gdpr", true);
        c3348eV.j("iab", true);
        descriptor = c3348eV;
    }

    private C2467Hi() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public InterfaceC4123nG[] childSerializers() {
        return new InterfaceC4123nG[]{WD.u(C4950wi.INSTANCE), WD.u(C5214zi.INSTANCE)};
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public C2519Ji deserialize(InterfaceC2548Kl interfaceC2548Kl) {
        AbstractC2995aW.q(interfaceC2548Kl, "decoder");
        D40 descriptor2 = getDescriptor();
        InterfaceC4421qh interfaceC4421qhC = interfaceC2548Kl.c(descriptor2);
        O40 o40 = null;
        Object objS = null;
        Object objS2 = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int iK = interfaceC4421qhC.k(descriptor2);
            if (iK == -1) {
                z = false;
            } else if (iK == 0) {
                objS = interfaceC4421qhC.s(descriptor2, 0, C4950wi.INSTANCE, objS);
                i |= 1;
            } else {
                if (iK != 1) {
                    throw new Vf0(iK);
                }
                objS2 = interfaceC4421qhC.s(descriptor2, 1, C5214zi.INSTANCE, objS2);
                i |= 2;
            }
        }
        interfaceC4421qhC.b(descriptor2);
        return new C2519Ji(i, (C5126yi) objS, (C2363Di) objS2, o40);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public D40 getDescriptor() {
        return descriptor;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4123nG
    public void serialize(InterfaceC3385er interfaceC3385er, C2519Ji c2519Ji) {
        AbstractC2995aW.q(interfaceC3385er, "encoder");
        AbstractC2995aW.q(c2519Ji, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        D40 descriptor2 = getDescriptor();
        InterfaceC4596sh interfaceC4596shC = interfaceC3385er.c(descriptor2);
        C2519Ji.write$Self(c2519Ji, interfaceC4596shC, descriptor2);
        interfaceC4596shC.b(descriptor2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public InterfaceC4123nG[] typeParametersSerializers() {
        return WD.h;
    }
}
