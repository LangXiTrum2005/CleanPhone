package ads_mobile_sdk;

import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import saneness.hobby;
import saneness.spartacist;

/* JADX INFO: loaded from: classes.dex */
public final class fh1 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ gh1 b;
    public final /* synthetic */ xt0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fh1(gh1 gh1Var, xt0 xt0Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = gh1Var;
        this.c = xt0Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new fh1(this.b, this.c, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new fh1(this.b, this.c, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            hobby hobbyVar = this.b.c;
            xt0 xt0Var = this.c;
            this.a = 1;
            obj = hobby.saneness(hobbyVar, xt0Var, null, this, 14);
            if (obj == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
        }
        spartacist spartacistVar = (spartacist) obj;
        if (spartacistVar instanceof tn0) {
            dg2 dg2Var = ((zt0) ((tn0) spartacistVar).b).d;
            if (dg2Var != null) {
                return dg2.a(dg2Var);
            }
        } else if (!(spartacistVar instanceof nn0)) {
            throw new NoWhenBranchMatchedException();
        }
        return null;
    }
}
