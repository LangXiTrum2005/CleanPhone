package ads_mobile_sdk;

import com.google.android.gms.ads.mediation.MediationRewardedAd;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class hj2 extends Lambda implements Function1 {
    public final /* synthetic */ ij2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj2(ij2 ij2Var) {
        super(1);
        this.a = ij2Var;
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        MediationRewardedAd mediationAd = (MediationRewardedAd) obj;
        Intrinsics.checkNotNullParameter(mediationAd, "mediationAd");
        ij2 ij2Var = this.a;
        ij2Var.getClass();
        Intrinsics.checkNotNullParameter(mediationAd, "<set-?>");
        ij2Var.f = mediationAd;
        return Unit.f29295attabal;
    }
}
