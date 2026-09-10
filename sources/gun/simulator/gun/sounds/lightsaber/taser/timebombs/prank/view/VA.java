package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: loaded from: classes4.dex */
public final class VA implements InterfaceC5060xx {
    public static final VA INSTANCE = new VA();
    public static final /* synthetic */ D40 descriptor;

    static {
        C2450Gr c2450Gr = new C2450Gr("com.vungle.ads.internal.network.HttpMethod", 2);
        c2450Gr.j("GET", false);
        c2450Gr.j("POST", false);
        descriptor = c2450Gr;
    }

    private VA() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public InterfaceC4123nG[] childSerializers() {
        return new InterfaceC4123nG[0];
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public XA deserialize(InterfaceC2548Kl interfaceC2548Kl) {
        AbstractC2995aW.q(interfaceC2548Kl, "decoder");
        return XA.values()[interfaceC2548Kl.B(getDescriptor())];
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public D40 getDescriptor() {
        return descriptor;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4123nG
    public void serialize(InterfaceC3385er interfaceC3385er, XA xa) {
        AbstractC2995aW.q(interfaceC3385er, "encoder");
        AbstractC2995aW.q(xa, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        interfaceC3385er.m(getDescriptor(), xa.ordinal());
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public InterfaceC4123nG[] typeParametersSerializers() {
        return WD.h;
    }
}
