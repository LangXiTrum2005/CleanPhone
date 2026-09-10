package ads_mobile_sdk;

import android.view.ViewGroup;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class em1 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ gm1 b;
    public final /* synthetic */ ViewGroup c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public em1(gm1 gm1Var, ViewGroup viewGroup, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = gm1Var;
        this.c = viewGroup;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new em1(this.b, this.c, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new em1(this.b, this.c, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objA;
        String adUnitId;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            gm1 gm1Var = this.b;
            boolean z = this.c != null;
            this.a = 1;
            hj1 hj1Var = gm1Var.c;
            if (hj1Var.j == null || hj1Var.a != 6 || (adUnitId = gm1Var.g.getAdUnitId()) == null || (objA = gm1Var.f.a(adUnitId, this, z)) != p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
                objA = Unit.f29295attabal;
            }
            if (objA == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
        }
        return Unit.f29295attabal;
    }
}
