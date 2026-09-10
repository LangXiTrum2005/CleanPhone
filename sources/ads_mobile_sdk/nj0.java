package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.earstone;

/* JADX INFO: loaded from: classes.dex */
public final class nj0 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nj0(String str, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = str;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        nj0 nj0Var = new nj0(this.b, dernVar);
        nj0Var.a = obj;
        return nj0Var;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        nj0 nj0Var = new nj0(this.b, (wretchedly.dern) obj2);
        nj0Var.a = (gj0) obj;
        return nj0Var.invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        gj0 gj0Var = (gj0) this.a;
        String value = this.b;
        vm0 vm0VarN = gj0Var.n();
        Intrinsics.checkNotNullExpressionValue(vm0VarN, "toBuilder(...)");
        earstone builder = (earstone) vm0VarN;
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(value, "value");
        builder.wireman(value);
        xm0 xm0VarA = builder.a();
        Intrinsics.checkNotNullExpressionValue(xm0VarA, "build(...)");
        return (gj0) xm0VarA;
    }
}
