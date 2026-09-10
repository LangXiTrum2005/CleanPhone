package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.work.WorkRequest;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ln0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3994ln0 implements InterfaceC2570Lh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f4666a = 0;
    public int b = 0;
    public int c = 1;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (activity != null && (activity instanceof InterfaceC3766jB)) {
            View rootView = activity.getWindow().getDecorView().getRootView();
            rootView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC3292dn0(rootView, activity));
        }
        this.b++;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        int i = this.b - 1;
        this.b = i;
        if (i <= 0) {
            this.c = 1;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        C4626t1 c4626t1X;
        X0.j.h();
        if (!(activity instanceof InterfaceC4997xB) || System.currentTimeMillis() - this.f4666a <= ((long) this.c) * WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
            return;
        }
        C3.Z().getClass();
        if (C3.a0().c.contains(activity.getClass())) {
            return;
        }
        C3.Z().getClass();
        if (C3.a0().d == null || (c4626t1X = C3.a0().d.x(1)) == null || !c4626t1X.a()) {
            C3.a0().getClass();
            return;
        }
        if (W1.a(activity)) {
            this.f4666a = System.currentTimeMillis();
            this.c++;
            C3 c3Z = C3.Z();
            Context applicationContext = activity.getApplicationContext();
            synchronized (c3Z.b) {
                c3Z.X(applicationContext, null);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
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
