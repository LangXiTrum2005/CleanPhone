package com.p004ironsource.environment;

import android.app.Activity;
import android.content.Context;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public class ContextProvider {
    private static volatile ContextProvider d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Activity f24913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f24914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ConcurrentHashMap<String, a> f24915c = new ConcurrentHashMap<>();

    public interface a {
        void onPause(Activity activity);

        void onResume(Activity activity);
    }

    private ContextProvider() {
    }

    public static ContextProvider getInstance() {
        if (d == null) {
            synchronized (ContextProvider.class) {
                try {
                    if (d == null) {
                        d = new ContextProvider();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public Context getApplicationContext() {
        Activity activity;
        Context context = this.f24914b;
        return (context != null || (activity = this.f24913a) == null) ? context : activity.getApplicationContext();
    }

    public Activity getCurrentActiveActivity() {
        return this.f24913a;
    }

    public void onPause(Activity activity) {
        if (activity != null) {
            Iterator<a> it = this.f24915c.values().iterator();
            while (it.hasNext()) {
                it.next().onPause(activity);
            }
        }
    }

    public void onResume(Activity activity) {
        if (activity != null) {
            this.f24913a = activity;
            Iterator<a> it = this.f24915c.values().iterator();
            while (it.hasNext()) {
                it.next().onResume(this.f24913a);
            }
        }
    }

    public void registerLifeCycleListener(a aVar) {
        this.f24915c.put(aVar.getClass().getSimpleName(), aVar);
    }

    public void updateActivity(Activity activity) {
        if (activity != null) {
            this.f24913a = activity;
        }
    }

    public void updateAppContext(Context context) {
        if (context != null) {
            this.f24914b = context;
        }
    }
}
