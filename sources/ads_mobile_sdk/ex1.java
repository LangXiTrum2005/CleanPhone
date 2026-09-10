package ads_mobile_sdk;

import kotlinx.coroutines.walach;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ex1 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ walach b;
    public final /* synthetic */ tx1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ex1(walach walachVar, tx1 tx1Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = walachVar;
        this.c = tx1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new ex1(this.b, this.c, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new ex1(this.b, this.c, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            walach walachVar = this.b;
            this.a = 1;
            obj = walachVar.dent(this);
            if (obj == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
        }
        gq0 gq0Var = (gq0) obj;
        pq0 pq0VarB = gq0Var != null ? gq0Var.b() : null;
        if (pq0VarB != null) {
            pq0VarB.r = this.c.h;
        }
        return Unit.f29295attabal;
    }
}
