package ads_mobile_sdk;

import com.google.gson.JsonObject;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class tg1 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ yg1 b;
    public final /* synthetic */ gq0 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg1(yg1 yg1Var, gq0 gq0Var, int i, int i2, int i3, int i4, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = yg1Var;
        this.c = gq0Var;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new tg1(this.b, this.c, this.d, this.e, this.f, this.g, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((tg1) create((saran) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            ag1 ag1Var = this.b.c;
            gq0 gq0Var = this.c;
            int i2 = this.d;
            int i3 = this.e;
            int i4 = this.f;
            int i5 = this.g;
            this.a = 1;
            ag1Var.getClass();
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("x", igo.attabal.wireman(i2));
            jsonObject.addProperty("y", igo.attabal.wireman(i3));
            jsonObject.addProperty("width", igo.attabal.wireman(i4));
            jsonObject.addProperty("height", igo.attabal.wireman(i5));
            Object objA = gq0Var.a(jsonObject, "onDefaultPositionReceived", this);
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
