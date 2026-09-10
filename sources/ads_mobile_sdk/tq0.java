package ads_mobile_sdk;

import android.webkit.WebResourceRequest;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import saneness.strother;

/* JADX INFO: loaded from: classes.dex */
public final class tq0 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ strother b;
    public final /* synthetic */ uq0 c;
    public final /* synthetic */ WebResourceRequest d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tq0(strother strotherVar, uq0 uq0Var, WebResourceRequest webResourceRequest, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = strotherVar;
        this.c = uq0Var;
        this.d = webResourceRequest;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new tq0(this.b, this.c, this.d, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((tq0) create((saran) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
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
        strother strotherVar = this.b;
        gq0 gq0Var = this.c.b;
        WebResourceRequest webResourceRequest = this.d;
        this.a = 1;
        Object objA = ((gh1) strotherVar).a(gq0Var, webResourceRequest, this);
        return objA == objBeachfront ? objBeachfront : objA;
    }
}
