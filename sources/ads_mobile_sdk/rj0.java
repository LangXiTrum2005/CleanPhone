package ads_mobile_sdk;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.earstone;

/* JADX INFO: loaded from: classes.dex */
public final class rj0 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ JsonObject b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ mv d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rj0(mv mvVar, JsonObject jsonObject, wretchedly.dern dernVar, boolean z) {
        super(2, dernVar);
        this.b = jsonObject;
        this.c = z;
        this.d = mvVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        rj0 rj0Var = new rj0(this.d, this.b, dernVar, this.c);
        rj0Var.a = obj;
        return rj0Var;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((rj0) create((gj0) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        gj0 gj0Var = (gj0) this.a;
        JsonObject jsonObject = this.b;
        boolean z = this.c;
        mv value = this.d;
        vm0 vm0VarN = gj0Var.n();
        Intrinsics.checkNotNullExpressionValue(vm0VarN, "toBuilder(...)");
        earstone builder = (earstone) vm0VarN;
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (jsonObject != null) {
            String value2 = new Gson().toJson((JsonElement) jsonObject);
            Intrinsics.checkNotNullExpressionValue(value2, "toJson(...)");
            Intrinsics.checkNotNullParameter(value2, "value");
            builder.marial(value2);
            if (z) {
                builder.attabal(0);
            }
        }
        builder.impromptu();
        Intrinsics.checkNotNullParameter(value, "value");
        builder.dern(value);
        xm0 xm0VarA = builder.a();
        Intrinsics.checkNotNullExpressionValue(xm0VarA, "build(...)");
        return (gj0) xm0VarA;
    }
}
