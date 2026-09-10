package ads_mobile_sdk;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.coreopsis;

/* JADX INFO: loaded from: classes.dex */
public final class te1 implements MediationAdLoadCallback {
    public final /* synthetic */ coreopsis a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ yb0 c;

    public te1(yb0 yb0Var, fx2 fx2Var, Function1 function1) {
        this.a = fx2Var;
        this.b = function1;
        this.c = yb0Var;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        Intrinsics.checkNotNullParameter(adError, "adError");
        ((fx2) this.a).a(adError);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final Object onSuccess(Object obj) {
        MediationRewardedAd ad = (MediationRewardedAd) obj;
        Intrinsics.checkNotNullParameter(ad, "ad");
        ((fx2) this.a).a();
        this.b.invoke(ad);
        return new se1(this.c);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String failure) {
        Intrinsics.checkNotNullParameter(failure, "failure");
        ((fx2) this.a).a(new AdError(0, failure, AdError.UNDEFINED_DOMAIN));
    }
}
