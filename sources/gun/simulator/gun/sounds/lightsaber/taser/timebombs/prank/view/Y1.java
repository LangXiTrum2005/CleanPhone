package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class Y1 implements InterfaceC5060xx {
    public static final Y1 INSTANCE;
    public static final /* synthetic */ D40 descriptor;

    static {
        Y1 y1 = new Y1();
        INSTANCE = y1;
        C3348eV c3348eV = new C3348eV("com.vungle.ads.internal.model.AdPayload", y1, 5);
        c3348eV.j(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, true);
        c3348eV.j("config", true);
        c3348eV.j("mraidFiles", true);
        c3348eV.j("incentivizedTextSettings", true);
        c3348eV.j("assetsFullyDownloaded", true);
        descriptor = c3348eV;
    }

    private Y1() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public InterfaceC4123nG[] childSerializers() {
        InterfaceC4123nG interfaceC4123nGU = WD.u(new T5(C3749j2.INSTANCE, 0));
        InterfaceC4123nG interfaceC4123nGU2 = WD.u(C3720ii.INSTANCE);
        C3186cf c3186cfA = AbstractC3263dY.a(ConcurrentHashMap.class);
        W90 w90 = W90.f3912a;
        return new InterfaceC4123nG[]{interfaceC4123nGU, interfaceC4123nGU2, new C2831Vj(c3186cfA, new InterfaceC4123nG[]{w90, w90}), new C4095mz(w90, w90, 1), C3969lb.f4651a};
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public C4980x2 deserialize(InterfaceC2548Kl interfaceC2548Kl) {
        AbstractC2995aW.q(interfaceC2548Kl, "decoder");
        D40 descriptor2 = getDescriptor();
        InterfaceC4421qh interfaceC4421qhC = interfaceC2548Kl.c(descriptor2);
        Object objS = null;
        Object objS2 = null;
        Object objZ = null;
        Object objZ2 = null;
        boolean z = true;
        int i = 0;
        boolean zA = false;
        while (z) {
            int iK = interfaceC4421qhC.k(descriptor2);
            if (iK == -1) {
                z = false;
            } else if (iK == 0) {
                objS = interfaceC4421qhC.s(descriptor2, 0, new T5(C3749j2.INSTANCE, 0), objS);
                i |= 1;
            } else if (iK == 1) {
                objS2 = interfaceC4421qhC.s(descriptor2, 1, C3720ii.INSTANCE, objS2);
                i |= 2;
            } else if (iK == 2) {
                C3186cf c3186cfA = AbstractC3263dY.a(ConcurrentHashMap.class);
                W90 w90 = W90.f3912a;
                objZ = interfaceC4421qhC.z(descriptor2, 2, new C2831Vj(c3186cfA, new InterfaceC4123nG[]{w90, w90}), objZ);
                i |= 4;
            } else if (iK == 3) {
                W90 w91 = W90.f3912a;
                objZ2 = interfaceC4421qhC.z(descriptor2, 3, new C4095mz(w91, w91, 1), objZ2);
                i |= 8;
            } else {
                if (iK != 4) {
                    throw new Vf0(iK);
                }
                zA = interfaceC4421qhC.A(descriptor2, 4);
                i |= 16;
            }
        }
        interfaceC4421qhC.b(descriptor2);
        return new C4980x2(i, (List) objS, (C2622Ni) objS2, (ConcurrentHashMap) objZ, (Map) objZ2, zA, null);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public D40 getDescriptor() {
        return descriptor;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4123nG
    public void serialize(InterfaceC3385er interfaceC3385er, C4980x2 c4980x2) {
        AbstractC2995aW.q(interfaceC3385er, "encoder");
        AbstractC2995aW.q(c4980x2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        D40 descriptor2 = getDescriptor();
        InterfaceC4596sh interfaceC4596shC = interfaceC3385er.c(descriptor2);
        C4980x2.write$Self(c4980x2, interfaceC4596shC, descriptor2);
        interfaceC4596shC.b(descriptor2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public InterfaceC4123nG[] typeParametersSerializers() {
        return WD.h;
    }
}
