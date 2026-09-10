package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.lf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3978lf0 implements InterfaceC5060xx {
    public static final C3978lf0 INSTANCE;
    public static final /* synthetic */ D40 descriptor;

    static {
        C3978lf0 c3978lf0 = new C3978lf0();
        INSTANCE = c3978lf0;
        C3348eV c3348eV = new C3348eV("com.vungle.ads.internal.model.UnclosedAd", c3978lf0, 2);
        c3348eV.j("107", false);
        c3348eV.j(StatisticData.ERROR_CODE_IO_ERROR, true);
        descriptor = c3348eV;
    }

    private C3978lf0() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public InterfaceC4123nG[] childSerializers() {
        W90 w90 = W90.f3912a;
        return new InterfaceC4123nG[]{w90, w90};
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public C4154nf0 deserialize(InterfaceC2548Kl interfaceC2548Kl) {
        AbstractC2995aW.q(interfaceC2548Kl, "decoder");
        D40 descriptor2 = getDescriptor();
        InterfaceC4421qh interfaceC4421qhC = interfaceC2548Kl.c(descriptor2);
        O40 o40 = null;
        String strL = null;
        String strL2 = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int iK = interfaceC4421qhC.k(descriptor2);
            if (iK == -1) {
                z = false;
            } else if (iK == 0) {
                strL = interfaceC4421qhC.l(descriptor2, 0);
                i |= 1;
            } else {
                if (iK != 1) {
                    throw new Vf0(iK);
                }
                strL2 = interfaceC4421qhC.l(descriptor2, 1);
                i |= 2;
            }
        }
        interfaceC4421qhC.b(descriptor2);
        return new C4154nf0(i, strL, strL2, o40);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public D40 getDescriptor() {
        return descriptor;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4123nG
    public void serialize(InterfaceC3385er interfaceC3385er, C4154nf0 c4154nf0) {
        AbstractC2995aW.q(interfaceC3385er, "encoder");
        AbstractC2995aW.q(c4154nf0, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        D40 descriptor2 = getDescriptor();
        InterfaceC4596sh interfaceC4596shC = interfaceC3385er.c(descriptor2);
        C4154nf0.write$Self(c4154nf0, interfaceC4596shC, descriptor2);
        interfaceC4596shC.b(descriptor2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public InterfaceC4123nG[] typeParametersSerializers() {
        return WD.h;
    }
}
