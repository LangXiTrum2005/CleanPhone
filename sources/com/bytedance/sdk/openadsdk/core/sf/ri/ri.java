package com.bytedance.sdk.openadsdk.core.sf.ri;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public class ri implements Application.ActivityLifecycleCallbacks {
    private static volatile ri ri;
    private final lr lr;

    private ri(Application application) {
        this.lr = lr.ri(application);
    }

    public static ri ri(Application application) {
        if (ri == null) {
            synchronized (ri.class) {
                try {
                    if (ri == null) {
                        ri = new ri(application);
                        application.registerActivityLifecycleCallbacks(ri);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ri;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        lr lrVar = this.lr;
        if (lrVar != null) {
            lrVar.ri(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        lr lrVar = this.lr;
        if (lrVar != null) {
            lrVar.lr(activity);
        }
    }

    public String ri(String str, long j, int i) {
        lr lrVar = this.lr;
        if (lrVar != null) {
            return lrVar.ri(str, j, i);
        }
        return "null";
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
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
