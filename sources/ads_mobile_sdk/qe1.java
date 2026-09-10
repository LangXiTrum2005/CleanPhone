package ads_mobile_sdk;

import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.igo;

/* JADX INFO: loaded from: classes.dex */
public final class qe1 implements MediationNativeAdCallback {
    public final /* synthetic */ yb0 a;

    public qe1(yb0 yb0Var) {
        this.a = yb0Var;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void onAdClosed() {
        this.a.b();
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onAdLeftApplication() {
        this.a.a();
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void onAdOpened() {
        this.a.c();
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoComplete() {
        this.a.f();
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoMute() {
        igo igoVarA = this.a.a();
        if (igoVarA != null) {
            hy2 hy2Var = (hy2) igoVarA;
            saran saranVar = hy2Var.a;
            dy2 block = new dy2(hy2Var, null);
            EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoPause() {
        igo igoVarA = this.a.a();
        if (igoVarA != null) {
            hy2 hy2Var = (hy2) igoVarA;
            saran saranVar = hy2Var.a;
            ey2 block = new ey2(hy2Var, null);
            EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoPlay() {
        igo igoVarA = this.a.a();
        if (igoVarA != null) {
            hy2 hy2Var = (hy2) igoVarA;
            saran saranVar = hy2Var.a;
            fy2 block = new fy2(hy2Var, null);
            EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoUnmute() {
        igo igoVarA = this.a.a();
        if (igoVarA != null) {
            hy2 hy2Var = (hy2) igoVarA;
            saran saranVar = hy2Var.a;
            gy2 block = new gy2(hy2Var, null);
            EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void reportAdClicked() {
        this.a.d();
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void reportAdImpression() {
        this.a.e();
    }
}
