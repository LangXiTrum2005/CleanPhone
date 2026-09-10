package ads_mobile_sdk;

import android.view.View;
import java.util.List;
import p002kotlin.Unit;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.cord;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.glassmaker;
import tetrahedral.triweekly;

/* JADX INFO: loaded from: classes.dex */
public final class nx1 extends SuspendLambda implements triweekly {
    public /* synthetic */ glassmaker a;
    public final /* synthetic */ tx1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nx1(tx1 tx1Var, wretchedly.dern dernVar) {
        super(3, dernVar);
        this.b = tx1Var;
    }

    @Override // tetrahedral.triweekly
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        nx1 nx1Var = new nx1(this.b, (wretchedly.dern) obj3);
        nx1Var.a = (glassmaker) obj2;
        return nx1Var.invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        glassmaker glassmakerVar = this.a;
        List list = this.b.n;
        Intrinsics.checkNotNullExpressionValue(list, "access$getOmidRegisteredViews$p(...)");
        cord.polder(list);
        List list2 = this.b.n;
        Intrinsics.checkNotNullExpressionValue(list2, "access$getOmidRegisteredViews$p(...)");
        View view = (View) CollectionsKt.picketboat(list2);
        if (view != null) {
            this.b.f.a(glassmakerVar, view);
        }
        return Unit.f29295attabal;
    }
}
