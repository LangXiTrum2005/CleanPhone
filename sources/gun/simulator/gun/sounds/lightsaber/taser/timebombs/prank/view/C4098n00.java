package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.n00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4098n00 implements InterfaceC5060xx {
    public static final C4098n00 INSTANCE;
    public static final /* synthetic */ D40 descriptor;

    static {
        C4098n00 c4098n00 = new C4098n00();
        INSTANCE = c4098n00;
        C3348eV c3348eV = new C3348eV("com.vungle.ads.internal.model.RtbRequest", c4098n00, 1);
        c3348eV.j("sdk_user_agent", true);
        descriptor = c3348eV;
    }

    private C4098n00() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public InterfaceC4123nG[] childSerializers() {
        return new InterfaceC4123nG[]{WD.u(W90.f3912a)};
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public C4274p00 deserialize(InterfaceC2548Kl interfaceC2548Kl) {
        AbstractC2995aW.q(interfaceC2548Kl, "decoder");
        D40 descriptor2 = getDescriptor();
        InterfaceC4421qh interfaceC4421qhC = interfaceC2548Kl.c(descriptor2);
        O40 o40 = null;
        Object objS = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int iK = interfaceC4421qhC.k(descriptor2);
            if (iK == -1) {
                z = false;
            } else {
                if (iK != 0) {
                    throw new Vf0(iK);
                }
                objS = interfaceC4421qhC.s(descriptor2, 0, W90.f3912a, objS);
                i = 1;
            }
        }
        interfaceC4421qhC.b(descriptor2);
        return new C4274p00(i, (String) objS, o40);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public D40 getDescriptor() {
        return descriptor;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4123nG
    public void serialize(InterfaceC3385er interfaceC3385er, C4274p00 c4274p00) {
        AbstractC2995aW.q(interfaceC3385er, "encoder");
        AbstractC2995aW.q(c4274p00, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        D40 descriptor2 = getDescriptor();
        InterfaceC4596sh interfaceC4596shC = interfaceC3385er.c(descriptor2);
        C4274p00.write$Self(c4274p00, interfaceC4596shC, descriptor2);
        interfaceC4596shC.b(descriptor2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public InterfaceC4123nG[] typeParametersSerializers() {
        return WD.h;
    }
}
