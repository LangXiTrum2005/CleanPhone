package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.vg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4858vg implements InterfaceC5060xx {
    public static final C4858vg INSTANCE;
    public static final /* synthetic */ D40 descriptor;

    static {
        C4858vg c4858vg = new C4858vg();
        INSTANCE = c4858vg;
        C3348eV c3348eV = new C3348eV("com.vungle.ads.internal.model.CommonRequestBody.GDPR", c4858vg, 4);
        c3348eV.j("consent_status", false);
        c3348eV.j("consent_source", false);
        c3348eV.j("consent_timestamp", false);
        c3348eV.j("consent_message_version", false);
        descriptor = c3348eV;
    }

    private C4858vg() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public InterfaceC4123nG[] childSerializers() {
        W90 w90 = W90.f3912a;
        return new InterfaceC4123nG[]{w90, w90, FJ.f3064a, w90};
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public C5034xg deserialize(InterfaceC2548Kl interfaceC2548Kl) {
        AbstractC2995aW.q(interfaceC2548Kl, "decoder");
        D40 descriptor2 = getDescriptor();
        InterfaceC4421qh interfaceC4421qhC = interfaceC2548Kl.c(descriptor2);
        String strL = null;
        String strL2 = null;
        String strL3 = null;
        long jW = 0;
        boolean z = true;
        int i = 0;
        while (z) {
            int iK = interfaceC4421qhC.k(descriptor2);
            if (iK == -1) {
                z = false;
            } else if (iK == 0) {
                strL = interfaceC4421qhC.l(descriptor2, 0);
                i |= 1;
            } else if (iK == 1) {
                strL2 = interfaceC4421qhC.l(descriptor2, 1);
                i |= 2;
            } else if (iK == 2) {
                jW = interfaceC4421qhC.w(descriptor2, 2);
                i |= 4;
            } else {
                if (iK != 3) {
                    throw new Vf0(iK);
                }
                strL3 = interfaceC4421qhC.l(descriptor2, 3);
                i |= 8;
            }
        }
        interfaceC4421qhC.b(descriptor2);
        return new C5034xg(i, strL, strL2, jW, strL3, null);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public D40 getDescriptor() {
        return descriptor;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4123nG
    public void serialize(InterfaceC3385er interfaceC3385er, C5034xg c5034xg) {
        AbstractC2995aW.q(interfaceC3385er, "encoder");
        AbstractC2995aW.q(c5034xg, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        D40 descriptor2 = getDescriptor();
        InterfaceC4596sh interfaceC4596shC = interfaceC3385er.c(descriptor2);
        C5034xg.write$Self(c5034xg, interfaceC4596shC, descriptor2);
        interfaceC4596shC.b(descriptor2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public InterfaceC4123nG[] typeParametersSerializers() {
        return WD.h;
    }
}
