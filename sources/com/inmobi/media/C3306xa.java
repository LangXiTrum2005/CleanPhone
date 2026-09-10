package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.squareup.picasso.Picasso;
import java.lang.ref.WeakReference;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.xa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3306xa implements Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        WeakReference weakReferenceA;
        Intrinsics.f(activity, "activity");
        synchronized (C3322ya.f24131c) {
            try {
                if (C3322ya.f24130b != null && (weakReferenceA = C3322ya.a(C3322ya.f24129a, activity)) != null) {
                    activity.getApplication().unregisterActivityLifecycleCallbacks(this);
                    C3322ya.d.remove(weakReferenceA);
                    if (C3322ya.d.isEmpty()) {
                        Intrinsics.e(C3322ya.d(), "access$getTAG$p(...)");
                        Objects.toString(C3322ya.f24130b);
                        Picasso picasso = C3322ya.f24130b;
                        if (picasso != null) {
                            picasso.shutdown();
                        }
                        C3322ya.f24130b = null;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Intrinsics.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Intrinsics.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Intrinsics.f(activity, "activity");
        Intrinsics.f(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Intrinsics.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Intrinsics.f(activity, "activity");
    }
}
