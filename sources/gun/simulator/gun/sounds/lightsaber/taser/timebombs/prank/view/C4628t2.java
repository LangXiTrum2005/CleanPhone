package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.t2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4628t2 implements InterfaceC5060xx {
    public static final C4628t2 INSTANCE;
    public static final /* synthetic */ D40 descriptor;

    static {
        C4628t2 c4628t2 = new C4628t2();
        INSTANCE = c4628t2;
        C3348eV c3348eV = new C3348eV("com.vungle.ads.internal.model.AdPayload.ViewAbilityInfo", c4628t2, 2);
        c3348eV.j("is_enabled", true);
        c3348eV.j("extra_vast", true);
        descriptor = c3348eV;
    }

    private C4628t2() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public InterfaceC4123nG[] childSerializers() {
        return new InterfaceC4123nG[]{WD.u(C3969lb.f4651a), WD.u(W90.f3912a)};
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public C4804v2 deserialize(InterfaceC2548Kl interfaceC2548Kl) {
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
                objS = interfaceC4421qhC.s(descriptor2, 0, C3969lb.f4651a, objS);
                i |= 1;
            } else {
                if (iK != 1) {
                    throw new Vf0(iK);
                }
                objS2 = interfaceC4421qhC.s(descriptor2, 1, W90.f3912a, objS2);
                i |= 2;
            }
        }
        interfaceC4421qhC.b(descriptor2);
        return new C4804v2(i, (Boolean) objS, (String) objS2, o40);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public D40 getDescriptor() {
        return descriptor;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4123nG
    public void serialize(InterfaceC3385er interfaceC3385er, C4804v2 c4804v2) {
        AbstractC2995aW.q(interfaceC3385er, "encoder");
        AbstractC2995aW.q(c4804v2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        D40 descriptor2 = getDescriptor();
        InterfaceC4596sh interfaceC4596shC = interfaceC3385er.c(descriptor2);
        C4804v2.write$Self(c4804v2, interfaceC4596shC, descriptor2);
        interfaceC4596shC.b(descriptor2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public InterfaceC4123nG[] typeParametersSerializers() {
        return WD.h;
    }
}
