package ads_mobile_sdk;

import android.graphics.Rect;
import com.google.gson.JsonObject;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class hi1 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ ii1 b;
    public final /* synthetic */ gq0 c;
    public final /* synthetic */ Rect d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hi1(ii1 ii1Var, gq0 gq0Var, Rect rect, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = ii1Var;
        this.c = gq0Var;
        this.d = rect;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new hi1(this.b, this.c, this.d, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((hi1) create((saran) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            ag1 ag1Var = this.b.a;
            gq0 gq0Var = this.c;
            Rect rect = this.d;
            int i2 = rect.left;
            int i3 = rect.top;
            int iWidth = rect.width();
            int iHeight = this.d.height();
            this.a = 1;
            ag1Var.getClass();
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("x", igo.attabal.wireman(i2));
            jsonObject.addProperty("y", igo.attabal.wireman(i3));
            jsonObject.addProperty("width", igo.attabal.wireman(iWidth));
            jsonObject.addProperty("height", igo.attabal.wireman(iHeight));
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
