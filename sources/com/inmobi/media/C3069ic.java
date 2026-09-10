package com.inmobi.media;

import A.RunnableC0883c;
import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.ic, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3069ic {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GestureDetectorOnGestureListenerC3005ec f23696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f23697b;

    public C3069ic(GestureDetectorOnGestureListenerC3005ec view, long j) {
        Intrinsics.f(view, "view");
        this.f23696a = view;
        this.f23697b = j;
    }

    public final void a() {
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0883c(this, 18), this.f23697b);
    }

    public static final void a(C3069ic this$0) {
        Intrinsics.f(this$0, "this$0");
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = this$0.f23696a;
        if (gestureDetectorOnGestureListenerC3005ec != null) {
            gestureDetectorOnGestureListenerC3005ec.g();
        }
        this$0.f23696a = null;
    }
}
