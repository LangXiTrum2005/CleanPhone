package com.applovin.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.applovin.impl.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0928c implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f10620a = androidx.media3.extractor.text.ttml.a.u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference f10621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WeakReference f10622c;

    public C0928c(Context context) {
        this.f10621b = new WeakReference(null);
        this.f10622c = new WeakReference(null);
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            this.f10621b = new WeakReference(activity);
            if (activity.hasWindowFocus()) {
                this.f10622c = this.f10621b;
            }
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this);
    }

    public Activity a() {
        return (Activity) this.f10622c.get();
    }

    public Activity b() {
        return (Activity) this.f10621b.get();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Iterator it = new ArrayList(this.f10620a).iterator();
        while (it.hasNext()) {
            ((AbstractC0926b) it.next()).onActivityCreated(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Iterator it = new ArrayList(this.f10620a).iterator();
        while (it.hasNext()) {
            ((AbstractC0926b) it.next()).onActivityDestroyed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.f10622c = new WeakReference(null);
        Iterator it = new ArrayList(this.f10620a).iterator();
        while (it.hasNext()) {
            ((AbstractC0926b) it.next()).onActivityPaused(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        WeakReference weakReference = new WeakReference(activity);
        this.f10621b = weakReference;
        this.f10622c = weakReference;
        Iterator it = new ArrayList(this.f10620a).iterator();
        while (it.hasNext()) {
            ((AbstractC0926b) it.next()).onActivityResumed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Iterator it = new ArrayList(this.f10620a).iterator();
        while (it.hasNext()) {
            ((AbstractC0926b) it.next()).onActivitySaveInstanceState(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Iterator it = new ArrayList(this.f10620a).iterator();
        while (it.hasNext()) {
            ((AbstractC0926b) it.next()).onActivityStarted(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Iterator it = new ArrayList(this.f10620a).iterator();
        while (it.hasNext()) {
            ((AbstractC0926b) it.next()).onActivityStopped(activity);
        }
    }

    public void a(AbstractC0926b abstractC0926b) {
        this.f10620a.add(abstractC0926b);
    }

    public void b(AbstractC0926b abstractC0926b) {
        this.f10620a.remove(abstractC0926b);
    }
}
