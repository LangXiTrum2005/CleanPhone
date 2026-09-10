package com.google.firebase.messaging;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: compiled from: FcmLifecycleCallbacks.java */
/* JADX INFO: loaded from: classes3.dex */
public class arytenoidectomy implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final Queue<String> f22587kowloon = new ArrayDeque(10);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        final Intent intent = activity.getIntent();
        if (intent == null) {
            return;
        }
        if (Build.VERSION.SDK_INT <= 25) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.google.firebase.messaging.kowloon
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22662kowloon.saneness(intent);
                }
            });
        } else {
            saneness(intent);
        }
    }

    public final void saneness(Intent intent) {
        Bundle bundle = null;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                String strImpromptu = restrictive.impromptu(extras);
                if (!TextUtils.isEmpty(strImpromptu)) {
                    if (this.f22587kowloon.contains(strImpromptu)) {
                        return;
                    } else {
                        this.f22587kowloon.add(strImpromptu);
                    }
                }
                bundle = extras.getBundle("gcm.n.analytics_data");
            }
        } catch (RuntimeException unused) {
        }
        if (restrictive.yemenite(bundle)) {
            restrictive.rotuma(bundle);
        }
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
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
