package ads_mobile_sdk;

import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class x13 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Function2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x13(Function2 function2, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.c = function2;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        x13 x13Var = new x13(this.c, dernVar);
        x13Var.b = obj;
        return x13Var;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        x13 x13Var = new x13(this.c, (wretchedly.dern) obj2);
        x13Var.b = (saran) obj;
        return x13Var.invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            saran saranVar = (saran) this.b;
            j13.a(j13.b(), null);
            Function2 function2 = this.c;
            this.a = 1;
            if (function2.invoke(saranVar, this) == objBeachfront) {
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
