package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import saneness.biogenic;

/* JADX INFO: loaded from: classes.dex */
public final class a21 extends SuspendLambda implements Function2 {
    public final /* synthetic */ f21 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a21(f21 f21Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.a = f21Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new a21(this.a, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new a21(this.a, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        q11 q11Var = this.a.h.b;
        if (q11Var != null) {
            q11Var.a = 3;
            if (q11Var.e != null) {
                biogenic.attabal("Unbinding from service.");
                q11Var.b.unbindService(q11Var.e);
                q11Var.e = null;
            }
            q11Var.d = null;
        }
        return Unit.f29295attabal;
    }
}
