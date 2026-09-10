package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class i2 extends SuspendLambda implements Function1 {
    public int a;
    public final /* synthetic */ j2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(j2 j2Var, wretchedly.dern dernVar) {
        super(1, dernVar);
        this.b = j2Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(wretchedly.dern dernVar) {
        return new i2(this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new i2(this.b, (wretchedly.dern) obj).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
            return obj;
        }
        p002kotlin.dern.saneness(obj);
        iv ivVar = this.b.l;
        this.a = 1;
        Object objK = ivVar.k(this);
        return objK == objBeachfront ? objBeachfront : objK;
    }
}
