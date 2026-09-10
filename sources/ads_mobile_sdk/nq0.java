package ads_mobile_sdk;

import android.webkit.WebResourceRequest;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class nq0 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ pq0 b;
    public final /* synthetic */ WebResourceRequest c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nq0(pq0 pq0Var, WebResourceRequest webResourceRequest, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = pq0Var;
        this.c = webResourceRequest;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new nq0(this.b, this.c, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new nq0(this.b, this.c, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            gk2 gk2Var = this.b.r;
            if (gk2Var != null) {
                String string = this.c.getUrl().toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                this.a = 1;
                if (gk2Var.b(string, this) == objBeachfront) {
                    return objBeachfront;
                }
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
