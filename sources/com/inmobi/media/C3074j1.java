package com.inmobi.media;

import A.RunnableC0905n;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.j1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3074j1 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HandlerC3042h1 f23710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f23711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f23712c;

    public C3074j1(Context context) {
        this.f23712c = context;
        Looper mainLooper = Looper.getMainLooper();
        Intrinsics.e(mainLooper, "getMainLooper(...)");
        this.f23710a = new HandlerC3042h1(mainLooper);
    }

    public static final void a(Context context, C3074j1 this$0) {
        Intrinsics.f(context, "$context");
        Intrinsics.f(this$0, "this$0");
        if (C3090k1.a(C3090k1.f23737a, context) || this$0.f23711b != null) {
            return;
        }
        this$0.f23710a.sendEmptyMessageDelayed(1001, com.smartdigimkt.u2.m.D0);
    }

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
        WeakReference weakReference = this.f23711b;
        if (!Intrinsics.a(weakReference != null ? (Activity) weakReference.get() : null, activity)) {
            this.f23711b = new WeakReference(activity);
        }
        this.f23710a.removeMessages(1001);
        this.f23710a.sendEmptyMessage(1002);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Intrinsics.f(activity, "activity");
        Intrinsics.f(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Intrinsics.f(activity, "activity");
        WeakReference weakReference = this.f23711b;
        if (!Intrinsics.a(weakReference != null ? (Activity) weakReference.get() : null, activity)) {
            this.f23711b = new WeakReference(activity);
        }
        this.f23710a.removeMessages(1001);
        this.f23710a.sendEmptyMessage(1002);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Intrinsics.f(activity, "activity");
        WeakReference weakReference = this.f23711b;
        if (Intrinsics.a(weakReference != null ? (Activity) weakReference.get() : null, activity)) {
            this.f23710a.sendEmptyMessageDelayed(1001, com.smartdigimkt.u2.m.D0);
        } else if (this.f23711b == null) {
            Uc.a(new RunnableC0905n(19, this.f23712c, this));
        }
    }
}
