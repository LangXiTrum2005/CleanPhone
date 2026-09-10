package ads_mobile_sdk;

import java.util.Map;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.earstone;

/* JADX INFO: loaded from: classes.dex */
public final class pj0 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pj0(String str, String str2, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = str;
        this.c = str2;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        pj0 pj0Var = new pj0(this.b, this.c, dernVar);
        pj0Var.a = obj;
        return pj0Var;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((pj0) create((gj0) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        gj0 gj0Var = (gj0) this.a;
        String value = this.b;
        String key = this.c;
        vm0 vm0VarN = gj0Var.n();
        Intrinsics.checkNotNullExpressionValue(vm0VarN, "toBuilder(...)");
        earstone builder = (earstone) vm0VarN;
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (value == null || value.length() == 0) {
            Map mapCompetently = builder.competently();
            Intrinsics.checkNotNullExpressionValue(mapCompetently, "getStoredSdkCoreDataMap(...)");
            Intrinsics.checkNotNullParameter(new zd0(mapCompetently), "<this>");
            Intrinsics.checkNotNullParameter(key, "key");
            key.getClass();
            builder.b();
            ((gj0) builder.b).t().remove(key);
        } else {
            Map mapCompetently2 = builder.competently();
            Intrinsics.checkNotNullExpressionValue(mapCompetently2, "getStoredSdkCoreDataMap(...)");
            Intrinsics.checkNotNullParameter(new zd0(mapCompetently2), "<this>");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            key.getClass();
            builder.b();
            ((gj0) builder.b).t().put(key, value);
        }
        xm0 xm0VarA = builder.a();
        Intrinsics.checkNotNullExpressionValue(xm0VarA, "build(...)");
        return (gj0) xm0VarA;
    }
}
