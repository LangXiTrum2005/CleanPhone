package com.facebook.appevents.iap;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.facebook.FacebookSdk;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/facebook/appevents/iap/InAppPurchaseActivityLifecycleTracker$initializeIfNotInitialized$2", "Landroid/app/Application$ActivityLifecycleCallbacks;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class InAppPurchaseActivityLifecycleTracker$initializeIfNotInitialized$2 implements Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Intrinsics.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Intrinsics.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Intrinsics.f(activity, "activity");
        try {
            FacebookSdk.e().execute(InAppPurchaseActivityLifecycleTracker$initializeIfNotInitialized$2$onActivityResumed$1.X);
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Intrinsics.f(activity, "activity");
        Intrinsics.f(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Intrinsics.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Intrinsics.f(activity, "activity");
        try {
            AtomicBoolean atomicBoolean = InAppPurchaseActivityLifecycleTracker.f16090a;
            if (Intrinsics.a(InAppPurchaseActivityLifecycleTracker.f16092c, Boolean.TRUE) && Intrinsics.a(activity.getLocalClassName(), "com.android.billingclient.api.ProxyBillingActivity")) {
                FacebookSdk.e().execute(InAppPurchaseActivityLifecycleTracker$initializeIfNotInitialized$2$onActivityStopped$1.X);
            }
        } catch (Exception unused) {
        }
    }
}
