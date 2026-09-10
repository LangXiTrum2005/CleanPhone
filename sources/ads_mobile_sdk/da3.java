package ads_mobile_sdk;

import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import saneness.cosy;

/* JADX INFO: loaded from: classes.dex */
public final class da3 extends SuspendLambda implements Function2 {
    public final /* synthetic */ http.dern a;
    public final /* synthetic */ String b;
    public final /* synthetic */ fa3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da3(http.dern dernVar, String str, fa3 fa3Var, wretchedly.dern dernVar2) {
        super(2, dernVar2);
        this.a = dernVar;
        this.b = str;
        this.c = fa3Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new da3(this.a, this.b, this.c, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((da3) create((saran) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        this.a.attabal(this.b, null, this.c.g.c, new cosy());
        return Unit.f29295attabal;
    }
}
