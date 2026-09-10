package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.rg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4506rg implements InterfaceC5060xx {
    public static final C4506rg INSTANCE;
    public static final /* synthetic */ D40 descriptor;

    static {
        C4506rg c4506rg = new C4506rg();
        INSTANCE = c4506rg;
        C3348eV c3348eV = new C3348eV("com.vungle.ads.internal.model.CommonRequestBody.COPPA", c4506rg, 1);
        c3348eV.j("is_coppa", false);
        descriptor = c3348eV;
    }

    private C4506rg() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public InterfaceC4123nG[] childSerializers() {
        return new InterfaceC4123nG[]{WD.u(C3969lb.f4651a)};
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public C4682tg deserialize(InterfaceC2548Kl interfaceC2548Kl) {
        AbstractC2995aW.q(interfaceC2548Kl, "decoder");
        D40 descriptor2 = getDescriptor();
        InterfaceC4421qh interfaceC4421qhC = interfaceC2548Kl.c(descriptor2);
        O40 o40 = null;
        Object objS = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int iK = interfaceC4421qhC.k(descriptor2);
            if (iK == -1) {
                z = false;
            } else {
                if (iK != 0) {
                    throw new Vf0(iK);
                }
                objS = interfaceC4421qhC.s(descriptor2, 0, C3969lb.f4651a, objS);
                i = 1;
            }
        }
        interfaceC4421qhC.b(descriptor2);
        return new C4682tg(i, (Boolean) objS, o40);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public D40 getDescriptor() {
        return descriptor;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4123nG
    public void serialize(InterfaceC3385er interfaceC3385er, C4682tg c4682tg) {
        AbstractC2995aW.q(interfaceC3385er, "encoder");
        AbstractC2995aW.q(c4682tg, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        D40 descriptor2 = getDescriptor();
        InterfaceC4596sh interfaceC4596shC = interfaceC3385er.c(descriptor2);
        C4682tg.write$Self(c4682tg, interfaceC4596shC, descriptor2);
        interfaceC4596shC.b(descriptor2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public InterfaceC4123nG[] typeParametersSerializers() {
        return WD.h;
    }
}
