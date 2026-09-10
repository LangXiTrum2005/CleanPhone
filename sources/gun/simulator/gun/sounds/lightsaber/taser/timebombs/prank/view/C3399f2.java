package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.f2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3399f2 implements InterfaceC5060xx {
    public static final C3399f2 INSTANCE;
    public static final /* synthetic */ D40 descriptor;

    static {
        C3399f2 c3399f2 = new C3399f2();
        INSTANCE = c3399f2;
        C3348eV c3348eV = new C3348eV("com.vungle.ads.internal.model.AdPayload.CacheableReplacement", c3399f2, 3);
        c3348eV.j("url", true);
        c3348eV.j("extension", true);
        c3348eV.j("required", true);
        descriptor = c3348eV;
    }

    private C3399f2() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public InterfaceC4123nG[] childSerializers() {
        W90 w90 = W90.f3912a;
        return new InterfaceC4123nG[]{WD.u(w90), WD.u(w90), WD.u(C3969lb.f4651a)};
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public C3575h2 deserialize(InterfaceC2548Kl interfaceC2548Kl) {
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
                objS3 = interfaceC4421qhC.s(descriptor2, 2, C3969lb.f4651a, objS3);
                i |= 4;
            }
        }
        interfaceC4421qhC.b(descriptor2);
        return new C3575h2(i, (String) objS, (String) objS2, (Boolean) objS3, (O40) null);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public D40 getDescriptor() {
        return descriptor;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4123nG
    public void serialize(InterfaceC3385er interfaceC3385er, C3575h2 c3575h2) {
        AbstractC2995aW.q(interfaceC3385er, "encoder");
        AbstractC2995aW.q(c3575h2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        D40 descriptor2 = getDescriptor();
        InterfaceC4596sh interfaceC4596shC = interfaceC3385er.c(descriptor2);
        C3575h2.write$Self(c3575h2, interfaceC4596shC, descriptor2);
        interfaceC4596shC.b(descriptor2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public InterfaceC4123nG[] typeParametersSerializers() {
        return WD.h;
    }
}
