package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.rU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4488rU implements InterfaceC5060xx {
    public static final C4488rU INSTANCE;
    public static final /* synthetic */ D40 descriptor;

    static {
        C4488rU c4488rU = new C4488rU();
        INSTANCE = c4488rU;
        C3348eV c3348eV = new C3348eV("com.vungle.ads.internal.model.Placement", c4488rU, 3);
        c3348eV.j("placement_ref_id", false);
        c3348eV.j("is_hb", true);
        c3348eV.j("type", true);
        descriptor = c3348eV;
    }

    private C4488rU() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public InterfaceC4123nG[] childSerializers() {
        W90 w90 = W90.f3912a;
        return new InterfaceC4123nG[]{w90, C3969lb.f4651a, WD.u(w90)};
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public C4664tU deserialize(InterfaceC2548Kl interfaceC2548Kl) {
        AbstractC2995aW.q(interfaceC2548Kl, "decoder");
        D40 descriptor2 = getDescriptor();
        InterfaceC4421qh interfaceC4421qhC = interfaceC2548Kl.c(descriptor2);
        Object objS = null;
        String strL = null;
        boolean z = true;
        int i = 0;
        boolean zA = false;
        while (z) {
            int iK = interfaceC4421qhC.k(descriptor2);
            if (iK == -1) {
                z = false;
            } else if (iK == 0) {
                strL = interfaceC4421qhC.l(descriptor2, 0);
                i |= 1;
            } else if (iK == 1) {
                zA = interfaceC4421qhC.A(descriptor2, 1);
                i |= 2;
            } else {
                if (iK != 2) {
                    throw new Vf0(iK);
                }
                objS = interfaceC4421qhC.s(descriptor2, 2, W90.f3912a, objS);
                i |= 4;
            }
        }
        interfaceC4421qhC.b(descriptor2);
        return new C4664tU(i, strL, zA, (String) objS, (O40) null);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public D40 getDescriptor() {
        return descriptor;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4123nG
    public void serialize(InterfaceC3385er interfaceC3385er, C4664tU c4664tU) {
        AbstractC2995aW.q(interfaceC3385er, "encoder");
        AbstractC2995aW.q(c4664tU, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        D40 descriptor2 = getDescriptor();
        InterfaceC4596sh interfaceC4596shC = interfaceC3385er.c(descriptor2);
        C4664tU.write$Self(c4664tU, interfaceC4596shC, descriptor2);
        interfaceC4596shC.b(descriptor2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public InterfaceC4123nG[] typeParametersSerializers() {
        return WD.h;
    }
}
