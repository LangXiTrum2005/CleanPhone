package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.l50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3932l50 implements InterfaceC5060xx {
    public static final C3932l50 INSTANCE;
    public static final /* synthetic */ D40 descriptor;

    static {
        C3932l50 c3932l50 = new C3932l50();
        INSTANCE = c3932l50;
        C3348eV c3348eV = new C3348eV("com.vungle.ads.fpd.SessionContext", c3932l50, 12);
        c3348eV.j("level_percentile", true);
        c3348eV.j("page", true);
        c3348eV.j("time_spent", true);
        c3348eV.j("signup_date", true);
        c3348eV.j("user_score_percentile", true);
        c3348eV.j("user_id", true);
        c3348eV.j("friends", true);
        c3348eV.j("user_level_percentile", true);
        c3348eV.j("health_percentile", true);
        c3348eV.j(com.umeng.analytics.pro.w.f2596a, true);
        c3348eV.j("session_duration", true);
        c3348eV.j("in_game_purchases_usd", true);
        descriptor = c3348eV;
    }

    private C3932l50() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public InterfaceC4123nG[] childSerializers() {
        C4179nv c4179nv = C4179nv.f4766a;
        InterfaceC4123nG interfaceC4123nGU = WD.u(c4179nv);
        W90 w90 = W90.f3912a;
        InterfaceC4123nG interfaceC4123nGU2 = WD.u(w90);
        AD ad = AD.f2808a;
        return new InterfaceC4123nG[]{interfaceC4123nGU, interfaceC4123nGU2, WD.u(ad), WD.u(ad), WD.u(c4179nv), WD.u(w90), WD.u(new T5(w90, 0)), WD.u(c4179nv), WD.u(c4179nv), WD.u(ad), WD.u(ad), WD.u(c4179nv)};
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public C4108n50 deserialize(InterfaceC2548Kl interfaceC2548Kl) {
        AbstractC2995aW.q(interfaceC2548Kl, "decoder");
        D40 descriptor2 = getDescriptor();
        InterfaceC4421qh interfaceC4421qhC = interfaceC2548Kl.c(descriptor2);
        Object objS = null;
        Object objS2 = null;
        Object objS3 = null;
        Object objS4 = null;
        Object objS5 = null;
        Object objS6 = null;
        Object objS7 = null;
        Object objS8 = null;
        Object objS9 = null;
        Object objS10 = null;
        Object objS11 = null;
        Object objS12 = null;
        int i = 0;
        boolean z = true;
        while (z) {
            int iK = interfaceC4421qhC.k(descriptor2);
            switch (iK) {
                case -1:
                    objS12 = objS12;
                    z = false;
                    break;
                case 0:
                    objS = interfaceC4421qhC.s(descriptor2, 0, C4179nv.f4766a, objS);
                    i |= 1;
                    objS12 = objS12;
                    break;
                case 1:
                    objS2 = interfaceC4421qhC.s(descriptor2, 1, W90.f3912a, objS2);
                    i |= 2;
                    objS = objS;
                    break;
                case 2:
                    objS3 = interfaceC4421qhC.s(descriptor2, 2, AD.f2808a, objS3);
                    i |= 4;
                    objS = objS;
                    break;
                case 3:
                    objS4 = interfaceC4421qhC.s(descriptor2, 3, AD.f2808a, objS4);
                    i |= 8;
                    objS = objS;
                    break;
                case 4:
                    objS5 = interfaceC4421qhC.s(descriptor2, 4, C4179nv.f4766a, objS5);
                    i |= 16;
                    objS = objS;
                    break;
                case 5:
                    objS6 = interfaceC4421qhC.s(descriptor2, 5, W90.f3912a, objS6);
                    i |= 32;
                    objS = objS;
                    break;
                case 6:
                    objS7 = interfaceC4421qhC.s(descriptor2, 6, new T5(W90.f3912a, 0), objS7);
                    i |= 64;
                    objS = objS;
                    objS12 = objS12;
                    break;
                case 7:
                    objS8 = interfaceC4421qhC.s(descriptor2, 7, C4179nv.f4766a, objS8);
                    i |= 128;
                    objS = objS;
                    break;
                case 8:
                    objS9 = interfaceC4421qhC.s(descriptor2, 8, C4179nv.f4766a, objS9);
                    i |= 256;
                    objS = objS;
                    break;
                case 9:
                    objS10 = interfaceC4421qhC.s(descriptor2, 9, AD.f2808a, objS10);
                    i |= 512;
                    objS = objS;
                    break;
                case 10:
                    objS11 = interfaceC4421qhC.s(descriptor2, 10, AD.f2808a, objS11);
                    i |= 1024;
                    objS = objS;
                    break;
                case 11:
                    objS12 = interfaceC4421qhC.s(descriptor2, 11, C4179nv.f4766a, objS12);
                    i |= 2048;
                    objS = objS;
                    break;
                default:
                    throw new Vf0(iK);
            }
        }
        interfaceC4421qhC.b(descriptor2);
        return new C4108n50(i, (Float) objS, (String) objS2, (Integer) objS3, (Integer) objS4, (Float) objS5, (String) objS6, (List) objS7, (Float) objS8, (Float) objS9, (Integer) objS10, (Integer) objS11, (Float) objS12, null);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public D40 getDescriptor() {
        return descriptor;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4123nG
    public void serialize(InterfaceC3385er interfaceC3385er, C4108n50 c4108n50) {
        AbstractC2995aW.q(interfaceC3385er, "encoder");
        AbstractC2995aW.q(c4108n50, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        D40 descriptor2 = getDescriptor();
        InterfaceC4596sh interfaceC4596shC = interfaceC3385er.c(descriptor2);
        C4108n50.write$Self(c4108n50, interfaceC4596shC, descriptor2);
        interfaceC4596shC.b(descriptor2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public InterfaceC4123nG[] typeParametersSerializers() {
        return WD.h;
    }
}
