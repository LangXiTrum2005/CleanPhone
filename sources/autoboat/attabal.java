package autoboat;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import demilitarize.impromptu;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: GlideExecutor.java */
/* JADX INFO: loaded from: classes2.dex */
public final class attabal implements ExecutorService, AutoCloseable {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public static final long f14743arytenoidectomy = TimeUnit.SECONDS.toMillis(10);

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public static volatile int f14744monoploid;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final ExecutorService f14745kowloon;

    /* JADX INFO: compiled from: GlideExecutor.java */
    public static final class dern implements ThreadFactory {

        /* JADX INFO: renamed from: autoboat.attabal$dern$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: GlideExecutor.java */
        public class C0122attabal extends Thread {
            public C0122attabal(Runnable runnable) {
                super(runnable);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(9);
                super.run();
            }
        }

        public dern() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0122attabal(runnable);
        }
    }

    /* JADX INFO: compiled from: GlideExecutor.java */
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final boolean f14751attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public long f14752beachfront;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public int f14753dern;
        private String name;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public int f14755saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public ThreadFactory f14756wireman = new dern();

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public marial f14754marial = marial.f14750wireman;

        public saneness(boolean z) {
            this.f14751attabal = z;
        }

        public attabal attabal() {
            if (TextUtils.isEmpty(this.name)) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.name);
            }
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f14755saneness, this.f14753dern, this.f14752beachfront, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new wireman(this.f14756wireman, this.name, this.f14754marial, this.f14751attabal));
            if (this.f14752beachfront != 0) {
                threadPoolExecutor.allowCoreThreadTimeOut(true);
            }
            return new attabal(threadPoolExecutor);
        }

        public saneness dern(int i) {
            this.f14755saneness = i;
            this.f14753dern = i;
            return this;
        }

        public saneness saneness(String str) {
            this.name = str;
            return this;
        }
    }

    /* JADX INFO: compiled from: GlideExecutor.java */
    public static final class wireman implements ThreadFactory {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final marial f14757arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final ThreadFactory f14758kowloon;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public final boolean f14759monoploid;
        private final String name;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name */
        public final AtomicInteger f14760polloi = new AtomicInteger();

        /* JADX INFO: renamed from: autoboat.attabal$wireman$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: GlideExecutor.java */
        public class RunnableC0124attabal implements Runnable {

            /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
            public final /* synthetic */ Runnable f14762kowloon;

            public RunnableC0124attabal(Runnable runnable) {
                this.f14762kowloon = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (wireman.this.f14759monoploid) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.f14762kowloon.run();
                } catch (Throwable th) {
                    wireman.this.f14757arytenoidectomy.attabal(th);
                }
            }
        }

        public wireman(ThreadFactory threadFactory, String str, marial marialVar, boolean z) {
            this.f14758kowloon = threadFactory;
            this.name = str;
            this.f14757arytenoidectomy = marialVar;
            this.f14759monoploid = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = this.f14758kowloon.newThread(new RunnableC0124attabal(runnable));
            threadNewThread.setName("glide-" + this.name + "-thread-" + this.f14760polloi.getAndIncrement());
            return threadNewThread;
        }
    }

    public attabal(ExecutorService executorService) {
        this.f14745kowloon = executorService;
    }

    public static attabal arytenoidectomy() {
        return formularize().attabal();
    }

    public static int attabal() {
        return saneness() >= 4 ? 2 : 1;
    }

    public static attabal cutely() {
        return dern().attabal();
    }

    public static saneness dern() {
        return new saneness(true).dern(attabal()).saneness("animation");
    }

    public static attabal dovishness() {
        return monoploid().attabal();
    }

    public static saneness formularize() {
        return new saneness(true).dern(1).saneness("disk-cache");
    }

    public static saneness monoploid() {
        return new saneness(false).dern(saneness()).saneness("source");
    }

    public static attabal rotuma() {
        return new attabal(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f14743arytenoidectomy, TimeUnit.MILLISECONDS, new SynchronousQueue(), new wireman(new dern(), "source-unlimited", marial.f14750wireman, false)));
    }

    public static int saneness() {
        if (f14744monoploid == 0) {
            f14744monoploid = Math.min(4, autoboat.saneness.attabal());
        }
        return f14744monoploid;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f14745kowloon.awaitTermination(j, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        impromptu.attabal(this);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f14745kowloon.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection2) throws InterruptedException {
        return this.f14745kowloon.invokeAll(collection2);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection2) throws ExecutionException, InterruptedException {
        return (T) this.f14745kowloon.invokeAny(collection2);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f14745kowloon.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f14745kowloon.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f14745kowloon.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return this.f14745kowloon.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return this.f14745kowloon.submit(runnable);
    }

    public String toString() {
        return this.f14745kowloon.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection2, long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f14745kowloon.invokeAll(collection2, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection2, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.f14745kowloon.invokeAny(collection2, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t) {
        return this.f14745kowloon.submit(runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        return this.f14745kowloon.submit(callable);
    }

    /* JADX INFO: compiled from: GlideExecutor.java */
    public interface marial {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final marial f14747attabal = new C0123attabal();

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public static final marial f14748dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final marial f14749saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public static final marial f14750wireman;

        /* JADX INFO: compiled from: GlideExecutor.java */
        public class dern implements marial {
            @Override // autoboat.attabal.marial
            public void attabal(Throwable th) {
                if (th != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th);
                }
            }
        }

        /* JADX INFO: compiled from: GlideExecutor.java */
        public class saneness implements marial {
            @Override // autoboat.attabal.marial
            public void attabal(Throwable th) {
                if (th != null) {
                    Log.isLoggable("GlideExecutor", 6);
                }
            }
        }

        static {
            saneness sanenessVar = new saneness();
            f14749saneness = sanenessVar;
            f14748dern = new dern();
            f14750wireman = sanenessVar;
        }

        void attabal(Throwable th);

        /* JADX INFO: renamed from: autoboat.attabal$marial$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: GlideExecutor.java */
        public class C0123attabal implements marial {
            @Override // autoboat.attabal.marial
            public void attabal(Throwable th) {
            }
        }
    }
}
