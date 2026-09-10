package ads_mobile_sdk;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.coreopsis;

/* JADX INFO: loaded from: classes.dex */
public final class pu1 implements MediationInterstitialListener {
    public final /* synthetic */ su1 a;
    public final /* synthetic */ coreopsis b;
    public final /* synthetic */ yb0 c;

    public pu1(yb0 yb0Var, fx2 fx2Var, su1 su1Var) {
        this.a = su1Var;
        this.b = fx2Var;
        this.c = yb0Var;
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdClicked(MediationInterstitialAdapter adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.c.d();
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdClosed(MediationInterstitialAdapter adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.c.b();
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdFailedToLoad(MediationInterstitialAdapter adapter, int i) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        fx2 fx2Var = (fx2) this.b;
        String errorMessage = fx2Var.c.a(i);
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        fx2Var.a(new AdError(i, errorMessage, AdError.UNDEFINED_DOMAIN));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdLeftApplication(MediationInterstitialAdapter adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.c.a();
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdLoaded(MediationInterstitialAdapter adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        su1 su1Var = this.a;
        su1Var.getClass();
        Intrinsics.checkNotNullParameter(adapter, "<set-?>");
        su1Var.d = adapter;
        ((fx2) this.b).a();
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdOpened(MediationInterstitialAdapter adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.c.c();
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdFailedToLoad(MediationInterstitialAdapter adapter, AdError adError) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(adError, "adError");
        ((fx2) this.b).a(adError);
    }
}
