package com.smartdigimkt.m3;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public class b implements Application.ActivityLifecycleCallbacks {
    private static final int f = 1;
    private static final int g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f36560h = 3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f36561i = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f36562a;
    private int d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f36564c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AtomicBoolean f36565e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ConcurrentHashMap<String, Boolean> f36563b = new ConcurrentHashMap<>(3);

    public b(boolean z2) {
        if (z2) {
            a();
        }
    }

    private void a(int i2, Activity activity) {
        if (i2 == 2) {
            int i3 = this.d;
            this.d = activity != null ? activity.hashCode() : i3;
            if (i3 == 0) {
                com.smartdigimkt.k3.c.d().a(true);
                return;
            }
            return;
        }
        if (i2 == 3) {
            if (this.d != 0 || activity == null) {
                return;
            }
            this.d = activity.hashCode();
            return;
        }
        if (i2 == 4 && activity != null && activity.hashCode() == this.d) {
            this.d = 0;
            com.smartdigimkt.k3.c.d().a(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        com.smartdigimkt.k3.c.d().m = true;
        a();
        a(3, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        com.smartdigimkt.k3.c.d().a();
        com.smartdigimkt.k3.c.d().a(activity);
        a(2, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        this.f36562a++;
        this.f36563b.put(activity.toString(), Boolean.TRUE);
        if (this.f36562a == 1) {
            a();
        }
        a(1, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        com.smartdigimkt.k3.c.d().f36176l = true;
        this.f36562a--;
        boolean zContainsKey = this.f36563b.containsKey(activity.toString());
        if (!this.f36564c && !zContainsKey) {
            this.f36564c = true;
            this.f36562a++;
        }
        if (zContainsKey) {
            try {
                this.f36563b.remove(activity.toString());
            } catch (Throwable unused) {
            }
        }
        a(4, activity);
    }

    private void a() {
        if (this.f36565e.compareAndSet(false, true)) {
            com.smartdigimkt.i7.c.a(com.smartdigimkt.m6.b.p().k()).a(21, new com.smartdigimkt.a7.a());
        }
    }
}
