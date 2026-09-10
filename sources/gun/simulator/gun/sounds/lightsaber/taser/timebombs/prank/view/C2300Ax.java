package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.Map;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ax, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2300Ax implements InterfaceC5060xx {
    public static final C2300Ax INSTANCE;
    public static final /* synthetic */ D40 descriptor;

    static {
        C2300Ax c2300Ax = new C2300Ax();
        INSTANCE = c2300Ax;
        C3348eV c3348eV = new C3348eV("com.vungle.ads.internal.network.GenericTpatRequest", c2300Ax, 4);
        c3348eV.j("method", true);
        c3348eV.j("headers", true);
        c3348eV.j(TtmlNode.TAG_BODY, true);
        c3348eV.j("attempt", true);
        descriptor = c3348eV;
    }

    private C2300Ax() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public InterfaceC4123nG[] childSerializers() {
        W90 w90 = W90.f3912a;
        return new InterfaceC4123nG[]{VA.INSTANCE, WD.u(new C4095mz(w90, w90, 1)), WD.u(w90), AD.f2808a};
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public C2352Cx deserialize(InterfaceC2548Kl interfaceC2548Kl) {
        AbstractC2995aW.q(interfaceC2548Kl, "decoder");
        D40 descriptor2 = getDescriptor();
        InterfaceC4421qh interfaceC4421qhC = interfaceC2548Kl.c(descriptor2);
        Object objZ = null;
        Object objS = null;
        Object objS2 = null;
        boolean z = true;
        int i = 0;
        int iD = 0;
        while (z) {
            int iK = interfaceC4421qhC.k(descriptor2);
            if (iK == -1) {
                z = false;
            } else if (iK == 0) {
                objZ = interfaceC4421qhC.z(descriptor2, 0, VA.INSTANCE, objZ);
                i |= 1;
            } else if (iK == 1) {
                W90 w90 = W90.f3912a;
                objS = interfaceC4421qhC.s(descriptor2, 1, new C4095mz(w90, w90, 1), objS);
                i |= 2;
            } else if (iK == 2) {
                objS2 = interfaceC4421qhC.s(descriptor2, 2, W90.f3912a, objS2);
                i |= 4;
            } else {
                if (iK != 3) {
                    throw new Vf0(iK);
                }
                iD = interfaceC4421qhC.D(descriptor2, 3);
                i |= 8;
            }
        }
        interfaceC4421qhC.b(descriptor2);
        return new C2352Cx(i, (XA) objZ, (Map) objS, (String) objS2, iD, (O40) null);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public D40 getDescriptor() {
        return descriptor;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4123nG
    public void serialize(InterfaceC3385er interfaceC3385er, C2352Cx c2352Cx) {
        AbstractC2995aW.q(interfaceC3385er, "encoder");
        AbstractC2995aW.q(c2352Cx, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        D40 descriptor2 = getDescriptor();
        InterfaceC4596sh interfaceC4596shC = interfaceC3385er.c(descriptor2);
        C2352Cx.write$Self(c2352Cx, interfaceC4596shC, descriptor2);
        interfaceC4596shC.b(descriptor2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public InterfaceC4123nG[] typeParametersSerializers() {
        return WD.h;
    }
}
