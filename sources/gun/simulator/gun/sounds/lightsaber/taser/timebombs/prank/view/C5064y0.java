package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5064y0 implements Application.ActivityLifecycleCallbacks {
    private static final String TAG = "ActivityManager";
    private String lastStoppedActivityName;
    private C4976x0 targetActivityInfo;
    public static final C4800v0 Companion = new C4800v0(null);
    private static final C5064y0 instance = new C5064y0();
    private AtomicBoolean isInitialized = new AtomicBoolean(false);
    private final CopyOnWriteArraySet<String> startedActivities = new CopyOnWriteArraySet<>();
    private final CopyOnWriteArraySet<C4888w0> callbacks = new CopyOnWriteArraySet<>();
    private final AtomicBoolean inBackground = new AtomicBoolean(false);

    private C5064y0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void init(Context context) {
        if (this.isInitialized.getAndSet(true)) {
            return;
        }
        try {
            C3622hc0.INSTANCE.runOnUiThread(new Ff0(19, context, this));
        } catch (Exception e) {
            C4917wJ.Companion.e(TAG, "Error initializing ActivityManager", e);
            this.isInitialized.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: init$lambda-0, reason: not valid java name */
    public static final void m287init$lambda0(Context context, C5064y0 c5064y0) {
        AbstractC2995aW.q(context, "$context");
        AbstractC2995aW.q(c5064y0, "this$0");
        Context applicationContext = context.getApplicationContext();
        AbstractC2995aW.o(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(c5064y0);
    }

    private final boolean isAppForeground() {
        return !this.startedActivities.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isAppInForeground() {
        return !this.isInitialized.get() || this.lastStoppedActivityName == null || isAppForeground();
    }

    public final void addListener(C4888w0 c4888w0) {
        AbstractC2995aW.q(c4888w0, "callback");
        this.callbacks.add(c4888w0);
    }

    public final void deInit$vungle_ads_release(Context context) {
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
        Context applicationContext = context.getApplicationContext();
        AbstractC2995aW.o(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this);
        this.startedActivities.clear();
        this.isInitialized.set(false);
        this.callbacks.clear();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        AbstractC2995aW.q(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        AbstractC2995aW.q(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        AbstractC2995aW.q(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        AbstractC2995aW.q(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        AbstractC2995aW.q(activity, "activity");
        AbstractC2995aW.q(bundle, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        AbstractC2995aW.q(activity, "activity");
        this.startedActivities.add(activity.toString());
        if (this.inBackground.getAndSet(false)) {
            Iterator<C4888w0> it = this.callbacks.iterator();
            while (it.hasNext()) {
                it.next().onForeground();
            }
            C4976x0 c4976x0 = this.targetActivityInfo;
            if (c4976x0 != null) {
                Context context = c4976x0.getContext().get();
                if (context != null) {
                    Companion.startWhenForeground(context, c4976x0.getDeepLinkOverrideIntent(), c4976x0.getDefaultIntent(), c4976x0.getAdOpenCallback());
                }
                this.targetActivityInfo = null;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        AbstractC2995aW.q(activity, "activity");
        this.lastStoppedActivityName = activity.toString();
        this.startedActivities.remove(activity.toString());
        boolean zIsAppInForeground = isAppInForeground();
        this.inBackground.set(!zIsAppInForeground);
        if (zIsAppInForeground) {
            return;
        }
        Iterator<C4888w0> it = this.callbacks.iterator();
        while (it.hasNext()) {
            it.next().onBackground();
        }
    }
}
