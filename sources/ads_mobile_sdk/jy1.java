package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class jy1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ my1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jy1(my1 my1Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.a = my1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new jy1(this.a, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new jy1(this.a, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        my1 my1Var = this.a;
        f93 f93Var = my1Var.Q;
        if (f93Var == null) {
            return null;
        }
        ((gq0) my1Var.G.getValue()).l.set(false);
        if (f93Var.c.indexOfChild(my1Var.g()) == -1) {
            f93Var.c.addView(my1Var.g(), f93Var.b, f93Var.a);
        }
        return Unit.f29295attabal;
    }
}
