package ads_mobile_sdk;

import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class ru1 extends Lambda implements Function1 {
    public final /* synthetic */ su1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ru1(su1 su1Var) {
        super(1);
        this.a = su1Var;
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        UnifiedNativeAdMapper unifiedNativeAdMapper = (UnifiedNativeAdMapper) obj;
        Intrinsics.checkNotNullParameter(unifiedNativeAdMapper, "unifiedNativeAdMapper");
        su1 su1Var = this.a;
        w43 w43Var = new w43(unifiedNativeAdMapper);
        su1Var.getClass();
        Intrinsics.checkNotNullParameter(w43Var, "<set-?>");
        su1Var.c = w43Var;
        return Unit.f29295attabal;
    }
}
