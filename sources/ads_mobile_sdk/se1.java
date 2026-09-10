package ads_mobile_sdk;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardItem;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.igo;

/* JADX INFO: loaded from: classes.dex */
public final class se1 implements MediationRewardedAdCallback {
    public final /* synthetic */ yb0 a;

    public se1(yb0 yb0Var) {
        this.a = yb0Var;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void onAdClosed() {
        this.a.b();
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onAdFailedToShow(AdError adError) {
        Intrinsics.checkNotNullParameter(adError, "adError");
        this.a.a(adError);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void onAdOpened() {
        this.a.c();
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onUserEarnedReward() {
        igo igoVarA = this.a.a();
        if (igoVarA != null) {
            hy2 hy2Var = (hy2) igoVarA;
            saran saranVar = hy2Var.a;
            by2 block = new by2(hy2Var, null);
            EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onVideoComplete() {
        this.a.f();
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onVideoStart() {
        this.a.a();
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void reportAdClicked() {
        this.a.d();
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void reportAdImpression() {
        this.a.e();
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onAdFailedToShow(String errorDescription) {
        Intrinsics.checkNotNullParameter(errorDescription, "errorDescription");
        AdError adError = new AdError(0, errorDescription, AdError.UNDEFINED_DOMAIN);
        Intrinsics.checkNotNullParameter(adError, "adError");
        this.a.a(adError);
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onUserEarnedReward(RewardItem rewardItem) {
        Intrinsics.checkNotNullParameter(rewardItem, "rewardItem");
        yb0 yb0Var = this.a;
        yb0Var.getClass();
        Intrinsics.checkNotNullParameter(rewardItem, "rewardItem");
        igo igoVarA = yb0Var.a();
        if (igoVarA != null) {
            hy2 hy2Var = (hy2) igoVarA;
            Intrinsics.checkNotNullParameter(rewardItem, "rewardItem");
            saran saranVar = hy2Var.a;
            ay2 block = new ay2(hy2Var, rewardItem, null);
            EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
        }
    }
}
