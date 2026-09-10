package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class NZ implements InterfaceC5060xx {
    public static final NZ INSTANCE;
    public static final /* synthetic */ D40 descriptor;

    static {
        NZ nz = new NZ();
        INSTANCE = nz;
        C3348eV c3348eV = new C3348eV("com.vungle.ads.fpd.Revenue", nz, 17);
        c3348eV.j("total_earnings_usd", true);
        c3348eV.j("earnings_by_placement_usd", true);
        c3348eV.j("top_n_adomain", true);
        c3348eV.j("is_user_a_purchaser", true);
        c3348eV.j("is_user_a_subscriber", true);
        c3348eV.j("last_7_days_total_spend_usd", true);
        c3348eV.j("last_7_days_median_spend_usd", true);
        c3348eV.j("last_7_days_mean_spend_usd", true);
        c3348eV.j("last_30_days_total_spend_usd", true);
        c3348eV.j("last_30_days_median_spend_usd", true);
        c3348eV.j("last_30_days_mean_spend_usd", true);
        c3348eV.j("last_7_days_user_pltv_usd", true);
        c3348eV.j("last_7_days_user_ltv_usd", true);
        c3348eV.j("last_30_days_user_pltv_usd", true);
        c3348eV.j("last_30_days_user_ltv_usd", true);
        c3348eV.j("last_7_days_placement_fill_rate", true);
        c3348eV.j("last_30_days_placement_fill_rate", true);
        descriptor = c3348eV;
    }

    private NZ() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public InterfaceC4123nG[] childSerializers() {
        C4179nv c4179nv = C4179nv.f4766a;
        InterfaceC4123nG interfaceC4123nGU = WD.u(c4179nv);
        InterfaceC4123nG interfaceC4123nGU2 = WD.u(c4179nv);
        InterfaceC4123nG interfaceC4123nGU3 = WD.u(new T5(W90.f3912a, 0));
        C3969lb c3969lb = C3969lb.f4651a;
        return new InterfaceC4123nG[]{interfaceC4123nGU, interfaceC4123nGU2, interfaceC4123nGU3, WD.u(c3969lb), WD.u(c3969lb), WD.u(c4179nv), WD.u(c4179nv), WD.u(c4179nv), WD.u(c4179nv), WD.u(c4179nv), WD.u(c4179nv), WD.u(c4179nv), WD.u(c4179nv), WD.u(c4179nv), WD.u(c4179nv), WD.u(c4179nv), WD.u(c4179nv)};
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public PZ deserialize(InterfaceC2548Kl interfaceC2548Kl) {
        int i;
        Object objS;
        AbstractC2995aW.q(interfaceC2548Kl, "decoder");
        D40 descriptor2 = getDescriptor();
        InterfaceC4421qh interfaceC4421qhC = interfaceC2548Kl.c(descriptor2);
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
        Object objS13 = null;
        Object objS14 = null;
        Object objS15 = null;
        Object obj = null;
        Object objS16 = null;
        Object objS17 = null;
        int i2 = 0;
        boolean z = true;
        while (z) {
            Object obj2 = objS7;
            int iK = interfaceC4421qhC.k(descriptor2);
            switch (iK) {
                case -1:
                    objS2 = objS2;
                    objS6 = objS6;
                    objS8 = objS8;
                    objS17 = objS17;
                    Object obj3 = obj;
                    objS3 = objS3;
                    objS = obj3;
                    objS7 = obj2;
                    objS14 = objS14;
                    objS5 = objS5;
                    z = false;
                    objS17 = objS17;
                    objS8 = objS8;
                    objS2 = objS2;
                    objS6 = objS6;
                    Object obj4 = objS3;
                    obj = objS;
                    objS3 = obj4;
                    break;
                case 0:
                    objS = obj;
                    objS15 = interfaceC4421qhC.s(descriptor2, 0, C4179nv.f4766a, objS15);
                    i2 |= 1;
                    objS7 = obj2;
                    objS14 = objS14;
                    objS4 = objS4;
                    objS5 = objS5;
                    objS17 = objS17;
                    objS8 = objS8;
                    objS2 = objS2;
                    objS6 = objS6;
                    Object obj5 = objS3;
                    obj = objS;
                    objS3 = obj5;
                    break;
                case 1:
                    objS = interfaceC4421qhC.s(descriptor2, 1, C4179nv.f4766a, obj);
                    i2 |= 2;
                    objS7 = obj2;
                    objS4 = objS4;
                    objS5 = objS5;
                    objS17 = objS17;
                    objS8 = objS8;
                    objS2 = objS2;
                    objS6 = objS6;
                    Object obj6 = objS3;
                    obj = objS;
                    objS3 = obj6;
                    break;
                case 2:
                    objS16 = interfaceC4421qhC.s(descriptor2, 2, new T5(W90.f3912a, 0), objS16);
                    i2 |= 4;
                    objS7 = obj2;
                    objS8 = objS8;
                    objS4 = objS4;
                    objS5 = objS5;
                    objS6 = objS6;
                    objS17 = objS17;
                    objS2 = objS2;
                    break;
                case 3:
                    objS17 = interfaceC4421qhC.s(descriptor2, 3, C3969lb.f4651a, objS17);
                    i2 |= 8;
                    objS7 = obj2;
                    objS8 = objS8;
                    objS2 = objS2;
                    objS5 = objS5;
                    objS6 = objS6;
                    break;
                case 4:
                    objS7 = interfaceC4421qhC.s(descriptor2, 4, C3969lb.f4651a, obj2);
                    i2 |= 16;
                    objS8 = objS8;
                    objS5 = objS5;
                    objS6 = objS6;
                    break;
                case 5:
                    objS6 = objS6;
                    objS8 = interfaceC4421qhC.s(descriptor2, 5, C4179nv.f4766a, objS8);
                    i2 |= 32;
                    objS7 = obj2;
                    objS6 = objS6;
                    break;
                case 6:
                    objS8 = objS8;
                    objS9 = interfaceC4421qhC.s(descriptor2, 6, C4179nv.f4766a, objS9);
                    i2 |= 64;
                    objS7 = obj2;
                    objS8 = objS8;
                    break;
                case 7:
                    objS8 = objS8;
                    objS10 = interfaceC4421qhC.s(descriptor2, 7, C4179nv.f4766a, objS10);
                    i2 |= 128;
                    objS7 = obj2;
                    objS8 = objS8;
                    break;
                case 8:
                    objS8 = objS8;
                    objS11 = interfaceC4421qhC.s(descriptor2, 8, C4179nv.f4766a, objS11);
                    i2 |= 256;
                    objS7 = obj2;
                    objS8 = objS8;
                    break;
                case 9:
                    objS8 = objS8;
                    objS12 = interfaceC4421qhC.s(descriptor2, 9, C4179nv.f4766a, objS12);
                    i2 |= 512;
                    objS7 = obj2;
                    objS8 = objS8;
                    break;
                case 10:
                    objS8 = objS8;
                    objS13 = interfaceC4421qhC.s(descriptor2, 10, C4179nv.f4766a, objS13);
                    i2 |= 1024;
                    objS7 = obj2;
                    objS8 = objS8;
                    break;
                case 11:
                    objS8 = objS8;
                    objS14 = interfaceC4421qhC.s(descriptor2, 11, C4179nv.f4766a, objS14);
                    i2 |= 2048;
                    objS7 = obj2;
                    objS8 = objS8;
                    break;
                case 12:
                    objS8 = objS8;
                    objS3 = interfaceC4421qhC.s(descriptor2, 12, C4179nv.f4766a, objS3);
                    i2 |= 4096;
                    objS7 = obj2;
                    objS8 = objS8;
                    break;
                case 13:
                    objS8 = objS8;
                    objS4 = interfaceC4421qhC.s(descriptor2, 13, C4179nv.f4766a, objS4);
                    i2 |= 8192;
                    objS7 = obj2;
                    objS8 = objS8;
                    break;
                case 14:
                    objS8 = objS8;
                    objS2 = interfaceC4421qhC.s(descriptor2, 14, C4179nv.f4766a, objS2);
                    i2 |= 16384;
                    objS7 = obj2;
                    objS8 = objS8;
                    break;
                case 15:
                    objS5 = interfaceC4421qhC.s(descriptor2, 15, C4179nv.f4766a, objS5);
                    i = 32768;
                    i2 |= i;
                    objS7 = obj2;
                    objS8 = objS8;
                    break;
                case 16:
                    objS6 = interfaceC4421qhC.s(descriptor2, 16, C4179nv.f4766a, objS6);
                    i = 65536;
                    i2 |= i;
                    objS7 = obj2;
                    objS8 = objS8;
                    break;
                default:
                    throw new Vf0(iK);
            }
        }
        Object obj7 = objS2;
        Object obj8 = objS5;
        Object obj9 = objS6;
        Object obj10 = objS8;
        Object obj11 = objS14;
        Object obj12 = objS17;
        Object obj13 = obj;
        interfaceC4421qhC.b(descriptor2);
        return new PZ(i2, (Float) objS15, (Float) obj13, (List) objS16, (Boolean) obj12, (Boolean) objS7, (Float) obj10, (Float) objS9, (Float) objS10, (Float) objS11, (Float) objS12, (Float) objS13, (Float) obj11, (Float) objS3, (Float) objS4, (Float) obj7, (Float) obj8, (Float) obj9, null);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public D40 getDescriptor() {
        return descriptor;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4123nG
    public void serialize(InterfaceC3385er interfaceC3385er, PZ pz) {
        AbstractC2995aW.q(interfaceC3385er, "encoder");
        AbstractC2995aW.q(pz, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        D40 descriptor2 = getDescriptor();
        InterfaceC4596sh interfaceC4596shC = interfaceC3385er.c(descriptor2);
        PZ.write$Self(pz, interfaceC4596shC, descriptor2);
        interfaceC4596shC.b(descriptor2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public InterfaceC4123nG[] typeParametersSerializers() {
        return WD.h;
    }
}
