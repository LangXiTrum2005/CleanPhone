package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class e32 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ gk2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e32(gk2 gk2Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = gk2Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        e32 e32Var = new e32(this.b, dernVar);
        e32Var.a = obj;
        return e32Var;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        e32 e32Var = new e32(this.b, (wretchedly.dern) obj2);
        e32Var.a = (gq0) obj;
        return e32Var.invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        ((gq0) this.a).b().r = this.b;
        return Unit.f29295attabal;
    }
}
