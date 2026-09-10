package ads_mobile_sdk;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.coreopsis;

/* JADX INFO: loaded from: classes.dex */
public final class qu1 implements MediationNativeListener {
    public final /* synthetic */ Function1 a;
    public final /* synthetic */ coreopsis b;
    public final /* synthetic */ yb0 c;

    public qu1(yb0 yb0Var, fx2 fx2Var, ru1 ru1Var) {
        this.a = ru1Var;
        this.b = fx2Var;
        this.c = yb0Var;
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdClicked(MediationNativeAdapter adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.c.d();
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdClosed(MediationNativeAdapter adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.c.b();
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdFailedToLoad(MediationNativeAdapter adapter, int i) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        fx2 fx2Var = (fx2) this.b;
        String errorMessage = fx2Var.c.a(i);
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        fx2Var.a(new AdError(i, errorMessage, AdError.UNDEFINED_DOMAIN));
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdImpression(MediationNativeAdapter adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.c.e();
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdLeftApplication(MediationNativeAdapter adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.c.a();
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdLoaded(MediationNativeAdapter adapter, UnifiedNativeAdMapper unifiedNativeAdMapper) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(unifiedNativeAdMapper, "unifiedNativeAdMapper");
        this.a.invoke(unifiedNativeAdMapper);
        ((fx2) this.b).a();
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdOpened(MediationNativeAdapter adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.c.c();
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onVideoEnd(MediationNativeAdapter adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.c.a();
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdFailedToLoad(MediationNativeAdapter adapter, AdError adError) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(adError, "adError");
        ((fx2) this.b).a(adError);
    }
}
