package ads_mobile_sdk;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.coreopsis;

/* JADX INFO: loaded from: classes.dex */
public final class ve1 implements MediationAdLoadCallback {
    public final /* synthetic */ Function1 a;
    public final /* synthetic */ coreopsis b;
    public final /* synthetic */ yb0 c;

    public ve1(yb0 yb0Var, fx2 fx2Var, Function1 function1) {
        this.a = function1;
        this.b = fx2Var;
        this.c = yb0Var;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        Intrinsics.checkNotNullParameter(adError, "adError");
        ((fx2) this.b).a(adError);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final Object onSuccess(Object obj) {
        UnifiedNativeAdMapper ad = (UnifiedNativeAdMapper) obj;
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.a.invoke(ad);
        ((fx2) this.b).a();
        return new ue1(this.c);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String failure) {
        Intrinsics.checkNotNullParameter(failure, "failure");
        ((fx2) this.b).a(new AdError(0, failure, AdError.UNDEFINED_DOMAIN));
    }
}
