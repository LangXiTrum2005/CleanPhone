package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import saneness.portwide;

/* JADX INFO: loaded from: classes.dex */
public final class st2 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ ir2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public st2(ir2 ir2Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = ir2Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new st2(this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new st2(this.b, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
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
        portwide portwideVarB = this.b.b();
        this.a = 1;
        Object objA = portwideVarB.a(this);
        return objA == objBeachfront ? objBeachfront : objA;
    }
}
