package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import saneness.imperceivable;
import saneness.orthocephalic;
import saneness.spartacist;

/* JADX INFO: loaded from: classes.dex */
public final class ea2 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ orthocephalic b;
    public final /* synthetic */ spartacist c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea2(wretchedly.dern dernVar, orthocephalic orthocephalicVar, spartacist spartacistVar) {
        super(2, dernVar);
        this.b = orthocephalicVar;
        this.c = spartacistVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new ea2(dernVar, this.b, this.c);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new ea2((wretchedly.dern) obj2, this.b, this.c).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            orthocephalic orthocephalicVar = this.b;
            if (orthocephalicVar != null) {
                imperceivable imperceivableVar = (imperceivable) ((tn0) this.c).b;
                this.a = 1;
                if (orthocephalicVar.a(imperceivableVar, this) == objBeachfront) {
                    return objBeachfront;
                }
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
