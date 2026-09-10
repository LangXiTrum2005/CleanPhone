package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Arrays;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Hr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2476Hr implements InterfaceC4123nG {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3188a;
    public final InterfaceC3069bH b;
    public final Object c;
    public final C2812Uq d;

    public C2476Hr() {
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        this.f3188a = 1;
        this.c = c5033xf0;
        this.d = C2812Uq.f3846a;
        this.b = AbstractC2340Cl.H(EnumC4124nH.b, new C4691tk0(3, "kotlin.Unit", this));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public final Object deserialize(InterfaceC2548Kl interfaceC2548Kl) {
        int i = this.f3188a;
        Object obj = this.c;
        switch (i) {
            case 0:
                AbstractC2995aW.q(interfaceC2548Kl, "decoder");
                int iB = interfaceC2548Kl.B(getDescriptor());
                if (iB >= 0) {
                    Enum[] enumArr = (Enum[]) obj;
                    if (iB < enumArr.length) {
                        return enumArr[iB];
                    }
                }
                throw new P40(iB + " is not among valid " + getDescriptor().h() + " enum values, values size is " + ((Enum[]) obj).length);
            default:
                AbstractC2995aW.q(interfaceC2548Kl, "decoder");
                D40 descriptor = getDescriptor();
                InterfaceC4421qh interfaceC4421qhC = interfaceC2548Kl.c(descriptor);
                int iK = interfaceC4421qhC.k(getDescriptor());
                if (iK != -1) {
                    throw new P40(AbstractC3950lJ.p("Unexpected index ", iK));
                }
                interfaceC4421qhC.b(descriptor);
                return obj;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public final D40 getDescriptor() {
        InterfaceC3069bH interfaceC3069bH = this.b;
        switch (this.f3188a) {
            case 0:
                break;
        }
        return (D40) interfaceC3069bH.getValue();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4123nG
    public final void serialize(InterfaceC3385er interfaceC3385er, Object obj) {
        switch (this.f3188a) {
            case 0:
                Enum r5 = (Enum) obj;
                AbstractC2995aW.q(interfaceC3385er, "encoder");
                AbstractC2995aW.q(r5, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                Enum[] enumArr = (Enum[]) this.c;
                int iS0 = U5.s0(r5, enumArr);
                if (iS0 != -1) {
                    interfaceC3385er.m(getDescriptor(), iS0);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(r5);
                sb.append(" is not a valid enum ");
                sb.append(getDescriptor().h());
                sb.append(", must be one of ");
                String string = Arrays.toString(enumArr);
                AbstractC2995aW.p(string, "toString(this)");
                sb.append(string);
                throw new P40(sb.toString());
            default:
                AbstractC2995aW.q(interfaceC3385er, "encoder");
                AbstractC2995aW.q(obj, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                interfaceC3385er.c(getDescriptor()).b(getDescriptor());
                return;
        }
    }

    public final String toString() {
        switch (this.f3188a) {
            case 0:
                return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().h() + '>';
            default:
                return super.toString();
        }
    }

    public C2476Hr(String str, Enum[] enumArr) {
        this.f3188a = 0;
        this.c = enumArr;
        this.b = AbstractC2340Cl.I(new C4691tk0(2, this, str));
    }
}
