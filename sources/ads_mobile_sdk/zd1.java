package ads_mobile_sdk;

import android.view.View;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class zd1 extends Lambda implements Function1 {
    public final /* synthetic */ fe1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd1(fe1 fe1Var) {
        super(1);
        this.a = fe1Var;
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View adView = (View) obj;
        Intrinsics.checkNotNullParameter(adView, "adView");
        fe1 fe1Var = this.a;
        fe1Var.getClass();
        Intrinsics.checkNotNullParameter(adView, "<set-?>");
        fe1Var.b = adView;
        return Unit.f29295attabal;
    }
}
