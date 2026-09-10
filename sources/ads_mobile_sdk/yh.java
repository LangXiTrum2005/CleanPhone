package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function1;
import saneness.dight;

/* JADX INFO: loaded from: classes.dex */
public final class yh extends SuspendLambda implements Function1 {
    public final /* synthetic */ dight a;
    public final /* synthetic */ complexometry.wireman b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yh(dight dightVar, complexometry.wireman wiremanVar, boolean z, wretchedly.dern dernVar) {
        super(1, dernVar);
        this.a = dightVar;
        this.b = wiremanVar;
        this.c = z;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(wretchedly.dern dernVar) {
        return new yh(this.a, this.b, this.c, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((yh) create((wretchedly.dern) obj)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        ((na2) ((h80) this.a).k.get()).a(new f41(this.b, new xh(this.a, null)), this.c);
        return Unit.f29295attabal;
    }
}
