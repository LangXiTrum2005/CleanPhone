package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class AQ implements ThreadFactory {
    private final AtomicInteger atomicInteger;
    private final String name;
    private final ThreadFactory threadFactory;

    public AQ(String str) {
        AbstractC2995aW.q(str, "name");
        this.name = str;
        this.threadFactory = Executors.defaultThreadFactory();
        this.atomicInteger = new AtomicInteger(0);
    }

    public final String getName() {
        return this.name;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        AbstractC2995aW.q(runnable, "r");
        Thread threadNewThread = this.threadFactory.newThread(runnable);
        threadNewThread.setName(this.name + "-th-" + this.atomicInteger.incrementAndGet());
        return threadNewThread;
    }
}
