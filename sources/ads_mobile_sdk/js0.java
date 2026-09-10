package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class js0 extends SuspendLambda implements Function2 {
    public final /* synthetic */ ks0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public js0(ks0 ks0Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.a = ks0Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new js0(this.a, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new js0(this.a, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        gq0 gq0Var = (gq0) this.a.b.d.get();
        if (gq0Var != null) {
            gq0Var.setVisibility(8);
        }
        this.a.c.h.getAndSet(false);
        return Unit.f29295attabal;
    }
}
