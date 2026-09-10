package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.dy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC3304dy implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadFactory f4298a;
    public final String b;
    public final InterfaceC3392ey c;
    public final boolean d;
    public final AtomicInteger e;

    public ThreadFactoryC3304dy(ThreadFactoryC4448r0 threadFactoryC4448r0, String str, boolean z) {
        C4710tz c4710tz = InterfaceC3392ey.g1;
        this.e = new AtomicInteger();
        this.f4298a = threadFactoryC4448r0;
        this.b = str;
        this.c = c4710tz;
        this.d = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f4298a.newThread(new RunnableC3252dN(3, this, runnable));
        threadNewThread.setName("glide-" + this.b + "-thread-" + this.e.getAndIncrement());
        return threadNewThread;
    }
}
