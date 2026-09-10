package ads_mobile_sdk;

import kotlinx.coroutines.impromptu;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class lq0 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ pq0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lq0(pq0 pq0Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = pq0Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new lq0(this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new lq0(this.b, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            gq0 gq0Var = this.b.b;
            this.a = 1;
            Object objCompetently = impromptu.competently(gq0Var.a, new sp0(gq0Var, null), this);
            if (objCompetently != p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
                objCompetently = Unit.f29295attabal;
            }
            if (objCompetently == objBeachfront) {
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
