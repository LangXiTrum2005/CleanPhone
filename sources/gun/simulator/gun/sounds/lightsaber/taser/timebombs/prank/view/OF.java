package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: loaded from: classes4.dex */
public abstract class OF implements InterfaceC4123nG {
    private final InterfaceC4123nG tSerializer;

    public OF(C4095mz c4095mz) {
        this.tSerializer = c4095mz;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public final Object deserialize(InterfaceC2548Kl interfaceC2548Kl) {
        InterfaceC3858kF jf;
        AbstractC2995aW.q(interfaceC2548Kl, "decoder");
        InterfaceC3858kF interfaceC3858kFN = AbstractC2871Wx.N(interfaceC2548Kl);
        AbstractC4122nF abstractC4122nFG = interfaceC3858kFN.g();
        VE veD = interfaceC3858kFN.d();
        InterfaceC4123nG interfaceC4123nG = this.tSerializer;
        AbstractC4122nF abstractC4122nFTransformDeserialize = transformDeserialize(abstractC4122nFG);
        veD.getClass();
        AbstractC2995aW.q(interfaceC4123nG, "deserializer");
        AbstractC2995aW.q(abstractC4122nFTransformDeserialize, "element");
        if (abstractC4122nFTransformDeserialize instanceof FF) {
            jf = new PF(veD, (FF) abstractC4122nFTransformDeserialize, null, null);
        } else if (abstractC4122nFTransformDeserialize instanceof WE) {
            jf = new QF(veD, (WE) abstractC4122nFTransformDeserialize);
        } else {
            if (!(abstractC4122nFTransformDeserialize instanceof C5001xF) && !AbstractC2995aW.i(abstractC4122nFTransformDeserialize, DF.f2962a)) {
                throw new C3770jF(7, 0);
            }
            jf = new JF(veD, (IF) abstractC4122nFTransformDeserialize);
        }
        return AbstractC4496rb.m(jf, interfaceC4123nG);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public D40 getDescriptor() {
        return this.tSerializer.getDescriptor();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4123nG
    public final void serialize(InterfaceC3385er interfaceC3385er, Object obj) {
        AbstractC2995aW.q(interfaceC3385er, "encoder");
        AbstractC2995aW.q(obj, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        InterfaceC4825vF interfaceC4825vFO = AbstractC2871Wx.O(interfaceC3385er);
        VE veD = interfaceC4825vFO.d();
        InterfaceC4123nG interfaceC4123nG = this.tSerializer;
        AbstractC2995aW.q(veD, "<this>");
        AbstractC2995aW.q(interfaceC4123nG, "serializer");
        C3086bY c3086bY = new C3086bY();
        new KF(veD, new C4140nX(c3086bY, 19), 1).x(interfaceC4123nG, obj);
        Object obj2 = c3086bY.f4172a;
        if (obj2 != null) {
            interfaceC4825vFO.p(transformSerialize((AbstractC4122nF) obj2));
        } else {
            AbstractC2995aW.x0("result");
            throw null;
        }
    }

    public abstract AbstractC4122nF transformDeserialize(AbstractC4122nF abstractC4122nF);

    public AbstractC4122nF transformSerialize(AbstractC4122nF abstractC4122nF) {
        AbstractC2995aW.q(abstractC4122nF, "element");
        return abstractC4122nF;
    }
}
