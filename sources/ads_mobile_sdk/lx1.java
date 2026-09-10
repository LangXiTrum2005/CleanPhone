package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.glassmaker;

/* JADX INFO: loaded from: classes.dex */
public final class lx1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ tx1 a;
    public final /* synthetic */ glassmaker b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lx1(tx1 tx1Var, glassmaker glassmakerVar, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.a = tx1Var;
        this.b = glassmakerVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new lx1(this.a, this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new lx1(this.a, this.b, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        lv1 lv1Var = this.a.f;
        glassmaker adSession = this.b;
        lv1Var.getClass();
        Intrinsics.checkNotNullParameter(adSession, "adSession");
        return (Unit) lv1Var.f.attabal("FinishOmidSession", new av1(adSession));
    }
}
