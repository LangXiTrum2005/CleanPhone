package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Vj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2831Vj implements InterfaceC4123nG {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3888a;
    public final InterfaceC4123nG b;
    public final D40 c;
    public final Object d;
    public final Object e;

    public C2831Vj(C3186cf c3186cf, InterfaceC4123nG[] interfaceC4123nGArr) {
        this.f3888a = 0;
        this.d = c3186cf;
        this.b = null;
        this.e = U5.h0(interfaceC4123nGArr);
        this.c = new C2779Tj(AbstractC3375el.i("kotlinx.serialization.ContextualSerializer", J40.f3253a, new D40[0], new C4140nX(this, 12)), c3186cf);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public final Object deserialize(InterfaceC2548Kl interfaceC2548Kl) {
        InterfaceC4123nG interfaceC4123nG = this.b;
        Object obj = this.d;
        Object obj2 = this.e;
        switch (this.f3888a) {
            case 0:
                AbstractC2995aW.q(interfaceC2548Kl, "decoder");
                InterfaceC3156cG interfaceC3156cG = (InterfaceC3156cG) obj;
                interfaceC2548Kl.a().a(interfaceC3156cG, (List) obj2);
                if (interfaceC4123nG != null) {
                    return interfaceC2548Kl.j(interfaceC4123nG);
                }
                AbstractC2871Wx.q0(interfaceC3156cG);
                throw null;
            default:
                AbstractC2995aW.q(interfaceC2548Kl, "decoder");
                D40 d40 = this.c;
                InterfaceC4421qh interfaceC4421qhC = interfaceC2548Kl.c(d40);
                Object objZ = AbstractC5119ye0.f5287a;
                Object objZ2 = objZ;
                Object objZ3 = objZ2;
                while (true) {
                    int iK = interfaceC4421qhC.k(d40);
                    if (iK == -1) {
                        interfaceC4421qhC.b(d40);
                        Object obj3 = AbstractC5119ye0.f5287a;
                        if (objZ == obj3) {
                            throw new P40("Element 'first' is missing");
                        }
                        if (objZ2 == obj3) {
                            throw new P40("Element 'second' is missing");
                        }
                        if (objZ3 != obj3) {
                            return new C3538ge0(objZ, objZ2, objZ3);
                        }
                        throw new P40("Element 'third' is missing");
                    }
                    if (iK == 0) {
                        objZ = interfaceC4421qhC.z(d40, 0, interfaceC4123nG, null);
                    } else if (iK == 1) {
                        objZ2 = interfaceC4421qhC.z(d40, 1, (InterfaceC4123nG) obj, null);
                    } else {
                        if (iK != 2) {
                            throw new P40(AbstractC3950lJ.p("Unexpected index ", iK));
                        }
                        objZ3 = interfaceC4421qhC.z(d40, 2, (InterfaceC4123nG) obj2, null);
                    }
                }
                break;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public final D40 getDescriptor() {
        return this.c;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4123nG
    public final void serialize(InterfaceC3385er interfaceC3385er, Object obj) {
        Object obj2 = this.e;
        Object obj3 = this.d;
        InterfaceC4123nG interfaceC4123nG = this.b;
        switch (this.f3888a) {
            case 0:
                AbstractC2995aW.q(interfaceC3385er, "encoder");
                AbstractC2995aW.q(obj, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                InterfaceC3156cG interfaceC3156cG = (InterfaceC3156cG) obj3;
                interfaceC3385er.a().a(interfaceC3156cG, (List) obj2);
                if (interfaceC4123nG != null) {
                    interfaceC3385er.x(interfaceC4123nG, obj);
                    return;
                } else {
                    AbstractC2871Wx.q0(interfaceC3156cG);
                    throw null;
                }
            default:
                C3538ge0 c3538ge0 = (C3538ge0) obj;
                AbstractC2995aW.q(interfaceC3385er, "encoder");
                AbstractC2995aW.q(c3538ge0, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                D40 d40 = this.c;
                InterfaceC4596sh interfaceC4596shC = interfaceC3385er.c(d40);
                interfaceC4596shC.B(d40, 0, interfaceC4123nG, c3538ge0.f4424a);
                interfaceC4596shC.B(d40, 1, (InterfaceC4123nG) obj3, c3538ge0.b);
                interfaceC4596shC.B(d40, 2, (InterfaceC4123nG) obj2, c3538ge0.c);
                interfaceC4596shC.b(d40);
                return;
        }
    }

    public C2831Vj(InterfaceC4123nG interfaceC4123nG, InterfaceC4123nG interfaceC4123nG2, InterfaceC4123nG interfaceC4123nG3) {
        this.f3888a = 1;
        this.b = interfaceC4123nG;
        this.d = interfaceC4123nG2;
        this.e = interfaceC4123nG3;
        this.c = AbstractC3375el.h("kotlin.Triple", new D40[0], new C4140nX(this, 17));
    }
}
