package ads_mobile_sdk;

import android.view.View;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class cj2 extends Lambda implements Function1 {
    public final /* synthetic */ ij2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cj2(ij2 ij2Var) {
        super(1);
        this.a = ij2Var;
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View adView = (View) obj;
        Intrinsics.checkNotNullParameter(adView, "adView");
        ij2 ij2Var = this.a;
        ij2Var.getClass();
        Intrinsics.checkNotNullParameter(adView, "<set-?>");
        ij2Var.c = adView;
        return Unit.f29295attabal;
    }
}
