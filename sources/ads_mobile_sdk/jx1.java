package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function1;
import saneness.glassmaker;
import tetrahedral.triweekly;

/* JADX INFO: loaded from: classes.dex */
public final class jx1 extends SuspendLambda implements Function1 {
    public int a;
    public final /* synthetic */ triweekly b;
    public final /* synthetic */ gq0 c;
    public final /* synthetic */ glassmaker d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jx1(triweekly triweeklyVar, gq0 gq0Var, glassmaker glassmakerVar, wretchedly.dern dernVar) {
        super(1, dernVar);
        this.b = triweeklyVar;
        this.c = gq0Var;
        this.d = glassmakerVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(wretchedly.dern dernVar) {
        return new jx1(this.b, this.c, this.d, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((jx1) create((wretchedly.dern) obj)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            triweekly triweeklyVar = this.b;
            gq0 gq0Var = this.c;
            glassmaker glassmakerVar = this.d;
            this.a = 1;
            if (triweeklyVar.invoke(gq0Var, glassmakerVar, this) == objBeachfront) {
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
