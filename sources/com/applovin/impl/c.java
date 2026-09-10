package com.applovin.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class c implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f7608a = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference f7609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WeakReference f7610c;

    public c(Context context) {
        this.f7609b = new WeakReference(null);
        this.f7610c = new WeakReference(null);
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            this.f7609b = new WeakReference(activity);
            if (activity.hasWindowFocus()) {
                this.f7610c = this.f7609b;
            }
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this);
    }

    public Activity a() {
        return (Activity) this.f7610c.get();
    }

    public Activity b() {
        return (Activity) this.f7609b.get();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Iterator it = new ArrayList(this.f7608a).iterator();
        while (it.hasNext()) {
            ((b) it.next()).onActivityCreated(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Iterator it = new ArrayList(this.f7608a).iterator();
        while (it.hasNext()) {
            ((b) it.next()).onActivityDestroyed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.f7610c = new WeakReference(null);
        Iterator it = new ArrayList(this.f7608a).iterator();
        while (it.hasNext()) {
            ((b) it.next()).onActivityPaused(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        WeakReference weakReference = new WeakReference(activity);
        this.f7609b = weakReference;
        this.f7610c = weakReference;
        Iterator it = new ArrayList(this.f7608a).iterator();
        while (it.hasNext()) {
            ((b) it.next()).onActivityResumed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Iterator it = new ArrayList(this.f7608a).iterator();
        while (it.hasNext()) {
            ((b) it.next()).onActivitySaveInstanceState(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Iterator it = new ArrayList(this.f7608a).iterator();
        while (it.hasNext()) {
            ((b) it.next()).onActivityStarted(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Iterator it = new ArrayList(this.f7608a).iterator();
        while (it.hasNext()) {
            ((b) it.next()).onActivityStopped(activity);
        }
    }

    public void a(b bVar) {
        this.f7608a.add(bVar);
    }

    public void b(b bVar) {
        this.f7608a.remove(bVar);
    }
}
