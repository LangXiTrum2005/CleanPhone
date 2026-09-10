package l2;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Choreographer;
import android.view.Choreographer$VsyncCallback;
import com.google.android.gms.internal.ads.h1;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends h1 implements Choreographer$VsyncCallback {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Handler f44935f;

    public s(Choreographer choreographer, DisplayManager displayManager) {
        super(choreographer, displayManager, 1);
        this.f44935f = l1.y.q(null);
    }

    @Override // com.google.android.gms.internal.ads.h1
    public final void e() {
        this.f15046c.registerDisplayListener(this, l1.y.q(null));
        this.f15045b.postVsyncCallback(this);
    }

    @Override // com.google.android.gms.internal.ads.h1
    public final void f() {
        this.f15046c.unregisterDisplayListener(this);
        this.f44935f.removeCallbacksAndMessages(null);
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
        this.f44935f.postDelayed(new com.mbridge.msdk.config.component.info.provider.subprovider.f(this, 22), 500L);
    }
}
