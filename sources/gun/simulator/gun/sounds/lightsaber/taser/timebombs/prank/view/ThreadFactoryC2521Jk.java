package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Jk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class ThreadFactoryC2521Jk implements ThreadFactory {
    public static final ThreadFactory e = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicLong f3278a = new AtomicLong();
    public final String b;
    public final int c;
    public final StrictMode.ThreadPolicy d;

    public ThreadFactoryC2521Jk(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        this.b = str;
        this.c = i;
        this.d = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = e.newThread(new RunnableC3976le0(26, this, runnable));
        Locale locale = Locale.ROOT;
        threadNewThread.setName(this.b + " Thread #" + this.f3278a.getAndIncrement());
        return threadNewThread;
    }
}
