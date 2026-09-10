package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ez, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3393ez {
    private final Handler handler = new Handler(Looper.getMainLooper());

    private final long calculateTime(long j) {
        return SystemClock.uptimeMillis() + j;
    }

    public final void cancel(String str) {
        AbstractC2995aW.q(str, "tag");
        this.handler.removeCallbacksAndMessages(str);
    }

    public final void cancelAll() {
        this.handler.removeCallbacksAndMessages(null);
    }

    public final void schedule(Runnable runnable, long j) {
        AbstractC2995aW.q(runnable, "runnable");
        this.handler.postAtTime(runnable, calculateTime(j));
    }

    public final void schedule(Runnable runnable, String str, long j) {
        AbstractC2995aW.q(runnable, "runnable");
        AbstractC2995aW.q(str, "tag");
        this.handler.postAtTime(runnable, str, calculateTime(j));
    }
}
