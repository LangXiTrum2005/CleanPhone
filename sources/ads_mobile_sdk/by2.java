package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import saneness.vinyl;

/* JADX INFO: loaded from: classes.dex */
public final class by2 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ hy2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public by2(hy2 hy2Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = hy2Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new by2(this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new by2(this.b, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            hy2 hy2Var = this.b;
            vinyl vinylVar = hy2Var.d;
            scarbroite.attabal attabalVar = hy2Var.b.i0;
            if (attabalVar == null) {
                attabalVar = yg2.a;
            }
            this.a = 1;
            if (vinylVar.a(attabalVar, this) == objBeachfront) {
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
