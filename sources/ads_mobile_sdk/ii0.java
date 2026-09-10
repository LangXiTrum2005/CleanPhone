package ads_mobile_sdk;

import androidx.p000activity.ComponentActivity;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.libya;

/* JADX INFO: loaded from: classes.dex */
public final class ii0 extends SuspendLambda implements Function2 {
    public final /* synthetic */ libya a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ii0(libya libyaVar, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.a = libyaVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new ii0(this.a, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new ii0(this.a, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        libya libyaVar = this.a;
        cr closeReason = cr.CUSTOM;
        bm0 bm0Var = (bm0) libyaVar;
        bm0Var.getClass();
        Intrinsics.checkNotNullParameter(closeReason, "closeReason");
        bm0Var.t = closeReason;
        ComponentActivity componentActivity = bm0Var.l;
        if (componentActivity != null) {
            componentActivity.finish();
        }
        return Unit.f29295attabal;
    }
}
