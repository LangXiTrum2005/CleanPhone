package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class u12 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ ln0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u12(ln0 ln0Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = ln0Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new u12(this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new u12(this.b, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            ln0 ln0Var = this.b;
            this.a = 1;
            Object objB = ((gk2) ln0Var.a).b(this);
            if (objB != p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
                objB = Unit.f29295attabal;
            }
            if (objB != p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
                objB = Unit.f29295attabal;
            }
            if (objB == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
        }
        return Unit.f29295attabal;
    }
}
