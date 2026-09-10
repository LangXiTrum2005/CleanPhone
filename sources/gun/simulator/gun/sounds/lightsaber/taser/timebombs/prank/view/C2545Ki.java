package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ki, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2545Ki implements InterfaceC5060xx {
    public static final C2545Ki INSTANCE;
    public static final /* synthetic */ D40 descriptor;

    static {
        C2545Ki c2545Ki = new C2545Ki();
        INSTANCE = c2545Ki;
        C3348eV c3348eV = new C3348eV("com.vungle.ads.internal.model.ConfigPayload.ViewAbilitySettings", c2545Ki, 1);
        c3348eV.j("om", true);
        descriptor = c3348eV;
    }

    private C2545Ki() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public InterfaceC4123nG[] childSerializers() {
        return new InterfaceC4123nG[]{WD.u(C3969lb.f4651a)};
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public C2596Mi deserialize(InterfaceC2548Kl interfaceC2548Kl) {
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
        return new C2596Mi(i, (Boolean) objS, o40);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public D40 getDescriptor() {
        return descriptor;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4123nG
    public void serialize(InterfaceC3385er interfaceC3385er, C2596Mi c2596Mi) {
        AbstractC2995aW.q(interfaceC3385er, "encoder");
        AbstractC2995aW.q(c2596Mi, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        D40 descriptor2 = getDescriptor();
        InterfaceC4596sh interfaceC4596shC = interfaceC3385er.c(descriptor2);
        C2596Mi.write$Self(c2596Mi, interfaceC4596shC, descriptor2);
        interfaceC4596shC.b(descriptor2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public InterfaceC4123nG[] typeParametersSerializers() {
        return WD.h;
    }
}
