package ads_mobile_sdk;

import kotlinx.coroutines.splinterproof;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class k3 extends SuspendLambda implements Function2 {
    public formularization.attabal a;
    public x3 b;
    public int c;
    public final /* synthetic */ x3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(x3 x3Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.d = x3Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new k3(this.d, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new k3(this.d, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        formularization.attabal attabalVar;
        x3 x3Var;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.c;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            long jX = this.d.g.X();
            this.c = 1;
            if (splinterproof.saneness(jX, this) != objBeachfront) {
            }
            return objBeachfront;
        }
        if (i == 1) {
            p002kotlin.dern.saneness(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x3Var = this.b;
            attabalVar = this.a;
            p002kotlin.dern.saneness(obj);
        }
        try {
            x3Var.y.dern();
            return Unit.f29295attabal;
        } finally {
            attabalVar.wireman(null);
        }
        x3 x3Var2 = this.d;
        attabalVar = x3Var2.p;
        this.a = attabalVar;
        this.b = x3Var2;
        this.c = 2;
        if (attabalVar.attabal(null, this) != objBeachfront) {
            x3Var = x3Var2;
            x3Var.y.dern();
            return Unit.f29295attabal;
        }
        return objBeachfront;
    }
}
