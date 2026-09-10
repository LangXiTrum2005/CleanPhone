package ads_mobile_sdk;

import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ly2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ my2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ly2(my2 my2Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.a = my2Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new ly2(this.a, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new ly2(this.a, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        hy2 hy2Var = (hy2) this.a.c;
        g1 g1Var = hy2Var.b.n0;
        if (g1Var == g1.THIRD_PARTY_SDK_CALLBACK) {
            saran saranVar = hy2Var.a;
            wx2 block = new wx2(hy2Var, null);
            EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
        } else if (g1Var == g1.ON_AD_SHOW) {
            saran saranVar2 = hy2Var.a;
            xx2 block2 = new xx2(hy2Var, null);
            EmptyCoroutineContext context2 = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar2, "<this>");
            Intrinsics.checkNotNullParameter(context2, "context");
            Intrinsics.checkNotNullParameter(block2, "block");
            hy2Var.g = cutely.wireman(saranVar2, context2, null, new x13(block2, null), 2, null);
        }
        return Unit.f29295attabal;
    }
}
