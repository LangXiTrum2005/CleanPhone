package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ha, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3617ha implements InterfaceC5060xx {
    public static final C3617ha INSTANCE;
    public static final /* synthetic */ D40 descriptor;

    static {
        C3617ha c3617ha = new C3617ha();
        INSTANCE = c3617ha;
        C3348eV c3348eV = new C3348eV("com.vungle.ads.internal.model.BidPayload", c3617ha, 4);
        c3348eV.j("version", true);
        c3348eV.j("adunit", true);
        c3348eV.j("impression", true);
        c3348eV.j(com.umeng.analytics.pro.bc.aC, true);
        descriptor = c3348eV;
    }

    private C3617ha() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public InterfaceC4123nG[] childSerializers() {
        InterfaceC4123nG interfaceC4123nGU = WD.u(AD.f2808a);
        W90 w90 = W90.f3912a;
        return new InterfaceC4123nG[]{interfaceC4123nGU, WD.u(w90), WD.u(new T5(w90, 0)), WD.u(Y1.INSTANCE)};
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public C3967la deserialize(InterfaceC2548Kl interfaceC2548Kl) {
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
                objS2 = interfaceC4421qhC.s(descriptor2, 1, W90.f3912a, objS2);
                i |= 2;
            } else if (iK == 2) {
                objS3 = interfaceC4421qhC.s(descriptor2, 2, new T5(W90.f3912a, 0), objS3);
                i |= 4;
            } else {
                if (iK != 3) {
                    throw new Vf0(iK);
                }
                objS4 = interfaceC4421qhC.s(descriptor2, 3, Y1.INSTANCE, objS4);
                i |= 8;
            }
        }
        interfaceC4421qhC.b(descriptor2);
        return new C3967la(i, (Integer) objS, (String) objS2, (List) objS3, (C4980x2) objS4, null);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public D40 getDescriptor() {
        return descriptor;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4123nG
    public void serialize(InterfaceC3385er interfaceC3385er, C3967la c3967la) {
        AbstractC2995aW.q(interfaceC3385er, "encoder");
        AbstractC2995aW.q(c3967la, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        D40 descriptor2 = getDescriptor();
        InterfaceC4596sh interfaceC4596shC = interfaceC3385er.c(descriptor2);
        C3967la.write$Self(c3967la, interfaceC4596shC, descriptor2);
        interfaceC4596shC.b(descriptor2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public InterfaceC4123nG[] typeParametersSerializers() {
        return WD.h;
    }
}
