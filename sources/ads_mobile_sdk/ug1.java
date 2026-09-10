package ads_mobile_sdk;

import com.google.gson.JsonObject;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ug1 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ yg1 b;
    public final /* synthetic */ gq0 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ug1(yg1 yg1Var, gq0 gq0Var, boolean z, boolean z2, boolean z3, boolean z4, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = yg1Var;
        this.c = gq0Var;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new ug1(this.b, this.c, this.d, this.e, this.f, this.g, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ug1) create((saran) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            ag1 ag1Var = this.b.c;
            gq0 gq0Var = this.c;
            boolean z = this.d;
            boolean z2 = this.e;
            boolean z3 = this.f;
            boolean z4 = this.g;
            this.a = 1;
            ag1Var.getClass();
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("sms", igo.attabal.attabal(z));
            jsonObject.addProperty("tel", igo.attabal.attabal(z2));
            jsonObject.addProperty("calendar", igo.attabal.attabal(z3));
            jsonObject.addProperty("storePicture", igo.attabal.attabal(z4));
            jsonObject.addProperty("inlineVideo", igo.attabal.attabal(true));
            Object objA = gq0Var.a(jsonObject, "onDeviceFeaturesReceived", this);
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
