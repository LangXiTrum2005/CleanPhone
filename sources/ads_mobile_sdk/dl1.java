package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.strokes;

/* JADX INFO: loaded from: classes.dex */
public final class dl1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ long a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dl1(long j, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.a = j;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new dl1(this.a, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new dl1(this.a, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        long j = this.a;
        strokes builder = xk1.r();
        Intrinsics.checkNotNullExpressionValue(builder, "newBuilder(...)");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.attabal(j);
        xm0 xm0VarA = builder.a();
        Intrinsics.checkNotNullExpressionValue(xm0VarA, "build(...)");
        return (xk1) xm0VarA;
    }
}
