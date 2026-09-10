package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.eM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3339eM extends WG implements InterfaceC2766Sw {
    public final /* synthetic */ int f;
    public final /* synthetic */ InterfaceC4123nG g;
    public final /* synthetic */ InterfaceC4123nG h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3339eM(InterfaceC4123nG interfaceC4123nG, InterfaceC4123nG interfaceC4123nG2, int i) {
        super(1);
        this.f = i;
        this.g = interfaceC4123nG;
        this.h = interfaceC4123nG2;
    }

    public final void a(C3275df c3275df) {
        int i = this.f;
        InterfaceC4123nG interfaceC4123nG = this.h;
        InterfaceC4123nG interfaceC4123nG2 = this.g;
        switch (i) {
            case 0:
                AbstractC2995aW.q(c3275df, "$this$buildSerialDescriptor");
                C3275df.a(c3275df, "key", interfaceC4123nG2.getDescriptor());
                C3275df.a(c3275df, AppMeasurementSdk.ConditionalUserProperty.VALUE, interfaceC4123nG.getDescriptor());
                break;
            default:
                AbstractC2995aW.q(c3275df, "$this$buildClassSerialDescriptor");
                C3275df.a(c3275df, "first", interfaceC4123nG2.getDescriptor());
                C3275df.a(c3275df, "second", interfaceC4123nG.getDescriptor());
                break;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        switch (this.f) {
            case 0:
                a((C3275df) obj);
                break;
            default:
                a((C3275df) obj);
                break;
        }
        return c5033xf0;
    }
}
