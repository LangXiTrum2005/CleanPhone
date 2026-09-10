package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Cy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C2353Cy extends Y2 implements InterfaceC2714Qw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2950a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2353Cy(AbstractC4340pk0 abstractC4340pk0, int i) {
        super(0, abstractC4340pk0, C2612My.class, AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "active()Z", 8);
        this.f2950a = i;
        if (i == 1) {
            super(0, abstractC4340pk0, C4213oI.class, AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "active()Z", 8);
            return;
        }
        if (i == 2) {
            super(0, abstractC4340pk0, C5081y80.class, AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "active()Z", 8);
        } else if (i != 3) {
        } else {
            super(0, abstractC4340pk0, Gb0.class, AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "active()Z", 8);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
    public final /* bridge */ /* synthetic */ Object invoke() throws Throwable {
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        switch (this.f2950a) {
            case 0:
                m158invoke();
                break;
            case 1:
                m158invoke();
                break;
            case 2:
                m158invoke();
                break;
            default:
                m158invoke();
                break;
        }
        return c5033xf0;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m158invoke() throws Throwable {
        switch (this.f2950a) {
            case 0:
                ((C2612My) this.receiver).o();
                break;
            case 1:
                ((C4213oI) this.receiver).o();
                break;
            case 2:
                ((C5081y80) this.receiver).p();
                break;
            default:
                ((Gb0) this.receiver).o();
                break;
        }
    }
}
