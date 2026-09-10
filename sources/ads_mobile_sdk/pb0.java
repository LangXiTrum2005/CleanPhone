package ads_mobile_sdk;

import complexometry.taiyuan;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class pb0 extends SuspendLambda implements Function2 {
    public final /* synthetic */ wb0 a;
    public final /* synthetic */ taiyuan b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pb0(wretchedly.dern dernVar, wb0 wb0Var, taiyuan taiyuanVar) {
        super(2, dernVar);
        this.a = wb0Var;
        this.b = taiyuanVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new pb0(dernVar, this.a, this.b);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new pb0((wretchedly.dern) obj2, this.a, this.b).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        complexometry.dern dernVarA = this.a.a();
        if (dernVarA != null) {
            dernVarA.attabal(this.b);
        }
        return Unit.f29295attabal;
    }
}
