package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: loaded from: classes4.dex */
public final class LF implements InterfaceC4123nG {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LF f3345a = new LF();
    public static final F40 b = AbstractC3375el.i("kotlinx.serialization.json.JsonPrimitive", CV.i, new D40[0], I40.f);

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public final Object deserialize(InterfaceC2548Kl interfaceC2548Kl) {
        AbstractC2995aW.q(interfaceC2548Kl, "decoder");
        AbstractC4122nF abstractC4122nFG = AbstractC2871Wx.N(interfaceC2548Kl).g();
        if (abstractC4122nFG instanceof IF) {
            return (IF) abstractC4122nFG;
        }
        throw AbstractC2871Wx.J(-1, abstractC4122nFG.toString(), "Unexpected JSON element, expected JsonPrimitive, had " + AbstractC3263dY.a(abstractC4122nFG.getClass()));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public final D40 getDescriptor() {
        return b;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4123nG
    public final void serialize(InterfaceC3385er interfaceC3385er, Object obj) {
        IF r3 = (IF) obj;
        AbstractC2995aW.q(interfaceC3385er, "encoder");
        AbstractC2995aW.q(r3, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        AbstractC2871Wx.O(interfaceC3385er);
        if (r3 instanceof DF) {
            interfaceC3385er.x(EF.f3016a, DF.f2962a);
        } else {
            interfaceC3385er.x(C5089yF.f5268a, (C5001xF) r3);
        }
    }
}
