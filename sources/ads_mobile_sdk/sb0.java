package ads_mobile_sdk;

import complexometry.polloi;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class sb0 extends SuspendLambda implements Function2 {
    public final /* synthetic */ wb0 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sb0(wretchedly.dern dernVar, wb0 wb0Var, String str, String str2) {
        super(2, dernVar);
        this.a = wb0Var;
        this.b = str;
        this.c = str2;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new sb0(dernVar, this.a, this.b, this.c);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((sb0) create((saran) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        polloi polloiVar;
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        wb0 wb0Var = this.a;
        synchronized (wb0Var) {
            polloiVar = wb0Var.e;
        }
        if (polloiVar != null) {
            polloiVar.saneness(this.b, this.c);
        }
        return Unit.f29295attabal;
    }
}
