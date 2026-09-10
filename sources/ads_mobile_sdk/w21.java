package ads_mobile_sdk;

import android.content.Context;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class w21 extends SuspendLambda implements Function2 {
    public final /* synthetic */ d41 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w21(d41 d41Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.a = d41Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new w21(this.a, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new w21(this.a, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        d41 d41Var = this.a;
        liquory.attabal attabalVarJ = d41Var.j();
        Context context = d41Var.k.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        cg2 cg2Var = new cg2(context, attabalVarJ);
        cg2Var.addView(d41Var.k);
        return cg2Var;
    }
}
