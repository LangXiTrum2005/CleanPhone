package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ei, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2389Ei implements InterfaceC5060xx {
    public static final C2389Ei INSTANCE;
    public static final /* synthetic */ D40 descriptor;

    static {
        C2389Ei c2389Ei = new C2389Ei();
        INSTANCE = c2389Ei;
        C3348eV c3348eV = new C3348eV("com.vungle.ads.internal.model.ConfigPayload.LogMetricsSettings", c2389Ei, 2);
        c3348eV.j("error_log_level", true);
        c3348eV.j("metrics_is_enabled", true);
        descriptor = c3348eV;
    }

    private C2389Ei() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public InterfaceC4123nG[] childSerializers() {
        return new InterfaceC4123nG[]{WD.u(AD.f2808a), WD.u(C3969lb.f4651a)};
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public C2441Gi deserialize(InterfaceC2548Kl interfaceC2548Kl) {
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
                objS = interfaceC4421qhC.s(descriptor2, 0, AD.f2808a, objS);
                i |= 1;
            } else {
                if (iK != 1) {
                    throw new Vf0(iK);
                }
                objS2 = interfaceC4421qhC.s(descriptor2, 1, C3969lb.f4651a, objS2);
                i |= 2;
            }
        }
        interfaceC4421qhC.b(descriptor2);
        return new C2441Gi(i, (Integer) objS, (Boolean) objS2, o40);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public D40 getDescriptor() {
        return descriptor;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4123nG
    public void serialize(InterfaceC3385er interfaceC3385er, C2441Gi c2441Gi) {
        AbstractC2995aW.q(interfaceC3385er, "encoder");
        AbstractC2995aW.q(c2441Gi, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        D40 descriptor2 = getDescriptor();
        InterfaceC4596sh interfaceC4596shC = interfaceC3385er.c(descriptor2);
        C2441Gi.write$Self(c2441Gi, interfaceC4596shC, descriptor2);
        interfaceC4596shC.b(descriptor2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public InterfaceC4123nG[] typeParametersSerializers() {
        return WD.h;
    }
}
