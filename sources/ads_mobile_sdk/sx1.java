package ads_mobile_sdk;

import android.view.View;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import saneness.glassmaker;
import tetrahedral.triweekly;

/* JADX INFO: loaded from: classes.dex */
public final class sx1 extends SuspendLambda implements triweekly {
    public /* synthetic */ glassmaker a;
    public final /* synthetic */ tx1 b;
    public final /* synthetic */ View c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sx1(tx1 tx1Var, View view, wretchedly.dern dernVar) {
        super(3, dernVar);
        this.b = tx1Var;
        this.c = view;
    }

    @Override // tetrahedral.triweekly
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        sx1 sx1Var = new sx1(this.b, this.c, (wretchedly.dern) obj3);
        sx1Var.a = (glassmaker) obj2;
        return sx1Var.invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        this.b.f.a(this.a, this.c);
        this.b.n.add(this.c);
        return Unit.f29295attabal;
    }
}
