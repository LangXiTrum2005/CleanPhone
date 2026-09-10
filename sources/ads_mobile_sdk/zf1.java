package ads_mobile_sdk;

import com.google.gson.JsonObject;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class zf1 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ gq0 b;
    public final /* synthetic */ JsonObject c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zf1(gq0 gq0Var, JsonObject jsonObject, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = gq0Var;
        this.c = jsonObject;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new zf1(this.b, this.c, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new zf1(this.b, this.c, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            gq0 gq0Var = this.b;
            JsonObject jsonObject = this.c;
            this.a = 1;
            if (gq0Var.a(jsonObject, "onScreenInfoChanged", this) == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
        }
        return Unit.f29295attabal;
    }
}
