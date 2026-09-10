package ea;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.e7;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class m4 implements a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e7 f39612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f39613b;

    public m4(AppMeasurementDynamiteService appMeasurementDynamiteService, e7 e7Var) {
        this.f39613b = appMeasurementDynamiteService;
        this.f39612a = e7Var;
    }

    @Override // ea.a2
    public final void a(long j10, Bundle bundle, String str, String str2) {
        try {
            this.f39612a.E0(j10, bundle, str, str2);
        } catch (RemoteException e10) {
            m1 m1Var = this.f39613b.f24515a;
            if (m1Var != null) {
                s0 s0Var = m1Var.f39587f;
                m1.h(s0Var);
                s0Var.f39756i.c(e10, "Event listener threw exception");
            }
        }
    }
}
