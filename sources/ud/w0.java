package ud;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class w0 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1 f52177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f52178b;

    public w0(c1 sharedSessionRepository) {
        kotlin.jvm.internal.n.f(sharedSessionRepository, "sharedSessionRepository");
        this.f52177a = sharedSessionRepository;
        this.f52178b = true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.n.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        kotlin.jvm.internal.n.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.n.f(activity, "activity");
        if (this.f52178b) {
            this.f52177a.b();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        kotlin.jvm.internal.n.f(activity, "activity");
        if (this.f52178b) {
            this.f52177a.c();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        kotlin.jvm.internal.n.f(activity, "activity");
        kotlin.jvm.internal.n.f(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        kotlin.jvm.internal.n.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.n.f(activity, "activity");
    }
}
