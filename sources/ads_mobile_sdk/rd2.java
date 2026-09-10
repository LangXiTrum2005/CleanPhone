package ads_mobile_sdk;

import complexometry.ResponseInfo;
import java.util.concurrent.CancellationException;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class rd2 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ ee2 b;
    public final /* synthetic */ CancellationException c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rd2(ee2 ee2Var, CancellationException cancellationException, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = ee2Var;
        this.c = cancellationException;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new rd2(this.b, this.c, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new rd2(this.b, this.c, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            na2 na2Var = this.b.e;
            if (na2Var == null) {
                Intrinsics.preprohormone("adLoader");
                na2Var = null;
            }
            on0 on0Var = new on0(this.c, k41.CANCELLED, null, 4);
            this.a = 1;
            if (na2Var.a(on0Var, (ResponseInfo) null, this) == objBeachfront) {
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
