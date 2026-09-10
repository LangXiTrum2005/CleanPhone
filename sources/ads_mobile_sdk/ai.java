package ads_mobile_sdk;

import android.content.Context;
import android.os.Looper;
import kotlinx.coroutines.impromptu;
import p002kotlin.Unit;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.terni;

/* JADX INFO: loaded from: classes.dex */
public final class ai extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;

    public ai(wretchedly.dern dernVar) {
        super(2, dernVar);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        ai aiVar = new ai(dernVar);
        aiVar.b = obj;
        return aiVar;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ai aiVar = new ai((wretchedly.dern) obj2);
        aiVar.b = (d41) obj;
        return aiVar.invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objCompetently;
        Object obj2;
        d41 d41Var;
        Object obj3;
        cg2 cg2Var;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            d41 d41Var2 = (d41) this.b;
            terni.f37333attabal.getClass();
            CoroutineContext coroutineContext = (CoroutineContext) ((i60) ((terni) en0.c.getValue())).u.get();
            this.b = d41Var2;
            this.a = 1;
            if (Intrinsics.wireman(Looper.getMainLooper(), Looper.myLooper())) {
                liquory.attabal attabalVarJ = d41Var2.j();
                Context context = d41Var2.k.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                cg2Var = new cg2(context, attabalVarJ);
                cg2Var.addView(d41Var2.k);
            } else {
                objCompetently = impromptu.competently(coroutineContext, new w21(d41Var2, null), this);
            }
            if (obj2 == objBeachfront) {
                obj2 = objCompetently;
                obj2 = cg2Var;
                return objBeachfront;
            }
            obj2 = objCompetently;
            obj2 = cg2Var;
            d41Var = d41Var2;
            obj3 = obj2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d41Var = (d41) this.b;
            p002kotlin.dern.saneness(obj);
            obj3 = obj;
        }
        return new ei(d41Var, (cg2) obj3);
    }
}
