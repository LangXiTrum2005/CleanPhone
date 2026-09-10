package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.pb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4322pb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadPoolExecutor f4840a;

    public C4322pb0(Pg0 pg0) {
        this.f4840a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), pg0);
    }
}
