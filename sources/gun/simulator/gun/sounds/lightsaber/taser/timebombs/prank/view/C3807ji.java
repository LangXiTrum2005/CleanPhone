package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ji, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3807ji implements InterfaceC5060xx {
    public static final C3807ji INSTANCE;
    public static final /* synthetic */ D40 descriptor;

    static {
        C3807ji c3807ji = new C3807ji();
        INSTANCE = c3807ji;
        C3348eV c3348eV = new C3348eV("com.vungle.ads.internal.model.ConfigPayload.AutoRedirect", c3807ji, 2);
        c3348eV.j("allow_auto_redirect", true);
        c3348eV.j("after_click_ms", true);
        descriptor = c3348eV;
    }

    private C3807ji() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public InterfaceC4123nG[] childSerializers() {
        return new InterfaceC4123nG[]{WD.u(C3969lb.f4651a), WD.u(FJ.f3064a)};
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public C3983li deserialize(InterfaceC2548Kl interfaceC2548Kl) {
        AbstractC2995aW.q(interfaceC2548Kl, "decoder");
        D40 descriptor2 = getDescriptor();
        InterfaceC4421qh interfaceC4421qhC = interfaceC2548Kl.c(descriptor2);
        O40 o40 = null;
        Object objS = null;
        Object objS2 = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int iK = interfaceC4421qhC.k(descriptor2);
            if (iK == -1) {
                z = false;
            } else if (iK == 0) {
                objS = interfaceC4421qhC.s(descriptor2, 0, C3969lb.f4651a, objS);
                i |= 1;
            } else {
                if (iK != 1) {
                    throw new Vf0(iK);
                }
                objS2 = interfaceC4421qhC.s(descriptor2, 1, FJ.f3064a, objS2);
                i |= 2;
            }
        }
        interfaceC4421qhC.b(descriptor2);
        return new C3983li(i, (Boolean) objS, (Long) objS2, o40);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public D40 getDescriptor() {
        return descriptor;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4123nG
    public void serialize(InterfaceC3385er interfaceC3385er, C3983li c3983li) {
        AbstractC2995aW.q(interfaceC3385er, "encoder");
        AbstractC2995aW.q(c3983li, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        D40 descriptor2 = getDescriptor();
        InterfaceC4596sh interfaceC4596shC = interfaceC3385er.c(descriptor2);
        C3983li.write$Self(c3983li, interfaceC4596shC, descriptor2);
        interfaceC4596shC.b(descriptor2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public InterfaceC4123nG[] typeParametersSerializers() {
        return WD.h;
    }
}
