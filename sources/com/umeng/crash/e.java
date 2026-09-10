package com.umeng.crash;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes3.dex */
final class e implements Application.ActivityLifecycleCallbacks {
    private static final e c = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f2718a;
    String b = "";
    private final LinkedList<Activity> d = new LinkedList<>();
    private int e;
    private boolean f;

    private e() {
    }

    public static e a() {
        return c;
    }

    public final void b() {
        Iterator<Activity> it = this.d.iterator();
        while (it.hasNext()) {
            it.next().finish();
        }
        this.d.clear();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.d.addFirst(activity);
        if (this.d.size() > 10) {
            this.d.removeLast();
        }
        this.b = "";
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.d.remove(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.b = "";
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.b = activity.getComponentName().flattenToShortString();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        int i = this.e + 1;
        this.e = i;
        if (i == 1 && !this.f) {
            this.f2718a = true;
        }
        this.b = activity.getComponentName().flattenToShortString();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        boolean zIsChangingConfigurations = activity.isChangingConfigurations();
        this.f = zIsChangingConfigurations;
        int i = this.e - 1;
        this.e = i;
        if (i == 0 && !zIsChangingConfigurations) {
            this.f2718a = false;
        }
        this.b = "";
    }
}
