package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class sh0 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;

    public sh0(wretchedly.dern dernVar) {
        super(2, dernVar);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        sh0 sh0Var = new sh0(dernVar);
        sh0Var.a = obj;
        return sh0Var;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        sh0 sh0Var = new sh0((wretchedly.dern) obj2);
        sh0Var.a = (gq0) obj;
        return sh0Var.invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        pq0 pq0VarB = ((gq0) this.a).b();
        pq0VarB.l.setValue(pq0VarB, pq0.t[2], Boolean.TRUE);
        return Unit.f29295attabal;
    }
}
