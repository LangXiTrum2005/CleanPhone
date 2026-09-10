package com.iab.omid.library.chartboost.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public class d implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f21848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f21849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f21850c;

    public interface a {
        void a(boolean z2);
    }

    public void a(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    public ActivityManager.RunningAppProcessInfo b() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    public boolean c() {
        return this.f21849b;
    }

    public boolean d() {
        return false;
    }

    public void e() {
        this.f21848a = true;
        boolean zA = a();
        this.f21849b = zA;
        b(zA);
    }

    public void f() {
        this.f21848a = false;
        this.f21850c = null;
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
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        a(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        a(a());
    }

    public void a(a aVar) {
        this.f21850c = aVar;
    }

    public void b(boolean z2) {
    }

    private void a(boolean z2) {
        if (this.f21849b != z2) {
            this.f21849b = z2;
            if (this.f21848a) {
                b(z2);
                a aVar = this.f21850c;
                if (aVar != null) {
                    aVar.a(z2);
                }
            }
        }
    }

    private boolean a() {
        return b().importance == 100 || d();
    }
}
