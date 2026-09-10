package ads_mobile_sdk;

import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class pg0 extends SuspendLambda implements Function2 {
    public final /* synthetic */ rg0 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pg0(rg0 rg0Var, String str, boolean z, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.a = rg0Var;
        this.b = str;
        this.c = z;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new pg0(this.a, this.b, this.c, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((pg0) create((saran) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        wg0 wg0Var = this.a.b;
        String adUnitId = this.b;
        boolean z = this.c;
        wg0Var.getClass();
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        try {
            if (wg0Var.e.getValue() != null) {
                Class.forName(wg0Var.d.C()).getMethod(z ? "beginAdUnitExposure" : "endAdUnitExposure", String.class).invoke(wg0Var.e.getValue(), adUnitId);
            }
        } catch (Exception e) {
            ((d13) wg0Var.b).a("FirebaseAnalyticsAdapter.invokeMethod AdUnitExposure", e);
        }
        return Unit.f29295attabal;
    }
}
