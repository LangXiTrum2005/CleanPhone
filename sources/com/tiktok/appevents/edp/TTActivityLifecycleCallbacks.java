package com.tiktok.appevents.edp;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.tiktok.TikTokBusinessSdk;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public class TTActivityLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
    public int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public WeakReference f42670Y;

    /* JADX INFO: renamed from: com.tiktok.appevents.edp.TTActivityLifecycleCallbacks$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: com.tiktok.appevents.edp.TTActivityLifecycleCallbacks$1$1, reason: invalid class name and collision with other inner class name */
        class RunnableC07541 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    throw null;
                } catch (Throwable unused) {
                }
            }
        }

        /* JADX INFO: renamed from: com.tiktok.appevents.edp.TTActivityLifecycleCallbacks$1$2, reason: invalid class name */
        class AnonymousClass2 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i2 = EDPConfig.f42669a;
            TikTokBusinessSdk.a();
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.tiktok.appevents.edp.TTActivityLifecycleCallbacks$2, reason: invalid class name */
    class AnonymousClass2 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (this.f42670Y.get() != null) {
            this.f42670Y.get();
        }
        this.f42670Y = new WeakReference(activity);
        int i2 = EDPConfig.f42669a;
        String str = TikTokBusinessSdk.f42660a;
        this.X++;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        int i2 = this.X - 1;
        this.X = i2;
        if (i2 <= 0) {
            this.X = 0;
        }
    }
}
