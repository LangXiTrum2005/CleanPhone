package ads_mobile_sdk;

import complexometry.ResponseInfo;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import saneness.spartacist;

/* JADX INFO: loaded from: classes.dex */
public final class ja2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ na2 a;
    public final /* synthetic */ spartacist b;
    public final /* synthetic */ ResponseInfo c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja2(ResponseInfo responseInfo, na2 na2Var, spartacist spartacistVar, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.a = na2Var;
        this.b = spartacistVar;
        this.c = responseInfo;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new ja2(this.c, this.a, this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ja2) create((saran) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        na2 na2Var = this.a;
        liquory.wireman wiremanVar = (liquory.wireman) na2Var.w.getValue(na2Var, na2.y[0]);
        if (wiremanVar != null) {
            na2 na2Var2 = this.a;
            nn0 nn0Var = (nn0) this.b;
            ResponseInfo responseInfo = this.c;
            na2Var2.getClass();
            wiremanVar.saneness(k92.a(nn0Var, responseInfo));
        }
        return Unit.f29295attabal;
    }
}
