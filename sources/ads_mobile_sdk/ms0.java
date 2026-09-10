package ads_mobile_sdk;

import android.app.Activity;
import android.content.Context;
import android.view.WindowManager;
import android.widget.FrameLayout;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import saneness.technofreak;

/* JADX INFO: loaded from: classes.dex */
public final class ms0 extends SuspendLambda implements Function2 {
    public final /* synthetic */ gq0 a;
    public final /* synthetic */ ns0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ms0(gq0 gq0Var, ns0 ns0Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.a = gq0Var;
        this.b = ns0Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new ms0(this.a, this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new ms0(this.a, this.b, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FrameLayout frameLayoutC;
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        this.a.setVisibility(8);
        WindowManager windowManager = (WindowManager) this.b.b.a.get();
        technofreak technofreakVar = (technofreak) ((yj1) this.b.c.get()).c.get();
        Context context = (technofreakVar == null || (frameLayoutC = ((cm1) technofreakVar).c()) == null) ? null : frameLayoutC.getContext();
        Activity activity = context instanceof Activity ? (Activity) context : null;
        WindowManager windowManager2 = activity != null ? (WindowManager) activity.getSystemService(WindowManager.class) : null;
        if (this.a.getWindowToken() != null) {
            if (windowManager != null) {
                windowManager.removeView(this.a);
            }
            if (windowManager2 != null) {
                windowManager2.removeView(this.a);
            }
        } else {
            y13.a("Failed to remove validator from WindowManager", null, 6);
        }
        return Unit.f29295attabal;
    }
}
