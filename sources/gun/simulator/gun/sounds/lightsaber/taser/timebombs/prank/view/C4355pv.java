package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.pv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4355pv implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f4857a = new HashMap();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final ArrayList d = new ArrayList();
    public WeakReference e = null;

    public final void a(Activity activity, String str, ViewTreeObserverOnDrawListenerC4367q3 viewTreeObserverOnDrawListenerC4367q3) {
        synchronized (this) {
            try {
                WeakReference weakReference = new WeakReference(activity);
                if (weakReference.get() == null || this.c.get(((Activity) weakReference.get()).getClass()) == null) {
                    this.c.put(((Activity) weakReference.get()).getClass(), new HashMap());
                }
                HashMap map = (HashMap) this.c.get(((Activity) weakReference.get()).getClass());
                if (map == null) {
                    map = new HashMap();
                }
                map.put(str, viewTreeObserverOnDrawListenerC4367q3);
                this.c.put(((Activity) weakReference.get()).getClass(), map);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Activity activity, String str) {
        synchronized (this) {
            try {
                WeakReference weakReference = new WeakReference(activity);
                if (weakReference.get() != null && this.c.get(((Activity) weakReference.get()).getClass()) != null) {
                    HashMap map = (HashMap) this.c.get(((Activity) weakReference.get()).getClass());
                    if (map == null) {
                        return;
                    }
                    map.remove(str);
                    this.c.put(((Activity) weakReference.get()).getClass(), map);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.d.add(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        WeakReference weakReference = this.e;
        if (weakReference != null && weakReference.get() == activity) {
            this.e = null;
        }
        this.d.remove(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.e = new WeakReference(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        activity.getWindow().getDecorView().post(new RunnableC3252dN(18, this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        ViewTreeObserver viewTreeObserver = activity.getWindow().getDecorView().getViewTreeObserver();
        HashMap map = this.f4857a;
        viewTreeObserver.removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener) map.get(activity.getClass()));
        map.remove(activity.getClass());
        HashMap map2 = this.b;
        viewTreeObserver.removeOnDrawListener((ViewTreeObserver.OnDrawListener) map2.get(activity.getClass()));
        map2.remove(activity.getClass());
        this.c.remove(activity.getClass());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
