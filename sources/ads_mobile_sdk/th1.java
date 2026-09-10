package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import saneness.libya;

/* JADX INFO: loaded from: classes.dex */
public final class th1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ libya a;
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public th1(libya libyaVar, int i, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.a = libyaVar;
        this.b = i;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new th1(this.a, this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new th1(this.a, this.b, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        bm0 bm0Var = (bm0) this.a;
        bm0Var.a(this.b);
        bm0Var.o();
        return Unit.f29295attabal;
    }
}
