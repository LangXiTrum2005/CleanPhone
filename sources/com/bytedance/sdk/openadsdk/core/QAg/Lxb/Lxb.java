package com.bytedance.sdk.openadsdk.core.QAg.Lxb;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb implements Application.ActivityLifecycleCallbacks {
    private static volatile Lxb Lxb;
    private final LD LD;

    private Lxb(Application application) {
        this.LD = LD.Lxb(application);
    }

    public static Lxb Lxb(Application application) {
        if (Lxb == null) {
            synchronized (Lxb.class) {
                try {
                    if (Lxb == null) {
                        Lxb = new Lxb(application);
                        application.registerActivityLifecycleCallbacks(Lxb);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return Lxb;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        LD ld = this.LD;
        if (ld != null) {
            ld.Lxb(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        LD ld = this.LD;
        if (ld != null) {
            ld.LD(activity);
        }
    }

    public String Lxb(String str, long j, int i) {
        LD ld = this.LD;
        if (ld != null) {
            return ld.Lxb(str, j, i);
        }
        return "null";
    }
}
