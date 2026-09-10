package com.google.android.gms.internal.ads;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Choreographer;
import android.view.Choreographer$VsyncCallback;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 extends h1 implements Choreographer$VsyncCallback {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Handler f16245f;

    public /* synthetic */ k1(Choreographer choreographer, DisplayManager displayManager) {
        super(choreographer, displayManager, 0);
        this.f16245f = uu0.o();
    }

    @Override // com.google.android.gms.internal.ads.h1
    public final void g() {
        this.f15046c.registerDisplayListener(this, uu0.o());
        this.f15045b.postVsyncCallback(this);
    }

    @Override // com.google.android.gms.internal.ads.h1
    public final void h() {
        this.f15046c.unregisterDisplayListener(this);
        this.f16245f.removeCallbacksAndMessages(null);
        this.f15045b.removeVsyncCallback(this);
        this.f15047d = C.TIME_UNSET;
        this.f15048e = C.TIME_UNSET;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i10) {
        if (i10 == 0) {
            this.f15045b.postVsyncCallback(this);
        }
    }

    public final void onVsync(Choreographer.FrameData frameData) {
        this.f15047d = frameData.getFrameTimeNanos();
        Choreographer.FrameTimeline[] frameTimelines = frameData.getFrameTimelines();
        int length = frameTimelines.length;
        long j10 = C.TIME_UNSET;
        if (length >= 2) {
            long expectedPresentationTimeNanos = frameTimelines[1].getExpectedPresentationTimeNanos() - frameTimelines[0].getExpectedPresentationTimeNanos();
            if (expectedPresentationTimeNanos != 0) {
                j10 = expectedPresentationTimeNanos;
            }
            this.f15048e = j10;
        } else {
            this.f15048e = C.TIME_UNSET;
        }
        this.f16245f.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.j1
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                k1 k1Var = this.f15895a;
                k1Var.f15045b.postVsyncCallback(k1Var);
            }
        }, 500L);
    }
}
