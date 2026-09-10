package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class YE implements InterfaceC4123nG {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final YE f4010a = new YE();
    public static final XE b = XE.b;

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public final Object deserialize(InterfaceC2548Kl interfaceC2548Kl) {
        AbstractC2995aW.q(interfaceC2548Kl, "decoder");
        AbstractC2871Wx.N(interfaceC2548Kl);
        return new WE((List) new T5(C4561sF.f4969a, 0).deserialize(interfaceC2548Kl));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public final D40 getDescriptor() {
        return b;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4123nG
    public final void serialize(InterfaceC3385er interfaceC3385er, Object obj) {
        WE we = (WE) obj;
        AbstractC2995aW.q(interfaceC3385er, "encoder");
        AbstractC2995aW.q(we, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        AbstractC2871Wx.O(interfaceC3385er);
        C4561sF c4561sF = C4561sF.f4969a;
        Q5 q5 = new Q5(c4561sF.getDescriptor(), 1);
        int size = we.size();
        InterfaceC4596sh interfaceC4596shZ = interfaceC3385er.z(q5, size);
        Iterator<E> it = we.iterator();
        for (int i = 0; i < size; i++) {
            interfaceC4596shZ.B(q5, i, c4561sF, it.next());
        }
        interfaceC4596shZ.b(q5);
    }
}
