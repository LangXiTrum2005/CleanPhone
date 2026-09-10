package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class xy0 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f22036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f22037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public wy0 f22038c;

    public boolean a() {
        return false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (!this.f22037b) {
            this.f22037b = true;
            if (this.f22036a) {
                b(true);
                wy0 wy0Var = this.f22038c;
                if (wy0Var != null) {
                    wy0Var.zzd(true);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        boolean z10 = runningAppProcessInfo.importance == 100 || a();
        if (this.f22037b != z10) {
            this.f22037b = z10;
            if (this.f22036a) {
                b(z10);
                wy0 wy0Var = this.f22038c;
                if (wy0Var != null) {
                    wy0Var.zzd(z10);
                }
            }
        }
    }

    public void b(boolean z10) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
