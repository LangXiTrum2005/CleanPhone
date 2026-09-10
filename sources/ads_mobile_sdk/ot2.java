package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import svd.polloi;

/* JADX INFO: loaded from: classes.dex */
public final class ot2 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ polloi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ot2(polloi polloiVar, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = polloiVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new ot2(this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new ot2(this.b, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
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
        polloi polloiVar = this.b;
        this.a = 1;
        Object objDern = polloi.dern(polloiVar, this);
        return objDern == objBeachfront ? objBeachfront : objDern;
    }
}
