package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: loaded from: classes4.dex */
public final class Bf0 implements InterfaceC4123nG {
    public static final Bf0 b = new Bf0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2476Hr f2884a = new C2476Hr();

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public final Object deserialize(InterfaceC2548Kl interfaceC2548Kl) {
        AbstractC2995aW.q(interfaceC2548Kl, "decoder");
        this.f2884a.deserialize(interfaceC2548Kl);
        return C5033xf0.f5238a;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public final D40 getDescriptor() {
        return this.f2884a.getDescriptor();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4123nG
    public final void serialize(InterfaceC3385er interfaceC3385er, Object obj) {
        C5033xf0 c5033xf0 = (C5033xf0) obj;
        AbstractC2995aW.q(interfaceC3385er, "encoder");
        AbstractC2995aW.q(c5033xf0, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.f2884a.serialize(interfaceC3385er, c5033xf0);
    }
}
