package ads_mobile_sdk;

import complexometry.ResponseInfo;
import kotlinx.coroutines.saran;
import kurbash.formularize;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import saneness.orthocephalic;
import saneness.spartacist;

/* JADX INFO: loaded from: classes.dex */
public final class ia2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ na2 a;
    public final /* synthetic */ spartacist b;
    public final /* synthetic */ ResponseInfo c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia2(ResponseInfo responseInfo, na2 na2Var, spartacist spartacistVar, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.a = na2Var;
        this.b = spartacistVar;
        this.c = responseInfo;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new ia2(this.c, this.a, this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ia2) create((saran) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        na2 na2Var = this.a;
        formularize[] formularizeVarArr = na2.y;
        orthocephalic orthocephalicVar = na2Var.n;
        if (orthocephalicVar != null) {
            orthocephalicVar.a(k92.a((nn0) this.b, this.c));
        }
        return Unit.f29295attabal;
    }
}
