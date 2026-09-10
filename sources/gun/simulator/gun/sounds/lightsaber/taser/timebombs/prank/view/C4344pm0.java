package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.pm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4344pm0 extends LinkedBlockingDeque {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ThreadPoolExecutor f4849a;

    @Override // java.util.concurrent.LinkedBlockingDeque, java.util.Queue, java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue, java.util.Deque
    public final boolean offer(Object obj) {
        synchronized (this) {
            int poolSize = this.f4849a.getPoolSize();
            int activeCount = this.f4849a.getActiveCount();
            int maximumPoolSize = this.f4849a.getMaximumPoolSize();
            if (activeCount < poolSize || poolSize >= maximumPoolSize) {
                return offerFirst(obj);
            }
            No0 no0 = AbstractC4648tE.f5026a;
            return false;
        }
    }
}
