package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.sF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4561sF implements InterfaceC4123nG {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4561sF f4969a = new C4561sF();
    public static final F40 b = AbstractC3375el.i("kotlinx.serialization.json.JsonElement", C3700iV.b, new D40[0], C4473rF.g);

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public final Object deserialize(InterfaceC2548Kl interfaceC2548Kl) {
        AbstractC2995aW.q(interfaceC2548Kl, "decoder");
        return AbstractC2871Wx.N(interfaceC2548Kl).g();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public final D40 getDescriptor() {
        return b;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4123nG
    public final void serialize(InterfaceC3385er interfaceC3385er, Object obj) {
        AbstractC4122nF abstractC4122nF = (AbstractC4122nF) obj;
        AbstractC2995aW.q(interfaceC3385er, "encoder");
        AbstractC2995aW.q(abstractC4122nF, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        AbstractC2871Wx.O(interfaceC3385er);
        if (abstractC4122nF instanceof IF) {
            interfaceC3385er.x(LF.f3345a, abstractC4122nF);
        } else if (abstractC4122nF instanceof FF) {
            interfaceC3385er.x(HF.f3163a, abstractC4122nF);
        } else if (abstractC4122nF instanceof WE) {
            interfaceC3385er.x(YE.f4010a, abstractC4122nF);
        }
    }
}
