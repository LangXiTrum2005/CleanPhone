package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class yw extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ cb3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw(cb3 cb3Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = cb3Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        yw ywVar = new yw(this.b, dernVar);
        ywVar.a = obj;
        return ywVar;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        yw ywVar = new yw(this.b, (wretchedly.dern) obj2);
        ywVar.a = (gq0) obj;
        return ywVar.invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        ((gq0) this.a).b().o = this.b;
        return Unit.f29295attabal;
    }
}
