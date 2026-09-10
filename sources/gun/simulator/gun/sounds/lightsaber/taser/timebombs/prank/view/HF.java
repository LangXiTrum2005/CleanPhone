package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class HF implements InterfaceC4123nG {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HF f3163a = new HF();
    public static final GF b = GF.b;

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public final Object deserialize(InterfaceC2548Kl interfaceC2548Kl) {
        AbstractC2995aW.q(interfaceC2548Kl, "decoder");
        AbstractC2871Wx.N(interfaceC2548Kl);
        W90 w90 = W90.f3912a;
        return new FF((Map) WD.d(C4561sF.f4969a).deserialize(interfaceC2548Kl));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public final D40 getDescriptor() {
        return b;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4123nG
    public final void serialize(InterfaceC3385er interfaceC3385er, Object obj) {
        FF ff = (FF) obj;
        AbstractC2995aW.q(interfaceC3385er, "encoder");
        AbstractC2995aW.q(ff, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        AbstractC2871Wx.O(interfaceC3385er);
        W90 w90 = W90.f3912a;
        WD.d(C4561sF.f4969a).serialize(interfaceC3385er, ff);
    }
}
