package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.yh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class ChoreographerFrameCallbackC5125yh0 implements Choreographer.FrameCallback, Handler.Callback {
    public static final ChoreographerFrameCallbackC5125yh0 e = new ChoreographerFrameCallbackC5125yh0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile long f5292a = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    public final Handler b;
    public Choreographer c;
    public int d;

    public ChoreographerFrameCallbackC5125yh0() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        int i = Ug0.f3833a;
        Handler handler = new Handler(looper, this);
        this.b = handler;
        handler.sendEmptyMessage(0);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.f5292a = j;
        Choreographer choreographer = this.c;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            try {
                this.c = Choreographer.getInstance();
            } catch (RuntimeException e2) {
                AbstractC4038mJ.g("Vsync sampling disabled due to platform error", e2);
            }
            return true;
        }
        if (i == 1) {
            Choreographer choreographer = this.c;
            if (choreographer != null) {
                int i2 = this.d + 1;
                this.d = i2;
                if (i2 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
            return true;
        }
        if (i != 2) {
            return false;
        }
        Choreographer choreographer2 = this.c;
        if (choreographer2 != null) {
            int i3 = this.d - 1;
            this.d = i3;
            if (i3 == 0) {
                choreographer2.removeFrameCallback(this);
                this.f5292a = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
            }
        }
        return true;
    }
}
