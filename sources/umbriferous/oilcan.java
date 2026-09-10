package umbriferous;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: ExecutorUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public final class oilcan {

    /* JADX INFO: compiled from: ExecutorUtils.java */
    public class attabal implements ThreadFactory {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ AtomicLong f39172arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ String f39173kowloon;

        /* JADX INFO: renamed from: umbriferous.oilcan$attabal$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ExecutorUtils.java */
        public class C0815attabal extends wireman {

            /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
            public final /* synthetic */ Runnable f39175kowloon;

            public C0815attabal(Runnable runnable) {
                this.f39175kowloon = runnable;
            }

            @Override // umbriferous.wireman
            public void attabal() {
                this.f39175kowloon.run();
            }
        }

        public attabal(String str, AtomicLong atomicLong) {
            this.f39173kowloon = str;
            this.f39172arytenoidectomy = atomicLong;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(new C0815attabal(runnable));
            threadNewThread.setName(this.f39173kowloon + this.f39172arytenoidectomy.getAndIncrement());
            return threadNewThread;
        }
    }

    /* JADX INFO: compiled from: ExecutorUtils.java */
    public class saneness extends wireman {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ ExecutorService f39176arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ String f39177kowloon;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public final /* synthetic */ long f39178monoploid;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name */
        public final /* synthetic */ TimeUnit f39179polloi;

        public saneness(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
            this.f39177kowloon = str;
            this.f39176arytenoidectomy = executorService;
            this.f39178monoploid = j;
            this.f39179polloi = timeUnit;
        }

        @Override // umbriferous.wireman
        public void attabal() {
            try {
                gelandelaufer.competently.beachfront().saneness("Executing shutdown hook for " + this.f39177kowloon);
                this.f39176arytenoidectomy.shutdown();
                if (this.f39176arytenoidectomy.awaitTermination(this.f39178monoploid, this.f39179polloi)) {
                    return;
                }
                gelandelaufer.competently.beachfront().saneness(this.f39177kowloon + " did not shut down in the allocated time. Requesting immediate shutdown.");
                this.f39176arytenoidectomy.shutdownNow();
            } catch (InterruptedException unused) {
                gelandelaufer.competently.beachfront().saneness(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.f39177kowloon));
                this.f39176arytenoidectomy.shutdownNow();
            }
        }
    }

    public static void attabal(String str, ExecutorService executorService) {
        saneness(str, executorService, 2L, TimeUnit.SECONDS);
    }

    public static ExecutorService dern(String str) {
        ExecutorService executorServiceMarial = marial(wireman(str), new ThreadPoolExecutor.DiscardPolicy());
        attabal(str, executorServiceMarial);
        return executorServiceMarial;
    }

    public static ExecutorService marial(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler));
    }

    public static void saneness(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
        Runtime.getRuntime().addShutdownHook(new Thread(new saneness(str, executorService, j, timeUnit), "Crashlytics Shutdown Hook for " + str));
    }

    public static ThreadFactory wireman(String str) {
        return new attabal(str, new AtomicLong(1L));
    }
}
