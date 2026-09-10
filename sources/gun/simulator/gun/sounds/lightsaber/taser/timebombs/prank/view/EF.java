package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: loaded from: classes4.dex */
public final class EF implements InterfaceC4123nG {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EF f3016a = new EF();
    public static final F40 b = AbstractC3375el.i("kotlinx.serialization.json.JsonNull", K40.f3299a, new D40[0], I40.f);

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public final Object deserialize(InterfaceC2548Kl interfaceC2548Kl) {
        AbstractC2995aW.q(interfaceC2548Kl, "decoder");
        AbstractC2871Wx.N(interfaceC2548Kl);
        if (interfaceC2548Kl.C()) {
            throw new C4034mF("Expected 'null' literal", 0);
        }
        return DF.f2962a;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public final D40 getDescriptor() {
        return b;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4123nG
    public final void serialize(InterfaceC3385er interfaceC3385er, Object obj) {
        AbstractC2995aW.q(interfaceC3385er, "encoder");
        AbstractC2995aW.q((DF) obj, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        AbstractC2871Wx.O(interfaceC3385er);
        interfaceC3385er.t();
    }
}
