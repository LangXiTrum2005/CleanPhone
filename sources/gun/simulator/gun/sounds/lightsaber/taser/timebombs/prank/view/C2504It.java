package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.measurement.AppMeasurement;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.It, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2504It implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f3244a = Collections.newSetFromMap(new WeakHashMap());

    public static void a(Intent intent) {
        Bundle bundle = null;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                bundle = extras.getBundle("gcm.n.analytics_data");
            }
        } catch (RuntimeException unused) {
        }
        if (bundle != null && "1".equals(bundle.getString("google.c.a.e"))) {
            if (bundle != null && "1".equals(bundle.getString("google.c.a.tc"))) {
                C4266ou c4266ouB = C4266ou.b();
                c4266ouB.a();
                InterfaceC3227d4 interfaceC3227d4 = (InterfaceC3227d4) c4266ouB.d.a(InterfaceC3227d4.class);
                if (interfaceC3227d4 != null) {
                    String string = bundle.getString("google.c.a.c_id");
                    C3315e4 c3315e4 = (C3315e4) interfaceC3227d4;
                    if ((!gp0.b.contains(AppMeasurement.FCM_ORIGIN)) && gp0.c(AppMeasurement.FCM_ORIGIN, "_ln")) {
                        c3315e4.f4306a.setUserProperty(AppMeasurement.FCM_ORIGIN, "_ln", string);
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("source", "Firebase");
                    bundle2.putString("medium", "notification");
                    bundle2.putString(MBInterstitialActivity.INTENT_CAMAPIGN, string);
                    c3315e4.a(AppMeasurement.FCM_ORIGIN, "_cmp", bundle2);
                }
            }
            AbstractC2995aW.a0(bundle, "_no");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intent intent = activity.getIntent();
        if (intent == null || !this.f3244a.add(intent)) {
            return;
        }
        if (Build.VERSION.SDK_INT <= 25) {
            new Handler(Looper.getMainLooper()).post(new RunnableC3976le0(28, this, intent));
        } else {
            a(intent);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (activity.isFinishing()) {
            this.f3244a.remove(activity.getIntent());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
