package ads_mobile_sdk;

import complexometry.marial;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import saneness.canephora;

/* JADX INFO: loaded from: classes.dex */
public final class nj extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Function2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nj(Function2 function2, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.c = function2;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        nj njVar = new nj(this.c, dernVar);
        njVar.b = obj;
        return njVar;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        nj njVar = new nj(this.c, (wretchedly.dern) obj2);
        njVar.b = (canephora) obj;
        return njVar.invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            canephora canephoraVar = (canephora) this.b;
            if (!(canephoraVar instanceof m92)) {
                if (canephoraVar instanceof l92) {
                    return new marial.attabal(((l92) canephoraVar).a);
                }
                throw new NoWhenBranchMatchedException();
            }
            Function2 function2 = this.c;
            Object obj2 = ((m92) canephoraVar).a;
            this.a = 1;
            obj = function2.invoke(obj2, this);
            if (obj == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
        }
        return new marial.saneness((complexometry.attabal) obj);
    }
}
