package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.VisibleForTesting;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.hc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3622hc0 {
    public static final C3622hc0 INSTANCE = new C3622hc0();
    private static final Handler UI_HANDLER = new Handler(Looper.getMainLooper());
    private static Executor uiExecutor;

    private C3622hc0() {
    }

    public final Executor getUiExecutor$vungle_ads_release() {
        return uiExecutor;
    }

    public final boolean isMainThread() {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return mainLooper.isCurrentThread();
        }
        Looper looperMyLooper = Looper.myLooper();
        return looperMyLooper != null && AbstractC2995aW.i(mainLooper.getThread(), looperMyLooper.getThread());
    }

    public final void runOnUiThread(Runnable runnable) {
        AbstractC2995aW.q(runnable, "runnable");
        if (isMainThread()) {
            runnable.run();
            return;
        }
        Executor executor = uiExecutor;
        if (executor == null) {
            UI_HANDLER.post(runnable);
        } else if (executor != null) {
            executor.execute(runnable);
        }
    }

    public final void setUiExecutor$vungle_ads_release(Executor executor) {
        uiExecutor = executor;
    }

    @VisibleForTesting
    public static /* synthetic */ void getUiExecutor$vungle_ads_release$annotations() {
    }
}
