package ads_mobile_sdk;

import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class yd1 extends Lambda implements Function1 {
    public final /* synthetic */ fe1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd1(fe1 fe1Var) {
        super(1);
        this.a = fe1Var;
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit unit;
        MediationAppOpenAd mediationAd = (MediationAppOpenAd) obj;
        Intrinsics.checkNotNullParameter(mediationAd, "mediationAd");
        fe1 fe1Var = this.a;
        synchronized (fe1Var) {
            Intrinsics.checkNotNullParameter(mediationAd, "<set-?>");
            fe1Var.f = mediationAd;
            unit = Unit.f29295attabal;
        }
        return unit;
    }
}
