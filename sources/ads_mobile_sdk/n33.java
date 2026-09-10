package ads_mobile_sdk;

import android.content.Context;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class n33 extends SuspendLambda implements Function2 {
    public final /* synthetic */ o33 a;
    public final /* synthetic */ Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n33(o33 o33Var, Context context, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.a = o33Var;
        this.b = context;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new n33(this.a, this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new n33(this.a, this.b, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        o33 o33Var = this.a;
        Context context = this.b;
        int i = o33.f3289attabal;
        o33Var.a(context);
        return Unit.f29295attabal;
    }
}
