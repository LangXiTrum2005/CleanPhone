package ads_mobile_sdk;

import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class fj2 extends Lambda implements Function1 {
    public final /* synthetic */ ij2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fj2(ij2 ij2Var) {
        super(1);
        this.a = ij2Var;
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        UnifiedNativeAdMapper unifiedNativeAdMapper = (UnifiedNativeAdMapper) obj;
        Intrinsics.checkNotNullParameter(unifiedNativeAdMapper, "unifiedNativeAdMapper");
        ij2 ij2Var = this.a;
        w43 w43Var = new w43(unifiedNativeAdMapper);
        ij2Var.getClass();
        Intrinsics.checkNotNullParameter(w43Var, "<set-?>");
        ij2Var.d = w43Var;
        return Unit.f29295attabal;
    }
}
