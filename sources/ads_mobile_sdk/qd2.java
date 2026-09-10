package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class qd2 extends SuspendLambda implements Function1 {
    public formularization.attabal a;
    public ee2 b;
    public int c;
    public final /* synthetic */ ee2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qd2(ee2 ee2Var, wretchedly.dern dernVar) {
        super(1, dernVar);
        this.d = ee2Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(wretchedly.dern dernVar) {
        return new qd2(this.d, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new qd2(this.d, (wretchedly.dern) obj).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        formularization.attabal attabalVar;
        ee2 ee2Var;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.c;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            ee2 ee2Var2 = this.d;
            attabalVar = ee2Var2.f;
            this.a = attabalVar;
            this.b = ee2Var2;
            this.c = 1;
            if (attabalVar.attabal(null, this) == objBeachfront) {
                return objBeachfront;
            }
            ee2Var = ee2Var2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ee2Var = this.b;
            attabalVar = this.a;
            p002kotlin.dern.saneness(obj);
        }
        try {
            return p002kotlin.time.saneness.cutely(ee2Var.o);
        } finally {
            attabalVar.wireman(null);
        }
    }
}
