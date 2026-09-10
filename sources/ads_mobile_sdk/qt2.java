package ads_mobile_sdk;

import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import svd.arytenoidectomy;
import svd.polloi;

/* JADX INFO: loaded from: classes.dex */
public final class qt2 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ polloi b;
    public final /* synthetic */ ir2 c;
    public final /* synthetic */ arytenoidectomy d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qt2(polloi polloiVar, ir2 ir2Var, arytenoidectomy arytenoidectomyVar, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = polloiVar;
        this.c = ir2Var;
        this.d = arytenoidectomyVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new qt2(this.b, this.c, this.d, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((qt2) create((saran) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            polloi polloiVar = this.b;
            ir2 ir2Var = this.c;
            arytenoidectomy arytenoidectomyVar = this.d;
            this.a = 1;
            if (polloiVar.attabal(ir2Var, arytenoidectomyVar, this) == objBeachfront) {
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
