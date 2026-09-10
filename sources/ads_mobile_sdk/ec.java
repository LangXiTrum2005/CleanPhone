package ads_mobile_sdk;

import java.util.Map;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.yemenite;

/* JADX INFO: loaded from: classes.dex */
public final class ec extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ec(String str, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = str;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        ec ecVar = new ec(this.b, dernVar);
        ecVar.a = obj;
        return ecVar;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ec ecVar = new ec(this.b, (wretchedly.dern) obj2);
        ecVar.a = (cc) obj;
        return ecVar.invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        cc ccVar = (cc) this.a;
        String key = this.b;
        vm0 vm0VarN = ccVar.n();
        Intrinsics.checkNotNullExpressionValue(vm0VarN, "toBuilder(...)");
        yemenite builder = (yemenite) vm0VarN;
        Intrinsics.checkNotNullParameter(builder, "builder");
        Map mapAttabal = builder.attabal();
        Intrinsics.checkNotNullExpressionValue(mapAttabal, "getLogsMap(...)");
        Intrinsics.checkNotNullParameter(new zd0(mapAttabal), "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        key.getClass();
        builder.b();
        ((cc) builder.b).q().remove(key);
        xm0 xm0VarA = builder.a();
        Intrinsics.checkNotNullExpressionValue(xm0VarA, "build(...)");
        return (cc) xm0VarA;
    }
}
