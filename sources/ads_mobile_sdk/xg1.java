package ads_mobile_sdk;

import com.google.gson.JsonObject;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class xg1 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ yg1 b;
    public final /* synthetic */ gq0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xg1(yg1 yg1Var, gq0 gq0Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = yg1Var;
        this.c = gq0Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new xg1(this.b, this.c, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new xg1(this.b, this.c, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            yg1 yg1Var = this.b;
            ag1 ag1Var = yg1Var.c;
            gq0 gq0Var = this.c;
            String str = yg1Var.d;
            this.a = 1;
            ag1Var.getClass();
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("js", str);
            Object objA = gq0Var.a(jsonObject, "onReadyEventReceived", this);
            if (objA != p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
                objA = Unit.f29295attabal;
            }
            if (objA == objBeachfront) {
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
