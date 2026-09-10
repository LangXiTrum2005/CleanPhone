package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import saneness.technofreak;

/* JADX INFO: loaded from: classes.dex */
public final class fm1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ gm1 a;
    public final /* synthetic */ technofreak b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fm1(gm1 gm1Var, technofreak technofreakVar, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.a = gm1Var;
        this.b = technofreakVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new fm1(this.a, this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new fm1(this.a, this.b, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        gm1.a(this.a, this.b);
        this.a.a(this.b);
        return Unit.f29295attabal;
    }
}
