package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes3.dex */
public interface AI extends Future {
    void addListener(Runnable runnable, Executor executor);
}
