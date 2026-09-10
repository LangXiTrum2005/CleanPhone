package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Eg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2387Eg implements InterfaceC5060xx {
    public static final C2387Eg INSTANCE;
    public static final /* synthetic */ D40 descriptor;

    static {
        C2387Eg c2387Eg = new C2387Eg();
        INSTANCE = c2387Eg;
        C3348eV c3348eV = new C3348eV("com.vungle.ads.internal.model.CommonRequestBody.RequestParam", c2387Eg, 6);
        c3348eV.j("placements", true);
        c3348eV.j("ad_size", true);
        c3348eV.j("ad_start_time", true);
        c3348eV.j("app_id", true);
        c3348eV.j("placement_reference_id", true);
        c3348eV.j(com.umeng.analytics.pro.ay.m, true);
        descriptor = c3348eV;
    }

    private C2387Eg() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public InterfaceC4123nG[] childSerializers() {
        W90 w90 = W90.f3912a;
        return new InterfaceC4123nG[]{WD.u(new T5(w90, 0)), WD.u(C3979lg.INSTANCE), WD.u(FJ.f3064a), WD.u(w90), WD.u(w90), WD.u(w90)};
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public C2439Gg deserialize(InterfaceC2548Kl interfaceC2548Kl) {
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
                    objS = interfaceC4421qhC.s(descriptor2, 0, new T5(W90.f3912a, 0), objS);
                    i |= 1;
                    break;
                case 1:
                    objS2 = interfaceC4421qhC.s(descriptor2, 1, C3979lg.INSTANCE, objS2);
                    i |= 2;
                    break;
                case 2:
                    objS3 = interfaceC4421qhC.s(descriptor2, 2, FJ.f3064a, objS3);
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
        return new C2439Gg(i, (List) objS, (C4155ng) objS2, (Long) objS3, (String) objS4, (String) objS5, (String) objS6, (O40) null);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public D40 getDescriptor() {
        return descriptor;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4123nG
    public void serialize(InterfaceC3385er interfaceC3385er, C2439Gg c2439Gg) {
        AbstractC2995aW.q(interfaceC3385er, "encoder");
        AbstractC2995aW.q(c2439Gg, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        D40 descriptor2 = getDescriptor();
        InterfaceC4596sh interfaceC4596shC = interfaceC3385er.c(descriptor2);
        C2439Gg.write$Self(c2439Gg, interfaceC4596shC, descriptor2);
        interfaceC4596shC.b(descriptor2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public InterfaceC4123nG[] typeParametersSerializers() {
        return WD.h;
    }
}
