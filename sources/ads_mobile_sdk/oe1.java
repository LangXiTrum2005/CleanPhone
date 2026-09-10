package ads_mobile_sdk;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class oe1 implements MediationInterstitialAdCallback {
    public final /* synthetic */ yb0 a;

    public oe1(yb0 yb0Var) {
        this.a = yb0Var;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void onAdClosed() {
        this.a.b();
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdCallback
    public final void onAdFailedToShow(AdError adError) {
        Intrinsics.checkNotNullParameter(adError, "adError");
        this.a.a(adError);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdCallback
    public final void onAdLeftApplication() {
        this.a.a();
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void onAdOpened() {
        this.a.c();
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void reportAdClicked() {
        this.a.d();
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void reportAdImpression() {
        this.a.e();
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdCallback
    public final void onAdFailedToShow(String errorDescription) {
        Intrinsics.checkNotNullParameter(errorDescription, "errorDescription");
        AdError adError = new AdError(0, errorDescription, AdError.UNDEFINED_DOMAIN);
        Intrinsics.checkNotNullParameter(adError, "adError");
        this.a.a(adError);
    }
}
