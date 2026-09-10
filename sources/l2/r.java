package l2;

import android.view.Choreographer;
import android.view.Display;
import com.google.android.gms.internal.ads.h1;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends h1 implements Choreographer.FrameCallback {
    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        this.f15047d = j10;
        this.f15045b.postFrameCallbackDelayed(this, 500L);
    }

    @Override // com.google.android.gms.internal.ads.h1
    public final void e() {
        long refreshRate;
        this.f15046c.registerDisplayListener(this, l1.y.q(null));
        this.f15045b.postFrameCallback(this);
        Display display = this.f15046c.getDisplay(0);
        if (display != null) {
            refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
        } else {
            l1.a.s("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            refreshRate = C.TIME_UNSET;
        }
        this.f15048e = refreshRate;
    }

    @Override // com.google.android.gms.internal.ads.h1
    public final void f() {
        this.f15046c.unregisterDisplayListener(this);
        this.f15045b.removeFrameCallback(this);
        this.f15047d = C.TIME_UNSET;
        this.f15048e = C.TIME_UNSET;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i10) {
        long refreshRate;
        if (i10 == 0) {
            this.f15045b.postFrameCallback(this);
            Display display = this.f15046c.getDisplay(0);
            if (display != null) {
                refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            } else {
                l1.a.s("VideoFrameReleaseHelper", "Unable to query display refresh rate");
                refreshRate = C.TIME_UNSET;
            }
            this.f15048e = refreshRate;
        }
    }
}
