package ads_mobile_sdk;

import kotlinx.coroutines.cutely;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class b73 extends SuspendLambda implements Function2 {
    public final /* synthetic */ er0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b73(er0 er0Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.a = er0Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new b73(this.a, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new b73(this.a, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        er0 er0Var = this.a;
        synchronized (er0Var.f) {
            boolean zIsMuted = er0Var.isMuted();
            yq0 yq0Var = er0Var.i;
            yq0 yq0Var2 = yq0.ENDED;
            er0Var.i = yq0Var2;
            cutely.wireman(er0Var.a, null, null, new zq0(er0Var, yq0Var, yq0Var2, zIsMuted, zIsMuted, null), 3, null);
            unit = Unit.f29295attabal;
        }
        return unit;
    }
}
