package pb;

import com.google.android.gms.internal.measurement.c8;
import com.google.android.gms.internal.measurement.u7;
import com.google.android.gms.internal.measurement.v6;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.unity3d.services.UnityAdsConstants;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirebaseAnalytics f48305b;

    public d(FirebaseAnalytics firebaseAnalytics, int i10) {
        this.f48304a = i10;
        switch (i10) {
            case 1:
                Objects.requireNonNull(firebaseAnalytics);
                this.f48305b = firebaseAnalytics;
                break;
            default:
                Objects.requireNonNull(firebaseAnalytics);
                this.f48305b = firebaseAnalytics;
                break;
        }
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f48304a) {
            case 0:
                c8 c8Var = this.f48305b.f24659a;
                c8Var.getClass();
                v6 v6Var = new v6();
                c8Var.c(new u7(c8Var, v6Var, 5));
                return v6Var.r(UnityAdsConstants.Timeout.INIT_TIMEOUT_MS);
            default:
                c8 c8Var2 = this.f48305b.f24659a;
                c8Var2.getClass();
                v6 v6Var2 = new v6();
                c8Var2.c(new u7(c8Var2, v6Var2, 6));
                return (Long) v6.u1(Long.class, v6Var2.m0(UnityAdsConstants.Timeout.INIT_TIMEOUT_MS));
        }
    }
}
