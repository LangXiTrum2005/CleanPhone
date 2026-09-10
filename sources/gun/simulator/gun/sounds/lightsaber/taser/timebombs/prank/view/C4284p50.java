package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.p50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4284p50 implements InterfaceC5060xx {
    public static final C4284p50 INSTANCE;
    public static final /* synthetic */ D40 descriptor;

    static {
        C4284p50 c4284p50 = new C4284p50();
        INSTANCE = c4284p50;
        C3348eV c3348eV = new C3348eV("com.vungle.ads.internal.signals.SessionData", c4284p50, 7);
        c3348eV.j("103", false);
        c3348eV.j(StatisticData.ERROR_CODE_IO_ERROR, true);
        c3348eV.j(StatisticData.ERROR_CODE_NOT_FOUND, true);
        c3348eV.j("106", true);
        c3348eV.j(MBridgeCommon.DYNAMIC_VIEW_TEMPLATE_VALUE, true);
        c3348eV.j("104", true);
        c3348eV.j("105", true);
        descriptor = c3348eV;
    }

    private C4284p50() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public InterfaceC4123nG[] childSerializers() {
        T5 t5 = new T5(M60.INSTANCE, 0);
        T5 t6 = new T5(C3978lf0.INSTANCE, 0);
        AD ad = AD.f2808a;
        FJ fj = FJ.f3064a;
        return new InterfaceC4123nG[]{ad, W90.f3912a, fj, t5, fj, ad, t6};
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public C4459r50 deserialize(InterfaceC2548Kl interfaceC2548Kl) {
        AbstractC2995aW.q(interfaceC2548Kl, "decoder");
        D40 descriptor2 = getDescriptor();
        InterfaceC4421qh interfaceC4421qhC = interfaceC2548Kl.c(descriptor2);
        Object objZ = null;
        String strL = null;
        long jW = 0;
        long jW2 = 0;
        boolean z = true;
        int i = 0;
        int iD = 0;
        int iD2 = 0;
        Object objZ2 = null;
        while (z) {
            int iK = interfaceC4421qhC.k(descriptor2);
            switch (iK) {
                case -1:
                    z = false;
                    break;
                case 0:
                    iD = interfaceC4421qhC.D(descriptor2, 0);
                    i |= 1;
                    break;
                case 1:
                    strL = interfaceC4421qhC.l(descriptor2, 1);
                    i |= 2;
                    break;
                case 2:
                    jW = interfaceC4421qhC.w(descriptor2, 2);
                    i |= 4;
                    break;
                case 3:
                    objZ = interfaceC4421qhC.z(descriptor2, 3, new T5(M60.INSTANCE, 0), objZ);
                    i |= 8;
                    break;
                case 4:
                    jW2 = interfaceC4421qhC.w(descriptor2, 4);
                    i |= 16;
                    break;
                case 5:
                    iD2 = interfaceC4421qhC.D(descriptor2, 5);
                    i |= 32;
                    break;
                case 6:
                    objZ2 = interfaceC4421qhC.z(descriptor2, 6, new T5(C3978lf0.INSTANCE, 0), objZ2);
                    i |= 64;
                    break;
                default:
                    throw new Vf0(iK);
            }
        }
        interfaceC4421qhC.b(descriptor2);
        return new C4459r50(i, iD, strL, jW, (List) objZ, jW2, iD2, (List) objZ2, null);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public D40 getDescriptor() {
        return descriptor;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4123nG
    public void serialize(InterfaceC3385er interfaceC3385er, C4459r50 c4459r50) {
        AbstractC2995aW.q(interfaceC3385er, "encoder");
        AbstractC2995aW.q(c4459r50, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        D40 descriptor2 = getDescriptor();
        InterfaceC4596sh interfaceC4596shC = interfaceC3385er.c(descriptor2);
        C4459r50.write$Self(c4459r50, interfaceC4596shC, descriptor2);
        interfaceC4596shC.b(descriptor2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public InterfaceC4123nG[] typeParametersSerializers() {
        return WD.h;
    }
}
