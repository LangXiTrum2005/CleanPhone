package utwa;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: LottieThreadFactory.java */
/* JADX INFO: loaded from: classes.dex */
public class competently implements ThreadFactory {

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public static final AtomicInteger f39252polloi = new AtomicInteger(1);

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final AtomicInteger f39253arytenoidectomy = new AtomicInteger(1);

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final ThreadGroup f39254kowloon;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final String f39255monoploid;

    public competently() {
        SecurityManager securityManager = System.getSecurityManager();
        this.f39254kowloon = securityManager == null ? Thread.currentThread().getThreadGroup() : securityManager.getThreadGroup();
        this.f39255monoploid = "lottie-" + f39252polloi.getAndIncrement() + "-thread-";
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.f39254kowloon, runnable, this.f39255monoploid + this.f39253arytenoidectomy.getAndIncrement(), 0L);
        thread.setDaemon(false);
        thread.setPriority(10);
        return thread;
    }
}
