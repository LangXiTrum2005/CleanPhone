package saneness;

import ads_mobile_sdk.cg2;
import ads_mobile_sdk.d41;
import ads_mobile_sdk.ei;
import ads_mobile_sdk.en0;
import ads_mobile_sdk.i60;
import ads_mobile_sdk.i61;
import ads_mobile_sdk.w21;
import android.content.Context;
import android.os.Looper;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class powdery {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object attabal(d41 d41Var, wretchedly.dern dernVar) {
        i61 i61Var;
        Object objCompetently;
        cg2 cg2Var;
        if (dernVar instanceof i61) {
            i61Var = (i61) dernVar;
            int i = i61Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                i61Var.d = i - Integer.MIN_VALUE;
            } else {
                i61Var = new i61(this, dernVar);
            }
        } else {
            i61Var = new i61(this, dernVar);
        }
        Object obj = i61Var.b;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = i61Var.d;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            terni.f37333attabal.getClass();
            CoroutineContext coroutineContext = (CoroutineContext) ((i60) ((terni) en0.c.getValue())).u.get();
            i61Var.a = d41Var;
            i61Var.d = 1;
            if (Intrinsics.wireman(Looper.getMainLooper(), Looper.myLooper())) {
                liquory.attabal attabalVarJ = d41Var.j();
                Context context = d41Var.k.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                cg2Var = new cg2(context, attabalVarJ);
                cg2Var.addView(d41Var.k);
            } else {
                objCompetently = kotlinx.coroutines.impromptu.competently(coroutineContext, new w21(d41Var, null), i61Var);
            }
            if (obj == objBeachfront) {
                obj = objCompetently;
                obj = cg2Var;
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d41Var = i61Var.a;
            p002kotlin.dern.saneness(obj);
        }
        obj = objCompetently;
        obj = cg2Var;
        return new acidy.wireman(new ei(d41Var, (cg2) obj));
    }
}
