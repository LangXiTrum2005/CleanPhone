package ads_mobile_sdk;

import complexometry.monoploid;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class iz0 extends SuspendLambda implements Function2 {
    public final /* synthetic */ monoploid a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iz0(wretchedly.dern dernVar, monoploid monoploidVar) {
        super(2, dernVar);
        this.a = monoploidVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new iz0(dernVar, this.a);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new iz0((wretchedly.dern) obj2, this.a).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        this.a.attabal(wz0.L);
        return Unit.f29295attabal;
    }
}
