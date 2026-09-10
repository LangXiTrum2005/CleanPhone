package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Iterator;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.yF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5089yF implements InterfaceC4123nG {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C5089yF f5268a = new C5089yF();
    public static final FV b;

    static {
        CV cv = CV.i;
        if (!(!AbstractC3089ba0.v0("kotlinx.serialization.json.JsonLiteral"))) {
            throw new IllegalArgumentException("Blank serial names are prohibited".toString());
        }
        Iterator it = GV.f3125a.keySet().iterator();
        while (it.hasNext()) {
            String strB = ((C3186cf) ((InterfaceC3156cG) it.next())).b();
            AbstractC2995aW.n(strB);
            String strA = GV.a(strB);
            if (AbstractC3089ba0.o0("kotlinx.serialization.json.JsonLiteral", "kotlin." + strA) || AbstractC3089ba0.o0("kotlinx.serialization.json.JsonLiteral", strA)) {
                throw new IllegalArgumentException(AbstractC3375el.d0("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name kotlinx.serialization.json.JsonLiteral there already exist " + GV.a(strA) + "Serializer.\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
        b = new FV("kotlinx.serialization.json.JsonLiteral", cv);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public final Object deserialize(InterfaceC2548Kl interfaceC2548Kl) {
        AbstractC2995aW.q(interfaceC2548Kl, "decoder");
        AbstractC4122nF abstractC4122nFG = AbstractC2871Wx.N(interfaceC2548Kl).g();
        if (abstractC4122nFG instanceof C5001xF) {
            return (C5001xF) abstractC4122nFG;
        }
        throw AbstractC2871Wx.J(-1, abstractC4122nFG.toString(), "Unexpected JSON element, expected JsonLiteral, had " + AbstractC3263dY.a(abstractC4122nFG.getClass()));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public final D40 getDescriptor() {
        return b;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4123nG
    public final void serialize(InterfaceC3385er interfaceC3385er, Object obj) {
        C5001xF c5001xF = (C5001xF) obj;
        AbstractC2995aW.q(interfaceC3385er, "encoder");
        AbstractC2995aW.q(c5001xF, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        AbstractC2871Wx.O(interfaceC3385er);
        boolean z = c5001xF.f5213a;
        String str = c5001xF.b;
        if (z) {
            interfaceC3385er.F(str);
            return;
        }
        Long lJ0 = Z90.j0(str);
        if (lJ0 != null) {
            interfaceC3385er.s(lJ0.longValue());
            return;
        }
        We0 we0C0 = AbstractC2995aW.C0(str);
        if (we0C0 != null) {
            interfaceC3385er.i(C3010af0.b).s(we0C0.f3931a);
            return;
        }
        AbstractC2995aW.q(str, "<this>");
        Double dValueOf = null;
        try {
            C3439fY c3439fY = AbstractC4104n30.f4726a;
            c3439fY.getClass();
            if (c3439fY.f4369a.matcher(str).matches()) {
                dValueOf = Double.valueOf(Double.parseDouble(str));
            }
        } catch (NumberFormatException unused) {
        }
        if (dValueOf != null) {
            interfaceC3385er.e(dValueOf.doubleValue());
            return;
        }
        Boolean boolP = AbstractC4496rb.p(c5001xF);
        if (boolP != null) {
            interfaceC3385er.w(boolP.booleanValue());
        } else {
            interfaceC3385er.F(str);
        }
    }
}
