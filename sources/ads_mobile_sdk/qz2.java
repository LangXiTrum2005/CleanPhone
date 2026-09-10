package ads_mobile_sdk;

import complexometry.adultoid;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class qz2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ adultoid.attabal a;
    public final /* synthetic */ boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qz2(adultoid.attabal attabalVar, wretchedly.dern dernVar, boolean z) {
        super(2, dernVar);
        this.a = attabalVar;
        this.b = z;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new qz2(this.a, dernVar, this.b);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new qz2(this.a, (wretchedly.dern) obj2, this.b).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        this.a.onVideoMute(this.b);
        return Unit.f29295attabal;
    }
}
