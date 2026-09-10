package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function1;
import saneness.orthocephalic;

/* JADX INFO: loaded from: classes.dex */
public final class bi extends SuspendLambda implements Function1 {
    public final /* synthetic */ ra2 a;
    public final /* synthetic */ complexometry.wireman b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi(ra2 ra2Var, complexometry.wireman wiremanVar, wretchedly.dern dernVar) {
        super(1, dernVar);
        this.a = ra2Var;
        this.b = wiremanVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(wretchedly.dern dernVar) {
        return new bi(this.a, this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new bi(this.a, this.b, (wretchedly.dern) obj).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        this.a.a((orthocephalic) new f41(this.b, new ai(null)), false);
        return Unit.f29295attabal;
    }
}
