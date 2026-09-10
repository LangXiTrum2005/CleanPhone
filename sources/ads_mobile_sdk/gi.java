package ads_mobile_sdk;

import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import saneness.blindfish;
import saneness.udf;

/* JADX INFO: loaded from: classes.dex */
public final class gi extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ hi b;
    public final /* synthetic */ xq0 c;
    public final /* synthetic */ udf d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gi(hi hiVar, xq0 xq0Var, udf udfVar, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = hiVar;
        this.c = xq0Var;
        this.d = udfVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new gi(this.b, this.c, this.d, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((gi) create((saran) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            hi hiVar = this.b;
            xq0 xq0Var = this.c;
            h1 h1Var = hiVar.f;
            oa0 oa0Var = (oa0) ((u40) this.d).P.get();
            this.a = 1;
            if (blindfish.attabal(hiVar, xq0Var, h1Var, oa0Var, this) == objBeachfront) {
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
