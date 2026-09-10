package ads_mobile_sdk;

import android.app.Activity;
import android.view.ViewGroup;
import android.view.Window;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ph1 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ qh1 b;
    public final /* synthetic */ ViewGroup c;
    public final /* synthetic */ bg2 d;
    public final /* synthetic */ Activity e;
    public final /* synthetic */ Window f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ph1(qh1 qh1Var, ViewGroup viewGroup, bg2 bg2Var, Activity activity, Window window, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = qh1Var;
        this.c = viewGroup;
        this.d = bg2Var;
        this.e = activity;
        this.f = window;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new ph1(this.b, this.c, this.d, this.e, this.f, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ph1) create((saran) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            qh1 qh1Var = this.b;
            ViewGroup viewGroup = this.c;
            bg2 bg2Var = this.d;
            Activity activity = this.e;
            Window window = this.f;
            Intrinsics.checkNotNullExpressionValue(window, "$window");
            qh1 qh1Var2 = this.b;
            gq0 gq0Var = qh1Var2.h;
            xq0 xq0Var = qh1Var2.g;
            this.a = 1;
            if (qh1Var.a(viewGroup, bg2Var, activity, window, gq0Var, xq0Var, this) == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
        }
        return Unit.f29295attabal;
    }
}
