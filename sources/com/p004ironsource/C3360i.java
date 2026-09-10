package com.p004ironsource;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.p004ironsource.sdk.utils.SDKUtils;

/* JADX INFO: renamed from: com.ironsource.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C3360i implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private qp f25300a;

    public C3360i(qp qpVar) {
        this.f25300a = qpVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        if (SDKUtils.isIronSourceActivity(activity)) {
            return;
        }
        this.f25300a.b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        if (SDKUtils.isIronSourceActivity(activity)) {
            return;
        }
        this.f25300a.c(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}
