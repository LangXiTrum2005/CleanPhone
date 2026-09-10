package ads_mobile_sdk;

import android.content.Context;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class w30 extends SuspendLambda implements Function2 {
    public final /* synthetic */ x30 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w30(x30 x30Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.a = x30Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new w30(this.a, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new w30(this.a, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String strDern;
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        v30 v30Var = this.a.c;
        v30Var.f.getAndSet(true);
        Context context = v30Var.a;
        if (v30Var.e == null && (strDern = arytenoidectomy.wireman.dern(context, null)) != null && !Intrinsics.wireman(strDern, context.getPackageName())) {
            arytenoidectomy.wireman.attabal(context, strDern, v30Var);
        }
        return Unit.f29295attabal;
    }
}
