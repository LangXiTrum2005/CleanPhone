package ads_mobile_sdk;

import com.google.android.gms.ads.mediation.NativeAdMapper;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class be1 extends Lambda implements Function1 {
    public final /* synthetic */ fe1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be1(fe1 fe1Var) {
        super(1);
        this.a = fe1Var;
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        NativeAdMapper nativeAdMapper = (NativeAdMapper) obj;
        Intrinsics.checkNotNullParameter(nativeAdMapper, "nativeAdMapper");
        fe1 fe1Var = this.a;
        ik1 ik1Var = new ik1(nativeAdMapper);
        fe1Var.getClass();
        Intrinsics.checkNotNullParameter(ik1Var, "<set-?>");
        fe1Var.c = ik1Var;
        return Unit.f29295attabal;
    }
}
