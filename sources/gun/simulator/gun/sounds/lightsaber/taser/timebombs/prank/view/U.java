package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class U implements InterfaceC4123nG {
    public final InterfaceC2369Do a(InterfaceC4421qh interfaceC4421qh, String str) {
        AbstractC2995aW.q(interfaceC4421qh, "decoder");
        M40 m40A = interfaceC4421qh.a();
        m40A.getClass();
        InterfaceC3156cG interfaceC3156cG = ((C3874kV) this).f4600a;
        AbstractC2995aW.q(interfaceC3156cG, "baseClass");
        Map map = (Map) m40A.d.get(interfaceC3156cG);
        InterfaceC4123nG interfaceC4123nG = map != null ? (InterfaceC4123nG) map.get(str) : null;
        if (!(interfaceC4123nG instanceof InterfaceC4123nG)) {
            interfaceC4123nG = null;
        }
        if (interfaceC4123nG != null) {
            return interfaceC4123nG;
        }
        Object obj = m40A.e.get(interfaceC3156cG);
        InterfaceC2766Sw interfaceC2766Sw = WD.z(1, obj) ? (InterfaceC2766Sw) obj : null;
        return interfaceC2766Sw != null ? (InterfaceC2369Do) interfaceC2766Sw.invoke(str) : null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public final Object deserialize(InterfaceC2548Kl interfaceC2548Kl) {
        AbstractC2995aW.q(interfaceC2548Kl, "decoder");
        C3874kV c3874kV = (C3874kV) this;
        D40 descriptor = c3874kV.getDescriptor();
        InterfaceC4421qh interfaceC4421qhC = interfaceC2548Kl.c(descriptor);
        Object objZ = null;
        String strL = null;
        while (true) {
            int iK = interfaceC4421qhC.k(c3874kV.getDescriptor());
            if (iK == -1) {
                if (objZ == null) {
                    throw new IllegalArgumentException(AbstractC3888ke0.i("Polymorphic value has not been read for class ", strL).toString());
                }
                interfaceC4421qhC.b(descriptor);
                return objZ;
            }
            if (iK == 0) {
                strL = interfaceC4421qhC.l(c3874kV.getDescriptor(), iK);
            } else {
                if (iK != 1) {
                    StringBuilder sb = new StringBuilder("Invalid index in polymorphic deserialization of ");
                    if (strL == null) {
                        strL = "unknown class";
                    }
                    sb.append(strL);
                    sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                    sb.append(iK);
                    throw new P40(sb.toString());
                }
                if (strL == null) {
                    throw new IllegalArgumentException("Cannot read polymorphic value before its type token".toString());
                }
                InterfaceC2369Do interfaceC2369DoA = a(interfaceC4421qhC, strL);
                if (interfaceC2369DoA == null) {
                    AbstractC2871Wx.t0(strL, c3874kV.f4600a);
                    throw null;
                }
                objZ = interfaceC4421qhC.z(c3874kV.getDescriptor(), iK, interfaceC2369DoA, null);
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4123nG
    public final void serialize(InterfaceC3385er interfaceC3385er, Object obj) {
        AbstractC2995aW.q(interfaceC3385er, "encoder");
        AbstractC2995aW.q(obj, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        InterfaceC4123nG interfaceC4123nGR = WD.r(this, interfaceC3385er, obj);
        C3874kV c3874kV = (C3874kV) this;
        D40 descriptor = c3874kV.getDescriptor();
        InterfaceC4596sh interfaceC4596shC = interfaceC3385er.c(descriptor);
        interfaceC4596shC.o(0, interfaceC4123nGR.getDescriptor().h(), c3874kV.getDescriptor());
        interfaceC4596shC.B(c3874kV.getDescriptor(), 1, interfaceC4123nGR, obj);
        interfaceC4596shC.b(descriptor);
    }
}
