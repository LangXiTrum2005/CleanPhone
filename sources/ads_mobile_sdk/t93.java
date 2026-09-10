package ads_mobile_sdk;

import http.arytenoidectomy;
import kotlinx.coroutines.impromptu;
import org.chromium.support_lib_boundary.util.Features;
import p002kotlin.Unit;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class t93 extends SuspendLambda implements Function2 {
    public fa3 a;
    public int b;
    public final /* synthetic */ fa3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t93(fa3 fa3Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.c = fa3Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new t93(this.c, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new t93(this.c, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        fa3 fa3Var;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.b;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            this.c.i.getClass();
            Intrinsics.checkNotNullParameter(Features.MULTI_PROFILE, "feature");
            if (!arytenoidectomy.attabal(Features.MULTI_PROFILE)) {
                y13.a("MultiProfile is not supported", null, 6);
                return Unit.f29295attabal;
            }
            fa3 fa3Var2 = this.c;
            CoroutineContext coroutineContext = fa3Var2.d;
            s93 s93Var = new s93(fa3Var2, null);
            this.a = fa3Var2;
            this.b = 1;
            Object objCompetently = impromptu.competently(coroutineContext, s93Var, this);
            if (objCompetently == objBeachfront) {
                return objBeachfront;
            }
            fa3Var = fa3Var2;
            obj = objCompetently;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fa3Var = this.a;
            p002kotlin.dern.saneness(obj);
        }
        fa3Var.k = (http.dern) obj;
        return Unit.f29295attabal;
    }
}
