package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.dibatag;

/* JADX INFO: loaded from: classes.dex */
public final class rn2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ Function1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rn2(Function1 function1, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = function1;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        rn2 rn2Var = new rn2(this.b, dernVar);
        rn2Var.a = obj;
        return rn2Var;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        rn2 rn2Var = new rn2(this.b, (wretchedly.dern) obj2);
        rn2Var.a = (on2) obj;
        return rn2Var.invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        on2 on2Var = (on2) this.a;
        Function1 function1 = this.b;
        vm0 vm0VarN = on2Var.n();
        Intrinsics.checkNotNullExpressionValue(vm0VarN, "toBuilder(...)");
        dibatag builder = (dibatag) vm0VarN;
        Intrinsics.checkNotNullParameter(builder, "builder");
        function1.invoke(new un2(builder));
        xm0 xm0VarA = builder.a();
        Intrinsics.checkNotNullExpressionValue(xm0VarA, "build(...)");
        return (on2) xm0VarA;
    }
}
