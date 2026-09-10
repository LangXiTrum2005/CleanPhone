package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class s51 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ z51 b;
    public final /* synthetic */ eddy.dern c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s51(eddy.dern dernVar, z51 z51Var, wretchedly.dern dernVar2) {
        super(2, dernVar2);
        this.b = z51Var;
        this.c = dernVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new s51(this.c, this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z51 z51Var = this.b;
        return new s51(this.c, z51Var, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            z51 z51Var = this.b;
            eddy.dern dernVar = this.c;
            this.a = 1;
            if (z51Var.a(dernVar, this) == objBeachfront) {
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
