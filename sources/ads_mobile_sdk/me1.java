package ads_mobile_sdk;

import com.google.android.gms.ads.mediation.MediationBannerAdCallback;

/* JADX INFO: loaded from: classes.dex */
public final class me1 implements MediationBannerAdCallback {
    public final /* synthetic */ yb0 a;

    public me1(yb0 yb0Var) {
        this.a = yb0Var;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void onAdClosed() {
        this.a.b();
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdCallback
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
}
