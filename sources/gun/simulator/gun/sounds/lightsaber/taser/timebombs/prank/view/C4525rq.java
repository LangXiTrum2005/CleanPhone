package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.rq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4525rq implements InterfaceC4123nG {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4525rq f4949a = new C4525rq();
    public static final FV b = new FV("kotlin.time.Duration", CV.i);

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public final Object deserialize(InterfaceC2548Kl interfaceC2548Kl) {
        AbstractC2995aW.q(interfaceC2548Kl, "decoder");
        int i = C4350pq.d;
        String strY = interfaceC2548Kl.y();
        AbstractC2995aW.q(strY, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        try {
            return new C4350pq(AbstractC2340Cl.g(strY));
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(DM.B("Invalid ISO duration string format: '", strY, "'."), e);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public final D40 getDescriptor() {
        return b;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4123nG
    public final void serialize(InterfaceC3385er interfaceC3385er, Object obj) {
        long j = ((C4350pq) obj).f4853a;
        AbstractC2995aW.q(interfaceC3385er, "encoder");
        int i = C4350pq.d;
        StringBuilder sb = new StringBuilder();
        if (j < 0) {
            sb.append('-');
        }
        sb.append("PT");
        long jI = j < 0 ? C4350pq.i(j) : j;
        long jH = C4350pq.h(jI, EnumC4613sq.HOURS);
        boolean z = false;
        int iH = C4350pq.e(jI) ? 0 : (int) (C4350pq.h(jI, EnumC4613sq.MINUTES) % ((long) 60));
        int iH2 = C4350pq.e(jI) ? 0 : (int) (C4350pq.h(jI, EnumC4613sq.SECONDS) % ((long) 60));
        int iD = C4350pq.d(jI);
        if (C4350pq.e(j)) {
            jH = 9999999999999L;
        }
        boolean z2 = jH != 0;
        boolean z3 = (iH2 == 0 && iD == 0) ? false : true;
        if (iH != 0 || (z3 && z2)) {
            z = true;
        }
        if (z2) {
            sb.append(jH);
            sb.append('H');
        }
        if (z) {
            sb.append(iH);
            sb.append('M');
        }
        if (z3 || (!z2 && !z)) {
            C4350pq.b(sb, iH2, iD, 9, ExifInterface.LATITUDE_SOUTH, true);
        }
        String string = sb.toString();
        AbstractC2995aW.p(string, "StringBuilder().apply(builderAction).toString()");
        interfaceC3385er.F(string);
    }
}
