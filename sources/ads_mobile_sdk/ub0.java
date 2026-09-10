package ads_mobile_sdk;

import acidy.taiyuan;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ub0 extends SuspendLambda implements Function2 {
    public final /* synthetic */ wb0 a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ub0(wretchedly.dern dernVar, wb0 wb0Var, String str) {
        super(2, dernVar);
        this.a = wb0Var;
        this.b = str;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new ub0(dernVar, this.a, this.b);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new ub0((wretchedly.dern) obj2, this.a, this.b).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        taiyuan taiyuanVar;
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        wb0 wb0Var = this.a;
        synchronized (wb0Var) {
            taiyuanVar = wb0Var.l;
        }
        if (taiyuanVar != null) {
            taiyuanVar.attabal(this.b);
        }
        return Unit.f29295attabal;
    }
}
