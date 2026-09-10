package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Hh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2466Hh {
    public static final C2440Gh Companion = new C2440Gh(null);
    private static final long OPERATION_TIMEOUT = TimeUnit.SECONDS.toMillis(4);

    public final long getTimeout() {
        if (C3622hc0.INSTANCE.isMainThread()) {
            return OPERATION_TIMEOUT;
        }
        return Long.MAX_VALUE;
    }
}
