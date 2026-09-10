package com.inmobi.media;

import A.RunnableC0913u;
import android.os.Handler;
import android.os.Looper;
import com.inmobi.ads.InMobiAdRequestStatus;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class K0 extends AbstractC3037gc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ S0 f22913a;

    public K0(S0 s0) {
        this.f22913a = s0;
    }

    public static final void a(S0 this$0) {
        Intrinsics.f(this$0, "this$0");
        this$0.b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 43);
    }

    public static final void b(S0 this$0) {
        Intrinsics.f(this$0, "this$0");
        this$0.q = true;
        this$0.f();
    }

    @Override // com.inmobi.media.AbstractC3037gc
    public final void f(GestureDetectorOnGestureListenerC3005ec renderView) {
        Intrinsics.f(renderView, "renderView");
        if (2 == this.f22913a.Q()) {
            this.f22913a.q0();
        }
    }

    @Override // com.inmobi.media.AbstractC3037gc
    public final void g(GestureDetectorOnGestureListenerC3005ec renderView) {
        Intrinsics.f(renderView, "renderView");
        new Handler(Looper.getMainLooper()).post(new RunnableC0913u(this.f22913a, 0));
    }

    @Override // com.inmobi.media.AbstractC3037gc
    public final void h(GestureDetectorOnGestureListenerC3005ec renderView) {
        Intrinsics.f(renderView, "renderView");
        if (2 == this.f22913a.Q()) {
            new Handler(Looper.getMainLooper()).post(new RunnableC0913u(this.f22913a, 1));
        }
    }

    @Override // com.inmobi.media.AbstractC3037gc
    public final void a(Yd telemetryOnAdImpression) {
        Intrinsics.f(telemetryOnAdImpression, "telemetryOnAdImpression");
        this.f22913a.a(telemetryOnAdImpression);
    }
}
