package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.mi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4071mi implements InterfaceC5060xx {
    public static final C4071mi INSTANCE;
    public static final /* synthetic */ D40 descriptor;

    static {
        C4071mi c4071mi = new C4071mi();
        INSTANCE = c4071mi;
        C3348eV c3348eV = new C3348eV("com.vungle.ads.internal.model.ConfigPayload.CleverCache", c4071mi, 3);
        c3348eV.j("enabled", true);
        c3348eV.j("disk_size", true);
        c3348eV.j("disk_percentage", true);
        descriptor = c3348eV;
    }

    private C4071mi() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public InterfaceC4123nG[] childSerializers() {
        return new InterfaceC4123nG[]{WD.u(C3969lb.f4651a), WD.u(FJ.f3064a), WD.u(AD.f2808a)};
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public C4247oi deserialize(InterfaceC2548Kl interfaceC2548Kl) {
        AbstractC2995aW.q(interfaceC2548Kl, "decoder");
        D40 descriptor2 = getDescriptor();
        InterfaceC4421qh interfaceC4421qhC = interfaceC2548Kl.c(descriptor2);
        Object objS = null;
        Object objS2 = null;
        Object objS3 = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int iK = interfaceC4421qhC.k(descriptor2);
            if (iK == -1) {
                z = false;
            } else if (iK == 0) {
                objS = interfaceC4421qhC.s(descriptor2, 0, C3969lb.f4651a, objS);
                i |= 1;
            } else if (iK == 1) {
                objS2 = interfaceC4421qhC.s(descriptor2, 1, FJ.f3064a, objS2);
                i |= 2;
            } else {
                if (iK != 2) {
                    throw new Vf0(iK);
                }
                objS3 = interfaceC4421qhC.s(descriptor2, 2, AD.f2808a, objS3);
                i |= 4;
            }
        }
        interfaceC4421qhC.b(descriptor2);
        return new C4247oi(i, (Boolean) objS, (Long) objS2, (Integer) objS3, (O40) null);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public D40 getDescriptor() {
        return descriptor;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4123nG
    public void serialize(InterfaceC3385er interfaceC3385er, C4247oi c4247oi) {
        AbstractC2995aW.q(interfaceC3385er, "encoder");
        AbstractC2995aW.q(c4247oi, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        D40 descriptor2 = getDescriptor();
        InterfaceC4596sh interfaceC4596shC = interfaceC3385er.c(descriptor2);
        C4247oi.write$Self(c4247oi, interfaceC4596shC, descriptor2);
        interfaceC4596shC.b(descriptor2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public InterfaceC4123nG[] typeParametersSerializers() {
        return WD.h;
    }
}
