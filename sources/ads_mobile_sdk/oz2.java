package ads_mobile_sdk;

import complexometry.adultoid;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class oz2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ adultoid.attabal a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oz2(adultoid.attabal attabalVar, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.a = attabalVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new oz2(this.a, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new oz2(this.a, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        this.a.onVideoEnd();
        return Unit.f29295attabal;
    }
}
