package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.notornis;

/* JADX INFO: loaded from: classes.dex */
public final class kl2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ll2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kl2(ll2 ll2Var, String str, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = str;
        this.c = ll2Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        kl2 kl2Var = new kl2(this.c, this.b, dernVar);
        kl2Var.a = obj;
        return kl2Var;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((kl2) create((fl2) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        fl2 fl2Var = (fl2) this.a;
        String value = this.b;
        ll2 ll2Var = this.c;
        vm0 vm0VarN = fl2Var.n();
        Intrinsics.checkNotNullExpressionValue(vm0VarN, "toBuilder(...)");
        notornis builder = (notornis) vm0VarN;
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(value, "value");
        builder.dern(value);
        ll2Var.c.getClass();
        builder.attabal(System.currentTimeMillis());
        xm0 xm0VarA = builder.a();
        Intrinsics.checkNotNullExpressionValue(xm0VarA, "build(...)");
        return (fl2) xm0VarA;
    }
}
