package ads_mobile_sdk;

import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class j02 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ q02 b;
    public final /* synthetic */ sn0 c;
    public final /* synthetic */ h1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j02(q02 q02Var, sn0 sn0Var, h1 h1Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = q02Var;
        this.c = sn0Var;
        this.d = h1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new j02(this.b, this.c, this.d, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j02) create((saran) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            ve2 ve2Var = this.b.e;
            sn0 sn0Var = this.c;
            h1 h1Var = this.d;
            long jDern = p002kotlin.time.saneness.INSTANCE.dern();
            this.a = 1;
            if (ve2Var.a(sn0Var, h1Var, jDern, this) == objBeachfront) {
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
