package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class e23 extends SuspendLambda implements Function1 {
    public final /* synthetic */ m23 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e23(m23 m23Var, wretchedly.dern dernVar) {
        super(1, dernVar);
        this.a = m23Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(wretchedly.dern dernVar) {
        return new e23(this.a, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new e23(this.a, (wretchedly.dern) obj).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        m23 m23Var = this.a;
        return m23Var.o.a(m23Var.p, m23Var.f.a.a.getAdUnitId());
    }
}
