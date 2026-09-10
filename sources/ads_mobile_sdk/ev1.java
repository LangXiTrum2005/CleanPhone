package ads_mobile_sdk;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import saneness.groundwood;
import saneness.unprincipled;
import saneness.untruth;

/* JADX INFO: loaded from: classes.dex */
public final class ev1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ lv1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ev1(lv1 lv1Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.a = lv1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new ev1(this.a, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new ev1(this.a, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        Context context = this.a.c;
        mw1 mw1Var = groundwood.f37158attabal;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new IllegalArgumentException("Application Context cannot be null");
        }
        if (!mw1Var.a) {
            mw1Var.a = true;
            ax1 ax1VarA = ax1.a();
            ax1VarA.c.getClass();
            unprincipled unprincipledVar = new unprincipled();
            untruth untruthVar = ax1VarA.b;
            Handler handler = new Handler();
            untruthVar.getClass();
            ax1VarA.d = new cd0(handler, applicationContext, unprincipledVar, ax1VarA);
            n4.d.a(applicationContext);
            tv1.a(applicationContext);
            WindowManager windowManager = nw1.a;
            nw1.c = applicationContext.getResources().getDisplayMetrics().density;
            nw1.a = (WindowManager) applicationContext.getSystemService("window");
            applicationContext.registerReceiver(new vx1(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
            i21.b.a = applicationContext.getApplicationContext();
            o oVar = o.f;
            if (!oVar.c) {
                oVar.d.a(applicationContext);
                xg xgVar = oVar.d;
                xgVar.c = oVar;
                xgVar.b();
                oVar.e = oVar.d.b;
                oVar.c = true;
            }
            dl2.d.a = new WeakReference(applicationContext);
            IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            applicationContext.registerReceiver(new cl2(), intentFilter);
        }
        return Unit.f29295attabal;
    }
}
