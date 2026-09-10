package ads_mobile_sdk;

import com.google.gson.JsonObject;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import tetrahedral.triweekly;

/* JADX INFO: loaded from: classes.dex */
public final class ox1 extends SuspendLambda implements triweekly {
    public int a;
    public /* synthetic */ gq0 b;

    public ox1(wretchedly.dern dernVar) {
        super(3, dernVar);
    }

    @Override // tetrahedral.triweekly
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ox1 ox1Var = new ox1((wretchedly.dern) obj3);
        ox1Var.b = (gq0) obj;
        return ox1Var.invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            gq0 gq0Var = this.b;
            JsonObject jsonObject = new JsonObject();
            this.a = 1;
            if (gq0Var.a(jsonObject, "onSdkAdUserInteractionClick", this) == objBeachfront) {
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
