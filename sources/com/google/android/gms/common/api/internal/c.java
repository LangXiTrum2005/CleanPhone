package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f11675e = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f11676a = new AtomicBoolean();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f11677b = new AtomicBoolean();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f11678c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f11679d = false;

    public static void b(Application application) {
        c cVar = f11675e;
        synchronized (cVar) {
            try {
                if (!cVar.f11679d) {
                    application.registerActivityLifecycleCallbacks(cVar);
                    application.registerComponentCallbacks(cVar);
                    cVar.f11679d = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a(b bVar) {
        synchronized (f11675e) {
            this.f11678c.add(bVar);
        }
    }

    public final void c(boolean z10) {
        synchronized (f11675e) {
            try {
                Iterator it = this.f11678c.iterator();
                while (it.hasNext()) {
                    ((b) it.next()).a(z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean zCompareAndSet = this.f11676a.compareAndSet(true, false);
        this.f11677b.set(true);
        if (zCompareAndSet) {
            c(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean zCompareAndSet = this.f11676a.compareAndSet(true, false);
        this.f11677b.set(true);
        if (zCompareAndSet) {
            c(false);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        if (i10 == 20 && this.f11676a.compareAndSet(false, true)) {
            this.f11677b.set(true);
            c(true);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
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

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
