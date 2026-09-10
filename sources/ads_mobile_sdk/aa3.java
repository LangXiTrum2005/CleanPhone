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
public final class aa3 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ fa3 b;
    public final /* synthetic */ http.dern c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa3(http.dern dernVar, fa3 fa3Var, wretchedly.dern dernVar2) {
        super(2, dernVar2);
        this.b = fa3Var;
        this.c = dernVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new aa3(this.c, this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        fa3 fa3Var = this.b;
        return new aa3(this.c, fa3Var, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            this.b.i.getClass();
            Intrinsics.checkNotNullParameter(Features.PRECONNECT, "feature");
            if (!arytenoidectomy.attabal(Features.PRECONNECT)) {
                y13.a("Preconnect is not supported", null, 6);
                return Unit.f29295attabal;
            }
            fa3 fa3Var = this.b;
            CoroutineContext coroutineContext = fa3Var.d;
            z93 z93Var = new z93(this.c, fa3Var, null);
            this.a = 1;
            if (impromptu.competently(coroutineContext, z93Var, this) == objBeachfront) {
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
