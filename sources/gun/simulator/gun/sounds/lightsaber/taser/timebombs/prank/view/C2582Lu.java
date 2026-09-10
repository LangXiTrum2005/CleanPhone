package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Lu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2582Lu implements InterfaceC5060xx {
    public static final C2582Lu INSTANCE;
    public static final /* synthetic */ D40 descriptor;

    static {
        C2582Lu c2582Lu = new C2582Lu();
        INSTANCE = c2582Lu;
        C3348eV c3348eV = new C3348eV("com.vungle.ads.fpd.FirstPartyData", c2582Lu, 5);
        c3348eV.j("session_context", true);
        c3348eV.j("demographic", true);
        c3348eV.j("location", true);
        c3348eV.j("revenue", true);
        c3348eV.j("custom_data", true);
        descriptor = c3348eV;
    }

    private C2582Lu() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public InterfaceC4123nG[] childSerializers() {
        InterfaceC4123nG interfaceC4123nGU = WD.u(C3932l50.INSTANCE);
        InterfaceC4123nG interfaceC4123nGU2 = WD.u(C4962wo.INSTANCE);
        InterfaceC4123nG interfaceC4123nGU3 = WD.u(UI.INSTANCE);
        InterfaceC4123nG interfaceC4123nGU4 = WD.u(NZ.INSTANCE);
        W90 w90 = W90.f3912a;
        return new InterfaceC4123nG[]{interfaceC4123nGU, interfaceC4123nGU2, interfaceC4123nGU3, interfaceC4123nGU4, WD.u(new C4095mz(w90, w90, 1))};
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public C2634Nu deserialize(InterfaceC2548Kl interfaceC2548Kl) {
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
                objS = interfaceC4421qhC.s(descriptor2, 0, C3932l50.INSTANCE, objS);
                i |= 1;
            } else if (iK == 1) {
                objS2 = interfaceC4421qhC.s(descriptor2, 1, C4962wo.INSTANCE, objS2);
                i |= 2;
            } else if (iK == 2) {
                objS3 = interfaceC4421qhC.s(descriptor2, 2, UI.INSTANCE, objS3);
                i |= 4;
            } else if (iK == 3) {
                objS4 = interfaceC4421qhC.s(descriptor2, 3, NZ.INSTANCE, objS4);
                i |= 8;
            } else {
                if (iK != 4) {
                    throw new Vf0(iK);
                }
                W90 w90 = W90.f3912a;
                objS5 = interfaceC4421qhC.s(descriptor2, 4, new C4095mz(w90, w90, 1), objS5);
                i |= 16;
            }
        }
        interfaceC4421qhC.b(descriptor2);
        return new C2634Nu(i, (C4108n50) objS, (C5138yo) objS2, (WI) objS3, (PZ) objS4, (Map) objS5, null);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public D40 getDescriptor() {
        return descriptor;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4123nG
    public void serialize(InterfaceC3385er interfaceC3385er, C2634Nu c2634Nu) {
        AbstractC2995aW.q(interfaceC3385er, "encoder");
        AbstractC2995aW.q(c2634Nu, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        D40 descriptor2 = getDescriptor();
        InterfaceC4596sh interfaceC4596shC = interfaceC3385er.c(descriptor2);
        C2634Nu.write$Self(c2634Nu, interfaceC4596shC, descriptor2);
        interfaceC4596shC.b(descriptor2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public InterfaceC4123nG[] typeParametersSerializers() {
        return WD.h;
    }
}
