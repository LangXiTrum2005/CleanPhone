package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Io, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2499Io implements InterfaceC5060xx {
    public static final C2499Io INSTANCE;
    public static final /* synthetic */ D40 descriptor;

    static {
        C2499Io c2499Io = new C2499Io();
        INSTANCE = c2499Io;
        C3348eV c3348eV = new C3348eV("com.vungle.ads.internal.model.DeviceNode.VungleExt", c2499Io, 18);
        c3348eV.j("is_google_play_services_available", true);
        c3348eV.j("app_set_id", true);
        c3348eV.j("app_set_id_scope", true);
        c3348eV.j("battery_level", true);
        c3348eV.j("battery_state", true);
        c3348eV.j("battery_saver_enabled", true);
        c3348eV.j("connection_type", true);
        c3348eV.j("connection_type_detail", true);
        c3348eV.j("locale", true);
        c3348eV.j(com.umeng.analytics.pro.bc.N, true);
        c3348eV.j("time_zone", true);
        c3348eV.j("volume_level", true);
        c3348eV.j("sound_enabled", true);
        c3348eV.j("is_tv", true);
        c3348eV.j("sd_card_available", true);
        c3348eV.j("is_sideload_enabled", true);
        c3348eV.j("gaid", true);
        c3348eV.j("amazon_advertising_id", true);
        descriptor = c3348eV;
    }

    private C2499Io() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public InterfaceC4123nG[] childSerializers() {
        W90 w90 = W90.f3912a;
        InterfaceC4123nG interfaceC4123nGU = WD.u(w90);
        AD ad = AD.f2808a;
        InterfaceC4123nG interfaceC4123nGU2 = WD.u(ad);
        InterfaceC4123nG interfaceC4123nGU3 = WD.u(w90);
        InterfaceC4123nG interfaceC4123nGU4 = WD.u(w90);
        InterfaceC4123nG interfaceC4123nGU5 = WD.u(w90);
        InterfaceC4123nG interfaceC4123nGU6 = WD.u(w90);
        InterfaceC4123nG interfaceC4123nGU7 = WD.u(w90);
        InterfaceC4123nG interfaceC4123nGU8 = WD.u(w90);
        InterfaceC4123nG interfaceC4123nGU9 = WD.u(w90);
        InterfaceC4123nG interfaceC4123nGU10 = WD.u(w90);
        C3969lb c3969lb = C3969lb.f4651a;
        C4179nv c4179nv = C4179nv.f4766a;
        return new InterfaceC4123nG[]{c3969lb, interfaceC4123nGU, interfaceC4123nGU2, c4179nv, interfaceC4123nGU3, ad, interfaceC4123nGU4, interfaceC4123nGU5, interfaceC4123nGU6, interfaceC4123nGU7, interfaceC4123nGU8, c4179nv, ad, c3969lb, ad, c3969lb, interfaceC4123nGU9, interfaceC4123nGU10};
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public C2551Ko deserialize(InterfaceC2548Kl interfaceC2548Kl) {
        int i;
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
        boolean z = true;
        int i2 = 0;
        boolean zA = false;
        float fM = 0.0f;
        int iD = 0;
        float fM2 = 0.0f;
        int iD2 = 0;
        boolean zA2 = false;
        int iD3 = 0;
        boolean zA3 = false;
        while (z) {
            int iK = interfaceC4421qhC.k(descriptor2);
            switch (iK) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    zA = interfaceC4421qhC.A(descriptor2, 0);
                    i2 |= 1;
                    continue;
                case 1:
                    objS = interfaceC4421qhC.s(descriptor2, 1, W90.f3912a, objS);
                    i2 |= 2;
                    continue;
                case 2:
                    objS2 = interfaceC4421qhC.s(descriptor2, 2, AD.f2808a, objS2);
                    i2 |= 4;
                    continue;
                case 3:
                    fM = interfaceC4421qhC.m(descriptor2, 3);
                    i2 |= 8;
                    continue;
                case 4:
                    objS3 = interfaceC4421qhC.s(descriptor2, 4, W90.f3912a, objS3);
                    i2 |= 16;
                    continue;
                case 5:
                    iD = interfaceC4421qhC.D(descriptor2, 5);
                    i2 |= 32;
                    continue;
                case 6:
                    objS4 = interfaceC4421qhC.s(descriptor2, 6, W90.f3912a, objS4);
                    i2 |= 64;
                    continue;
                case 7:
                    objS5 = interfaceC4421qhC.s(descriptor2, 7, W90.f3912a, objS5);
                    i2 |= 128;
                    continue;
                case 8:
                    objS6 = interfaceC4421qhC.s(descriptor2, 8, W90.f3912a, objS6);
                    i2 |= 256;
                    continue;
                case 9:
                    objS7 = interfaceC4421qhC.s(descriptor2, 9, W90.f3912a, objS7);
                    i2 |= 512;
                    continue;
                case 10:
                    objS8 = interfaceC4421qhC.s(descriptor2, 10, W90.f3912a, objS8);
                    i2 |= 1024;
                    continue;
                case 11:
                    fM2 = interfaceC4421qhC.m(descriptor2, 11);
                    i2 |= 2048;
                    continue;
                case 12:
                    iD2 = interfaceC4421qhC.D(descriptor2, 12);
                    i2 |= 4096;
                    continue;
                case 13:
                    zA2 = interfaceC4421qhC.A(descriptor2, 13);
                    i2 |= 8192;
                    continue;
                case 14:
                    iD3 = interfaceC4421qhC.D(descriptor2, 14);
                    i2 |= 16384;
                    continue;
                case 15:
                    zA3 = interfaceC4421qhC.A(descriptor2, 15);
                    i = 32768;
                    break;
                case 16:
                    objS9 = interfaceC4421qhC.s(descriptor2, 16, W90.f3912a, objS9);
                    i = 65536;
                    break;
                case 17:
                    objS10 = interfaceC4421qhC.s(descriptor2, 17, W90.f3912a, objS10);
                    i = 131072;
                    break;
                default:
                    throw new Vf0(iK);
            }
            i2 |= i;
        }
        interfaceC4421qhC.b(descriptor2);
        return new C2551Ko(i2, zA, (String) objS, (Integer) objS2, fM, (String) objS3, iD, (String) objS4, (String) objS5, (String) objS6, (String) objS7, (String) objS8, fM2, iD2, zA2, iD3, zA3, (String) objS9, (String) objS10, (O40) null);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public D40 getDescriptor() {
        return descriptor;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4123nG
    public void serialize(InterfaceC3385er interfaceC3385er, C2551Ko c2551Ko) {
        AbstractC2995aW.q(interfaceC3385er, "encoder");
        AbstractC2995aW.q(c2551Ko, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        D40 descriptor2 = getDescriptor();
        InterfaceC4596sh interfaceC4596shC = interfaceC3385er.c(descriptor2);
        C2551Ko.write$Self(c2551Ko, interfaceC4596shC, descriptor2);
        interfaceC4596shC.b(descriptor2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public InterfaceC4123nG[] typeParametersSerializers() {
        return WD.h;
    }
}
