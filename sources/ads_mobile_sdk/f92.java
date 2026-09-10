package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import saneness.canephora;
import saneness.imperceivable;
import saneness.orthocephalic;

/* JADX INFO: loaded from: classes.dex */
public final class f92 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ orthocephalic b;
    public final /* synthetic */ canephora c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f92(orthocephalic orthocephalicVar, canephora canephoraVar, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = orthocephalicVar;
        this.c = canephoraVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new f92(this.b, this.c, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new f92(this.b, this.c, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            orthocephalic orthocephalicVar = this.b;
            imperceivable imperceivableVar = (imperceivable) ((m92) this.c).a;
            this.a = 1;
            if (orthocephalicVar.a(imperceivableVar, this) == objBeachfront) {
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
