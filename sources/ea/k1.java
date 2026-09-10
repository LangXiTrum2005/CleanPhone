package ea;

import com.google.android.gms.internal.measurement.a7;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class k1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a7 f39527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f39528c;

    public /* synthetic */ k1(AppMeasurementDynamiteService appMeasurementDynamiteService, a7 a7Var, int i10) {
        this.f39526a = i10;
        this.f39527b = a7Var;
        this.f39528c = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f39526a) {
            case 0:
                h3 h3VarK = this.f39528c.f24515a.k();
                a7 a7Var = this.f39527b;
                h3VarK.G0();
                h3VarK.H0();
                h3VarK.U0(new com.google.android.gms.common.api.internal.m0(h3VarK, h3VarK.W0(false), a7Var, 14));
                break;
            default:
                AppMeasurementDynamiteService appMeasurementDynamiteService = this.f39528c;
                l4 l4Var = appMeasurementDynamiteService.f24515a.f39590i;
                m1.f(l4Var);
                m1 m1Var = appMeasurementDynamiteService.f24515a;
                l4Var.w1(this.f39527b, m1Var.f39605y != null && m1Var.f39605y.booleanValue());
                break;
        }
    }
}
