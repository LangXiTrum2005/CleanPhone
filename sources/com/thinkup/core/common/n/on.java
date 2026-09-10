package com.thinkup.core.common.n;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class on implements Application.ActivityLifecycleCallbacks {
    int o;
    boolean o0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    boolean f41928n = false;
    ConcurrentHashMap<String, Boolean> m = new ConcurrentHashMap<>(3);

    public on(boolean z2) {
        this.o0 = false;
        if (z2) {
            this.o0 = true;
            o();
        }
        o0n.m().o(new n0() { // from class: com.thinkup.core.common.n.on.1
            @Override // com.thinkup.core.common.n.n0
            public final void o(boolean z3) {
                o0m o0mVarN = o0n.m().n();
                if (z3) {
                    if (o0mVarN == null || !o0mVarN.o()) {
                        return;
                    }
                    o0mVarN.onAppForegroundStatusChanged(true);
                    return;
                }
                if (o0mVarN == null || !o0mVarN.o()) {
                    return;
                }
                o0mVarN.onAppForegroundStatusChanged(false);
            }
        });
    }

    private static void o() {
        com.thinkup.core.common.oo0.oo.o();
        com.thinkup.core.common.oo0.n.o(o0n.m().on()).o(21, new com.thinkup.core.common.on.n0());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        activity.getClass();
        if (this.o0) {
            return;
        }
        this.o0 = true;
        o();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        activity.getClass();
        this.o++;
        this.m.put(activity.toString(), Boolean.TRUE);
        if (this.o != 1 || this.o0) {
            return;
        }
        this.o0 = true;
        o();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        activity.getClass();
        this.o--;
        boolean zContainsKey = this.m.containsKey(activity.toString());
        if (!this.f41928n && !zContainsKey) {
            this.f41928n = true;
            this.o++;
        }
        if (zContainsKey) {
            try {
                this.m.remove(activity.toString());
            } catch (Throwable unused) {
            }
        }
        if (this.o == 0) {
            this.o0 = false;
        }
    }
}
