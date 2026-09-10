package com.iab.omid.library.adcolony.b;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class b implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static b f21462a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f21463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f21464c;
    private a d;

    public interface a {
        void a(boolean z2);
    }

    private b() {
    }

    public static b a() {
        return f21462a;
    }

    private void e() {
        boolean z2 = !this.f21464c;
        Iterator<com.iab.omid.library.adcolony.adsession.a> it = com.iab.omid.library.adcolony.b.a.a().b().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(z2);
        }
    }

    public void b() {
        this.f21463b = true;
        this.f21464c = false;
        e();
    }

    public void c() {
        this.f21463b = false;
        this.f21464c = false;
        this.d = null;
    }

    public ActivityManager.RunningAppProcessInfo d() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
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
        a(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        View viewE;
        boolean z2 = false;
        boolean z3 = d().importance != 100;
        boolean z4 = true;
        for (com.iab.omid.library.adcolony.adsession.a aVar : com.iab.omid.library.adcolony.b.a.a().c()) {
            if (aVar.f() && (viewE = aVar.e()) != null && viewE.hasWindowFocus()) {
                z4 = false;
            }
        }
        if (z3 && z4) {
            z2 = true;
        }
        a(z2);
    }

    public void a(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    public void a(a aVar) {
        this.d = aVar;
    }

    private void a(boolean z2) {
        if (this.f21464c != z2) {
            this.f21464c = z2;
            if (this.f21463b) {
                e();
                a aVar = this.d;
                if (aVar != null) {
                    aVar.a(!z2);
                }
            }
        }
    }
}
