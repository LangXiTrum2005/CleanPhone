package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ga2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ na2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga2(na2 na2Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.a = na2Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new ga2(this.a, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new ga2(this.a, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        na2 na2Var = this.a;
        liquory.wireman wiremanVar = (liquory.wireman) na2Var.w.getValue(na2Var, na2.y[0]);
        if (wiremanVar != null) {
            wiremanVar.attabal();
        }
        return Unit.f29295attabal;
    }
}
