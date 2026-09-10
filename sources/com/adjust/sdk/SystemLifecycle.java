package com.adjust.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class SystemLifecycle implements Application.ActivityLifecycleCallbacks {
    private static volatile SystemLifecycle instance;
    private Application application = null;
    private volatile SystemLifecycleCallback callback;
    private final SystemLifecycleCache callbackCache;
    public final CopyOnWriteArrayList<String> logMessageList;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class SystemLifecycleCache implements SystemLifecycleCallback {
        public volatile Boolean foregroundOrElseBackgroundCache = null;

        @Override // com.adjust.sdk.SystemLifecycle.SystemLifecycleCallback
        public void onActivityLifecycle(boolean z10) {
            this.foregroundOrElseBackgroundCache = Boolean.valueOf(z10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface SystemLifecycleCallback {
        void onActivityLifecycle(boolean z10);
    }

    public SystemLifecycle() {
        SystemLifecycleCache systemLifecycleCache = new SystemLifecycleCache();
        this.callbackCache = systemLifecycleCache;
        this.callback = systemLifecycleCache;
        this.logMessageList = new CopyOnWriteArrayList<>();
    }

    public static SystemLifecycle getSingletonInstance() {
        SystemLifecycle systemLifecycle;
        SystemLifecycle systemLifecycle2 = instance;
        if (systemLifecycle2 != null) {
            return systemLifecycle2;
        }
        synchronized (SystemLifecycle.class) {
            try {
                systemLifecycle = instance;
                if (systemLifecycle == null) {
                    systemLifecycle = new SystemLifecycle();
                    instance = systemLifecycle;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return systemLifecycle;
    }

    public Boolean foregroundOrElseBackgroundCached() {
        return this.callbackCache.foregroundOrElseBackgroundCache;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.callback.onActivityLifecycle(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.callback.onActivityLifecycle(true);
    }

    public void overwriteCallback(SystemLifecycleCallback systemLifecycleCallback) {
        this.callback = systemLifecycleCallback;
    }

    public synchronized void registerActivityLifecycleCallbacks(Context context) {
        if (this.application != null) {
            this.logMessageList.add("Cannot register activity lifecycle callbacks more than once");
            return;
        }
        if (context == null) {
            this.logMessageList.add("Cannot register activity lifecycle callbacks without context");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        boolean z10 = applicationContext instanceof Application;
        CopyOnWriteArrayList<String> copyOnWriteArrayList = this.logMessageList;
        if (!z10) {
            copyOnWriteArrayList.add("Cannot register activity lifecycle callbacks without application context as Application");
            return;
        }
        copyOnWriteArrayList.add("Registering activity lifecycle callbacks");
        Application application = (Application) applicationContext;
        this.application = application;
        application.registerActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
