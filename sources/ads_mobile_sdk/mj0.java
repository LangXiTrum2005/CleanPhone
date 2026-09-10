package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.earstone;

/* JADX INFO: loaded from: classes.dex */
public final class mj0 extends SuspendLambda implements Function2 {
    public mj0(wretchedly.dern dernVar) {
        super(2, dernVar);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new mj0(dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new mj0((wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        earstone builder = gj0.w();
        Intrinsics.checkNotNullExpressionValue(builder, "newBuilder(...)");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.impromptu();
        xm0 xm0VarA = builder.a();
        Intrinsics.checkNotNullExpressionValue(xm0VarA, "build(...)");
        return (gj0) xm0VarA;
    }
}
