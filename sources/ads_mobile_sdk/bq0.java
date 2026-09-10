package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import saneness.loun;

/* JADX INFO: loaded from: classes.dex */
public final class bq0 extends SuspendLambda implements Function2 {
    public final /* synthetic */ gq0 a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bq0(gq0 gq0Var, String str, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.a = gq0Var;
        this.b = str;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new bq0(this.a, this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new bq0(this.a, this.b, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        loun lounVar = this.a.e;
        d13 d13Var = (d13) lounVar;
        d13Var.a(this.b, new Exception(this.b));
        return Unit.f29295attabal;
    }
}
