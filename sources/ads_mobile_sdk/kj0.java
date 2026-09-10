package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.earstone;

/* JADX INFO: loaded from: classes.dex */
public final class kj0 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;

    public kj0(wretchedly.dern dernVar) {
        super(2, dernVar);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        kj0 kj0Var = new kj0(dernVar);
        kj0Var.a = obj;
        return kj0Var;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        kj0 kj0Var = new kj0((wretchedly.dern) obj2);
        kj0Var.a = (gj0) obj;
        return kj0Var.invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        vm0 vm0VarN = ((gj0) this.a).n();
        Intrinsics.checkNotNullExpressionValue(vm0VarN, "toBuilder(...)");
        earstone builder = (earstone) vm0VarN;
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.attabal(builder.beachfront() + 1);
        xm0 xm0VarA = builder.a();
        Intrinsics.checkNotNullExpressionValue(xm0VarA, "build(...)");
        return (gj0) xm0VarA;
    }
}
