package ads_mobile_sdk;

import android.view.WindowManager;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ub1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ WindowManager a;
    public final /* synthetic */ gq0 b;
    public final /* synthetic */ WindowManager.LayoutParams c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ub1(WindowManager windowManager, gq0 gq0Var, WindowManager.LayoutParams layoutParams, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.a = windowManager;
        this.b = gq0Var;
        this.c = layoutParams;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new ub1(this.a, this.b, this.c, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ub1) create((saran) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        this.a.updateViewLayout(this.b, this.c);
        return Unit.f29295attabal;
    }
}
