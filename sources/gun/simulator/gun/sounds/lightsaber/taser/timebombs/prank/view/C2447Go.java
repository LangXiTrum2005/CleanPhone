package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Go, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2447Go implements InterfaceC5060xx {
    public static final C2447Go INSTANCE;
    public static final /* synthetic */ D40 descriptor;

    static {
        C2447Go c2447Go = new C2447Go();
        INSTANCE = c2447Go;
        C3348eV c3348eV = new C3348eV("com.vungle.ads.internal.model.DeviceNode", c2447Go, 11);
        c3348eV.j("make", false);
        c3348eV.j("model", false);
        c3348eV.j("osv", false);
        c3348eV.j(com.umeng.analytics.pro.bc.P, true);
        c3348eV.j(com.umeng.analytics.pro.bc.x, false);
        c3348eV.j("w", false);
        c3348eV.j(com.umeng.analytics.pro.bc.aM, false);
        c3348eV.j(com.umeng.analytics.pro.ay.d, true);
        c3348eV.j("ifa", true);
        c3348eV.j("lmt", true);
        c3348eV.j("ext", true);
        descriptor = c3348eV;
    }

    private C2447Go() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public InterfaceC4123nG[] childSerializers() {
        W90 w90 = W90.f3912a;
        InterfaceC4123nG interfaceC4123nGU = WD.u(w90);
        AD ad = AD.f2808a;
        return new InterfaceC4123nG[]{w90, w90, w90, interfaceC4123nGU, w90, ad, ad, WD.u(w90), WD.u(w90), WD.u(ad), WD.u(C2499Io.INSTANCE)};
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public C2577Lo deserialize(InterfaceC2548Kl interfaceC2548Kl) {
        AbstractC2995aW.q(interfaceC2548Kl, "decoder");
        D40 descriptor2 = getDescriptor();
        InterfaceC4421qh interfaceC4421qhC = interfaceC2548Kl.c(descriptor2);
        Object objS = null;
        Object objS2 = null;
        Object objS3 = null;
        String strL = null;
        Object objS4 = null;
        Object objS5 = null;
        String strL2 = null;
        String strL3 = null;
        String strL4 = null;
        int i = 0;
        int iD = 0;
        int iD2 = 0;
        boolean z = true;
        while (z) {
            int iK = interfaceC4421qhC.k(descriptor2);
            switch (iK) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strL = interfaceC4421qhC.l(descriptor2, 0);
                    i |= 1;
                    break;
                case 1:
                    strL2 = interfaceC4421qhC.l(descriptor2, 1);
                    i |= 2;
                    break;
                case 2:
                    strL3 = interfaceC4421qhC.l(descriptor2, 2);
                    i |= 4;
                    break;
                case 3:
                    objS = interfaceC4421qhC.s(descriptor2, 3, W90.f3912a, objS);
                    i |= 8;
                    break;
                case 4:
                    strL4 = interfaceC4421qhC.l(descriptor2, 4);
                    i |= 16;
                    break;
                case 5:
                    iD = interfaceC4421qhC.D(descriptor2, 5);
                    i |= 32;
                    break;
                case 6:
                    iD2 = interfaceC4421qhC.D(descriptor2, 6);
                    i |= 64;
                    break;
                case 7:
                    objS2 = interfaceC4421qhC.s(descriptor2, 7, W90.f3912a, objS2);
                    i |= 128;
                    break;
                case 8:
                    objS3 = interfaceC4421qhC.s(descriptor2, 8, W90.f3912a, objS3);
                    i |= 256;
                    break;
                case 9:
                    objS4 = interfaceC4421qhC.s(descriptor2, 9, AD.f2808a, objS4);
                    i |= 512;
                    break;
                case 10:
                    objS5 = interfaceC4421qhC.s(descriptor2, 10, C2499Io.INSTANCE, objS5);
                    i |= 1024;
                    break;
                default:
                    throw new Vf0(iK);
            }
        }
        interfaceC4421qhC.b(descriptor2);
        return new C2577Lo(i, strL, strL2, strL3, (String) objS, strL4, iD, iD2, (String) objS2, (String) objS3, (Integer) objS4, (C2551Ko) objS5, (O40) null);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public D40 getDescriptor() {
        return descriptor;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4123nG
    public void serialize(InterfaceC3385er interfaceC3385er, C2577Lo c2577Lo) {
        AbstractC2995aW.q(interfaceC3385er, "encoder");
        AbstractC2995aW.q(c2577Lo, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        D40 descriptor2 = getDescriptor();
        InterfaceC4596sh interfaceC4596shC = interfaceC3385er.c(descriptor2);
        C2577Lo.write$Self(c2577Lo, interfaceC4596shC, descriptor2);
        interfaceC4596shC.b(descriptor2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public InterfaceC4123nG[] typeParametersSerializers() {
        return WD.h;
    }
}
