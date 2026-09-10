package ads_mobile_sdk;

import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import saneness.blindfish;
import saneness.sheafer;

/* JADX INFO: loaded from: classes.dex */
public final class uj extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ vj b;
    public final /* synthetic */ xq0 c;
    public final /* synthetic */ sheafer d;
    public final /* synthetic */ gq0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uj(vj vjVar, xq0 xq0Var, sheafer sheaferVar, gq0 gq0Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = vjVar;
        this.c = xq0Var;
        this.d = sheaferVar;
        this.e = gq0Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new uj(this.b, this.c, this.d, this.e, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((uj) create((saran) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            vj vjVar = this.b;
            xq0 xq0Var = this.c;
            h1 h1Var = vjVar.f;
            oa0 oa0VarB = this.d.b();
            this.a = 1;
            if (blindfish.attabal(vjVar, xq0Var, h1Var, oa0VarB, this) == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
        }
        this.e.onPause();
        return Unit.f29295attabal;
    }
}
