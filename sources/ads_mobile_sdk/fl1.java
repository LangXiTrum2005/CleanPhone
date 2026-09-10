package ads_mobile_sdk;

import java.util.Map;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.strokes;

/* JADX INFO: loaded from: classes.dex */
public final class fl1 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fl1(String str, wretchedly.dern dernVar, boolean z) {
        super(2, dernVar);
        this.b = str;
        this.c = z;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        fl1 fl1Var = new fl1(this.b, dernVar, this.c);
        fl1Var.a = obj;
        return fl1Var;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((fl1) create((xk1) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        xk1 xk1Var = (xk1) this.a;
        String key = this.b;
        boolean z = this.c;
        vm0 vm0VarN = xk1Var.n();
        Intrinsics.checkNotNullExpressionValue(vm0VarN, "toBuilder(...)");
        strokes builder = (strokes) vm0VarN;
        Intrinsics.checkNotNullParameter(builder, "builder");
        Map mapWireman = builder.wireman();
        Intrinsics.checkNotNullExpressionValue(mapWireman, "getAdUnitToUseMediaViewMap(...)");
        Intrinsics.checkNotNullParameter(new zd0(mapWireman), "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        builder.dern(key, z);
        xm0 xm0VarA = builder.a();
        Intrinsics.checkNotNullExpressionValue(xm0VarA, "build(...)");
        return (xk1) xm0VarA;
    }
}
