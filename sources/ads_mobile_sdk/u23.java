package ads_mobile_sdk;

import android.os.Binder;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class u23 extends SuspendLambda implements Function2 {
    public final /* synthetic */ x23 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u23(x23 x23Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.a = x23Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new u23(this.a, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new u23(this.a, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        x23 x23Var = this.a;
        x23Var.g.set(true);
        if (x23Var.d.isConnected() || x23Var.d.isConnecting()) {
            x23Var.d.disconnect();
        }
        Binder.flushPendingCommands();
        return Unit.f29295attabal;
    }
}
