package ads_mobile_sdk;

import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class ce1 extends Lambda implements Function1 {
    public final /* synthetic */ fe1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ce1(fe1 fe1Var) {
        super(1);
        this.a = fe1Var;
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        UnifiedNativeAdMapper unifiedNativeAdMapper = (UnifiedNativeAdMapper) obj;
        Intrinsics.checkNotNullParameter(unifiedNativeAdMapper, "unifiedNativeAdMapper");
        fe1 fe1Var = this.a;
        w43 w43Var = new w43(unifiedNativeAdMapper);
        fe1Var.getClass();
        Intrinsics.checkNotNullParameter(w43Var, "<set-?>");
        fe1Var.c = w43Var;
        return Unit.f29295attabal;
    }
}
