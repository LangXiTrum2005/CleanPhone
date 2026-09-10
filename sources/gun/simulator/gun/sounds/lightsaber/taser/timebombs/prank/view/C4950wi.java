package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.wi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4950wi implements InterfaceC5060xx {
    public static final C4950wi INSTANCE;
    public static final /* synthetic */ D40 descriptor;

    static {
        C4950wi c4950wi = new C4950wi();
        INSTANCE = c4950wi;
        C3348eV c3348eV = new C3348eV("com.vungle.ads.internal.model.ConfigPayload.GDPRSettings", c4950wi, 6);
        c3348eV.j("is_country_data_protected", true);
        c3348eV.j("consent_title", true);
        c3348eV.j("consent_message", true);
        c3348eV.j("consent_message_version", true);
        c3348eV.j("button_accept", true);
        c3348eV.j("button_deny", true);
        descriptor = c3348eV;
    }

    private C4950wi() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public InterfaceC4123nG[] childSerializers() {
        InterfaceC4123nG interfaceC4123nGU = WD.u(C3969lb.f4651a);
        W90 w90 = W90.f3912a;
        return new InterfaceC4123nG[]{interfaceC4123nGU, WD.u(w90), WD.u(w90), WD.u(w90), WD.u(w90), WD.u(w90)};
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public C5126yi deserialize(InterfaceC2548Kl interfaceC2548Kl) {
        AbstractC2995aW.q(interfaceC2548Kl, "decoder");
        D40 descriptor2 = getDescriptor();
        InterfaceC4421qh interfaceC4421qhC = interfaceC2548Kl.c(descriptor2);
        Object objS = null;
        Object objS2 = null;
        Object objS3 = null;
        Object objS4 = null;
        Object objS5 = null;
        Object objS6 = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int iK = interfaceC4421qhC.k(descriptor2);
            switch (iK) {
                case -1:
                    z = false;
                    break;
                case 0:
                    objS = interfaceC4421qhC.s(descriptor2, 0, C3969lb.f4651a, objS);
                    i |= 1;
                    break;
                case 1:
                    objS2 = interfaceC4421qhC.s(descriptor2, 1, W90.f3912a, objS2);
                    i |= 2;
                    break;
                case 2:
                    objS3 = interfaceC4421qhC.s(descriptor2, 2, W90.f3912a, objS3);
                    i |= 4;
                    break;
                case 3:
                    objS4 = interfaceC4421qhC.s(descriptor2, 3, W90.f3912a, objS4);
                    i |= 8;
                    break;
                case 4:
                    objS5 = interfaceC4421qhC.s(descriptor2, 4, W90.f3912a, objS5);
                    i |= 16;
                    break;
                case 5:
                    objS6 = interfaceC4421qhC.s(descriptor2, 5, W90.f3912a, objS6);
                    i |= 32;
                    break;
                default:
                    throw new Vf0(iK);
            }
        }
        interfaceC4421qhC.b(descriptor2);
        return new C5126yi(i, (Boolean) objS, (String) objS2, (String) objS3, (String) objS4, (String) objS5, (String) objS6, (O40) null);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public D40 getDescriptor() {
        return descriptor;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4123nG
    public void serialize(InterfaceC3385er interfaceC3385er, C5126yi c5126yi) {
        AbstractC2995aW.q(interfaceC3385er, "encoder");
        AbstractC2995aW.q(c5126yi, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        D40 descriptor2 = getDescriptor();
        InterfaceC4596sh interfaceC4596shC = interfaceC3385er.c(descriptor2);
        C5126yi.write$Self(c5126yi, interfaceC4596shC, descriptor2);
        interfaceC4596shC.b(descriptor2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public InterfaceC4123nG[] typeParametersSerializers() {
        return WD.h;
    }
}
